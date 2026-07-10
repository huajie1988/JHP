# JHP - PHP to Java 编译器

将 PHP 源代码翻译为 Java 的编译器。基于 ANTLR 4 解析框架构建。

## 项目结构

```
JHP/
├── src/
│   ├── JhpLexer.g4           # 词法分析器语法（PHP 分词）
│   ├── JhpParser.g4          # 语法分析器语法（PHP 语法）
│   ├── Main.java             # 程序入口，支持多种编译模式
│   ├── TestParser.java       # 解析器简单测试
│   ├── compiler/
│   │   ├── JhpVisitor.java         # 主访问者，协调翻译流程
│   │   ├── ExpressionProcessor.java    # 表达式路由处理器
│   │   ├── AtomicExpressionProcessor.java  # 标量、链式调用、数组、函数调用
│   │   ├── BinaryExpressionProcessor.java  # 二元运算
│   │   ├── UnaryExpressionProcessor.java  # 一元运算、类型转换、new 表达式
│   │   ├── VariableProcessor.java    # 变量声明、赋值、类型推断
│   │   ├── ClassProcessor.java      # 类/接口/trait 的翻译
│   │   ├── EnumProcessor.java       # PHP 8 枚举翻译
│   │   ├── ClosureProcessor.java    # Lambda/闭包处理
│   │   ├── InferType.java           # 类型推断引擎
│   │   ├── JhpUtils.java            # 类型映射和工具函数
│   │   ├── BuiltinConfig.java       # 内置函数注册表
│   │   ├── SymbolCollector.java     # 跨文件符号收集
│   │   ├── GlobalSymbolTable.java   # 全局符号存储
│   │   └── JhpCompilationException.java
│   ├── runtime/
│   │   └── JhpRuntime.java    # 运行时库（echo、数组、字符串函数）
│   └── resources/
│       └── builtin_functions.properties  # 内置函数签名配置
```

## 编译与使用

```bash
# 单文件模式
java Main <input.php> 1 [ClassName]   # 模式 1：翻译 + 编译 + 运行
java Main <input.php> 2 [ClassName]   # 模式 2：翻译 + 编译
java Main <input.php> 3 [ClassName]   # 模式 3：仅翻译

# 目录模式
java Main -srcdir <dir> [-outdir <dir>] [-mode <mode>]
java Main -d <dir> -o <dir> -m 3      # 翻译整个目录
java Main -d <dir> -m 4               # 翻译并编译整个目录

# 符号收集（调试用）
java Main -collect <input.php>
```

**编译模式说明：**
- `1` - 单文件：无类定义时，自动包装在生成的同名主类中 → 翻译 → 编译 → 运行
- `2` - 单文件：无类定义时，自动包装在生成的同名主类中 → 翻译 → 编译（生成 .class）
- `3` - 有类的文件：翻译时保持原样，不添加主类包裹。支持单个文件翻译
- `4` - 目录：翻译 → 编译（生成 .class 文件）

**模式 1/2**：对于没有类定义的 PHP 文件，翻译器自动将所有顶层代码包装在一个与输入文件同名的 public 类中，函数变为 static 方法，顶层语句放入 `main` 方法。

**模式 3/4**：对于已包含 class/interface/enum 定义的 PHP 文件，翻译时直接输出，不添加任何包裹类。也适用于单个文件的翻译。

**重要约束**：包含类定义的 PHP 文件中，**不能同时包含普通的 PHP 顶层语法**（如变量赋值、函数调用、if/while 等控制流语句）。如果需要混合使用，请将普通语法封装在类的方法中。违反此规则可能导致翻译结果不正确。

---

## 1. 已支持的 PHP 特性

### 语法规则参考（JhpParser.g4）

#### 语言结构
| 特性 | 语法规则 | 说明 |
|------|---------|------|
| 命名空间声明 | `namespaceDeclaration` | 翻译为 Java `package` |
| 导入语句 | `importStatement` | `import`、`require`、`include`、`use` |

