# JHP - PHP to Java Compiler

A compiler that translates PHP source code into Java. Built with ANTLR 4 for parsing and a custom translation framework.

## Project Structure

```
JHP/
├── src/
│   ├── JhpLexer.g4           # Lexer grammar (PHP tokenization)
│   ├── JhpParser.g4          # Parser grammar (PHP syntax)
│   ├── Main.java             # Entry point, compilation modes
│   ├── TestParser.java       # Simple parser test
│   ├── compiler/
│   │   ├── JhpVisitor.java         # Main visitor orchestrator
│   │   ├── ExpressionProcessor.java    # Routes expressions to handlers
│   │   ├── AtomicExpressionProcessor.java  # Scalars, chains, arrays, calls
│   │   ├── BinaryExpressionProcessor.java  # Binary operations
│   │   ├── UnaryExpressionProcessor.java  # Unary ops, casts, new
│   │   ├── VariableProcessor.java    # Variable declarations, assignment, type inference
│   │   ├── ClassProcessor.java      # Class/interface/trait translation
│   │   ├── EnumProcessor.java       # PHP 8 enum translation
│   │   ├── ClosureProcessor.java    # Lambda/closure handling
│   │   ├── InferType.java           # Type inference engine
│   │   ├── JhpUtils.java            # Type mapping, utilities
│   │   ├── BuiltinConfig.java       # Builtin function registry
│   │   ├── SymbolCollector.java     # Cross-file symbol collection
│   │   ├── GlobalSymbolTable.java   # Global symbol storage
│   │   └── JhpCompilationException.java
│   ├── runtime/
│   │   └── JhpRuntime.java    # Runtime library (echo, arrays, strings)
│   └── resources/
│       └── builtin_functions.properties  # Builtin function signatures
```

## Compilation Usage

```bash
# Single file modes
java Main <input.php> 1 [ClassName]   # Mode 1: translate + compile + run
java Main <input.php> 2 [ClassName]   # Mode 2: translate + compile only
java Main <input.php> 3 [ClassName]   # Mode 3: translate only

# Directory modes
java Main -srcdir <dir> [-outdir <dir>] [-mode <mode>]
java Main -d <dir> -o <dir> -m 3      # Translate directory
java Main -d <dir> -m 4               # Translate + compile directory

# Collect symbols (for debugging)
java Main -collect <input.php>
```

**Modes:**
- `1` - Single file: wrap in generated main class → translate → compile → run
- `2` - Single file: wrap in generated main class → translate → compile (produces .class)
- `3` - File with class(es): translate as-is, no wrapper class added. Can also translate single file.
- `4` - Directory: translate → compile (.class files)

**Mode 1/2 behavior**: For PHP files without class definitions, the translator automatically wraps all top-level code in a generated public class named after the input file. Functions become static methods, and top-level statements go into the `main` method.

**Mode 3/4 behavior**: For PHP files that already contain class/interface/enum definitions, translation outputs them as-is without adding any wrapper class. Can also translate a single file.

---

## 1. SUPPORTED PHP Features

### Grammar Rule References (JhpParser.g4)

#### Language Constructs
| Feature | Grammar Rule | Notes |
|---------|-------------|-------|
| Namespace declarations | `namespaceDeclaration` | Translated to Java `package` |
| Import statements | `importStatement` | `import`, `require`, `include`, `use` |

#### Control Flow
| Feature | Grammar Rule |
|---------|-------------|
| if/elseif/else | `ifStatement` |
| while loop | `whileStatement` |
| do-while loop | `doWhileStatement` |
| for loop | `forStatement` |
| foreach loop | `foreachStatement` |
| switch statement | `switchStatement` |
| break/continue | `breakStatement`, `continueStatement` |
| return | `returnStatement` |
| try/catch/finally | `tryCatchFinally` |
| throw | `throwStatement` |

#### Functions
| Feature | Grammar Rule |
|---------|-------------|
| Function declaration | `functionDeclaration` |
| Parameters | `formalParameterList`, `formalParameter` |
| Return type hints | `returnTypeDecl` (`: typeHint?`) |
| Variable arguments | `formalParameter: '...'?` |
| Arrow functions (PHP 7.4+) | `lambdaFunctionExpr: LambdaFn '(' ')' '=>' expression` |
| Multi-line closures | `lambdaFunctionExpr: Function_ '(' ')' ':'? typeHint? blockStatement` |
| Named arguments | `argumentName: identifier (':' | '=')` |

