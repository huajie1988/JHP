/*
PHP grammar (pure PHP only, no HTML, no duplicate rules).
The MIT License (MIT).
Copyright (c) 2015-2020, Ivan Kochurkin (kvanttt@gmail.com), Positive Technologies.
Copyright (c) 2019, Thierry Marianne (thierry.marianne@weaving-the-web.org)
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

// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

lexer grammar JhpLexer;

channels {
    PhpComments,
    ErrorLexem,
    SkipChannel
}

// 去掉了 superClass 和 caseInsensitive（ANTLR 4.9 以下不支持）

// ----------------------------------------------
// 顶层模式：只负责识别 PHP 开始标记并切换模式
// ----------------------------------------------

SeaWhitespace  : [ \t\r\n]+ -> channel(HIDDEN);
Shebang        : '#' '!' ~[\r\n]*;   // 简化版，原谓词可用语义 predicate 替代，这里先忽略

PHPStartEcho   : '<?=' -> type(Echo), pushMode(PHP);
PHPStart       : '<?php'? -> channel(SkipChannel), pushMode(PHP);

Error          : . -> channel(ErrorLexem);

// ----------------------------------------------
// mode PHP : 所有 PHP 词法规则
// ----------------------------------------------
mode PHP;

PHPEnd : '?>' -> channel(SkipChannel), popMode;

AttributeStart: '#[';

Whitespace        : [ \t\r\n]+    -> channel(SkipChannel);
MultiLineComment  : '/*' .*? '*/' -> channel(PhpComments);
SingleLineComment : '//'          -> channel(SkipChannel), pushMode(SingleLineCommentMode);
// 暂不支持Shell注释，这会导致其与属性冲突




// 关键字（完整列表同之前，此处省略以免过长，你可复制之前的）
Abstract : 'abstract';
Array : 'array';
As : 'as';
BinaryCast : 'binary';
BoolType : 'bool' 'ean'?;
BooleanConstant : 'true' | 'false';
Break : 'break';
Callable : 'callable';
Case : 'case';
Catch : 'catch';
Class : 'class';
Clone : 'clone';
Const : 'const';
Continue : 'continue';
Declare : 'declare';
Default : 'default';
Do : 'do';
DoubleCast : 'real';
DoubleType : 'double';
Echo : 'echo';
Else : 'else';
ElseIf : 'elseif';
Empty : 'empty';
Enum_ : 'enum';
EndDeclare : 'enddeclare';
EndFor : 'endfor';
EndForeach : 'endforeach';
EndIf : 'endif';
EndSwitch : 'endswitch';
EndWhile : 'endwhile';
Eval : 'eval';
Exit : 'die';
Extends : 'extends';
Final : 'final';
Finally : 'finally';
FloatCast : 'float';
For : 'for';
Foreach : 'foreach';
Function_ : 'function';
Global : 'global';
Goto : 'goto';
If : 'if';
Implements : 'implements';
Import : 'import';
Include : 'include';
IncludeOnce : 'include_once';
InstanceOf : 'instanceof';
InsteadOf : 'insteadof';
Int8Cast : 'int8';
Int16Cast : 'int16';
Int64Type : 'int64' | 'long';
IntType : 'int' 'eger'?;
Interface : 'interface';
IsSet : 'isset';
List : 'list';
LogicalAnd : 'and';
LogicalOr : 'or';
LogicalXor : 'xor';
Match_ : 'match';
Namespace : 'namespace';
New : 'new';
Null : 'null';
ObjectType : 'object';
Parent_ : 'parent';
Partial : 'partial';
Print : 'print';
Private : 'private';
Protected : 'protected';
Public : 'public';
Readonly : 'readonly';
Require : 'require';
RequireOnce : 'require_once';
Resource : 'resource';
Return : 'return';
Static : 'static';
StringType : 'string';
Switch : 'switch';
Throw : 'throw';
Trait : 'trait';
Try : 'try';
Typeof : 'clrtypeof';
UintCast : 'uint' ('8' | '16' | '64')?;
UnicodeCast : 'unicode';
Unset : 'unset';
Use : 'use';
Var : 'var';
While : 'while';
Yield : 'yield';
From : 'from';
LambdaFn : 'fn';
Ticks : 'ticks';
Encoding : 'encoding';
StrictTypes : 'strict_types';

Get : '__get';
Set : '__set';
Call : '__call';
CallStatic : '__callstatic';
Constructor : '__construct';
Destruct : '__destruct';
Wakeup : '__wakeup';
Sleep : '__sleep';
Autoload : '__autoload';
IsSet__ : '__isset';
Unset__ : '__unset';
ToString__ : '__tostring';
Invoke : '__invoke';
SetState : '__set_state';
Clone__ : '__clone';
DebugInfo : '__debuginfo';
Namespace__ : '__namespace__';
Class__ : '__class__';
Traic__ : '__trait__';
Function__ : '__function__';
Method__ : '__method__';
Line__ : '__line__';
File__ : '__file__';
Dir__ : '__dir__';