#### 控制流
| 特性 | 语法规则 |
|------|---------|
| if/elseif/else | `ifStatement` |
| while 循环 | `whileStatement` |
| do-while 循环 | `doWhileStatement` |
| for 循环 | `forStatement` |
| foreach 循环 | `foreachStatement` |
| switch 语句 | `switchStatement` |
| break/continue | `breakStatement`, `continueStatement` |
| return | `returnStatement` |
| try/catch/finally | `tryCatchFinally` |
| throw | `throwStatement` |

#### 函数
| 特性 | 语法规则 |
|------|---------|
| 函数声明 | `functionDeclaration` |
| 参数 | `formalParameterList`, `formalParameter` |
| 返回类型提示 | `returnTypeDecl`（`: typeHint?`） |
| 可变参数 | `formalParameter: '...'?` |
| 箭头函数（PHP 7.4+） | `lambdaFunctionExpr: LambdaFn '(' ')' '=>' expression` |
| 多行闭包 | `lambdaFunctionExpr: Function_ '(' ')' ':'? typeHint? blockStatement` |
| 命名参数 | `argumentName: identifier (':' | '=')` |

#### 类与面向对象
| 特性 | 语法规则 | 说明 |
|------|---------|------|
| 类声明 | `classDeclaration` | |
| 接口 | `classDeclaration`（含 `Interface` 关键字） | |
| 抽象类 | `classEntryType: Class` + `modifier: Abstract` | |
| Final 类 | `modifier: Final` | |
| 继承（extends） | `classDeclaration: Extends qualifiedStaticTypeRef` | |
| 实现（implements） | `classDeclaration: Implements interfaceList` | |
| 属性 | `classStatement: propertyModifiers typeHint variableInitializer` | |
| 常量 | `classStatement: Const typeHint? identifierInitializer` | |
| 方法 | `classStatement: Function_ identifier` | |
| 构造函数 | `methodName: __construct` → 类名 | |
| 访问修饰符 | `memberModifier: Public \| Private \| Protected` | |
| 静态成员 | `memberModifier: Static` | |
| 匿名类 | `anonymousClass` | |

#### 枚举（PHP 8）
| 特性 | 语法规则 |
|------|---------|
| 枚举声明 | `enumDeclaration` |
| 带值的枚举 | `enumItem: Case identifier Eq '(' expression (',' expression)* ')'` |
| 枚举方法 | `enumItem: memberModifiers? functionDeclaration` |
| 枚举实现接口 | `enumDeclaration: Implements interfaceList` |

#### 类型
| 特性 | 语法规则 |
|------|---------|
| 基础类型 | `primitiveType: BoolType, IntType, DoubleType, StringType, ...` |
| 类类型提示 | `typeHint: qualifiedStaticTypeRef` |
| 可空类型 | `typeHint: QuestionMark? typeHint` |
| 联合类型（PHP 8） | `typeHint: typeHint '\|' typeHint` |
| Callable 类型 | `typeHint: Callable` |
| Readonly | `memberModifier: Readonly` |