#### Classes & OOP
| Feature | Grammar Rule | Notes |
|---------|-------------|-------|
| Class declaration | `classDeclaration` | |
| Interface | `classDeclaration` (with `Interface` keyword) | |
| Abstract class | `classEntryType: Class` + `modifier: Abstract` | |
| Final class | `modifier: Final` | |
| Inheritance (extends) | `classDeclaration: Extends qualifiedStaticTypeRef` | |
| Implementation (implements) | `classDeclaration: Implements interfaceList` | |
| Properties | `classStatement: propertyModifiers typeHint variableInitializer` | |
| Constants | `classStatement: Const typeHint? identifierInitializer` | |
| Methods | `classStatement: Function_ identifier` | |
| Constructor | `methodName: __construct` → class name | |
| Access modifiers | `memberModifier: Public \| Private \| Protected` | |
| Static members | `memberModifier: Static` | |
| Anonymous classes | `anonymousClass` | |

#### Enums (PHP 8)
| Feature | Grammar Rule |
|---------|-------------|
| Enum declaration | `enumDeclaration` |
| Enum with values | `enumItem: Case identifier Eq '(' expression (',' expression)* ')'` |
| Enum methods | `enumItem: memberModifiers? functionDeclaration` |
| Enum implements interface | `enumDeclaration: Implements interfaceList` |

#### Types
| Feature | Grammar Rule |
|---------|-------------|
| Primitive types | `primitiveType: BoolType, IntType, DoubleType, StringType, ...` |
| Class type hints | `typeHint: qualifiedStaticTypeRef` |
| Nullable types | `typeHint: QuestionMark? typeHint` |
| Union types (PHP 8) | `typeHint: typeHint '\|' typeHint` |
| Callable type | `typeHint: Callable` |
| Readonly | `memberModifier: Readonly` |

#### Expressions
| Category | Operations | Grammar Rules |
|----------|------------|---------------|
| Primary | variables, literals, strings | `chain`, `scalar`, `string` |
| Array | creation, indexing | `arrayCreation`, `arrayDestructuring`, `indexedDestructItem` |
| Heredoc/Nowdoc | `<<<EOF` | `StartHereDoc`, `StartNowDoc` |
| Operators - Arithmetic | `+`, `-`, `*`, `/`, `%` | `AdditiveExpression`, `MultiplicativeExpression` |
| Operators - Bitwise | `&`, `\|`, `^`, `<<`, `>>` | `BitwiseAndExpression`, `BitwiseIncOrExpression`, `ShiftExpression` |
| Operators - Comparison | `<`, `>`, `<=`, `>=` | `RelationalExpression` |
| Operators - Equality | `==`, `!=`, `===`, `!==` | `EqualityExpression` |
| Operators - Logical | `&&`, `\|\|`, `and`, `or`, `xor` | `LogicalAndExpression`, `LogicalIncOrExpression` |
| Operators - Null coalescing | `??` | `CoalesceExpression` |
| Operators - Spaceship | `<=>` | `SpaceshipExpression` |
| Operators - Exponentiation | `**` | `ExponentiationExpression` |
| Operators - String concat | `.` | `AdditiveExpression` (op='.') |
| Increment/Decrement | `++`, `--` | `PrefixIncDecExpression`, `PostfixIncDecExpression` |
| Assignment | `=`, `+=`, `-=`, `**=`, etc. | `AssignmentExpression` |
| Ternary | `?:` | `ConditionalExpression` |
| instanceof | `instanceof typeRef` | `InstanceOfExpression` |
| new | `New typeRef arguments?` | `NewExpression` |
| clone | `Clone expression` | `CloneExpression` |
| cast | `(type) expr` | `CastExpression` |
| Error suppression | `@expr` | `UnaryOperatorExpression` (op='@') |
| Typeof | `clrtypeof` | `Typeof` token |

#### Attributes (PHP 8)
| Feature | Grammar Rule |
|---------|-------------|
| Attribute groups | `attributes: attributeGroup+` |
| Attribute | `attribute: qualifiedNamespaceName arguments?` |

---

## 2. UNSUPPORTED PHP Features

### Never Will Be Supported

These features are fundamentally incompatible with Java or are design decisions:

| Feature | Reason |
|---------|--------|
| `goto` statement | No equivalent in Java |
| `declare` statement | No equivalent in Java |
| `static` variables inside functions | No equivalent in Java |
| `global $var` | No global variable concept in Java |
| Shebang (`#!/usr/bin/php`) | Java doesn't use shebang |
| `<?=` short echo tag | Not needed; `echo` statement covers this |
| Shell-style comments (`#`) | Conflicts with PHP 8 attribute syntax `#[...]` |
| Reference parameters (`&$var`) | Java has no pass-by-reference |
| Closure `use()` clause | Java lambdas capture variables from enclosing scope differently |
| Variable variables (`$$var`) | No dynamic variable name concept in Java |
| `Mixed` type hint | No equivalent in Java; use `Object` uniformly |
| `unset()` cast | No equivalent in Java |
| Anonymous classes | Limited support — only simple cases without `use()` clause |
| Backtick strings | No shell command execution syntax in Java |
| `trait` statements | No trait concept in Java |
| Attributes on arbitrary expressions | Grammar coverage incomplete; behavior unpredictable |
| Colon-style alternative syntax (`endif;`, `endwhile;`) | ✅ Supported (if/elseif/else, while, for, foreach, switch) |

### Temporarily Not Supported — May Be Implemented

| Feature | Notes |
|---------|-------|
| `match` expression | Planned for future support |

---

## 3. JHP-SPECIFIC Syntax Extensions

These are **NOT standard PHP syntax**, added by JHP:

### JHP Generic Type Parameter Syntax
```php
// PHP does not have native generic syntax. JHP uses colon-marked angle brackets:

class Box<:T:> {}
function getFirst<:T:>(array<:T:> $arr): T { }
```

### Closure Type Annotation
```php
// Specify target functional interface for single-line closures
#[Type("Function<: string, string :>")]
$greet = fn(string $name) => "Hello, " . $name;
echo "Greeting: ", $greet("World"), "\n";

// Specify target functional interface for multi-line closures
#[Type("Runnable")]
$runnable = function() : void {
    echo "Running a multi-line closure:\n";
    for ($i = 0; $i < 3; $i++) {
        echo "  Count: ", $i, "\n";
    }
};
$runnable();  // 调用 run

```

### JavaDoc Annotation
```php
// Translated directly as Java annotation in output (not a comment)
#[JavaDoc("@param name The user name")]
#[JavaDoc("@return The greeting message")]
public function greet(string $name): string { ... }
// → Translated as:
// @param name The user name
// @return The greeting message
// public String greet(String name) { ... }
```

### Arrow Function (PHP 7.4 standard + JHP extension)
```php
// Standard PHP 7.4:
$fn = fn($x) => $x * 2;

// JHP also supports explicit return type:
$fn = fn($x): int => $x * 2;
```

---

## 4. Type Mapping Details

### PHP → Java Type Mappings

| PHP Type | Java Type |
|----------|-----------|
| `int`, `integer` | `Integer` |
| `long`, `int64` | `Long` |
| `float`, `double` | `Double` |
| `bool`, `boolean` | `Boolean` |
| `string` | `String` |
| `array` (list) | `ArrayList<Object>` (inferred element type) |
| `array` (assoc) | `HashMap<Object, Object>` (inferred key/value types) |
| `callable` | `Object` |
| `void` | `void` |
| `null` | `null` |
| `resource` | `Object` |
| `object` | `Object` |

### Expression → Java Operations

| PHP Operator | Java Operator |
|--------------|---------------|
| `.` (string concat) | `+` (with `String.valueOf()` wrapper) |
| `===` | `.equals()` |
| `!==` | `!.equals()` |
| `??` | `!= null ? left : right` (ternary) |
| `<=>` | `.compareTo()` |
| `**` | `Math.pow()` |
| `and`, `or`, `xor` | `&&`, `\|\|`, `^` |
| `@` (suppress) | **Ignored** |
| `clone` | **Handled via class copy or constructor** |

### PHP Arrays → Java Collections

```php
// PHP list
$arr = [1, 2, 3];
// → ArrayList<Integer>

// PHP associative
$arr = ['a' => 1, 'b' => 2];
// → HashMap<String, Integer>

// Array access
$arr[0]     → $arr.get(0)        // if List
$arr['key'] → $arr.get("key")    // if Map
$arr[0][1]  → JhpRuntime.arrayGet($arr, 0, 1)
```