Spaceship : '<=>';
Lgeneric : '<:';
Rgeneric : ':>';
DoubleArrow : '=>';
Inc : '++';
Dec : '--';
IsIdentical : '===';
IsNoidentical : '!==';
IsEqual : '==';
IsNotEq : '<>' | '!=';
IsSmallerOrEqual : '<=';
IsGreaterOrEqual : '>=';
PlusEqual : '+=';
MinusEqual : '-=';
MulEqual : '*=';
Pow : '**';
PowEqual : '**=';
DivEqual : '/=';
Concaequal : '.=';
ModEqual : '%=';
ShiftLeftEqual : '<<=';
ShiftRightEqual : '>>=';
AndEqual : '&=';
OrEqual : '|=';
XorEqual : '^=';
BooleanOr : '||';
BooleanAnd : '&&';
NullCoalescing : '??';
NullCoalescingEqual : '??=';
ShiftLeft : '<<';
ShiftRight : '>>';
DoubleColon : '::';
ObjectOperator : '->';
NamespaceSeparator : '\\';
Ellipsis : '...';
Less : '<';
Greater : '>';
Ampersand : '&';
Pipe : '|';
Bang : '!';
Caret : '^';
Plus : '+';
Minus : '-';
Asterisk : '*';
Percent : '%';
Divide : '/';
Tilde : '~';
SuppressWarnings : '@';
Dollar : '$';
Dot : '.';
QuestionMark : '?';
OpenRoundBracket : '(';
CloseRoundBracket : ')';
OpenSquareBracket : '[';
CloseSquareBracket : ']';
OpenCurlyBracket : '{';
CloseCurlyBracket : '}';
Comma : ',';
Colon : ':';
SemiColon : ';';
Eq : '=';
Quote : '\'';
BackQuote : '`';

VarName : '$' NameString;
Label : [a-zA-Z_][a-zA-Z_0-9]*;
Octal : '0' 'o'? OctalDigit+ ('_' OctalDigit+)*;
Decimal : '0' | NonZeroDigit Digit* ('_' Digit+)*;
Real : (LNum '.' LNum? | LNum? '.' LNum) ExponentPart? | LNum+ ExponentPart;
Hex : '0x' HexDigit+ ('_' HexDigit+)*;
Binary : '0b' [01]+ ('_' [01]+)*;

BackQuoteString : '`' ~'`'* '`';
SingleQuoteString : '\'' (~('\'' | '\\') | '\\' .)* '\'';
DoubleQuote : '"' -> pushMode(InterpolationString);

StartNowDoc : '<<<' [ \t]* '\'' NameString '\'' -> pushMode(HereDoc);
StartHereDoc : '<<<' [ \t]* NameString -> pushMode(HereDoc);

ErrorPhp : . -> channel(ErrorLexem);

// ----------------------------------------------
// mode InterpolationString
// ----------------------------------------------
mode InterpolationString;

VarNameInInterpolation : '$' NameString -> type(VarName);
DollarString : '$' -> type(StringPart);
CurlyDollar : '{' -> channel(SkipChannel), pushMode(PHP);
//CurlyDollar : '{$' -> channel(SkipChannel), pushMode(InInterpolation);
CurlyString : '{' -> type(StringPart);
EscapedChar : '\\' . -> type(StringPart);
DoubleQuoteInInterpolation : '"' -> type(DoubleQuote), popMode;
UnicodeEscape : '\\u{' [a-z0-9][a-z0-9]+ '}';
StringPart : ~[${\\"]+;

// ----------------------------------------------
// mode SingleLineCommentMode
// ----------------------------------------------
mode SingleLineCommentMode;

Comment : ~[\r\n?]+ -> channel(PhpComments);
PHPEndSingleLineComment : '?' '>';
CommentQuestionMark : '?' -> type(Comment), channel(PhpComments);
CommentEnd : [\r\n] -> channel(SkipChannel), popMode;

// ----------------------------------------------
// mode HereDoc
// ----------------------------------------------
mode HereDoc;

// 结束标记：匹配 >>> EOT 或 >>> EOT; （分号可选）
EndHereDoc : [ \t]* NameString [ \t]* '>>>' [ \t]* -> popMode;
EndNowDoc  : [ \t]* '\'' NameString '\'' [ \t]* '>>>' [ \t]* -> popMode;

// 一行文本：但不能以 >>> 结尾的行
HereDocText : (~'>' | '>' ~'>' | '>' '>' ~'>')+ ( '\r'? '\n' | '\r' )
            ;
// ----------------------------------------------
// fragments
// ----------------------------------------------
fragment PhpStartEchoFragment : '<' '?' '=';
fragment PhpStartFragment : '<' '?' 'php'?;
fragment NameString : [a-zA-Z_\u0080-\ufffe][a-zA-Z0-9_\u0080-\ufffe]*;
fragment LNum : Digit+ ('_' Digit+)*;
fragment ExponentPart : 'e' [+-]? LNum;
fragment NonZeroDigit : [1-9];
fragment Digit : [0-9];
fragment OctalDigit : [0-7];
fragment HexDigit : [a-f0-9];