#### 表达式
| 类别 | 运算 | 语法规则 |
|------|------|---------|
| 基本表达式 | 变量、字面量、字符串 | `chain`, `scalar`, `string` |
| 数组 | 创建、索引访问 | `arrayCreation`, `arrayDestructuring`, `indexedDestructItem` |
| Heredoc/Nowdoc | `<<<EOF` | `StartHereDoc`, `StartNowDoc` |
| 算术运算符 | `+`, `-`, `*`, `/`, `%` | `AdditiveExpression`, `MultiplicativeExpression` |
| 位运算符 | `&`, `\|`, `^`, `<<`, `>>` | `BitwiseAndExpression`, `BitwiseIncOrExpression`, `ShiftExpression` |
| 比较运算符 | `<`, `>`, `<=`, `>=` | `RelationalExpression` |
| 等值运算符 | `==`, `!=`, `===`, `!==` | `EqualityExpression` |
| 逻辑运算符 | `&&`, `\|\|`, `and`, `or`, `xor` | `LogicalAndExpression`, `LogicalIncOrExpression` |
| 空合并运算符 | `??` | `CoalesceExpression` |
| 宇宙飞船运算符 | `<=>` | `SpaceshipExpression` |
| 幂运算符 | `**` | `ExponentiationExpression` |
| 字符串连接 | `.` | `AdditiveExpression`（op='.'） |
| 自增/自减 | `++`, `--` | `PrefixIncDecExpression`, `PostfixIncDecExpression` |
| 赋值运算符 | `=`, `+=`, `-=`, `**=` 等 | `AssignmentExpression` |
| 三元运算符 | `?:` | `ConditionalExpression` |
| instanceof | `instanceof typeRef` | `InstanceOfExpression` |
| new | `New typeRef arguments?` | `NewExpression` |
| clone | `Clone expression` | `CloneExpression` |
| 类型转换 | `(type) expr` | `CastExpression` |
| 错误抑制 | `@expr` | `UnaryOperatorExpression`（op='@'） |
| Typeof | `clrtypeof` | `Typeof` token |

#### 注解（PHP 8）
| 特性 | 语法规则 |
|------|---------|
| 注解组 | `attributes: attributeGroup+` |
| 注解 | `attribute: qualifiedNamespaceName arguments?` |

---

## 2. 不支持的 PHP 特性

### 永远不会支持

以下特性与 Java 根本不兼容，或属于明确的设计决策：

| 特性 | 原因 |
|------|------|
| `goto` 语句 | Java 中没有对应概念 |
| `declare` 语句 | Java 中没有对应概念 |
| 函数内的 `static` 变量 | Java 中没有对应概念 |
| `global $var` | Java 中没有全局变量概念 |
| Shebang（`#!/usr/bin/php`） | Java 不使用 shebang |
| `<?=` 短标签 | 不需要；`echo` 语句已覆盖此功能 |
| Shell 风格注释（`#`） | 与 PHP 8 注解语法 `#[...]` 冲突 |
| 引用参数（`&$var`） | Java 没有引用传递 |
| 闭包中的 `use()` 子句 | Java lambda 以不同方式捕获外部变量 |
| 可变变量（`$$var`） | Java 中没有动态变量名概念 |
| `Mixed` 类型提示 | Java 中没有对应概念，统一使用 `Object` |
| `unset()` 强制转换 | Java 中没有对应概念 |
| 匿名类 | 有限支持 — 仅支持简单场景，且不支持 `use()` 子句 |
| 反引号字符串 | Java 中没有 shell 命令执行语法 |
| `trait` 语句 | Java 中没有 trait 概念 |
| 任意表达式上的注解 | 语法覆盖不完整，行为不可预测 |
| 冒号风格替代语法（`endif;`、`endwhile;`） | ✅ 已支持（if/elseif/else、while、for、foreach、switch） |

### 暂不支持 — 后续可能会实现

| 特性 | 说明 |
|------|------|
| `match` 表达式 | 计划未来支持 |

---

## 3. JHP 特有的语法扩展

这些是 JHP 添加的**非标准 PHP 语法**：

### JHP 泛型类型参数语法
```php
// PHP 本身不存在泛型语法。JHP 使用带冒号标记的尖括号：

class Box<:T:> {}
function getFirst<:T:>(array<:T:> $arr): T { }
```

### 闭包类型注解
```php
// 为多行闭包指定目标函数式接口
#[Type("Function<Integer, String>")]
$fn = function(int $x): string { return strval($x); };
```

### JavaDoc 注解
```php
// 翻译后直接原样转为 Java 注解（不是注释）
#[JavaDoc("@param name 用户姓名")]
#[JavaDoc("@return 问候信息")]
public function greet(string $name): string { ... }
// → 翻译为:
// @JavaDoc("@param name 用户姓名")
// @JavaDoc("@return 问候信息")
// public String greet(String name) { ... }
```