### String Indexing
```php
$str[5]  → String.valueOf($str.charAt(5))
```

---

## 5. Runtime Library (JhpRuntime)

Located: `src/runtime/JhpRuntime.java`

### Available Functions

| PHP Function | Java Equivalent |
|--------------|-----------------|
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

### Builtin Function Registration

Functions in `builtin_functions.properties`:
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

## 6. Compilation Process

### Single File Flow (Mode 1/2)
1. Parse PHP → ANTLR parse tree
2. Collect symbols (classes, methods) via `SymbolCollector`
3. Create `GlobalSymbolTable`
4. Wrap top-level code in a generated main class
5. Create `JhpVisitor` with mode and class name
6. Visit parse tree → generate Java code
7. Compile and optionally run

### Single File Flow (Mode 3/4)
1. Parse PHP → ANTLR parse tree
2. Collect symbols via `SymbolCollector`
3. Create `GlobalSymbolTable`
4. Create `JhpVisitor` with mode
5. Visit parse tree → generate Java code as-is (no wrapper)
6. Optionally compile

### Directory Flow
1. Walk all `.php`/`.jhp` files
2. **Phase 1**: Collect symbols from all files into `GlobalSymbolTable`
3. **Phase 2**: Translate each file, injecting the global table for cross-file type resolution

### Code Generation Architecture

```
PHP Source
    ↓
JhpLexer + JhpParser (ANTLR)
    ↓
ParseTree (JhpParser.phpFile)
    ↓
JhpVisitor (walks tree)
    ├── visitPhpFile() → class wrapper (mode 1/2) or direct output (mode 3)
    ├── visitNamespaceDeclaration() → package declaration
    ├── visitImportStatement() → import declaration
    ├── visitClassDeclaration() → ClassProcessor
    ├── visitEnumDeclaration() → EnumProcessor
    ├── visitFunctionDeclaration() → method signature
    └── visitStatement() → statement processors
            ↓
        ExpressionProcessor (routes expressions)
            ├── AtomicExpressionProcessor (scalars/chains/arrays)
            ├── BinaryExpressionProcessor (binary ops)
            └── UnaryExpressionProcessor (unary ops/casts)
            ↓
        VariableProcessor (variable declaration/assignment/type inference)
            ↓
        JhpUtils (type mapping)
            ↓
        Java Code (PrintWriter)
```

---

## 7. Scope & Variable Management

- `VariableProcessor` maintains `varTypes` map: variable name → type
- Scopes managed via `enterScope()` / `leaveScope()` using `Deque<Map>` stack
- Generic type bindings stored per-variable via `varGenericBindings`
- Function return types stored in `funcReturnTypes` map
- `GlobalSymbolTable` provides cross-file symbol resolution

---

## 8. Key Implementation Notes

### Type Inference
- `InferType` class handles inference from expressions
- Arrays: checks for `=>` to determine if `ArrayList` or `HashMap`
- Method return types: looked up via `SymbolCollector` → `GlobalSymbolTable`
- Chains with method calls: uses `ClassName.methodName` key

### Closure Translation
- Single-line closures: `function($x): int => $x * 2` → Java lambda `($x) -> $x * 2`
- Multi-line closures: require `#[Type("Function<...>")]` attribute → anonymous inner class

### Class Constant Translation
- `self::CONST` → `ClassName.CONST` (or `this.CONST`)
- `parent::method()` → `super.method()`
- `__CLASS__`, `__METHOD__`, etc. → magic constants handled in `AtomicExpressionProcessor`

---

## 9. Limitations & Known Issues

1. **Type inference is basic** - defaults to `Object` when types cannot be determined
2. **No null safety** - PHP's loose typing maps to Java reference types without null checks
3. **Integer division** - PHP `$x / $y` does float division; Java does integer division (truncated)
4. **No `@` error suppression** - PHP error suppression is silently ignored
5. **Cross-file method resolution** - Requires phase-1 symbol collection to work properly
6. **Variable type is immutable after declaration** - Since JHP compiles to Java (a statically typed language), once a variable's type is inferred or declared, it cannot be changed. In PHP you can do `$x = 1; $x = "hello";` but this will fail in translated Java code because the variable `$x` will be typed as `Integer` after the first assignment.
