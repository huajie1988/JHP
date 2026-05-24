/*
PHP grammar (pure PHP only, no HTML mixed, PHP 8 ready).
The MIT License (MIT).
Copyright (c) 2015-2020, Ivan Kochurkin (kvanttt@gmail.com), Positive Technologies.
Copyright (c) 2019-2020, Student Main for php7, php8 support.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

parser grammar JhpParser;

options {
    tokenVocab = JhpLexer;
}

// 入口：纯 PHP 文件（支持 Shebang 和可选的 PHP 开始标记）
phpFile
    : Shebang? namespaceDeclaration? importStatement* topStatement* EOF
    ;

// 原 phpBlock：可以保留作为内部块，但入口已改为 phpFile
phpBlock
    : importStatement* topStatement+
    ;

importStatement
    : (Import | Include | Require | Use) importPath SemiColon
    ;
// namespaceNameList会包含一个更复杂的as语法，而java又不支持类重新取别名
importPath
    : identifier ('\\' identifier)* ('\\' Asterisk)?
    ;

topStatement
    : statement
    | namespaceDeclaration
    | functionDeclaration
    | classDeclaration
    | enumDeclaration
    ;

namespaceDeclaration
    : Namespace namespaceNameList SemiColon
    ;

// namespaceStatement
//    : statement
//    | functionDeclaration
//    | classDeclaration
//    ;

functionDeclaration
    : attributes? Function_ identifier typeParameterListInBrackets? '(' formalParameterList ')' 
      (':' QuestionMark? typeHint)? 
      blockStatement
    ;

classDeclaration
    : attributes? (Private | Public | Protected)? modifier? Partial? (
        classEntryType identifier typeParameterListInBrackets? (Extends qualifiedStaticTypeRef)? (
            Implements interfaceList
        )?
        | Interface identifier typeParameterListInBrackets? (Extends interfaceList)?
    ) OpenCurlyBracket classStatement* CloseCurlyBracket
    ;

classEntryType
    : Class
    | Trait
    ;

interfaceList
    : qualifiedStaticTypeRef (',' qualifiedStaticTypeRef)*
    ;

typeParameterListInBrackets
    : '<:' typeParameterList ':>'
    //暂时不支持默认值泛型
    //| '<:' typeParameterWithDefaultsList ':>'
    //| '<:' typeParameterList ',' typeParameterWithDefaultsList ':>'
    ;

typeParameterList
    : typeParameterDecl (',' typeParameterDecl)*
    ;

typeParameterWithDefaultsList
    : typeParameterWithDefaultDecl (',' typeParameterWithDefaultDecl)*
    ;

typeParameterDecl
    : attributes? identifier
    ;

typeParameterWithDefaultDecl
    : attributes? identifier Eq (qualifiedStaticTypeRef | primitiveType)
    ;

genericDynamicArgs
    : '<:' typeRef (',' typeRef)* ':>'
    ;

// PHP 8 属性支持
attributes
    : attributeGroup+
    ;

attributeGroup
    : AttributeStart (identifier ':')?  attribute (',' attribute)* ']'
    ;

attribute
    : qualifiedNamespaceName arguments?
    ;

innerStatementList
    : innerStatement*
    ;

innerStatement
    : statement
    | functionDeclaration
    | classDeclaration
    ;

// Statements

statement
    // identifier ':'
    : blockStatement
    | ifStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | switchStatement
    | breakStatement
    | continueStatement
    | returnStatement
    // | staticVariableStatement
    | echoStatement
    | expressionStatement
    | foreachStatement
    | tryCatchFinally
    | throwStatement
    // | declareStatement
    | emptyStatement_
    | attributes expressionStatement   // 新增：允许属性修饰表达式语句
    ;

emptyStatement_
    : SemiColon
    ;

blockStatement
    : OpenCurlyBracket innerStatementList CloseCurlyBracket
    ;

ifStatement
    : If parentheses statement elseIfStatement* elseStatement?
    | If parentheses ':' innerStatementList elseIfColonStatement* elseColonStatement? EndIf SemiColon
    ;

elseIfStatement
    : ElseIf parentheses statement
    ;

elseIfColonStatement
    : ElseIf parentheses ':' innerStatementList
    ;

elseStatement
    : Else statement
    ;

elseColonStatement
    : Else ':' innerStatementList
    ;

whileStatement
    : While parentheses (statement | ':' innerStatementList EndWhile SemiColon)
    ;

doWhileStatement
    : Do statement While parentheses SemiColon
    ;

forStatement
    : For '(' forInit? SemiColon expressionList? SemiColon forUpdate? ')' (
        statement
        | ':' innerStatementList EndFor SemiColon
    )
    ;

forInit
    : expressionList
    ;

forUpdate
    : expressionList
    ;

switchStatement
    : Switch parentheses (
        OpenCurlyBracket SemiColon? switchBlock* CloseCurlyBracket
        | ':' SemiColon? switchBlock* EndSwitch SemiColon
    )
    ;

// 建议修改 JhpParser.g4
switchBlock
    : Case expression (':' | ';') switchBlockBody
    | Default (':' | ';') switchBlockBody
    ;
    
switchBlockBody
    : innerStatementList
    ;

breakStatement
    : Break expression? SemiColon
    ;

continueStatement
    : Continue expression? SemiColon
    ;

returnStatement
    : Return expression? SemiColon
    ;

expressionStatement
    : expression SemiColon
    ;

foreachStatement
    : Foreach (
        '(' expression As arrayDestructuring ')'
        | '(' chain As assignable ('=>' chain)? ')'
        | '(' expression As assignable ('=>' chain)? ')'
        | '(' chain As List '(' assignmentList ')' ')'
    ) (statement | ':' innerStatementList EndForeach SemiColon)
    ;

tryCatchFinally
    : Try blockStatement (catchClause+ finallyStatement? | catchClause* finallyStatement)
    ;

catchClause
    : Catch '(' qualifiedStaticTypeRef ('|' qualifiedStaticTypeRef)* VarName ')' blockStatement
    ;

finallyStatement
    : Finally blockStatement
    ;

throwStatement
    : Throw expression SemiColon
    ;


formalParameterList
    : formalParameter? (',' formalParameter)* ','?
    ;

formalParameter
    : attributes? memberModifier* QuestionMark? typeHint '...'? variableInitializer
    ;

// 支持联合类型 (PHP 8)
typeHint
    : primitiveType
    | qualifiedStaticTypeRef
    | Callable
    | typeHint '|' typeHint
    ;

echoStatement
    : Echo expressionList SemiColon
    ;

staticVariableStatement
    : Static variableInitializer (',' variableInitializer)* SemiColon
    ;

classStatement
    : attributes? (
        propertyModifiers typeHint variableInitializer (',' variableInitializer)* SemiColon
        | memberModifiers? (
            Const typeHint? identifierInitializer (',' identifierInitializer)* SemiColon
            | Function_ identifier typeParameterListInBrackets? '(' formalParameterList ')' (
                returnTypeDecl
                | baseCtorCall
                //baseCtorCall语法理论上不应该存在，即在方法定义时就需调用父类构造函数，目前暂不支持，但语法规则暂时保留，后续考虑删除
            )? methodBody
        )
    )
    | Use qualifiedNamespaceNameList traitAdaptations
    ;

traitAdaptations
    : SemiColon
    | OpenCurlyBracket traitAdaptationStatement* CloseCurlyBracket
    ;

traitAdaptationStatement
    : traitPrecedence
    | traitAlias
    ;

traitPrecedence
    : qualifiedNamespaceName '::' identifier InsteadOf qualifiedNamespaceNameList SemiColon
    ;

traitAlias
    : traitMethodReference As (memberModifier | memberModifier? identifier) SemiColon
    ;

traitMethodReference
    : (qualifiedNamespaceName '::')? identifier
    ;

baseCtorCall
    : ':' identifier arguments?
    ;

returnTypeDecl
    : ':' QuestionMark? typeHint
    ;

methodBody
    : SemiColon
    | blockStatement
    ;

propertyModifiers
    : memberModifiers
    // | Var
    ;

memberModifiers
    : memberModifier+
    ;

variableInitializer
    : VarName (Eq constantInitializer)?
    ;

identifierInitializer
    : identifier Eq constantInitializer
    ;


// PHP 8 枚举
enumDeclaration
    : attributes? Enum_ name=identifier
        (Colon typeHint (',' typeHint)*)?
        (OpenRoundBracket fieldNames+=identifier (',' fieldNames+=identifier)* CloseRoundBracket)?
        (Implements interfaceList)?
        OpenCurlyBracket enumItem* CloseCurlyBracket
    ;

enumItem
    : Case identifier (Eq '(' expression (',' expression)* ')')? SemiColon
    | memberModifiers? functionDeclaration
    //| Use qualifiedNamespaceNameList traitAdaptations
    ;

expressionList
    : expression (',' expression)*
    ;

parentheses
    : '(' expression ')'
    ;

// Expressions
expression
    : Clone expression                                            # CloneExpression
    | newExpr                                                     # NewExpression
    | stringConstant '[' expression ']'                           # IndexerExpression
    | '(' castOperation ')' expression                            # CastExpression
    | ('~' | '@') expression                                      # UnaryOperatorExpression
    | ('!' | '+' | '-') expression                                # UnaryOperatorExpression
    | ('++' | '--') chain                                         # PrefixIncDecExpression
    | chain ('++' | '--')                                         # PostfixIncDecExpression
    | Print expression                                            # PrintExpression
    | arrayCreation                                               # ArrayCreationExpression
    | chain                                                       # ChainExpression
    | constant                                                    # ScalarExpression
    | string                                                      # ScalarExpression
    | Label                                                       # ScalarExpression
    // | BackQuoteString                                             # BackQuoteStringExpression
    | parentheses                                                 # ParenthesisExpression
    | lambdaFunctionExpr                                          # LambdaFunctionExpression
    //| Function_ '(' formalParameterList ')' ':' typeHint blockStatement    # MultiLineClosureExpression
    //| LambdaFn '(' formalParameterList ')' '=>' expression                # SingleLineClosureExpression
    | matchExpr                                                   # MatchExpression
    | <assoc = right> expression op = '**' expression             # ExponentiationExpression
    | expression InstanceOf typeRef                               # InstanceOfExpression
    | expression op = ('*' | Divide | '%') expression             # MultiplicativeExpression
    | expression op = ('+' | '-' | '.') expression                # AdditiveExpression
    | expression op = ('<<' | '>>') expression                    # ShiftExpression
    | expression op = (Less | '<=' | Greater | '>=') expression   # RelationalExpression
    | expression op = ('===' | '!==' | '==' | IsNotEq) expression # EqualityExpression
    | expression op = '&' expression                              # BitwiseAndExpression
    | expression op = '^' expression                              # BitwiseExcOrExpression
    | expression op = '|' expression                              # BitwiseIncOrExpression
    | expression op = '&&' expression                             # LogicalAndExpression
    | expression op = '||' expression                             # LogicalIncOrExpression
    | expression op = QuestionMark expression? ':' expression     # ConditionalExpression
    | expression op = '??' expression                             # CoalesceExpression
    | expression op = '<=>' expression                            # SpaceshipExpression
    // | Throw expression                                            # SpecialWordExpression
    | arrayDestructuring Eq expression                            # ArrayDestructExpression
    //| assignable assignmentOperator attributes? hereDocString     # AssignmentExpression
    | assignable assignmentOperator attributes? expression        # AssignmentExpression
    // | assignable Eq attributes? '&' (chain | newExpr)             # AssignmentExpression
    | expression op = LogicalAnd expression                       # LogicalAndExpression
    | expression op = LogicalXor expression                       # LogicalExcOrExpression
    | expression op = LogicalOr expression                        # LogicalIncOrExpression
    ;

assignable
    : chain
    | arrayCreation
    ;

arrayCreation
    : (Array '(' arrayItemList? ')' | '[' arrayItemList? ']') ('[' expression ']')?
    ;

arrayDestructuring
    : '[' ','* indexedDestructItem (','+ indexedDestructItem)* ','* ']'
    | '[' keyedDestructItem (','+ keyedDestructItem)* ','? ']'
    ;

indexedDestructItem
    : chain
    ;

keyedDestructItem
    : (expression '=>')? chain
    ;

// 箭头函数 fn() => expr (PHP 7.4+)
 lambdaFunctionExpr
    :Function_ '(' formalParameterList ')' (':' typeHint)? blockStatement
    // : Static? Function_ '&'? '(' formalParameterList ')' lambdaFunctionUseVars? (':' typeHint)? blockStatement
    | LambdaFn '(' formalParameterList ')' '=>' expression
    ;

matchExpr
    : Match_ '(' expression ')' OpenCurlyBracket matchItem (',' matchItem)* ','? CloseCurlyBracket
    ;

matchItem
    : expression (',' expression)* '=>' expression
    ;

newExpr
    : New typeRef arguments?
    ;

assignmentOperator
    : Eq
    | '+='
    | '-='
    | '*='
    | '**='
    | '/='
    | '.='
    | '%='
    | '&='
    | '|='
    | '^='
    | '<<='
    | '>>='
    | '??='
    ;

arrayItemList
    : arrayItem (',' arrayItem)* ','?
    ;

arrayItem
    : expression ('=>' expression)?
    // | (expression '=>')? '&' chain
    ;

// lambdaFunctionUseVars
//    : Use '(' lambdaFunctionUseVar (',' lambdaFunctionUseVar)* ')'
//    ;

// lambdaFunctionUseVar
//    : '&'? VarName
//    ;

qualifiedStaticTypeRef
    : qualifiedNamespaceName genericDynamicArgs?
    | Static
    ;

typeRef
    : (qualifiedNamespaceName | indirectTypeRef) genericDynamicArgs?
    | primitiveType
    | Static
    | anonymousClass
    ;

anonymousClass
    : attributes? Private? modifier? Partial? (
        classEntryType typeParameterListInBrackets? (Extends qualifiedStaticTypeRef)? (
            Implements interfaceList
        )?
        | Interface identifier typeParameterListInBrackets? (Extends interfaceList)?
    ) OpenCurlyBracket classStatement* CloseCurlyBracket
    ;

indirectTypeRef
    : chainBase ('->' keyedFieldName)*
    ;

qualifiedNamespaceName
    // Namespace?
    : '\\'? namespaceNameList
    ;

namespaceNameList
    : identifier
    | identifier ('\\' identifier)* ('\\' namespaceNameTail)?
    ;

namespaceNameTail
    : identifier (As identifier)?
    | OpenCurlyBracket namespaceNameTail (',' namespaceNameTail)* ','? CloseCurlyBracket
    ;

qualifiedNamespaceNameList
    : qualifiedNamespaceName (',' qualifiedNamespaceName)*
    ;

arguments
    : '(' (actualArgument (',' actualArgument)*)? ','? ')'
    ;

actualArgument
    : argumentName? '...'? (typeRefWithGenerics | expression)
    // | '&' chain
    ;

typeRefWithGenerics
    : qualifiedNamespaceName genericDynamicArgs
    ;

argumentName
    : identifier (':'|'=')
    ;

constantInitializer
    : constant
    | string
    | Array '(' (arrayItemList ','?)? ')'
    | '[' (arrayItemList ','?)? ']'
    | ('+' | '-') constantInitializer
    | (string | constant) ('.' (string | constant))*
    ;

constant
    : Null
    | literalConstant
    | magicConstant
    | classConstant
    | qualifiedNamespaceName
    ;

literalConstant
    : Real
    | BooleanConstant
    | numericConstant
    | stringConstant
    ;

numericConstant
    : Octal
    | Decimal
    | Hex
    | Binary
    ;

classConstant
    : (Class | Parent_) '::' (identifier | Constructor | Get | Set)
    | (qualifiedStaticTypeRef | keyedVariable | string) '::' (
        identifier
        | keyedVariable
    )
    ;

stringConstant
    : Label
    ;

string
    : StartHereDoc HereDocText+ EndHereDoc
    | StartNowDoc HereDocText+ EndNowDoc
    | SingleQuoteString
    | DoubleQuote interpolatedStringPart* DoubleQuote
    ;

interpolatedStringPart
    : StringPart
    | UnicodeEscape
    | chain
    ;

chainList
    : chain (',' chain)*
    ;

chain
    : chainOrigin memberAccess*
    ;

chainOrigin
    : chainBase
    | functionCall
    | '(' newExpr ')'
    ;

memberAccess
    : '->' keyedFieldName actualArguments?
    ;

functionCall
    : functionCallName actualArguments
    ;

functionCallName
    : qualifiedNamespaceName
    | classConstant
    | chainBase
    | parentheses
    ;

actualArguments
    : genericDynamicArgs? arguments+ squareCurlyExpression*
    ;

chainBase
    : keyedVariable ('::' keyedVariable)?
    | qualifiedStaticTypeRef '::' keyedVariable
    ;

keyedFieldName
    : keyedSimpleFieldName
    | keyedVariable
    ;

keyedSimpleFieldName
    : (identifier | OpenCurlyBracket expression CloseCurlyBracket) squareCurlyExpression*
    ;

keyedVariable
    : Dollar* (VarName | Dollar OpenCurlyBracket expression CloseCurlyBracket) squareCurlyExpression*
    ;

squareCurlyExpression
    : '[' expression? ']'
    | OpenCurlyBracket expression CloseCurlyBracket
    ;

assignmentList
    : assignmentListElement? (',' assignmentListElement?)*
    ;

assignmentListElement
    : chain
    | List '(' assignmentList ')'
    | arrayItem
    ;

modifier
    : Abstract
    | Final
    ;

identifier
    : Label
    | Abstract
    // | Array
    | As
    | BinaryCast
    // | BoolType
    | BooleanConstant
    | Break
    | Callable
    | Case
    | Catch
    | Class
    | Clone
    | Const
    | Continue
    // | Declare
    // | Default
    | Do
    // | DoubleCast
    // | DoubleType
    | Echo
    | Else
    | ElseIf
    // | Empty
    // | EndDeclare
    | EndFor
    | EndForeach
    | EndIf
    | EndSwitch
    | EndWhile
    // | Eval
    // | Exit
    | Extends
    | Final
    | Finally
    // | FloatCast
    | For
    | Foreach
    | Function_
    // | Global
    // | Goto
    | If
    | Implements
    // | Import
    // | Include
    // | IncludeOnce
    | InstanceOf
    | InsteadOf
    // | Int16Cast
    // | Int64Type
    // | Int8Cast
    | Interface
    // | IntType
    // | IsSet
    // | LambdaFn
    | List
    | LogicalAnd
    | LogicalOr
    | LogicalXor
    // | Namespace
    // | New
    | Null
    | ObjectType
    | Parent_
    | Partial
    | Print
    | Private
    | Protected
    | Public
    | Readonly
    // | Require
    // | RequireOnce
    | Resource
    | Return
    | Static
    | StringType
    | Switch
    | Throw
    | Trait
    | Try
    | Typeof
    | UintCast
    | UnicodeCast
    // | Unset
    // | Use
    | Var
    | While
    // | Yield
    // | From
    | Enum_
    | Match_
    // | Ticks
    // | Encoding
    // | StrictTypes
    | Get
    | Set
    | Call
    | CallStatic
    | Constructor
    | Destruct
    | Wakeup
    | Sleep
    | Autoload
    // | IsSet__
    // | Unset__
    | ToString__
    | Invoke
    | SetState
    | Clone__
    | DebugInfo
    | Namespace__
    | Class__
    | Traic__
    | Function__
    | Method__
    | Line__
    | File__
    | Dir__
    ;

memberModifier
    : Public
    | Protected
    | Private
    | Static
    | Abstract
    | Final
    | Readonly
    ;

magicConstant
    : Namespace__
    | Class__
    | Traic__
    | Function__
    | Method__
    | Line__
    | File__
    | Dir__
    ;

primitiveType
    : BoolType
    | IntType
    | Int64Type
    | DoubleType
    | FloatCast
    | StringType
    | Resource
    | ObjectType
    | Array
    ;

castOperation
    : BoolType
    | Int8Cast
    | Int16Cast
    | IntType
    | Int64Type
    | UintCast
    | DoubleCast
    | DoubleType
    | FloatCast
    | StringType
    | BinaryCast
    | UnicodeCast
    | Array
    | ObjectType
    | Resource
    | qualifiedStaticTypeRef
    // | Unset
    ;