### 箭头函数（PHP 7.4 标准 + JHP 扩展）
```php
// 标准 PHP 7.4 写法：
$fn = fn($x) => $x * 2;

// JHP 也支持显式返回类型：
$fn = fn($x): int => $x * 2;
```

---

## 4. 类型映射详情

### PHP → Java 类型映射

| PHP 类型 | Java 类型 |
|----------|-----------|
| `int`, `integer` | `Integer` |
| `long`, `int64` | `Long` |
| `float`, `double` | `Double` |
| `bool`, `boolean` | `Boolean` |
| `string` | `String` |
| `array`（列表） | `ArrayList<Object>`（推断元素类型） |
| `array`（关联） | `HashMap<Object, Object>`（推断键/值类型） |
| `callable` | `Object` |
| `void` | `void` |
| `null` | `null` |
| `resource` | `Object` |
| `object` | `Object` |

### 表达式 → Java 运算映射

| PHP 运算符 | Java 运算符 |
|-----------|-------------|
| `.`（字符串连接） | `+`（配合 `String.valueOf()` 包装） |
| `===` | `.equals()` |
| `!==` | `!.equals()` |
| `??` | `!= null ? left : right`（三元表达式） |
| `<=>` | `.compareTo()` |
| `**` | `Math.pow()` |
| `and`, `or`, `xor` | `&&`, `\|\|`, `^` |
| `@`（抑制错误） | **忽略** |
| `clone` | **通过类复制或构造函数处理** |

### PHP 数组 → Java 集合

```php
// PHP 列表
$arr = [1, 2, 3];
// → ArrayList<Integer>

// PHP 关联数组
$arr = ['a' => 1, 'b' => 2];
// → HashMap<String, Integer>

// 数组访问
$arr[0]     → $arr.get(0)        // List 的情况
$arr['key'] → $arr.get("key")    // Map 的情况
$arr[0][1]  → JhpRuntime.arrayGet($arr, 0, 1)
```

### 字符串索引
```php
$str[5]  → String.valueOf($str.charAt(5))
```

---

## 5. 运行时库（JhpRuntime）

位置：`src/runtime/JhpRuntime.java`

### 可用函数

| PHP 函数 | Java 等价 |
|---------|----------|
| `echo($a, $b, ...)` | `JhpRuntime.echo(Object... args)` |
| `print_r($obj)` | `JhpRuntime.print_r(Object obj)` |
| `strlen($str)` | `JhpRuntime.strlen(String str)` → `Long` |
| `substr($str, $start, $len)` | `JhpRuntime.substr(String, int, int)` |
| `substr($str, $start)` | `JhpRuntime.substr(String, int)` |
| `strtolower($str)` | `JhpRuntime.strtolower(String)` |
| `strtoupper($str)` | `JhpRuntime.strtoupper(String)` |
| `trim($str)`, `ltrim`, `rtrim` | `JhpRuntime.trim/ltrim/rtrim(String)` |
| `implode($glue, $pieces)` | `JhpRuntime.implode(String, List<String>)` |
| `explode($delim, $str)` | `JhpRuntime.explode(String, String)` → `List<String>` |
| `join($glue, $pieces)` | `JhpRuntime.join(String, List<String>)` |
| `split($delim, $str)` | `JhpRuntime.split(String, String)` → `List<String>` |
| `count($arr)` | `JhpRuntime.count(Object)` → `Long` |
| `sprintf($fmt, ...)` | `JhpRuntime.sprintf(String, Object...)` |
| `arrayGet($arr, $key)` | `JhpRuntime.arrayGet(Object, Object)` |
| `arraySet($arr, $idx, $val)` | `JhpRuntime.arraySet(Object, Object...)` |

### 内置函数注册

`builtin_functions.properties` 中的函数：
```
count=Long
split=List<String>
join=String
implode=String
explode=List<String>
substr=String
strtolower=String
strtoupper=String
trim=String
ltrim=String
rtrim=String
sprintf=String
```

---

## 6. 编译流程

### 单文件流程（模式 1/2）
1. PHP 解析 → ANTLR 解析树
2. 通过 `SymbolCollector` 收集符号（类、方法）
3. 创建 `GlobalSymbolTable`
4. 将顶层代码包装在生成的同名主类中
5. 创建带模式和类名的 `JhpVisitor`
6. 遍历解析树 → 生成 Java 代码
7. 编译并可选运行

### 单文件流程（模式 3/4）
1. PHP 解析 → ANTLR 解析树
2. 通过 `SymbolCollector` 收集符号
3. 创建 `GlobalSymbolTable`
4. 创建带模式的 `JhpVisitor`
5. 遍历解析树 → 直接输出 Java 代码（无包裹类）
6. 可选编译

### 目录流程
1. 遍历所有 `.php`/`.jhp` 文件
2. **阶段 1**：从所有文件收集符号到 `GlobalSymbolTable`
3. **阶段 2**：翻译每个文件，注入全局表以支持跨文件类型解析

### 代码生成架构

```
PHP 源代码
    ↓
JhpLexer + JhpParser (ANTLR)
    ↓
ParseTree (JhpParser.phpFile)
    ↓
JhpVisitor（遍历树）
    ├── visitPhpFile() → class 包裹（模式 1/2）或直接输出（模式 3）
    ├── visitNamespaceDeclaration() → package 声明
    ├── visitImportStatement() → import 声明
    ├── visitClassDeclaration() → ClassProcessor
    ├── visitEnumDeclaration() → EnumProcessor
    ├── visitFunctionDeclaration() → 方法签名
    └── visitStatement() → 各语句处理器
            ↓
        ExpressionProcessor（表达式路由）
            ├── AtomicExpressionProcessor（标量/链式/数组）
            ├── BinaryExpressionProcessor（二元运算）
            └── UnaryExpressionProcessor（一元运算/类型转换）
            ↓
        VariableProcessor（变量声明/赋值/类型推断）
            ↓
        JhpUtils（类型映射）
            ↓
        Java 代码（PrintWriter）
```

---

## 7. 作用域与变量管理

- `VariableProcessor` 维护 `varTypes` 映射：变量名 → 类型
- 作用域通过 `enterScope()` / `leaveScope()` 管理，使用 `Deque<Map>` 栈
- 泛型绑定按变量存储在 `varGenericBindings` 中
- 函数返回类型存储在 `funcReturnTypes` 映射中
- `GlobalSymbolTable` 提供跨文件符号解析

---

## 8. 关键实现说明

### 类型推断
- `InferType` 类处理表达式类型推断
- 数组：根据是否有 `=>` 判断是 `ArrayList` 还是 `HashMap`
- 方法返回类型：通过 `SymbolCollector` → `GlobalSymbolTable` 查询
- 带方法调用的链式表达式：使用 `类名.方法名` 键查询

### 闭包翻译
- 单行闭包：`function($x): int => $x * 2` → Java lambda `($x) -> $x * 2`
- 多行闭包：需要 `#[Type("Function<...>")]` 注解 → 匿名内部类

### 类常量翻译
- `self::CONST` → `ClassName.CONST`（或 `this.CONST`）
- `parent::method()` → `super.method()`
- `__CLASS__`、`__METHOD__` 等 → `AtomicExpressionProcessor` 处理

---

## 9. 局限性与已知问题

1. **类型推断基础** - 类型无法确定时默认使用 `Object`
2. **无空安全** - PHP 的松散类型映射到 Java 引用类型时没有空检查
3. **整数除法** - PHP `$x / $y` 是浮点除法，Java 是整数除法（截断）
4. **`@` 错误抑制** - PHP 错误抑制被静默忽略
5. **跨文件方法解析** - 需要阶段 1 符号收集才能正常工作
6. **变量类型一旦确定不可更改** - 由于 JHP 编译为 Java（静态类型语言），变量的类型在推断或声明后不能再改变。PHP 中可以写 `$x = 1; $x = "hello";`，但在翻译后的 Java 代码中会失败，因为变量 `$x` 在第一次赋值后会被确定为 `Integer` 类型。
