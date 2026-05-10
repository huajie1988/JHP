// Generated from JhpParser.g4 by ANTLR 4.13.1
package jhp.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JhpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, Shebang=2, PHPStart=3, Error=4, PHPEnd=5, AttributeStart=6, 
		Whitespace=7, MultiLineComment=8, SingleLineComment=9, Abstract=10, Array=11, 
		As=12, BinaryCast=13, BoolType=14, BooleanConstant=15, Break=16, Callable=17, 
		Case=18, Catch=19, Class=20, Clone=21, Const=22, Continue=23, Declare=24, 
		Default=25, Do=26, DoubleCast=27, DoubleType=28, Echo=29, Else=30, ElseIf=31, 
		Empty=32, Enum_=33, EndDeclare=34, EndFor=35, EndForeach=36, EndIf=37, 
		EndSwitch=38, EndWhile=39, Eval=40, Exit=41, Extends=42, Final=43, Finally=44, 
		FloatCast=45, For=46, Foreach=47, Function_=48, Global=49, Goto=50, If=51, 
		Implements=52, Import=53, Include=54, IncludeOnce=55, InstanceOf=56, InsteadOf=57, 
		Int8Cast=58, Int16Cast=59, Int64Type=60, IntType=61, Interface=62, IsSet=63, 
		List=64, LogicalAnd=65, LogicalOr=66, LogicalXor=67, Match_=68, Namespace=69, 
		New=70, Null=71, ObjectType=72, Parent_=73, Partial=74, Print=75, Private=76, 
		Protected=77, Public=78, Readonly=79, Require=80, RequireOnce=81, Resource=82, 
		Return=83, Static=84, StringType=85, Switch=86, Throw=87, Trait=88, Try=89, 
		Typeof=90, UintCast=91, UnicodeCast=92, Unset=93, Use=94, Var=95, While=96, 
		Yield=97, From=98, LambdaFn=99, Ticks=100, Encoding=101, StrictTypes=102, 
		Get=103, Set=104, Call=105, CallStatic=106, Constructor=107, Destruct=108, 
		Wakeup=109, Sleep=110, Autoload=111, IsSet__=112, Unset__=113, ToString__=114, 
		Invoke=115, SetState=116, Clone__=117, DebugInfo=118, Namespace__=119, 
		Class__=120, Traic__=121, Function__=122, Method__=123, Line__=124, File__=125, 
		Dir__=126, Spaceship=127, Lgeneric=128, Rgeneric=129, DoubleArrow=130, 
		Inc=131, Dec=132, IsIdentical=133, IsNoidentical=134, IsEqual=135, IsNotEq=136, 
		IsSmallerOrEqual=137, IsGreaterOrEqual=138, PlusEqual=139, MinusEqual=140, 
		MulEqual=141, Pow=142, PowEqual=143, DivEqual=144, Concaequal=145, ModEqual=146, 
		ShiftLeftEqual=147, ShiftRightEqual=148, AndEqual=149, OrEqual=150, XorEqual=151, 
		BooleanOr=152, BooleanAnd=153, NullCoalescing=154, NullCoalescingEqual=155, 
		ShiftLeft=156, ShiftRight=157, DoubleColon=158, ObjectOperator=159, NamespaceSeparator=160, 
		Ellipsis=161, Less=162, Greater=163, Ampersand=164, Pipe=165, Bang=166, 
		Caret=167, Plus=168, Minus=169, Asterisk=170, Percent=171, Divide=172, 
		Tilde=173, SuppressWarnings=174, Dollar=175, Dot=176, QuestionMark=177, 
		OpenRoundBracket=178, CloseRoundBracket=179, OpenSquareBracket=180, CloseSquareBracket=181, 
		OpenCurlyBracket=182, CloseCurlyBracket=183, Comma=184, Colon=185, SemiColon=186, 
		Eq=187, Quote=188, BackQuote=189, VarName=190, Label=191, Octal=192, Decimal=193, 
		Real=194, Hex=195, Binary=196, BackQuoteString=197, SingleQuoteString=198, 
		DoubleQuote=199, StartNowDoc=200, StartHereDoc=201, ErrorPhp=202, CurlyDollar=203, 
		UnicodeEscape=204, StringPart=205, Comment=206, PHPEndSingleLineComment=207, 
		CommentEnd=208, HereDocText=209;
	public static final int
		RULE_phpFile = 0, RULE_phpBlock = 1, RULE_importStatement = 2, RULE_importPath = 3, 
		RULE_topStatement = 4, RULE_namespaceDeclaration = 5, RULE_functionDeclaration = 6, 
		RULE_classDeclaration = 7, RULE_classEntryType = 8, RULE_interfaceList = 9, 
		RULE_typeParameterListInBrackets = 10, RULE_typeParameterList = 11, RULE_typeParameterWithDefaultsList = 12, 
		RULE_typeParameterDecl = 13, RULE_typeParameterWithDefaultDecl = 14, RULE_genericDynamicArgs = 15, 
		RULE_attributes = 16, RULE_attributeGroup = 17, RULE_attribute = 18, RULE_innerStatementList = 19, 
		RULE_innerStatement = 20, RULE_statement = 21, RULE_emptyStatement_ = 22, 
		RULE_blockStatement = 23, RULE_ifStatement = 24, RULE_elseIfStatement = 25, 
		RULE_elseIfColonStatement = 26, RULE_elseStatement = 27, RULE_elseColonStatement = 28, 
		RULE_whileStatement = 29, RULE_doWhileStatement = 30, RULE_forStatement = 31, 
		RULE_forInit = 32, RULE_forUpdate = 33, RULE_switchStatement = 34, RULE_switchBlock = 35, 
		RULE_switchBlockBody = 36, RULE_breakStatement = 37, RULE_continueStatement = 38, 
		RULE_returnStatement = 39, RULE_expressionStatement = 40, RULE_foreachStatement = 41, 
		RULE_tryCatchFinally = 42, RULE_catchClause = 43, RULE_finallyStatement = 44, 
		RULE_throwStatement = 45, RULE_formalParameterList = 46, RULE_formalParameter = 47, 
		RULE_typeHint = 48, RULE_echoStatement = 49, RULE_staticVariableStatement = 50, 
		RULE_classStatement = 51, RULE_traitAdaptations = 52, RULE_traitAdaptationStatement = 53, 
		RULE_traitPrecedence = 54, RULE_traitAlias = 55, RULE_traitMethodReference = 56, 
		RULE_baseCtorCall = 57, RULE_returnTypeDecl = 58, RULE_methodBody = 59, 
		RULE_propertyModifiers = 60, RULE_memberModifiers = 61, RULE_variableInitializer = 62, 
		RULE_identifierInitializer = 63, RULE_enumDeclaration = 64, RULE_enumItem = 65, 
		RULE_expressionList = 66, RULE_parentheses = 67, RULE_expression = 68, 
		RULE_assignable = 69, RULE_arrayCreation = 70, RULE_arrayDestructuring = 71, 
		RULE_indexedDestructItem = 72, RULE_keyedDestructItem = 73, RULE_lambdaFunctionExpr = 74, 
		RULE_matchExpr = 75, RULE_matchItem = 76, RULE_newExpr = 77, RULE_assignmentOperator = 78, 
		RULE_arrayItemList = 79, RULE_arrayItem = 80, RULE_qualifiedStaticTypeRef = 81, 
		RULE_typeRef = 82, RULE_anonymousClass = 83, RULE_indirectTypeRef = 84, 
		RULE_qualifiedNamespaceName = 85, RULE_namespaceNameList = 86, RULE_namespaceNameTail = 87, 
		RULE_qualifiedNamespaceNameList = 88, RULE_arguments = 89, RULE_actualArgument = 90, 
		RULE_argumentName = 91, RULE_constantInitializer = 92, RULE_constant = 93, 
		RULE_literalConstant = 94, RULE_numericConstant = 95, RULE_classConstant = 96, 
		RULE_stringConstant = 97, RULE_string = 98, RULE_interpolatedStringPart = 99, 
		RULE_chainList = 100, RULE_chain = 101, RULE_chainOrigin = 102, RULE_memberAccess = 103, 
		RULE_functionCall = 104, RULE_functionCallName = 105, RULE_actualArguments = 106, 
		RULE_chainBase = 107, RULE_keyedFieldName = 108, RULE_keyedSimpleFieldName = 109, 
		RULE_keyedVariable = 110, RULE_squareCurlyExpression = 111, RULE_assignmentList = 112, 
		RULE_assignmentListElement = 113, RULE_modifier = 114, RULE_identifier = 115, 
		RULE_memberModifier = 116, RULE_magicConstant = 117, RULE_primitiveType = 118, 
		RULE_castOperation = 119;
	private static String[] makeRuleNames() {
		return new String[] {
			"phpFile", "phpBlock", "importStatement", "importPath", "topStatement", 
			"namespaceDeclaration", "functionDeclaration", "classDeclaration", "classEntryType", 
			"interfaceList", "typeParameterListInBrackets", "typeParameterList", 
			"typeParameterWithDefaultsList", "typeParameterDecl", "typeParameterWithDefaultDecl", 
			"genericDynamicArgs", "attributes", "attributeGroup", "attribute", "innerStatementList", 
			"innerStatement", "statement", "emptyStatement_", "blockStatement", "ifStatement", 
			"elseIfStatement", "elseIfColonStatement", "elseStatement", "elseColonStatement", 
			"whileStatement", "doWhileStatement", "forStatement", "forInit", "forUpdate", 
			"switchStatement", "switchBlock", "switchBlockBody", "breakStatement", 
			"continueStatement", "returnStatement", "expressionStatement", "foreachStatement", 
			"tryCatchFinally", "catchClause", "finallyStatement", "throwStatement", 
			"formalParameterList", "formalParameter", "typeHint", "echoStatement", 
			"staticVariableStatement", "classStatement", "traitAdaptations", "traitAdaptationStatement", 
			"traitPrecedence", "traitAlias", "traitMethodReference", "baseCtorCall", 
			"returnTypeDecl", "methodBody", "propertyModifiers", "memberModifiers", 
			"variableInitializer", "identifierInitializer", "enumDeclaration", "enumItem", 
			"expressionList", "parentheses", "expression", "assignable", "arrayCreation", 
			"arrayDestructuring", "indexedDestructItem", "keyedDestructItem", "lambdaFunctionExpr", 
			"matchExpr", "matchItem", "newExpr", "assignmentOperator", "arrayItemList", 
			"arrayItem", "qualifiedStaticTypeRef", "typeRef", "anonymousClass", "indirectTypeRef", 
			"qualifiedNamespaceName", "namespaceNameList", "namespaceNameTail", "qualifiedNamespaceNameList", 
			"arguments", "actualArgument", "argumentName", "constantInitializer", 
			"constant", "literalConstant", "numericConstant", "classConstant", "stringConstant", 
			"string", "interpolatedStringPart", "chainList", "chain", "chainOrigin", 
			"memberAccess", "functionCall", "functionCallName", "actualArguments", 
			"chainBase", "keyedFieldName", "keyedSimpleFieldName", "keyedVariable", 
			"squareCurlyExpression", "assignmentList", "assignmentListElement", "modifier", 
			"identifier", "memberModifier", "magicConstant", "primitiveType", "castOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'?>'", "'#['", null, null, null, "'abstract'", 
			"'array'", "'as'", "'binary'", null, null, "'break'", "'callable'", "'case'", 
			"'catch'", "'class'", "'clone'", "'const'", "'continue'", "'declare'", 
			"'default'", "'do'", "'real'", "'double'", "'echo'", "'else'", "'elseif'", 
			"'empty'", "'enum'", "'enddeclare'", "'endfor'", "'endforeach'", "'endif'", 
			"'endswitch'", "'endwhile'", "'eval'", "'die'", "'extends'", "'final'", 
			"'finally'", "'float'", "'for'", "'foreach'", "'function'", "'global'", 
			"'goto'", "'if'", "'implements'", "'import'", "'include'", "'include_once'", 
			"'instanceof'", "'insteadof'", "'int8'", "'int16'", null, null, "'interface'", 
			"'isset'", "'list'", "'and'", "'or'", "'xor'", "'match'", "'namespace'", 
			"'new'", "'null'", "'object'", "'parent'", "'partial'", "'print'", "'private'", 
			"'protected'", "'public'", "'readonly'", "'require'", "'require_once'", 
			"'resource'", "'return'", "'static'", "'string'", "'switch'", "'throw'", 
			"'trait'", "'try'", "'clrtypeof'", null, "'unicode'", "'unset'", "'use'", 
			"'var'", "'while'", "'yield'", "'from'", "'fn'", "'ticks'", "'encoding'", 
			"'strict_types'", "'__get'", "'__set'", "'__call'", "'__callstatic'", 
			"'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", "'__autoload'", 
			"'__isset'", "'__unset'", "'__tostring'", "'__invoke'", "'__set_state'", 
			"'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", "'__trait__'", 
			"'__function__'", "'__method__'", "'__line__'", "'__file__'", "'__dir__'", 
			"'<=>'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", "'!=='", "'=='", 
			null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", "'**='", "'/='", 
			"'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", "'||'", "'&&'", 
			"'??'", "'??='", "'<<'", "'>>'", "'::'", "'->'", "'\\'", "'...'", "'<'", 
			"'>'", "'&'", "'|'", "'!'", "'^'", "'+'", "'-'", "'*'", "'%'", "'/'", 
			"'~'", "'@'", null, "'.'", "'?'", "'('", "')'", "'['", "']'", null, "'}'", 
			"','", "':'", "';'", "'='", "'''", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SeaWhitespace", "Shebang", "PHPStart", "Error", "PHPEnd", "AttributeStart", 
			"Whitespace", "MultiLineComment", "SingleLineComment", "Abstract", "Array", 
			"As", "BinaryCast", "BoolType", "BooleanConstant", "Break", "Callable", 
			"Case", "Catch", "Class", "Clone", "Const", "Continue", "Declare", "Default", 
			"Do", "DoubleCast", "DoubleType", "Echo", "Else", "ElseIf", "Empty", 
			"Enum_", "EndDeclare", "EndFor", "EndForeach", "EndIf", "EndSwitch", 
			"EndWhile", "Eval", "Exit", "Extends", "Final", "Finally", "FloatCast", 
			"For", "Foreach", "Function_", "Global", "Goto", "If", "Implements", 
			"Import", "Include", "IncludeOnce", "InstanceOf", "InsteadOf", "Int8Cast", 
			"Int16Cast", "Int64Type", "IntType", "Interface", "IsSet", "List", "LogicalAnd", 
			"LogicalOr", "LogicalXor", "Match_", "Namespace", "New", "Null", "ObjectType", 
			"Parent_", "Partial", "Print", "Private", "Protected", "Public", "Readonly", 
			"Require", "RequireOnce", "Resource", "Return", "Static", "StringType", 
			"Switch", "Throw", "Trait", "Try", "Typeof", "UintCast", "UnicodeCast", 
			"Unset", "Use", "Var", "While", "Yield", "From", "LambdaFn", "Ticks", 
			"Encoding", "StrictTypes", "Get", "Set", "Call", "CallStatic", "Constructor", 
			"Destruct", "Wakeup", "Sleep", "Autoload", "IsSet__", "Unset__", "ToString__", 
			"Invoke", "SetState", "Clone__", "DebugInfo", "Namespace__", "Class__", 
			"Traic__", "Function__", "Method__", "Line__", "File__", "Dir__", "Spaceship", 
			"Lgeneric", "Rgeneric", "DoubleArrow", "Inc", "Dec", "IsIdentical", "IsNoidentical", 
			"IsEqual", "IsNotEq", "IsSmallerOrEqual", "IsGreaterOrEqual", "PlusEqual", 
			"MinusEqual", "MulEqual", "Pow", "PowEqual", "DivEqual", "Concaequal", 
			"ModEqual", "ShiftLeftEqual", "ShiftRightEqual", "AndEqual", "OrEqual", 
			"XorEqual", "BooleanOr", "BooleanAnd", "NullCoalescing", "NullCoalescingEqual", 
			"ShiftLeft", "ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", 
			"Ellipsis", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", 
			"Plus", "Minus", "Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", 
			"Dollar", "Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
			"Comma", "Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", 
			"Label", "Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", 
			"SingleQuoteString", "DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", 
			"CurlyDollar", "UnicodeEscape", "StringPart", "Comment", "PHPEndSingleLineComment", 
			"CommentEnd", "HereDocText"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JhpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JhpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PhpFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JhpParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(JhpParser.Shebang, 0); }
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPhpFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPhpFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPhpFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpFileContext phpFile() throws RecognitionException {
		PhpFileContext _localctx = new PhpFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_phpFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(240);
				match(Shebang);
				}
			}

			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(243);
				namespaceDeclaration();
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) {
				{
				{
				setState(246);
				importStatement();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -212681334822011151L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061631013633389567L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259606487873L) != 0)) {
				{
				{
				setState(252);
				topStatement();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PhpBlockContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) {
				{
				{
				setState(260);
				importStatement();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				topStatement();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -212681334822011151L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061631013633389567L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259606487873L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode Import() { return getToken(JhpParser.Import, 0); }
		public TerminalNode Include() { return getToken(JhpParser.Include, 0); }
		public TerminalNode Require() { return getToken(JhpParser.Require, 0); }
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			importPath();
			setState(273);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(JhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(JhpParser.NamespaceSeparator, i);
		}
		public TerminalNode Asterisk() { return getToken(JhpParser.Asterisk, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importPath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			identifier();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(NamespaceSeparator);
					setState(277);
					identifier();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(283);
				match(NamespaceSeparator);
				setState(284);
				match(Asterisk);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_topStatement);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				namespaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(JhpParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Namespace);
			setState(295);
			namespaceNameList();
			setState(296);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(JhpParser.QuestionMark, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(298);
				attributes();
				}
			}

			setState(301);
			match(Function_);
			setState(302);
			identifier();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(303);
				typeParameterListInBrackets();
				}
			}

			setState(306);
			match(OpenRoundBracket);
			setState(307);
			formalParameterList();
			setState(308);
			match(CloseRoundBracket);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(309);
				match(Colon);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(310);
					match(QuestionMark);
					}
				}

				setState(313);
				typeHint(0);
				}
			}

			setState(316);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(JhpParser.Interface, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(JhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TerminalNode Private() { return getToken(JhpParser.Private, 0); }
		public TerminalNode Public() { return getToken(JhpParser.Public, 0); }
		public TerminalNode Protected() { return getToken(JhpParser.Protected, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(JhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(JhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(318);
				attributes();
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(324);
				modifier();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(327);
				match(Partial);
				}
			}

			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(330);
				classEntryType();
				setState(331);
				identifier();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(332);
					typeParameterListInBrackets();
					}
				}

				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(335);
					match(Extends);
					setState(336);
					qualifiedStaticTypeRef();
					}
				}

				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(339);
					match(Implements);
					setState(340);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(343);
				match(Interface);
				setState(344);
				identifier();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(345);
					typeParameterListInBrackets();
					}
				}

				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(348);
					match(Extends);
					setState(349);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			match(OpenCurlyBracket);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(355);
				classStatement();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JhpParser.Class, 0); }
		public TerminalNode Trait() { return getToken(JhpParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterClassEntryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitClassEntryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitClassEntryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitInterfaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			qualifiedStaticTypeRef();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(366);
				match(Comma);
				setState(367);
				qualifiedStaticTypeRef();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(JhpParser.Lgeneric, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode Rgeneric() { return getToken(JhpParser.Rgeneric, 0); }
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JhpParser.Comma, 0); }
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeParameterListInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeParameterListInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeParameterListInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameterListInBrackets);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(Lgeneric);
				setState(374);
				typeParameterList();
				setState(375);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(Lgeneric);
				setState(378);
				typeParameterWithDefaultsList();
				setState(379);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(Lgeneric);
				setState(382);
				typeParameterList();
				setState(383);
				match(Comma);
				setState(384);
				typeParameterWithDefaultsList();
				setState(385);
				match(Rgeneric);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			typeParameterDecl();
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					match(Comma);
					setState(391);
					typeParameterDecl();
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeParameterWithDefaultsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeParameterWithDefaultsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			typeParameterWithDefaultDecl();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(398);
				match(Comma);
				setState(399);
				typeParameterWithDefaultDecl();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(405);
				attributes();
				}
			}

			setState(408);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeParameterWithDefaultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeParameterWithDefaultDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameterWithDefaultDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(410);
				attributes();
				}
			}

			setState(413);
			identifier();
			setState(414);
			match(Eq);
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(415);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(416);
				primitiveType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(JhpParser.Lgeneric, 0); }
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public TerminalNode Rgeneric() { return getToken(JhpParser.Rgeneric, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterGenericDynamicArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitGenericDynamicArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitGenericDynamicArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Lgeneric);
			setState(420);
			typeRef();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(421);
				match(Comma);
				setState(422);
				typeRef();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(Rgeneric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeGroupContext> attributeGroup() {
			return getRuleContexts(AttributeGroupContext.class);
		}
		public AttributeGroupContext attributeGroup(int i) {
			return getRuleContext(AttributeGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(430);
				attributeGroup();
				}
				}
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AttributeStart );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode AttributeStart() { return getToken(JhpParser.AttributeStart, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode CloseSquareBracket() { return getToken(JhpParser.CloseSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAttributeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAttributeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributeGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(AttributeStart);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(436);
				identifier();
				setState(437);
				match(Colon);
				}
				break;
			}
			setState(441);
			attribute();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(442);
				match(Comma);
				setState(443);
				attribute();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(CloseSquareBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			qualifiedNamespaceName();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(452);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterInnerStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitInnerStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitInnerStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					innerStatement();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitInnerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitInnerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_innerStatement);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(471);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(473);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(474);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(475);
				echoStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(476);
				expressionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(477);
				foreachStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(478);
				tryCatchFinally();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(479);
				throwStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(480);
				emptyStatement_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(481);
				attributes();
				setState(482);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(OpenCurlyBracket);
			setState(489);
			innerStatementList();
			setState(490);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JhpParser.If, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(JhpParser.EndIf, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(If);
				setState(493);
				parentheses();
				setState(494);
				statement();
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(495);
						elseIfStatement();
						}
						} 
					}
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(501);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(If);
				setState(505);
				parentheses();
				setState(506);
				match(Colon);
				setState(507);
				innerStatementList();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(508);
					elseIfColonStatement();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(514);
					elseColonStatement();
					}
				}

				setState(517);
				match(EndIf);
				setState(518);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(JhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(ElseIf);
			setState(523);
			parentheses();
			setState(524);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(JhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterElseIfColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitElseIfColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitElseIfColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(ElseIf);
			setState(527);
			parentheses();
			setState(528);
			match(Colon);
			setState(529);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JhpParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(Else);
			setState(532);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JhpParser.Else, 0); }
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterElseColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitElseColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitElseColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(Else);
			setState(535);
			match(Colon);
			setState(536);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(JhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(JhpParser.EndWhile, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(While);
			setState(539);
			parentheses();
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(540);
				statement();
				}
				break;
			case Colon:
				{
				setState(541);
				match(Colon);
				setState(542);
				innerStatementList();
				setState(543);
				match(EndWhile);
				setState(544);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(JhpParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(JhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(Do);
			setState(549);
			statement();
			setState(550);
			match(While);
			setState(551);
			parentheses();
			setState(552);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(JhpParser.For, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(JhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JhpParser.SemiColon, i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(JhpParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(For);
			setState(555);
			match(OpenRoundBracket);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(556);
				forInit();
				}
			}

			setState(559);
			match(SemiColon);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(560);
				expressionList();
				}
			}

			setState(563);
			match(SemiColon);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(564);
				forUpdate();
				}
			}

			setState(567);
			match(CloseRoundBracket);
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(568);
				statement();
				}
				break;
			case Colon:
				{
				setState(569);
				match(Colon);
				setState(570);
				innerStatementList();
				setState(571);
				match(EndFor);
				setState(572);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JhpParser.Switch, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TerminalNode EndSwitch() { return getToken(JhpParser.EndSwitch, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(JhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JhpParser.SemiColon, i);
		}
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Switch);
			setState(581);
			parentheses();
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(582);
				match(OpenCurlyBracket);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(583);
					match(SemiColon);
					}
				}

				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(586);
					switchBlock();
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(593);
				match(Colon);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(594);
					match(SemiColon);
					}
				}

				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(597);
					switchBlock();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(603);
				match(EndSwitch);
				setState(604);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(JhpParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockBodyContext switchBlockBody() {
			return getRuleContext(SwitchBlockBodyContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode Default() { return getToken(JhpParser.Default, 0); }
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchBlock);
		int _la;
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(Case);
				setState(608);
				expression(0);
				setState(609);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(610);
				switchBlockBody();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(Default);
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				switchBlockBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockBodyContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public SwitchBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSwitchBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSwitchBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSwitchBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockBodyContext switchBlockBody() throws RecognitionException {
		SwitchBlockBodyContext _localctx = new SwitchBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchBlockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JhpParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(Break);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(620);
				expression(0);
				}
			}

			setState(623);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(JhpParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(Continue);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(626);
				expression(0);
				}
			}

			setState(629);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JhpParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(Return);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(632);
				expression(0);
				}
			}

			setState(635);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expression(0);
			setState(638);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(JhpParser.Foreach, 0); }
		public List<TerminalNode> OpenRoundBracket() { return getTokens(JhpParser.OpenRoundBracket); }
		public TerminalNode OpenRoundBracket(int i) {
			return getToken(JhpParser.OpenRoundBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode As() { return getToken(JhpParser.As, 0); }
		public ArrayDestructuringContext arrayDestructuring() {
			return getRuleContext(ArrayDestructuringContext.class,0);
		}
		public List<TerminalNode> CloseRoundBracket() { return getTokens(JhpParser.CloseRoundBracket); }
		public TerminalNode CloseRoundBracket(int i) {
			return getToken(JhpParser.CloseRoundBracket, i);
		}
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode List() { return getToken(JhpParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(JhpParser.EndForeach, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Foreach);
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(641);
				match(OpenRoundBracket);
				setState(642);
				expression(0);
				setState(643);
				match(As);
				setState(644);
				arrayDestructuring();
				setState(645);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(647);
				match(OpenRoundBracket);
				setState(648);
				chain();
				setState(649);
				match(As);
				setState(650);
				assignable();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(651);
					match(DoubleArrow);
					setState(652);
					chain();
					}
				}

				setState(655);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(657);
				match(OpenRoundBracket);
				setState(658);
				expression(0);
				setState(659);
				match(As);
				setState(660);
				assignable();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(661);
					match(DoubleArrow);
					setState(662);
					chain();
					}
				}

				setState(665);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				{
				setState(667);
				match(OpenRoundBracket);
				setState(668);
				chain();
				setState(669);
				match(As);
				setState(670);
				match(List);
				setState(671);
				match(OpenRoundBracket);
				setState(672);
				assignmentList();
				setState(673);
				match(CloseRoundBracket);
				setState(674);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(678);
				statement();
				}
				break;
			case Colon:
				{
				setState(679);
				match(Colon);
				setState(680);
				innerStatementList();
				setState(681);
				match(EndForeach);
				setState(682);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(JhpParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTryCatchFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTryCatchFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(Try);
			setState(687);
			blockStatement();
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(689); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(688);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(691); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(693);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(696);
					catchClause();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(702);
				finallyStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JhpParser.Catch, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(JhpParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(JhpParser.Pipe, i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(Catch);
			setState(706);
			match(OpenRoundBracket);
			setState(707);
			qualifiedStaticTypeRef();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(708);
				match(Pipe);
				setState(709);
				qualifiedStaticTypeRef();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(VarName);
			setState(716);
			match(CloseRoundBracket);
			setState(717);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JhpParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Finally);
			setState(720);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(JhpParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(Throw);
			setState(723);
			expression(0);
			setState(724);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8293938343561919552L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9222527069147955103L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 2147614721L) != 0)) {
				{
				setState(726);
				formalParameter();
				}
			}

			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(729);
					match(Comma);
					setState(730);
					formalParameter();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(736);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(JhpParser.QuestionMark, 0); }
		public TerminalNode Ellipsis() { return getToken(JhpParser.Ellipsis, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(739);
				attributes();
				}
			}

			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(742);
					memberModifier();
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(748);
				match(QuestionMark);
				}
			}

			setState(751);
			typeHint(0);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(752);
				match(Ellipsis);
				}
			}

			setState(755);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeHintContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(JhpParser.Callable, 0); }
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(JhpParser.Pipe, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		return typeHint(0);
	}

	private TypeHintContext typeHint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeHintContext _localctx = new TypeHintContext(_ctx, _parentState);
		TypeHintContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_typeHint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(758);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(759);
				qualifiedStaticTypeRef();
				}
				break;
			case 3:
				{
				setState(760);
				match(Callable);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeHintContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeHint);
					setState(763);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(764);
					match(Pipe);
					setState(765);
					typeHint(2);
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(JhpParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterEchoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitEchoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitEchoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(Echo);
			setState(772);
			expressionList();
			setState(773);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitStaticVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitStaticVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(Static);
			setState(776);
			variableInitializer();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(777);
				match(Comma);
				setState(778);
				variableInitializer();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatementContext extends ParserRuleContext {
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(JhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public ReturnTypeDeclContext returnTypeDecl() {
			return getRuleContext(ReturnTypeDeclContext.class,0);
		}
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classStatement);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Const:
			case Final:
			case Function_:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(786);
					attributes();
					}
				}

				setState(834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(789);
					propertyModifiers();
					setState(790);
					typeHint(0);
					setState(791);
					variableInitializer();
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(792);
						match(Comma);
						setState(793);
						variableInitializer();
						}
						}
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(799);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
						{
						setState(801);
						memberModifiers();
						}
					}

					setState(832);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(804);
						match(Const);
						setState(806);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(805);
							typeHint(0);
							}
							break;
						}
						setState(808);
						identifierInitializer();
						setState(813);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(809);
							match(Comma);
							setState(810);
							identifierInitializer();
							}
							}
							setState(815);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(816);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(818);
						match(Function_);
						setState(819);
						identifier();
						setState(821);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(820);
							typeParameterListInBrackets();
							}
						}

						setState(823);
						match(OpenRoundBracket);
						setState(824);
						formalParameterList();
						setState(825);
						match(CloseRoundBracket);
						setState(828);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(826);
							baseCtorCall();
							}
							break;
						case 2:
							{
							setState(827);
							returnTypeDecl();
							}
							break;
						}
						setState(830);
						methodBody();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(Use);
				setState(837);
				qualifiedNamespaceNameList();
				setState(838);
				traitAdaptations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTraitAdaptations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTraitAdaptations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTraitAdaptations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_traitAdaptations);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				match(OpenCurlyBracket);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4835138645100835840L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9222527069147955103L) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(844);
					traitAdaptationStatement();
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTraitAdaptationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTraitAdaptationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTraitAdaptationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_traitAdaptationStatement);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				traitAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(JhpParser.DoubleColon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(JhpParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTraitPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTraitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTraitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			qualifiedNamespaceName();
			setState(858);
			match(DoubleColon);
			setState(859);
			identifier();
			setState(860);
			match(InsteadOf);
			setState(861);
			qualifiedNamespaceNameList();
			setState(862);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(JhpParser.As, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTraitAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTraitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTraitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			traitMethodReference();
			setState(865);
			match(As);
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(866);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(867);
					memberModifier();
					}
					break;
				}
				setState(870);
				identifier();
				}
				break;
			}
			setState(873);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(JhpParser.DoubleColon, 0); }
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTraitMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTraitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTraitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(875);
				qualifiedNamespaceName();
				setState(876);
				match(DoubleColon);
				}
				break;
			}
			setState(880);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseCtorCallContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBaseCtorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBaseCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(Colon);
			setState(883);
			identifier();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(884);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeDeclContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(JhpParser.QuestionMark, 0); }
		public ReturnTypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterReturnTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitReturnTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitReturnTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeDeclContext returnTypeDecl() throws RecognitionException {
		ReturnTypeDeclContext _localctx = new ReturnTypeDeclContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_returnTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(Colon);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(888);
				match(QuestionMark);
				}
			}

			setState(891);
			typeHint(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_methodBody);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				blockStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPropertyModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPropertyModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPropertyModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_propertyModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			memberModifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMemberModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMemberModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMemberModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(899);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(902); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(VarName);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(905);
				match(Eq);
				setState(906);
				constantInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierInitializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public IdentifierInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIdentifierInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIdentifierInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIdentifierInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierInitializerContext identifierInitializer() throws RecognitionException {
		IdentifierInitializerContext _localctx = new IdentifierInitializerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identifierInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			identifier();
			setState(910);
			match(Eq);
			setState(911);
			constantInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Enum_() { return getToken(JhpParser.Enum_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TerminalNode Implements() { return getToken(JhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public TerminalNode IntType() { return getToken(JhpParser.IntType, 0); }
		public TerminalNode StringType() { return getToken(JhpParser.StringType, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(Enum_);
			setState(914);
			identifier();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(915);
				match(Colon);
				setState(916);
				_la = _input.LA(1);
				if ( !(_la==IntType || _la==StringType) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(919);
				match(Implements);
				setState(920);
				interfaceList();
				}
			}

			setState(923);
			match(OpenCurlyBracket);
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271069996096L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(924);
				enumItem();
				}
				}
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(930);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumItemContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(JhpParser.Case, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enumItem);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(Case);
				setState(933);
				identifier();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(934);
					match(Eq);
					setState(935);
					expression(0);
					}
				}

				setState(938);
				match(SemiColon);
				}
				break;
			case AttributeStart:
			case Abstract:
			case Final:
			case Function_:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Static:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
					{
					setState(940);
					memberModifiers();
					}
				}

				setState(943);
				functionDeclaration();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(Use);
				setState(945);
				qualifiedNamespaceNameList();
				setState(946);
				traitAdaptations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			expression(0);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(951);
				match(Comma);
				setState(952);
				expression(0);
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(OpenRoundBracket);
			setState(959);
			expression(0);
			setState(960);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BooleanAnd() { return getToken(JhpParser.BooleanAnd, 0); }
		public TerminalNode LogicalAnd() { return getToken(JhpParser.LogicalAnd, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentiationExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(JhpParser.Pow, 0); }
		public ExponentiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreationExpressionContext extends ExpressionContext {
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public ArrayCreationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchExpressionContext extends ExpressionContext {
		public MatchExprContext matchExpr() {
			return getRuleContext(MatchExprContext.class,0);
		}
		public MatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode Print() { return getToken(JhpParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(JhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(JhpParser.Dec, 0); }
		public PostfixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPostfixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPostfixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPostfixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseExcOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Caret() { return getToken(JhpParser.Caret, 0); }
		public BitwiseExcOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBitwiseExcOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBitwiseExcOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBitwiseExcOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IsIdentical() { return getToken(JhpParser.IsIdentical, 0); }
		public TerminalNode IsNoidentical() { return getToken(JhpParser.IsNoidentical, 0); }
		public TerminalNode IsEqual() { return getToken(JhpParser.IsEqual, 0); }
		public TerminalNode IsNotEq() { return getToken(JhpParser.IsNotEq, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Asterisk() { return getToken(JhpParser.Asterisk, 0); }
		public TerminalNode Divide() { return getToken(JhpParser.Divide, 0); }
		public TerminalNode Percent() { return getToken(JhpParser.Percent, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CloneExpressionContext extends ExpressionContext {
		public TerminalNode Clone() { return getToken(JhpParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterCloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitCloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitCloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(JhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JhpParser.Minus, 0); }
		public TerminalNode Dot() { return getToken(JhpParser.Dot, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Less() { return getToken(JhpParser.Less, 0); }
		public TerminalNode IsSmallerOrEqual() { return getToken(JhpParser.IsSmallerOrEqual, 0); }
		public TerminalNode Greater() { return getToken(JhpParser.Greater, 0); }
		public TerminalNode IsGreaterOrEqual() { return getToken(JhpParser.IsGreaterOrEqual, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(JhpParser.Tilde, 0); }
		public TerminalNode SuppressWarnings() { return getToken(JhpParser.SuppressWarnings, 0); }
		public TerminalNode Bang() { return getToken(JhpParser.Bang, 0); }
		public TerminalNode Plus() { return getToken(JhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JhpParser.Minus, 0); }
		public UnaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitUnaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitUnaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalIncOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BooleanOr() { return getToken(JhpParser.BooleanOr, 0); }
		public TerminalNode LogicalOr() { return getToken(JhpParser.LogicalOr, 0); }
		public LogicalIncOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLogicalIncOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLogicalIncOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLogicalIncOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpaceshipExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Spaceship() { return getToken(JhpParser.Spaceship, 0); }
		public SpaceshipExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSpaceshipExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSpaceshipExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSpaceshipExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TerminalNode QuestionMark() { return getToken(JhpParser.QuestionMark, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ShiftLeft() { return getToken(JhpParser.ShiftLeft, 0); }
		public TerminalNode ShiftRight() { return getToken(JhpParser.ShiftRight, 0); }
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexerExpressionContext extends ExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(JhpParser.OpenSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(JhpParser.CloseSquareBracket, 0); }
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScalarExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(JhpParser.Label, 0); }
		public ScalarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterScalarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitScalarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitScalarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(JhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(JhpParser.Dec, 0); }
		public PrefixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPrefixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPrefixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPrefixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExcOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicalXor() { return getToken(JhpParser.LogicalXor, 0); }
		public LogicalExcOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLogicalExcOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLogicalExcOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLogicalExcOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseIncOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(JhpParser.Pipe, 0); }
		public BitwiseIncOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBitwiseIncOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBitwiseIncOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBitwiseIncOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(JhpParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDestructExpressionContext extends ExpressionContext {
		public ArrayDestructuringContext arrayDestructuring() {
			return getRuleContext(ArrayDestructuringContext.class,0);
		}
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayDestructExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayDestructExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayDestructExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayDestructExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionExpressionContext extends ExpressionContext {
		public LambdaFunctionExprContext lambdaFunctionExpr() {
			return getRuleContext(LambdaFunctionExprContext.class,0);
		}
		public LambdaFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLambdaFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLambdaFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CoalesceExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NullCoalescing() { return getToken(JhpParser.NullCoalescing, 0); }
		public CoalesceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterCoalesceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitCoalesceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitCoalesceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(963);
				match(Clone);
				setState(964);
				expression(37);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(965);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(966);
				stringConstant();
				setState(967);
				match(OpenSquareBracket);
				setState(968);
				expression(0);
				setState(969);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(971);
				match(OpenRoundBracket);
				setState(972);
				castOperation();
				setState(973);
				match(CloseRoundBracket);
				setState(974);
				expression(34);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(976);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(977);
				expression(33);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(978);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(979);
				expression(32);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(980);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(981);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(982);
				chain();
				setState(983);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(985);
				match(Print);
				setState(986);
				expression(29);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(987);
				arrayCreation();
				}
				break;
			case 11:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(988);
				chain();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(989);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990);
				string();
				}
				break;
			case 14:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991);
				match(Label);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(992);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993);
				lambdaFunctionExpr();
				}
				break;
			case 17:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994);
				matchExpr();
				}
				break;
			case 18:
				{
				_localctx = new ArrayDestructExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995);
				arrayDestructuring();
				setState(996);
				match(Eq);
				setState(997);
				expression(5);
				}
				break;
			case 19:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				assignable();
				setState(1000);
				assignmentOperator();
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1001);
					attributes();
					}
				}

				setState(1004);
				expression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1066);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1008);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1009);
						((ExponentiationExpressionContext)_localctx).op = match(Pow);
						setState(1010);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1011);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1012);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 7L) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1013);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1014);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1015);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & 259L) != 0)) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1016);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1017);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1018);
						((ShiftExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
							((ShiftExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1019);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1020);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1021);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 100663299L) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1022);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1023);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1024);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 15L) != 0)) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1025);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1026);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1027);
						((BitwiseAndExpressionContext)_localctx).op = match(Ampersand);
						setState(1028);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1029);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1030);
						((BitwiseExcOrExpressionContext)_localctx).op = match(Caret);
						setState(1031);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1032);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1033);
						((BitwiseIncOrExpressionContext)_localctx).op = match(Pipe);
						setState(1034);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1035);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1036);
						((LogicalAndExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1037);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1038);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1039);
						((LogicalIncOrExpressionContext)_localctx).op = match(BooleanOr);
						setState(1040);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1041);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1042);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1044);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
							{
							setState(1043);
							expression(0);
							}
						}

						setState(1046);
						match(Colon);
						setState(1047);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new CoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1048);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1049);
						((CoalesceExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1050);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1052);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1053);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1054);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1055);
						((LogicalAndExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1056);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1057);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1058);
						((LogicalExcOrExpressionContext)_localctx).op = match(LogicalXor);
						setState(1059);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1060);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1061);
						((LogicalIncOrExpressionContext)_localctx).op = match(LogicalOr);
						setState(1062);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1064);
						match(InstanceOf);
						setState(1065);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assignable);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				chain();
				}
				break;
			case Array:
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				arrayCreation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(JhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> OpenSquareBracket() { return getTokens(JhpParser.OpenSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(JhpParser.OpenSquareBracket, i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(JhpParser.CloseSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(JhpParser.CloseSquareBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1075);
				match(Array);
				setState(1076);
				match(OpenRoundBracket);
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1077);
					arrayItemList();
					}
				}

				setState(1080);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1081);
				match(OpenSquareBracket);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1082);
					arrayItemList();
					}
				}

				setState(1085);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1088);
				match(OpenSquareBracket);
				setState(1089);
				expression(0);
				setState(1090);
				match(CloseSquareBracket);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDestructuringContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(JhpParser.OpenSquareBracket, 0); }
		public List<IndexedDestructItemContext> indexedDestructItem() {
			return getRuleContexts(IndexedDestructItemContext.class);
		}
		public IndexedDestructItemContext indexedDestructItem(int i) {
			return getRuleContext(IndexedDestructItemContext.class,i);
		}
		public TerminalNode CloseSquareBracket() { return getToken(JhpParser.CloseSquareBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public List<KeyedDestructItemContext> keyedDestructItem() {
			return getRuleContexts(KeyedDestructItemContext.class);
		}
		public KeyedDestructItemContext keyedDestructItem(int i) {
			return getRuleContext(KeyedDestructItemContext.class,i);
		}
		public ArrayDestructuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDestructuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDestructuringContext arrayDestructuring() throws RecognitionException {
		ArrayDestructuringContext _localctx = new ArrayDestructuringContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arrayDestructuring);
		int _la;
		try {
			int _alt;
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				match(OpenSquareBracket);
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1095);
					match(Comma);
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1101);
				indexedDestructItem();
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1103); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1102);
							match(Comma);
							}
							}
							setState(1105); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1107);
						indexedDestructItem();
						}
						} 
					}
					setState(1112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1113);
					match(Comma);
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
				match(CloseSquareBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(OpenSquareBracket);
				setState(1122);
				keyedDestructItem();
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1124); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1123);
							match(Comma);
							}
							}
							setState(1126); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1128);
						keyedDestructItem();
						}
						} 
					}
					setState(1133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1134);
					match(Comma);
					}
				}

				setState(1137);
				match(CloseSquareBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexedDestructItemContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public IndexedDestructItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexedDestructItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIndexedDestructItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIndexedDestructItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIndexedDestructItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexedDestructItemContext indexedDestructItem() throws RecognitionException {
		IndexedDestructItemContext _localctx = new IndexedDestructItemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_indexedDestructItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			chain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyedDestructItemContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public KeyedDestructItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedDestructItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterKeyedDestructItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitKeyedDestructItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitKeyedDestructItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedDestructItemContext keyedDestructItem() throws RecognitionException {
		KeyedDestructItemContext _localctx = new KeyedDestructItemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_keyedDestructItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1143);
				expression(0);
				setState(1144);
				match(DoubleArrow);
				}
				break;
			}
			setState(1148);
			chain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionExprContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LambdaFn() { return getToken(JhpParser.LambdaFn, 0); }
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLambdaFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLambdaFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionExprContext lambdaFunctionExpr() throws RecognitionException {
		LambdaFunctionExprContext _localctx = new LambdaFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				match(Function_);
				setState(1151);
				match(OpenRoundBracket);
				setState(1152);
				formalParameterList();
				setState(1153);
				match(CloseRoundBracket);
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1154);
					match(Colon);
					setState(1155);
					typeHint(0);
					}
				}

				setState(1158);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				match(LambdaFn);
				setState(1161);
				match(OpenRoundBracket);
				setState(1162);
				formalParameterList();
				setState(1163);
				match(CloseRoundBracket);
				setState(1164);
				match(DoubleArrow);
				setState(1165);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchExprContext extends ParserRuleContext {
		public TerminalNode Match_() { return getToken(JhpParser.Match_, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public List<MatchItemContext> matchItem() {
			return getRuleContexts(MatchItemContext.class);
		}
		public MatchItemContext matchItem(int i) {
			return getRuleContext(MatchItemContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public MatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExprContext matchExpr() throws RecognitionException {
		MatchExprContext _localctx = new MatchExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_matchExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(Match_);
			setState(1170);
			match(OpenRoundBracket);
			setState(1171);
			expression(0);
			setState(1172);
			match(CloseRoundBracket);
			setState(1173);
			match(OpenCurlyBracket);
			setState(1174);
			matchItem();
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1175);
					match(Comma);
					setState(1176);
					matchItem();
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1182);
				match(Comma);
				}
			}

			setState(1185);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public MatchItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMatchItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMatchItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMatchItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchItemContext matchItem() throws RecognitionException {
		MatchItemContext _localctx = new MatchItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_matchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			expression(0);
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1188);
				match(Comma);
				setState(1189);
				expression(0);
				}
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195);
			match(DoubleArrow);
			setState(1196);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(JhpParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(New);
			setState(1199);
			typeRef();
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1200);
				arguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public TerminalNode PlusEqual() { return getToken(JhpParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(JhpParser.MinusEqual, 0); }
		public TerminalNode MulEqual() { return getToken(JhpParser.MulEqual, 0); }
		public TerminalNode PowEqual() { return getToken(JhpParser.PowEqual, 0); }
		public TerminalNode DivEqual() { return getToken(JhpParser.DivEqual, 0); }
		public TerminalNode Concaequal() { return getToken(JhpParser.Concaequal, 0); }
		public TerminalNode ModEqual() { return getToken(JhpParser.ModEqual, 0); }
		public TerminalNode AndEqual() { return getToken(JhpParser.AndEqual, 0); }
		public TerminalNode OrEqual() { return getToken(JhpParser.OrEqual, 0); }
		public TerminalNode XorEqual() { return getToken(JhpParser.XorEqual, 0); }
		public TerminalNode ShiftLeftEqual() { return getToken(JhpParser.ShiftLeftEqual, 0); }
		public TerminalNode ShiftRightEqual() { return getToken(JhpParser.ShiftRightEqual, 0); }
		public TerminalNode NullCoalescingEqual() { return getToken(JhpParser.NullCoalescingEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 281474976784375L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			arrayItem();
			setState(1210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1206);
					match(Comma);
					setState(1207);
					arrayItem();
					}
					} 
				}
				setState(1212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1213);
				match(Comma);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arrayItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			expression(0);
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1217);
				match(DoubleArrow);
				setState(1218);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterQualifiedStaticTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitQualifiedStaticTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitQualifiedStaticTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_qualifiedStaticTypeRef);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				qualifiedNamespaceName();
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1222);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(Static);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeRef);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1228);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1229);
					indirectTypeRef();
					}
					break;
				}
				setState(1233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1232);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1237);
				anonymousClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousClassContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public TerminalNode Interface() { return getToken(JhpParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Private() { return getToken(JhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(JhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(JhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(JhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public AnonymousClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAnonymousClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAnonymousClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAnonymousClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousClassContext anonymousClass() throws RecognitionException {
		AnonymousClassContext _localctx = new AnonymousClassContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_anonymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1240);
				attributes();
				}
			}

			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1243);
				match(Private);
				}
			}

			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1246);
				modifier();
				}
			}

			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1249);
				match(Partial);
				}
			}

			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1252);
				classEntryType();
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1253);
					typeParameterListInBrackets();
					}
				}

				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1256);
					match(Extends);
					setState(1257);
					qualifiedStaticTypeRef();
					}
				}

				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1260);
					match(Implements);
					setState(1261);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1264);
				match(Interface);
				setState(1265);
				identifier();
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1266);
					typeParameterListInBrackets();
					}
				}

				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1269);
					match(Extends);
					setState(1270);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1275);
			match(OpenCurlyBracket);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(1276);
				classStatement();
				}
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1282);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<TerminalNode> ObjectOperator() { return getTokens(JhpParser.ObjectOperator); }
		public TerminalNode ObjectOperator(int i) {
			return getToken(JhpParser.ObjectOperator, i);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIndirectTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIndirectTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIndirectTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			chainBase();
			setState(1289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1285);
					match(ObjectOperator);
					setState(1286);
					keyedFieldName();
					}
					} 
				}
				setState(1291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode NamespaceSeparator() { return getToken(JhpParser.NamespaceSeparator, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterQualifiedNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitQualifiedNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1292);
				match(NamespaceSeparator);
				}
			}

			setState(1295);
			namespaceNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(JhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(JhpParser.NamespaceSeparator, i);
		}
		public NamespaceNameTailContext namespaceNameTail() {
			return getRuleContext(NamespaceNameTailContext.class,0);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				identifier();
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1299);
						match(NamespaceSeparator);
						setState(1300);
						identifier();
						}
						} 
					}
					setState(1305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1306);
					match(NamespaceSeparator);
					setState(1307);
					namespaceNameTail();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceNameTailContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(JhpParser.As, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public List<NamespaceNameTailContext> namespaceNameTail() {
			return getRuleContexts(NamespaceNameTailContext.class);
		}
		public NamespaceNameTailContext namespaceNameTail(int i) {
			return getRuleContext(NamespaceNameTailContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public NamespaceNameTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNamespaceNameTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNamespaceNameTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNamespaceNameTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameTailContext namespaceNameTail() throws RecognitionException {
		NamespaceNameTailContext _localctx = new NamespaceNameTailContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				identifier();
				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1313);
					match(As);
					setState(1314);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(OpenCurlyBracket);
				setState(1318);
				namespaceNameTail();
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1319);
						match(Comma);
						setState(1320);
						namespaceNameTail();
						}
						} 
					}
					setState(1325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1326);
					match(Comma);
					}
				}

				setState(1329);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterQualifiedNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitQualifiedNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			qualifiedNamespaceName();
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1334);
				match(Comma);
				setState(1335);
				qualifiedNamespaceName();
				}
				}
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(OpenRoundBracket);
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184707L) != 0)) {
				{
				setState(1342);
				actualArgument();
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1343);
						match(Comma);
						setState(1344);
						actualArgument();
						}
						} 
					}
					setState(1349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				}
			}

			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1352);
				match(Comma);
				}
			}

			setState(1355);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JhpParser.Ellipsis, 0); }
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterActualArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitActualArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitActualArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_actualArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1357);
				argumentName();
				}
				break;
			}
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1360);
				match(Ellipsis);
				}
			}

			setState(1363);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitArgumentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitArgumentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			identifier();
			setState(1366);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantInitializerContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode Array() { return getToken(JhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JhpParser.Comma, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(JhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(JhpParser.CloseSquareBracket, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public TerminalNode Plus() { return getToken(JhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JhpParser.Minus, 0); }
		public List<TerminalNode> Dot() { return getTokens(JhpParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JhpParser.Dot, i);
		}
		public ConstantInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterConstantInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitConstantInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitConstantInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantInitializerContext constantInitializer() throws RecognitionException {
		ConstantInitializerContext _localctx = new ConstantInitializerContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constantInitializer);
		int _la;
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				match(Array);
				setState(1371);
				match(OpenRoundBracket);
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1372);
					arrayItemList();
					setState(1374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1373);
						match(Comma);
						}
					}

					}
				}

				setState(1378);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1379);
				match(OpenSquareBracket);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1380);
					arrayItemList();
					setState(1382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1381);
						match(Comma);
						}
					}

					}
				}

				setState(1386);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1387);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1388);
				constantInitializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1389);
					string();
					}
					break;
				case 2:
					{
					setState(1390);
					constant();
					}
					break;
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(1393);
					match(Dot);
					setState(1396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(1394);
						string();
						}
						break;
					case 2:
						{
						setState(1395);
						constant();
						}
						break;
					}
					}
					}
					setState(1402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(JhpParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_constant);
		try {
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1407);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1408);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1409);
				qualifiedNamespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(JhpParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(JhpParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_literalConstant);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1415);
				stringConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(JhpParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(JhpParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(JhpParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(JhpParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_la = _input.LA(1);
			if ( !(((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(JhpParser.DoubleColon, 0); }
		public TerminalNode Class() { return getToken(JhpParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(JhpParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(JhpParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(JhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(JhpParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterClassConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitClassConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitClassConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_classConstant);
		int _la;
		try {
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1421);
				match(DoubleColon);
				setState(1426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1422);
					identifier();
					}
					break;
				case 2:
					{
					setState(1423);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1424);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1425);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case As:
				case BinaryCast:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Do:
				case Echo:
				case Else:
				case ElseIf:
				case Enum_:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Extends:
				case Final:
				case Finally:
				case For:
				case Foreach:
				case Function_:
				case If:
				case Implements:
				case InstanceOf:
				case InsteadOf:
				case Interface:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Match_:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Readonly:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Var:
				case While:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1428);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1429);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1430);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1433);
				match(DoubleColon);
				setState(1436);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case As:
				case BinaryCast:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Do:
				case Echo:
				case Else:
				case ElseIf:
				case Enum_:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Extends:
				case Final:
				case Finally:
				case For:
				case Foreach:
				case Function_:
				case If:
				case Implements:
				case InstanceOf:
				case InsteadOf:
				case Interface:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Match_:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Readonly:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Var:
				case While:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case Label:
					{
					setState(1434);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1435);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(JhpParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			match(Label);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(JhpParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(JhpParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(JhpParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(JhpParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(JhpParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(JhpParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(JhpParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_string);
		try {
			int _alt;
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(StartHereDoc);
				setState(1444); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1443);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1446); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				match(StartNowDoc);
				setState(1450); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1449);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1452); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1455);
				match(DoubleQuote);
				setState(1459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1456);
						interpolatedStringPart();
						}
						} 
					}
					setState(1461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1462);
				match(DoubleQuote);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(JhpParser.StringPart, 0); }
		public TerminalNode UnicodeEscape() { return getToken(JhpParser.UnicodeEscape, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterInterpolatedStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitInterpolatedStringPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitInterpolatedStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interpolatedStringPart);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				match(UnicodeEscape);
				}
				break;
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterChainList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitChainList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitChainList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			chain();
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1471);
				match(Comma);
				setState(1472);
				chain();
				}
				}
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainContext extends ParserRuleContext {
		public ChainOriginContext chainOrigin() {
			return getRuleContext(ChainOriginContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			chainOrigin();
			setState(1482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1479);
					memberAccess();
					}
					} 
				}
				setState(1484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainOriginContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ChainOriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainOrigin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterChainOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitChainOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitChainOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainOriginContext chainOrigin() throws RecognitionException {
		ChainOriginContext _localctx = new ChainOriginContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_chainOrigin);
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				match(OpenRoundBracket);
				setState(1488);
				newExpr();
				setState(1489);
				match(CloseRoundBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode ObjectOperator() { return getToken(JhpParser.ObjectOperator, 0); }
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(ObjectOperator);
			setState(1494);
			keyedFieldName();
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1495);
				actualArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			functionCallName();
			setState(1499);
			actualArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitFunctionCallName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitFunctionCallName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_functionCallName);
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1501);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1502);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1503);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504);
				parentheses();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualArgumentsContext extends ParserRuleContext {
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterActualArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitActualArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitActualArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1507);
				genericDynamicArgs();
				}
			}

			setState(1511); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1510);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1513); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1515);
					squareCurlyExpression();
					}
					} 
				}
				setState(1520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public TerminalNode DoubleColon() { return getToken(JhpParser.DoubleColon, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterChainBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitChainBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitChainBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_chainBase);
		try {
			setState(1530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				keyedVariable();
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1522);
					match(DoubleColon);
					setState(1523);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				qualifiedStaticTypeRef();
				setState(1527);
				match(DoubleColon);
				setState(1528);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterKeyedFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitKeyedFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitKeyedFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_keyedFieldName);
		try {
			setState(1534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterKeyedSimpleFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitKeyedSimpleFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitKeyedSimpleFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case As:
			case BinaryCast:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Do:
			case Echo:
			case Else:
			case ElseIf:
			case Enum_:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Extends:
			case Final:
			case Finally:
			case For:
			case Foreach:
			case Function_:
			case If:
			case Implements:
			case InstanceOf:
			case InsteadOf:
			case Interface:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Var:
			case While:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1536);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1537);
				match(OpenCurlyBracket);
				setState(1538);
				expression(0);
				setState(1539);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1543);
					squareCurlyExpression();
					}
					} 
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(JhpParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(JhpParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterKeyedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitKeyedVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitKeyedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1549);
					match(Dollar);
					}
					} 
				}
				setState(1554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1555);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1556);
				match(Dollar);
				setState(1557);
				match(OpenCurlyBracket);
				setState(1558);
				expression(0);
				setState(1559);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1563);
					squareCurlyExpression();
					}
					} 
				}
				setState(1568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(JhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(JhpParser.CloseSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSquareCurlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSquareCurlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSquareCurlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				match(OpenSquareBracket);
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1570);
					expression(0);
					}
				}

				setState(1573);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				match(OpenCurlyBracket);
				setState(1575);
				expression(0);
				setState(1576);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(1580);
				assignmentListElement();
				}
			}

			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1583);
				match(Comma);
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1584);
					assignmentListElement();
					}
				}

				}
				}
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(JhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterAssignmentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitAssignmentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitAssignmentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_assignmentListElement);
		try {
			setState(1599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				match(List);
				setState(1594);
				match(OpenRoundBracket);
				setState(1595);
				assignmentList();
				setState(1596);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				arrayItem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(JhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(JhpParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(JhpParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(JhpParser.Abstract, 0); }
		public TerminalNode As() { return getToken(JhpParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(JhpParser.BinaryCast, 0); }
		public TerminalNode BooleanConstant() { return getToken(JhpParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(JhpParser.Break, 0); }
		public TerminalNode Callable() { return getToken(JhpParser.Callable, 0); }
		public TerminalNode Case() { return getToken(JhpParser.Case, 0); }
		public TerminalNode Catch() { return getToken(JhpParser.Catch, 0); }
		public TerminalNode Class() { return getToken(JhpParser.Class, 0); }
		public TerminalNode Clone() { return getToken(JhpParser.Clone, 0); }
		public TerminalNode Const() { return getToken(JhpParser.Const, 0); }
		public TerminalNode Continue() { return getToken(JhpParser.Continue, 0); }
		public TerminalNode Do() { return getToken(JhpParser.Do, 0); }
		public TerminalNode Echo() { return getToken(JhpParser.Echo, 0); }
		public TerminalNode Else() { return getToken(JhpParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(JhpParser.ElseIf, 0); }
		public TerminalNode EndFor() { return getToken(JhpParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(JhpParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(JhpParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(JhpParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(JhpParser.EndWhile, 0); }
		public TerminalNode Extends() { return getToken(JhpParser.Extends, 0); }
		public TerminalNode Final() { return getToken(JhpParser.Final, 0); }
		public TerminalNode Finally() { return getToken(JhpParser.Finally, 0); }
		public TerminalNode For() { return getToken(JhpParser.For, 0); }
		public TerminalNode Foreach() { return getToken(JhpParser.Foreach, 0); }
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public TerminalNode If() { return getToken(JhpParser.If, 0); }
		public TerminalNode Implements() { return getToken(JhpParser.Implements, 0); }
		public TerminalNode InstanceOf() { return getToken(JhpParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(JhpParser.InsteadOf, 0); }
		public TerminalNode Interface() { return getToken(JhpParser.Interface, 0); }
		public TerminalNode List() { return getToken(JhpParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(JhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(JhpParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(JhpParser.LogicalXor, 0); }
		public TerminalNode Null() { return getToken(JhpParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(JhpParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(JhpParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(JhpParser.Partial, 0); }
		public TerminalNode Print() { return getToken(JhpParser.Print, 0); }
		public TerminalNode Private() { return getToken(JhpParser.Private, 0); }
		public TerminalNode Protected() { return getToken(JhpParser.Protected, 0); }
		public TerminalNode Public() { return getToken(JhpParser.Public, 0); }
		public TerminalNode Readonly() { return getToken(JhpParser.Readonly, 0); }
		public TerminalNode Resource() { return getToken(JhpParser.Resource, 0); }
		public TerminalNode Return() { return getToken(JhpParser.Return, 0); }
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public TerminalNode StringType() { return getToken(JhpParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(JhpParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(JhpParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(JhpParser.Trait, 0); }
		public TerminalNode Try() { return getToken(JhpParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(JhpParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(JhpParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(JhpParser.UnicodeCast, 0); }
		public TerminalNode Var() { return getToken(JhpParser.Var, 0); }
		public TerminalNode While() { return getToken(JhpParser.While, 0); }
		public TerminalNode Enum_() { return getToken(JhpParser.Enum_, 0); }
		public TerminalNode Match_() { return getToken(JhpParser.Match_, 0); }
		public TerminalNode Get() { return getToken(JhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(JhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(JhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(JhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(JhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(JhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(JhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(JhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(JhpParser.Autoload, 0); }
		public TerminalNode ToString__() { return getToken(JhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(JhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(JhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(JhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(JhpParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(JhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(JhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(JhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(JhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(JhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(JhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(JhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(JhpParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4835138645100835840L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9222527069147955103L) != 0) || _la==Label) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(JhpParser.Public, 0); }
		public TerminalNode Protected() { return getToken(JhpParser.Protected, 0); }
		public TerminalNode Private() { return getToken(JhpParser.Private, 0); }
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(JhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(JhpParser.Final, 0); }
		public TerminalNode Readonly() { return getToken(JhpParser.Readonly, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(JhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(JhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(JhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(JhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(JhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(JhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(JhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(JhpParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterMagicConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitMagicConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitMagicConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(JhpParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(JhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(JhpParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(JhpParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(JhpParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(JhpParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(JhpParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(JhpParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(JhpParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3458799698461083648L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 9217L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(JhpParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(JhpParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(JhpParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(JhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(JhpParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(JhpParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(JhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(JhpParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(JhpParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(JhpParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(JhpParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(JhpParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(JhpParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(JhpParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(JhpParser.Resource, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterCastOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitCastOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitCastOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_castOperation);
		try {
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(BoolType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(Int8Cast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				match(Int16Cast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1614);
				match(IntType);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1615);
				match(Int64Type);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1616);
				match(UintCast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1617);
				match(DoubleCast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1618);
				match(DoubleType);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1619);
				match(FloatCast);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1620);
				match(StringType);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1621);
				match(BinaryCast);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1622);
				match(UnicodeCast);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1623);
				match(Array);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1624);
				match(ObjectType);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1625);
				match(Resource);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1626);
				qualifiedStaticTypeRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return typeHint_sempred((TypeHintContext)_localctx, predIndex);
		case 68:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeHint_sempred(TypeHintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 18:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00d1\u065e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0001\u0000\u0003\u0000\u00f2\b\u0000\u0001\u0000\u0003\u0000\u00f5"+
		"\b\u0000\u0001\u0000\u0005\u0000\u00f8\b\u0000\n\u0000\f\u0000\u00fb\t"+
		"\u0000\u0001\u0000\u0005\u0000\u00fe\b\u0000\n\u0000\f\u0000\u0101\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0106\b\u0001\n\u0001"+
		"\f\u0001\u0109\t\u0001\u0001\u0001\u0004\u0001\u010c\b\u0001\u000b\u0001"+
		"\f\u0001\u010d\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0117\b\u0003\n\u0003\f\u0003\u011a"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u011e\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0125\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"\u012c\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0131\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0138\b\u0006\u0001\u0006\u0003\u0006\u013b\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007\u0140\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0143\b\u0007\u0001\u0007\u0003\u0007\u0146\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0149\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u014e"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0152\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0156\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u015b\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u015f\b"+
		"\u0007\u0003\u0007\u0161\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0165"+
		"\b\u0007\n\u0007\f\u0007\u0168\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0171\b\t\n\t\f\t\u0174\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0184\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0189\b\u000b\n\u000b\f\u000b\u018c\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0191\b\f\n\f\f\f\u0194\t\f\u0001\r\u0003"+
		"\r\u0197\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u019c\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01a2\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01a8\b\u000f\n"+
		"\u000f\f\u000f\u01ab\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010\u01b0\b\u0010\u000b\u0010\f\u0010\u01b1\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u01b8\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01bd\b\u0011\n\u0011\f\u0011\u01c0\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01c6\b\u0012\u0001"+
		"\u0013\u0005\u0013\u01c9\b\u0013\n\u0013\f\u0013\u01cc\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01d1\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e5\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01f1\b\u0018"+
		"\n\u0018\f\u0018\u01f4\t\u0018\u0001\u0018\u0003\u0018\u01f7\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01fe"+
		"\b\u0018\n\u0018\f\u0018\u0201\t\u0018\u0001\u0018\u0003\u0018\u0204\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0209\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0223\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u022e"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0232\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0236\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u023f\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0249"+
		"\b\"\u0001\"\u0005\"\u024c\b\"\n\"\f\"\u024f\t\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0254\b\"\u0001\"\u0005\"\u0257\b\"\n\"\f\"\u025a\t\"\u0001"+
		"\"\u0001\"\u0003\"\u025e\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0268\b#\u0001$\u0001$\u0001%\u0001%\u0003%\u026e"+
		"\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u0274\b&\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0003\'\u027a\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u028e\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u0298\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02a5\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u02ad\b)\u0001*\u0001*\u0001*\u0004*\u02b2"+
		"\b*\u000b*\f*\u02b3\u0001*\u0003*\u02b7\b*\u0001*\u0005*\u02ba\b*\n*\f"+
		"*\u02bd\t*\u0001*\u0003*\u02c0\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u02c7\b+\n+\f+\u02ca\t+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001.\u0003.\u02d8\b.\u0001.\u0001.\u0005"+
		".\u02dc\b.\n.\f.\u02df\t.\u0001.\u0003.\u02e2\b.\u0001/\u0003/\u02e5\b"+
		"/\u0001/\u0005/\u02e8\b/\n/\f/\u02eb\t/\u0001/\u0003/\u02ee\b/\u0001/"+
		"\u0001/\u0003/\u02f2\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0003"+
		"0\u02fa\b0\u00010\u00010\u00010\u00050\u02ff\b0\n0\f0\u0302\t0\u00011"+
		"\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u030c\b2\n2\f"+
		"2\u030f\t2\u00012\u00012\u00013\u00033\u0314\b3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00053\u031b\b3\n3\f3\u031e\t3\u00013\u00013\u00013\u00033\u0323"+
		"\b3\u00013\u00013\u00033\u0327\b3\u00013\u00013\u00013\u00053\u032c\b"+
		"3\n3\f3\u032f\t3\u00013\u00013\u00013\u00013\u00013\u00033\u0336\b3\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u033d\b3\u00013\u00013\u00033\u0341"+
		"\b3\u00033\u0343\b3\u00013\u00013\u00013\u00013\u00033\u0349\b3\u0001"+
		"4\u00014\u00014\u00054\u034e\b4\n4\f4\u0351\t4\u00014\u00034\u0354\b4"+
		"\u00015\u00015\u00035\u0358\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00037\u0365\b7\u00017\u00037\u0368"+
		"\b7\u00017\u00017\u00018\u00018\u00018\u00038\u036f\b8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00039\u0376\b9\u0001:\u0001:\u0003:\u037a\b:\u0001:\u0001"+
		":\u0001;\u0001;\u0003;\u0380\b;\u0001<\u0001<\u0001=\u0004=\u0385\b=\u000b"+
		"=\f=\u0386\u0001>\u0001>\u0001>\u0003>\u038c\b>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0003@\u0396\b@\u0001@\u0001@\u0003@\u039a"+
		"\b@\u0001@\u0001@\u0005@\u039e\b@\n@\f@\u03a1\t@\u0001@\u0001@\u0001A"+
		"\u0001A\u0001A\u0001A\u0003A\u03a9\bA\u0001A\u0001A\u0001A\u0003A\u03ae"+
		"\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u03b5\bA\u0001B\u0001B\u0001"+
		"B\u0005B\u03ba\bB\nB\fB\u03bd\tB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u03eb"+
		"\bD\u0001D\u0001D\u0003D\u03ef\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0415\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0005D\u042b\bD\nD\fD\u042e\tD\u0001E\u0001E\u0003E\u0432"+
		"\bE\u0001F\u0001F\u0001F\u0003F\u0437\bF\u0001F\u0001F\u0001F\u0003F\u043c"+
		"\bF\u0001F\u0003F\u043f\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u0445\b"+
		"F\u0001G\u0001G\u0005G\u0449\bG\nG\fG\u044c\tG\u0001G\u0001G\u0004G\u0450"+
		"\bG\u000bG\fG\u0451\u0001G\u0005G\u0455\bG\nG\fG\u0458\tG\u0001G\u0005"+
		"G\u045b\bG\nG\fG\u045e\tG\u0001G\u0001G\u0001G\u0001G\u0001G\u0004G\u0465"+
		"\bG\u000bG\fG\u0466\u0001G\u0005G\u046a\bG\nG\fG\u046d\tG\u0001G\u0003"+
		"G\u0470\bG\u0001G\u0001G\u0003G\u0474\bG\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0003I\u047b\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u0485\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0003J\u0490\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0005K\u049a\bK\nK\fK\u049d\tK\u0001K\u0003K\u04a0\bK\u0001K"+
		"\u0001K\u0001L\u0001L\u0001L\u0005L\u04a7\bL\nL\fL\u04aa\tL\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0001M\u0003M\u04b2\bM\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0005O\u04b9\bO\nO\fO\u04bc\tO\u0001O\u0003O\u04bf\bO\u0001P"+
		"\u0001P\u0001P\u0003P\u04c4\bP\u0001Q\u0001Q\u0003Q\u04c8\bQ\u0001Q\u0003"+
		"Q\u04cb\bQ\u0001R\u0001R\u0003R\u04cf\bR\u0001R\u0003R\u04d2\bR\u0001"+
		"R\u0001R\u0001R\u0003R\u04d7\bR\u0001S\u0003S\u04da\bS\u0001S\u0003S\u04dd"+
		"\bS\u0001S\u0003S\u04e0\bS\u0001S\u0003S\u04e3\bS\u0001S\u0001S\u0003"+
		"S\u04e7\bS\u0001S\u0001S\u0003S\u04eb\bS\u0001S\u0001S\u0003S\u04ef\b"+
		"S\u0001S\u0001S\u0001S\u0003S\u04f4\bS\u0001S\u0001S\u0003S\u04f8\bS\u0003"+
		"S\u04fa\bS\u0001S\u0001S\u0005S\u04fe\bS\nS\fS\u0501\tS\u0001S\u0001S"+
		"\u0001T\u0001T\u0001T\u0005T\u0508\bT\nT\fT\u050b\tT\u0001U\u0003U\u050e"+
		"\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u0516\bV\nV\fV\u0519"+
		"\tV\u0001V\u0001V\u0003V\u051d\bV\u0003V\u051f\bV\u0001W\u0001W\u0001"+
		"W\u0003W\u0524\bW\u0001W\u0001W\u0001W\u0001W\u0005W\u052a\bW\nW\fW\u052d"+
		"\tW\u0001W\u0003W\u0530\bW\u0001W\u0001W\u0003W\u0534\bW\u0001X\u0001"+
		"X\u0001X\u0005X\u0539\bX\nX\fX\u053c\tX\u0001Y\u0001Y\u0001Y\u0001Y\u0005"+
		"Y\u0542\bY\nY\fY\u0545\tY\u0003Y\u0547\bY\u0001Y\u0003Y\u054a\bY\u0001"+
		"Y\u0001Y\u0001Z\u0003Z\u054f\bZ\u0001Z\u0003Z\u0552\bZ\u0001Z\u0001Z\u0001"+
		"[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u055f\b\\\u0003\\\u0561\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\"+
		"\u0567\b\\\u0003\\\u0569\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u0570\b\\\u0001\\\u0001\\\u0001\\\u0003\\\u0575\b\\\u0005\\\u0577\b"+
		"\\\n\\\f\\\u057a\t\\\u0003\\\u057c\b\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0003]\u0583\b]\u0001^\u0001^\u0001^\u0001^\u0003^\u0589\b^\u0001_\u0001"+
		"_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u0593\b`\u0001`\u0001"+
		"`\u0001`\u0003`\u0598\b`\u0001`\u0001`\u0001`\u0003`\u059d\b`\u0003`\u059f"+
		"\b`\u0001a\u0001a\u0001b\u0001b\u0004b\u05a5\bb\u000bb\fb\u05a6\u0001"+
		"b\u0001b\u0004b\u05ab\bb\u000bb\fb\u05ac\u0001b\u0001b\u0001b\u0005b\u05b2"+
		"\bb\nb\fb\u05b5\tb\u0001b\u0003b\u05b8\bb\u0001c\u0001c\u0001c\u0003c"+
		"\u05bd\bc\u0001d\u0001d\u0001d\u0005d\u05c2\bd\nd\fd\u05c5\td\u0001e\u0001"+
		"e\u0005e\u05c9\be\ne\fe\u05cc\te\u0001f\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0003f\u05d4\bf\u0001g\u0001g\u0001g\u0003g\u05d9\bg\u0001h\u0001h\u0001"+
		"h\u0001i\u0001i\u0001i\u0001i\u0003i\u05e2\bi\u0001j\u0003j\u05e5\bj\u0001"+
		"j\u0004j\u05e8\bj\u000bj\fj\u05e9\u0001j\u0005j\u05ed\bj\nj\fj\u05f0\t"+
		"j\u0001k\u0001k\u0001k\u0003k\u05f5\bk\u0001k\u0001k\u0001k\u0001k\u0003"+
		"k\u05fb\bk\u0001l\u0001l\u0003l\u05ff\bl\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0003m\u0606\bm\u0001m\u0005m\u0609\bm\nm\fm\u060c\tm\u0001n\u0005n"+
		"\u060f\bn\nn\fn\u0612\tn\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0003"+
		"n\u061a\bn\u0001n\u0005n\u061d\bn\nn\fn\u0620\tn\u0001o\u0001o\u0003o"+
		"\u0624\bo\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u062b\bo\u0001p\u0003"+
		"p\u062e\bp\u0001p\u0001p\u0003p\u0632\bp\u0005p\u0634\bp\np\fp\u0637\t"+
		"p\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u0640\bq\u0001"+
		"r\u0001r\u0001s\u0001s\u0001t\u0001t\u0001u\u0001u\u0001v\u0001v\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u065c\bw\u0001w\u0000\u0002"+
		"`\u0088x\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u0000\u0016\u0003\u000056P"+
		"P^^\u0001\u0000LN\u0002\u0000\u0014\u0014XX\u0001\u0000\u00b9\u00ba\u0002"+
		"\u0000==UU\u0001\u0000\u00ad\u00ae\u0002\u0000\u00a6\u00a6\u00a8\u00a9"+
		"\u0001\u0000\u0083\u0084\u0001\u0000\u00aa\u00ac\u0002\u0000\u00a8\u00a9"+
		"\u00b0\u00b0\u0001\u0000\u009c\u009d\u0002\u0000\u0089\u008a\u00a2\u00a3"+
		"\u0001\u0000\u0085\u0088\u0004\u0000\u008b\u008d\u008f\u0097\u009b\u009b"+
		"\u00bb\u00bb\u0001\u0000\u00a8\u00a9\u0002\u0000\u00c0\u00c1\u00c3\u00c4"+
		"\u0002\u0000\u0014\u0014II\u0002\u0000\n\n++\u0013\u0000\n\n\f\r\u000f"+
		"\u0017\u001a\u001a\u001d\u001f!!#\'*,.03489>>@DGOR\\_`gor~\u00bf\u00bf"+
		"\u0004\u0000\n\n++LOTT\u0001\u0000w~\b\u0000\u000b\u000b\u000e\u000e\u001c"+
		"\u001c--<=HHRRUU\u070f\u0000\u00f1\u0001\u0000\u0000\u0000\u0002\u0107"+
		"\u0001\u0000\u0000\u0000\u0004\u010f\u0001\u0000\u0000\u0000\u0006\u0113"+
		"\u0001\u0000\u0000\u0000\b\u0124\u0001\u0000\u0000\u0000\n\u0126\u0001"+
		"\u0000\u0000\u0000\f\u012b\u0001\u0000\u0000\u0000\u000e\u013f\u0001\u0000"+
		"\u0000\u0000\u0010\u016b\u0001\u0000\u0000\u0000\u0012\u016d\u0001\u0000"+
		"\u0000\u0000\u0014\u0183\u0001\u0000\u0000\u0000\u0016\u0185\u0001\u0000"+
		"\u0000\u0000\u0018\u018d\u0001\u0000\u0000\u0000\u001a\u0196\u0001\u0000"+
		"\u0000\u0000\u001c\u019b\u0001\u0000\u0000\u0000\u001e\u01a3\u0001\u0000"+
		"\u0000\u0000 \u01af\u0001\u0000\u0000\u0000\"\u01b3\u0001\u0000\u0000"+
		"\u0000$\u01c3\u0001\u0000\u0000\u0000&\u01ca\u0001\u0000\u0000\u0000("+
		"\u01d0\u0001\u0000\u0000\u0000*\u01e4\u0001\u0000\u0000\u0000,\u01e6\u0001"+
		"\u0000\u0000\u0000.\u01e8\u0001\u0000\u0000\u00000\u0208\u0001\u0000\u0000"+
		"\u00002\u020a\u0001\u0000\u0000\u00004\u020e\u0001\u0000\u0000\u00006"+
		"\u0213\u0001\u0000\u0000\u00008\u0216\u0001\u0000\u0000\u0000:\u021a\u0001"+
		"\u0000\u0000\u0000<\u0224\u0001\u0000\u0000\u0000>\u022a\u0001\u0000\u0000"+
		"\u0000@\u0240\u0001\u0000\u0000\u0000B\u0242\u0001\u0000\u0000\u0000D"+
		"\u0244\u0001\u0000\u0000\u0000F\u0267\u0001\u0000\u0000\u0000H\u0269\u0001"+
		"\u0000\u0000\u0000J\u026b\u0001\u0000\u0000\u0000L\u0271\u0001\u0000\u0000"+
		"\u0000N\u0277\u0001\u0000\u0000\u0000P\u027d\u0001\u0000\u0000\u0000R"+
		"\u0280\u0001\u0000\u0000\u0000T\u02ae\u0001\u0000\u0000\u0000V\u02c1\u0001"+
		"\u0000\u0000\u0000X\u02cf\u0001\u0000\u0000\u0000Z\u02d2\u0001\u0000\u0000"+
		"\u0000\\\u02d7\u0001\u0000\u0000\u0000^\u02e4\u0001\u0000\u0000\u0000"+
		"`\u02f9\u0001\u0000\u0000\u0000b\u0303\u0001\u0000\u0000\u0000d\u0307"+
		"\u0001\u0000\u0000\u0000f\u0348\u0001\u0000\u0000\u0000h\u0353\u0001\u0000"+
		"\u0000\u0000j\u0357\u0001\u0000\u0000\u0000l\u0359\u0001\u0000\u0000\u0000"+
		"n\u0360\u0001\u0000\u0000\u0000p\u036e\u0001\u0000\u0000\u0000r\u0372"+
		"\u0001\u0000\u0000\u0000t\u0377\u0001\u0000\u0000\u0000v\u037f\u0001\u0000"+
		"\u0000\u0000x\u0381\u0001\u0000\u0000\u0000z\u0384\u0001\u0000\u0000\u0000"+
		"|\u0388\u0001\u0000\u0000\u0000~\u038d\u0001\u0000\u0000\u0000\u0080\u0391"+
		"\u0001\u0000\u0000\u0000\u0082\u03b4\u0001\u0000\u0000\u0000\u0084\u03b6"+
		"\u0001\u0000\u0000\u0000\u0086\u03be\u0001\u0000\u0000\u0000\u0088\u03ee"+
		"\u0001\u0000\u0000\u0000\u008a\u0431\u0001\u0000\u0000\u0000\u008c\u043e"+
		"\u0001\u0000\u0000\u0000\u008e\u0473\u0001\u0000\u0000\u0000\u0090\u0475"+
		"\u0001\u0000\u0000\u0000\u0092\u047a\u0001\u0000\u0000\u0000\u0094\u048f"+
		"\u0001\u0000\u0000\u0000\u0096\u0491\u0001\u0000\u0000\u0000\u0098\u04a3"+
		"\u0001\u0000\u0000\u0000\u009a\u04ae\u0001\u0000\u0000\u0000\u009c\u04b3"+
		"\u0001\u0000\u0000\u0000\u009e\u04b5\u0001\u0000\u0000\u0000\u00a0\u04c0"+
		"\u0001\u0000\u0000\u0000\u00a2\u04ca\u0001\u0000\u0000\u0000\u00a4\u04d6"+
		"\u0001\u0000\u0000\u0000\u00a6\u04d9\u0001\u0000\u0000\u0000\u00a8\u0504"+
		"\u0001\u0000\u0000\u0000\u00aa\u050d\u0001\u0000\u0000\u0000\u00ac\u051e"+
		"\u0001\u0000\u0000\u0000\u00ae\u0533\u0001\u0000\u0000\u0000\u00b0\u0535"+
		"\u0001\u0000\u0000\u0000\u00b2\u053d\u0001\u0000\u0000\u0000\u00b4\u054e"+
		"\u0001\u0000\u0000\u0000\u00b6\u0555\u0001\u0000\u0000\u0000\u00b8\u057b"+
		"\u0001\u0000\u0000\u0000\u00ba\u0582\u0001\u0000\u0000\u0000\u00bc\u0588"+
		"\u0001\u0000\u0000\u0000\u00be\u058a\u0001\u0000\u0000\u0000\u00c0\u059e"+
		"\u0001\u0000\u0000\u0000\u00c2\u05a0\u0001\u0000\u0000\u0000\u00c4\u05b7"+
		"\u0001\u0000\u0000\u0000\u00c6\u05bc\u0001\u0000\u0000\u0000\u00c8\u05be"+
		"\u0001\u0000\u0000\u0000\u00ca\u05c6\u0001\u0000\u0000\u0000\u00cc\u05d3"+
		"\u0001\u0000\u0000\u0000\u00ce\u05d5\u0001\u0000\u0000\u0000\u00d0\u05da"+
		"\u0001\u0000\u0000\u0000\u00d2\u05e1\u0001\u0000\u0000\u0000\u00d4\u05e4"+
		"\u0001\u0000\u0000\u0000\u00d6\u05fa\u0001\u0000\u0000\u0000\u00d8\u05fe"+
		"\u0001\u0000\u0000\u0000\u00da\u0605\u0001\u0000\u0000\u0000\u00dc\u0610"+
		"\u0001\u0000\u0000\u0000\u00de\u062a\u0001\u0000\u0000\u0000\u00e0\u062d"+
		"\u0001\u0000\u0000\u0000\u00e2\u063f\u0001\u0000\u0000\u0000\u00e4\u0641"+
		"\u0001\u0000\u0000\u0000\u00e6\u0643\u0001\u0000\u0000\u0000\u00e8\u0645"+
		"\u0001\u0000\u0000\u0000\u00ea\u0647\u0001\u0000\u0000\u0000\u00ec\u0649"+
		"\u0001\u0000\u0000\u0000\u00ee\u065b\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0005\u0002\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u0003\n\u0005\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003"+
		"\u0004\u0002\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0003\b\u0004\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0000"+
		"\u0000\u0001\u0103\u0001\u0001\u0000\u0000\u0000\u0104\u0106\u0003\u0004"+
		"\u0002\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0003\b\u0004\u0000\u010b\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0003\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0007\u0000\u0000\u0000\u0110\u0111\u0003\u0006\u0003"+
		"\u0000\u0111\u0112\u0005\u00ba\u0000\u0000\u0112\u0005\u0001\u0000\u0000"+
		"\u0000\u0113\u0118\u0003\u00e6s\u0000\u0114\u0115\u0005\u00a0\u0000\u0000"+
		"\u0115\u0117\u0003\u00e6s\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011d\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u00a0\u0000\u0000\u011c"+
		"\u011e\u0005\u00aa\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0007\u0001\u0000\u0000\u0000\u011f"+
		"\u0125\u0003*\u0015\u0000\u0120\u0125\u0003\n\u0005\u0000\u0121\u0125"+
		"\u0003\f\u0006\u0000\u0122\u0125\u0003\u000e\u0007\u0000\u0123\u0125\u0003"+
		"\u0080@\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000"+
		"\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\t\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005E\u0000\u0000\u0127\u0128\u0003\u00acV\u0000\u0128"+
		"\u0129\u0005\u00ba\u0000\u0000\u0129\u000b\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0003 \u0010\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u00050\u0000\u0000\u012e\u0130\u0003\u00e6s\u0000\u012f\u0131\u0003\u0014"+
		"\n\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u00b2\u0000"+
		"\u0000\u0133\u0134\u0003\\.\u0000\u0134\u013a\u0005\u00b3\u0000\u0000"+
		"\u0135\u0137\u0005\u00b9\u0000\u0000\u0136\u0138\u0005\u00b1\u0000\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0003`0\u0000\u013a\u0135"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0003.\u0017\u0000\u013d\r\u0001"+
		"\u0000\u0000\u0000\u013e\u0140\u0003 \u0010\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u0143\u0007\u0001\u0000\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0003\u00e4r\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0005J\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0160\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0003\u0010\b\u0000\u014b\u014d\u0003\u00e6s\u0000\u014c"+
		"\u014e\u0003\u0014\n\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005*\u0000\u0000\u0150\u0152\u0003\u00a2Q\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u00054\u0000\u0000\u0154\u0156\u0003\u0012\t"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0161\u0001\u0000\u0000\u0000\u0157\u0158\u0005>\u0000\u0000"+
		"\u0158\u015a\u0003\u00e6s\u0000\u0159\u015b\u0003\u0014\n\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015e\u0001\u0000\u0000\u0000\u015c\u015d\u0005*\u0000\u0000\u015d\u015f"+
		"\u0003\u0012\t\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u014a\u0001"+
		"\u0000\u0000\u0000\u0160\u0157\u0001\u0000\u0000\u0000\u0161\u0162\u0001"+
		"\u0000\u0000\u0000\u0162\u0166\u0005\u00b6\u0000\u0000\u0163\u0165\u0003"+
		"f3\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000"+
		"\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0005\u00b7\u0000\u0000\u016a\u000f\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0007\u0002\u0000\u0000\u016c\u0011\u0001\u0000\u0000"+
		"\u0000\u016d\u0172\u0003\u00a2Q\u0000\u016e\u016f\u0005\u00b8\u0000\u0000"+
		"\u016f\u0171\u0003\u00a2Q\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0013\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0080\u0000\u0000\u0176"+
		"\u0177\u0003\u0016\u000b\u0000\u0177\u0178\u0005\u0081\u0000\u0000\u0178"+
		"\u0184\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0080\u0000\u0000\u017a"+
		"\u017b\u0003\u0018\f\u0000\u017b\u017c\u0005\u0081\u0000\u0000\u017c\u0184"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0080\u0000\u0000\u017e\u017f"+
		"\u0003\u0016\u000b\u0000\u017f\u0180\u0005\u00b8\u0000\u0000\u0180\u0181"+
		"\u0003\u0018\f\u0000\u0181\u0182\u0005\u0081\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0175\u0001\u0000\u0000\u0000\u0183\u0179\u0001"+
		"\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0184\u0015\u0001"+
		"\u0000\u0000\u0000\u0185\u018a\u0003\u001a\r\u0000\u0186\u0187\u0005\u00b8"+
		"\u0000\u0000\u0187\u0189\u0003\u001a\r\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u0017\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u0192\u0003\u001c\u000e"+
		"\u0000\u018e\u018f\u0005\u00b8\u0000\u0000\u018f\u0191\u0003\u001c\u000e"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0019\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0003 \u0010\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0003\u00e6s\u0000\u0199\u001b\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0003 \u0010\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0003\u00e6s\u0000\u019e\u01a1\u0005\u00bb\u0000\u0000\u019f\u01a2\u0003"+
		"\u00a2Q\u0000\u01a0\u01a2\u0003\u00ecv\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u001d\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0005\u0080\u0000\u0000\u01a4\u01a9\u0003\u00a4R\u0000"+
		"\u01a5\u01a6\u0005\u00b8\u0000\u0000\u01a6\u01a8\u0003\u00a4R\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005\u0081\u0000\u0000\u01ad\u001f\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b0\u0003\"\u0011\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2!\u0001\u0000\u0000\u0000\u01b3\u01b7\u0005"+
		"\u0006\u0000\u0000\u01b4\u01b5\u0003\u00e6s\u0000\u01b5\u01b6\u0005\u00b9"+
		"\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01be\u0003$\u0012\u0000\u01ba\u01bb\u0005\u00b8\u0000"+
		"\u0000\u01bb\u01bd\u0003$\u0012\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u00b5\u0000\u0000"+
		"\u01c2#\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003\u00aaU\u0000\u01c4\u01c6"+
		"\u0003\u00b2Y\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6%\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003(\u0014"+
		"\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\'\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d1\u0003*\u0015\u0000\u01ce\u01d1\u0003\f\u0006\u0000\u01cf"+
		"\u01d1\u0003\u000e\u0007\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		")\u0001\u0000\u0000\u0000\u01d2\u01e5\u0003.\u0017\u0000\u01d3\u01e5\u0003"+
		"0\u0018\u0000\u01d4\u01e5\u0003:\u001d\u0000\u01d5\u01e5\u0003<\u001e"+
		"\u0000\u01d6\u01e5\u0003>\u001f\u0000\u01d7\u01e5\u0003D\"\u0000\u01d8"+
		"\u01e5\u0003J%\u0000\u01d9\u01e5\u0003L&\u0000\u01da\u01e5\u0003N\'\u0000"+
		"\u01db\u01e5\u0003b1\u0000\u01dc\u01e5\u0003P(\u0000\u01dd\u01e5\u0003"+
		"R)\u0000\u01de\u01e5\u0003T*\u0000\u01df\u01e5\u0003Z-\u0000\u01e0\u01e5"+
		"\u0003,\u0016\u0000\u01e1\u01e2\u0003 \u0010\u0000\u01e2\u01e3\u0003P"+
		"(\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01d3\u0001\u0000\u0000\u0000\u01e4\u01d4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01d5\u0001\u0000\u0000\u0000\u01e4\u01d6\u0001\u0000\u0000"+
		"\u0000\u01e4\u01d7\u0001\u0000\u0000\u0000\u01e4\u01d8\u0001\u0000\u0000"+
		"\u0000\u01e4\u01d9\u0001\u0000\u0000\u0000\u01e4\u01da\u0001\u0000\u0000"+
		"\u0000\u01e4\u01db\u0001\u0000\u0000\u0000\u01e4\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e4\u01dd\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000"+
		"\u0000\u01e4\u01df\u0001\u0000\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e1\u0001\u0000\u0000\u0000\u01e5+\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005\u00ba\u0000\u0000\u01e7-\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005\u00b6\u0000\u0000\u01e9\u01ea\u0003&\u0013\u0000\u01ea\u01eb"+
		"\u0005\u00b7\u0000\u0000\u01eb/\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005"+
		"3\u0000\u0000\u01ed\u01ee\u0003\u0086C\u0000\u01ee\u01f2\u0003*\u0015"+
		"\u0000\u01ef\u01f1\u00032\u0019\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f7\u00036\u001b\u0000\u01f6"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7"+
		"\u0209\u0001\u0000\u0000\u0000\u01f8\u01f9\u00053\u0000\u0000\u01f9\u01fa"+
		"\u0003\u0086C\u0000\u01fa\u01fb\u0005\u00b9\u0000\u0000\u01fb\u01ff\u0003"+
		"&\u0013\u0000\u01fc\u01fe\u00034\u001a\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000"+
		"\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0204\u00038\u001c\u0000"+
		"\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0005%\u0000\u0000\u0206"+
		"\u0207\u0005\u00ba\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208"+
		"\u01ec\u0001\u0000\u0000\u0000\u0208\u01f8\u0001\u0000\u0000\u0000\u0209"+
		"1\u0001\u0000\u0000\u0000\u020a\u020b\u0005\u001f\u0000\u0000\u020b\u020c"+
		"\u0003\u0086C\u0000\u020c\u020d\u0003*\u0015\u0000\u020d3\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0005\u001f\u0000\u0000\u020f\u0210\u0003\u0086"+
		"C\u0000\u0210\u0211\u0005\u00b9\u0000\u0000\u0211\u0212\u0003&\u0013\u0000"+
		"\u02125\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u001e\u0000\u0000\u0214"+
		"\u0215\u0003*\u0015\u0000\u02157\u0001\u0000\u0000\u0000\u0216\u0217\u0005"+
		"\u001e\u0000\u0000\u0217\u0218\u0005\u00b9\u0000\u0000\u0218\u0219\u0003"+
		"&\u0013\u0000\u02199\u0001\u0000\u0000\u0000\u021a\u021b\u0005`\u0000"+
		"\u0000\u021b\u0222\u0003\u0086C\u0000\u021c\u0223\u0003*\u0015\u0000\u021d"+
		"\u021e\u0005\u00b9\u0000\u0000\u021e\u021f\u0003&\u0013\u0000\u021f\u0220"+
		"\u0005\'\u0000\u0000\u0220\u0221\u0005\u00ba\u0000\u0000\u0221\u0223\u0001"+
		"\u0000\u0000\u0000\u0222\u021c\u0001\u0000\u0000\u0000\u0222\u021d\u0001"+
		"\u0000\u0000\u0000\u0223;\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u001a"+
		"\u0000\u0000\u0225\u0226\u0003*\u0015\u0000\u0226\u0227\u0005`\u0000\u0000"+
		"\u0227\u0228\u0003\u0086C\u0000\u0228\u0229\u0005\u00ba\u0000\u0000\u0229"+
		"=\u0001\u0000\u0000\u0000\u022a\u022b\u0005.\u0000\u0000\u022b\u022d\u0005"+
		"\u00b2\u0000\u0000\u022c\u022e\u0003@ \u0000\u022d\u022c\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0231\u0005\u00ba\u0000\u0000\u0230\u0232\u0003\u0084B\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0005\u00ba\u0000\u0000"+
		"\u0234\u0236\u0003B!\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u023e"+
		"\u0005\u00b3\u0000\u0000\u0238\u023f\u0003*\u0015\u0000\u0239\u023a\u0005"+
		"\u00b9\u0000\u0000\u023a\u023b\u0003&\u0013\u0000\u023b\u023c\u0005#\u0000"+
		"\u0000\u023c\u023d\u0005\u00ba\u0000\u0000\u023d\u023f\u0001\u0000\u0000"+
		"\u0000\u023e\u0238\u0001\u0000\u0000\u0000\u023e\u0239\u0001\u0000\u0000"+
		"\u0000\u023f?\u0001\u0000\u0000\u0000\u0240\u0241\u0003\u0084B\u0000\u0241"+
		"A\u0001\u0000\u0000\u0000\u0242\u0243\u0003\u0084B\u0000\u0243C\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0005V\u0000\u0000\u0245\u025d\u0003\u0086"+
		"C\u0000\u0246\u0248\u0005\u00b6\u0000\u0000\u0247\u0249\u0005\u00ba\u0000"+
		"\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024d\u0001\u0000\u0000\u0000\u024a\u024c\u0003F#\u0000\u024b"+
		"\u024a\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u0250\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250"+
		"\u025e\u0005\u00b7\u0000\u0000\u0251\u0253\u0005\u00b9\u0000\u0000\u0252"+
		"\u0254\u0005\u00ba\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0258\u0001\u0000\u0000\u0000\u0255"+
		"\u0257\u0003F#\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001"+
		"\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0258\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0005&\u0000\u0000\u025c\u025e\u0005\u00ba"+
		"\u0000\u0000\u025d\u0246\u0001\u0000\u0000\u0000\u025d\u0251\u0001\u0000"+
		"\u0000\u0000\u025eE\u0001\u0000\u0000\u0000\u025f\u0260\u0005\u0012\u0000"+
		"\u0000\u0260\u0261\u0003\u0088D\u0000\u0261\u0262\u0007\u0003\u0000\u0000"+
		"\u0262\u0263\u0003H$\u0000\u0263\u0268\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0005\u0019\u0000\u0000\u0265\u0266\u0007\u0003\u0000\u0000\u0266\u0268"+
		"\u0003H$\u0000\u0267\u025f\u0001\u0000\u0000\u0000\u0267\u0264\u0001\u0000"+
		"\u0000\u0000\u0268G\u0001\u0000\u0000\u0000\u0269\u026a\u0003&\u0013\u0000"+
		"\u026aI\u0001\u0000\u0000\u0000\u026b\u026d\u0005\u0010\u0000\u0000\u026c"+
		"\u026e\u0003\u0088D\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0005\u00ba\u0000\u0000\u0270K\u0001\u0000\u0000\u0000\u0271\u0273\u0005"+
		"\u0017\u0000\u0000\u0272\u0274\u0003\u0088D\u0000\u0273\u0272\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0005\u00ba\u0000\u0000\u0276M\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0005S\u0000\u0000\u0278\u027a\u0003\u0088D\u0000\u0279"+
		"\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u00ba\u0000\u0000\u027c"+
		"O\u0001\u0000\u0000\u0000\u027d\u027e\u0003\u0088D\u0000\u027e\u027f\u0005"+
		"\u00ba\u0000\u0000\u027fQ\u0001\u0000\u0000\u0000\u0280\u02a4\u0005/\u0000"+
		"\u0000\u0281\u0282\u0005\u00b2\u0000\u0000\u0282\u0283\u0003\u0088D\u0000"+
		"\u0283\u0284\u0005\f\u0000\u0000\u0284\u0285\u0003\u008eG\u0000\u0285"+
		"\u0286\u0005\u00b3\u0000\u0000\u0286\u02a5\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0005\u00b2\u0000\u0000\u0288\u0289\u0003\u00cae\u0000\u0289\u028a"+
		"\u0005\f\u0000\u0000\u028a\u028d\u0003\u008aE\u0000\u028b\u028c\u0005"+
		"\u0082\u0000\u0000\u028c\u028e\u0003\u00cae\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0005\u00b3\u0000\u0000\u0290\u02a5\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0005\u00b2\u0000\u0000\u0292\u0293\u0003\u0088"+
		"D\u0000\u0293\u0294\u0005\f\u0000\u0000\u0294\u0297\u0003\u008aE\u0000"+
		"\u0295\u0296\u0005\u0082\u0000\u0000\u0296\u0298\u0003\u00cae\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u00b3\u0000\u0000\u029a"+
		"\u02a5\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u00b2\u0000\u0000\u029c"+
		"\u029d\u0003\u00cae\u0000\u029d\u029e\u0005\f\u0000\u0000\u029e\u029f"+
		"\u0005@\u0000\u0000\u029f\u02a0\u0005\u00b2\u0000\u0000\u02a0\u02a1\u0003"+
		"\u00e0p\u0000\u02a1\u02a2\u0005\u00b3\u0000\u0000\u02a2\u02a3\u0005\u00b3"+
		"\u0000\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u0281\u0001\u0000"+
		"\u0000\u0000\u02a4\u0287\u0001\u0000\u0000\u0000\u02a4\u0291\u0001\u0000"+
		"\u0000\u0000\u02a4\u029b\u0001\u0000\u0000\u0000\u02a5\u02ac\u0001\u0000"+
		"\u0000\u0000\u02a6\u02ad\u0003*\u0015\u0000\u02a7\u02a8\u0005\u00b9\u0000"+
		"\u0000\u02a8\u02a9\u0003&\u0013\u0000\u02a9\u02aa\u0005$\u0000\u0000\u02aa"+
		"\u02ab\u0005\u00ba\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac"+
		"\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7\u0001\u0000\u0000\u0000\u02ad"+
		"S\u0001\u0000\u0000\u0000\u02ae\u02af\u0005Y\u0000\u0000\u02af\u02bf\u0003"+
		".\u0017\u0000\u02b0\u02b2\u0003V+\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b7\u0003X,\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b7\u02c0\u0001\u0000\u0000\u0000\u02b8"+
		"\u02ba\u0003V+\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001"+
		"\u0000\u0000\u0000\u02be\u02c0\u0003X,\u0000\u02bf\u02b1\u0001\u0000\u0000"+
		"\u0000\u02bf\u02bb\u0001\u0000\u0000\u0000\u02c0U\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005\u0013\u0000\u0000\u02c2\u02c3\u0005\u00b2\u0000\u0000"+
		"\u02c3\u02c8\u0003\u00a2Q\u0000\u02c4\u02c5\u0005\u00a5\u0000\u0000\u02c5"+
		"\u02c7\u0003\u00a2Q\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9"+
		"\u0001\u0000\u0000\u0000\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c8"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005\u00be\u0000\u0000\u02cc\u02cd"+
		"\u0005\u00b3\u0000\u0000\u02cd\u02ce\u0003.\u0017\u0000\u02ceW\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d0\u0005,\u0000\u0000\u02d0\u02d1\u0003.\u0017\u0000"+
		"\u02d1Y\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005W\u0000\u0000\u02d3\u02d4"+
		"\u0003\u0088D\u0000\u02d4\u02d5\u0005\u00ba\u0000\u0000\u02d5[\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d8\u0003^/\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02dd\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0005\u00b8\u0000\u0000\u02da\u02dc\u0003^/\u0000\u02db\u02d9"+
		"\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db"+
		"\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e1"+
		"\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e2"+
		"\u0005\u00b8\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e2]\u0001\u0000\u0000\u0000\u02e3\u02e5\u0003"+
		" \u0010\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e9\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003\u00e8"+
		"t\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ee\u0005\u00b1\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f1\u0003`0\u0000\u02f0\u02f2\u0005\u00a1\u0000\u0000\u02f1"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0003|>\u0000\u02f4_\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u00060\uffff\uffff\u0000\u02f6\u02fa\u0003"+
		"\u00ecv\u0000\u02f7\u02fa\u0003\u00a2Q\u0000\u02f8\u02fa\u0005\u0011\u0000"+
		"\u0000\u02f9\u02f5\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa\u0300\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\n\u0001\u0000\u0000\u02fc\u02fd\u0005\u00a5\u0000\u0000"+
		"\u02fd\u02ff\u0003`0\u0002\u02fe\u02fb\u0001\u0000\u0000\u0000\u02ff\u0302"+
		"\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0001\u0000\u0000\u0000\u0301a\u0001\u0000\u0000\u0000\u0302\u0300\u0001"+
		"\u0000\u0000\u0000\u0303\u0304\u0005\u001d\u0000\u0000\u0304\u0305\u0003"+
		"\u0084B\u0000\u0305\u0306\u0005\u00ba\u0000\u0000\u0306c\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0005T\u0000\u0000\u0308\u030d\u0003|>\u0000\u0309"+
		"\u030a\u0005\u00b8\u0000\u0000\u030a\u030c\u0003|>\u0000\u030b\u0309\u0001"+
		"\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0001"+
		"\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u0005"+
		"\u00ba\u0000\u0000\u0311e\u0001\u0000\u0000\u0000\u0312\u0314\u0003 \u0010"+
		"\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000"+
		"\u0000\u0314\u0342\u0001\u0000\u0000\u0000\u0315\u0316\u0003x<\u0000\u0316"+
		"\u0317\u0003`0\u0000\u0317\u031c\u0003|>\u0000\u0318\u0319\u0005\u00b8"+
		"\u0000\u0000\u0319\u031b\u0003|>\u0000\u031a\u0318\u0001\u0000\u0000\u0000"+
		"\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000"+
		"\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001\u0000\u0000\u0000"+
		"\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u00ba\u0000\u0000"+
		"\u0320\u0343\u0001\u0000\u0000\u0000\u0321\u0323\u0003z=\u0000\u0322\u0321"+
		"\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0340"+
		"\u0001\u0000\u0000\u0000\u0324\u0326\u0005\u0016\u0000\u0000\u0325\u0327"+
		"\u0003`0\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u032d\u0003~?\u0000"+
		"\u0329\u032a\u0005\u00b8\u0000\u0000\u032a\u032c\u0003~?\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330"+
		"\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0005\u00ba\u0000\u0000\u0331\u0341\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u00050\u0000\u0000\u0333\u0335\u0003\u00e6s\u0000\u0334\u0336\u0003\u0014"+
		"\n\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0005\u00b2\u0000"+
		"\u0000\u0338\u0339\u0003\\.\u0000\u0339\u033c\u0005\u00b3\u0000\u0000"+
		"\u033a\u033d\u0003r9\u0000\u033b\u033d\u0003t:\u0000\u033c\u033a\u0001"+
		"\u0000\u0000\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u033f\u0003"+
		"v;\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u0324\u0001\u0000\u0000"+
		"\u0000\u0340\u0332\u0001\u0000\u0000\u0000\u0341\u0343\u0001\u0000\u0000"+
		"\u0000\u0342\u0315\u0001\u0000\u0000\u0000\u0342\u0322\u0001\u0000\u0000"+
		"\u0000\u0343\u0349\u0001\u0000\u0000\u0000\u0344\u0345\u0005^\u0000\u0000"+
		"\u0345\u0346\u0003\u00b0X\u0000\u0346\u0347\u0003h4\u0000\u0347\u0349"+
		"\u0001\u0000\u0000\u0000\u0348\u0313\u0001\u0000\u0000\u0000\u0348\u0344"+
		"\u0001\u0000\u0000\u0000\u0349g\u0001\u0000\u0000\u0000\u034a\u0354\u0005"+
		"\u00ba\u0000\u0000\u034b\u034f\u0005\u00b6\u0000\u0000\u034c\u034e\u0003"+
		"j5\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000"+
		"\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000"+
		"\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000"+
		"\u0000\u0352\u0354\u0005\u00b7\u0000\u0000\u0353\u034a\u0001\u0000\u0000"+
		"\u0000\u0353\u034b\u0001\u0000\u0000\u0000\u0354i\u0001\u0000\u0000\u0000"+
		"\u0355\u0358\u0003l6\u0000\u0356\u0358\u0003n7\u0000\u0357\u0355\u0001"+
		"\u0000\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0358k\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0003\u00aaU\u0000\u035a\u035b\u0005\u009e\u0000"+
		"\u0000\u035b\u035c\u0003\u00e6s\u0000\u035c\u035d\u00059\u0000\u0000\u035d"+
		"\u035e\u0003\u00b0X\u0000\u035e\u035f\u0005\u00ba\u0000\u0000\u035fm\u0001"+
		"\u0000\u0000\u0000\u0360\u0361\u0003p8\u0000\u0361\u0367\u0005\f\u0000"+
		"\u0000\u0362\u0368\u0003\u00e8t\u0000\u0363\u0365\u0003\u00e8t\u0000\u0364"+
		"\u0363\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365"+
		"\u0366\u0001\u0000\u0000\u0000\u0366\u0368\u0003\u00e6s\u0000\u0367\u0362"+
		"\u0001\u0000\u0000\u0000\u0367\u0364\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0001\u0000\u0000\u0000\u0369\u036a\u0005\u00ba\u0000\u0000\u036ao\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0003\u00aaU\u0000\u036c\u036d\u0005\u009e"+
		"\u0000\u0000\u036d\u036f\u0001\u0000\u0000\u0000\u036e\u036b\u0001\u0000"+
		"\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000"+
		"\u0000\u0000\u0370\u0371\u0003\u00e6s\u0000\u0371q\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0005\u00b9\u0000\u0000\u0373\u0375\u0003\u00e6s\u0000\u0374"+
		"\u0376\u0003\u00b2Y\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0001\u0000\u0000\u0000\u0376s\u0001\u0000\u0000\u0000\u0377\u0379\u0005"+
		"\u00b9\u0000\u0000\u0378\u037a\u0005\u00b1\u0000\u0000\u0379\u0378\u0001"+
		"\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0001"+
		"\u0000\u0000\u0000\u037b\u037c\u0003`0\u0000\u037cu\u0001\u0000\u0000"+
		"\u0000\u037d\u0380\u0005\u00ba\u0000\u0000\u037e\u0380\u0003.\u0017\u0000"+
		"\u037f\u037d\u0001\u0000\u0000\u0000\u037f\u037e\u0001\u0000\u0000\u0000"+
		"\u0380w\u0001\u0000\u0000\u0000\u0381\u0382\u0003z=\u0000\u0382y\u0001"+
		"\u0000\u0000\u0000\u0383\u0385\u0003\u00e8t\u0000\u0384\u0383\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000"+
		"\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387{\u0001\u0000\u0000"+
		"\u0000\u0388\u038b\u0005\u00be\u0000\u0000\u0389\u038a\u0005\u00bb\u0000"+
		"\u0000\u038a\u038c\u0003\u00b8\\\u0000\u038b\u0389\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0001\u0000\u0000\u0000\u038c}\u0001\u0000\u0000\u0000\u038d"+
		"\u038e\u0003\u00e6s\u0000\u038e\u038f\u0005\u00bb\u0000\u0000\u038f\u0390"+
		"\u0003\u00b8\\\u0000\u0390\u007f\u0001\u0000\u0000\u0000\u0391\u0392\u0005"+
		"!\u0000\u0000\u0392\u0395\u0003\u00e6s\u0000\u0393\u0394\u0005\u00b9\u0000"+
		"\u0000\u0394\u0396\u0007\u0004\u0000\u0000\u0395\u0393\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0399\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u00054\u0000\u0000\u0398\u039a\u0003\u0012\t\u0000"+
		"\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000"+
		"\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039f\u0005\u00b6\u0000\u0000"+
		"\u039c\u039e\u0003\u0082A\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039e"+
		"\u03a1\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u039f"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000\u03a1"+
		"\u039f\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005\u00b7\u0000\u0000\u03a3"+
		"\u0081\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005\u0012\u0000\u0000\u03a5"+
		"\u03a8\u0003\u00e6s\u0000\u03a6\u03a7\u0005\u00bb\u0000\u0000\u03a7\u03a9"+
		"\u0003\u0088D\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005"+
		"\u00ba\u0000\u0000\u03ab\u03b5\u0001\u0000\u0000\u0000\u03ac\u03ae\u0003"+
		"z=\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000"+
		"\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b5\u0003\f\u0006\u0000"+
		"\u03b0\u03b1\u0005^\u0000\u0000\u03b1\u03b2\u0003\u00b0X\u0000\u03b2\u03b3"+
		"\u0003h4\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03a4\u0001\u0000"+
		"\u0000\u0000\u03b4\u03ad\u0001\u0000\u0000\u0000\u03b4\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b5\u0083\u0001\u0000\u0000\u0000\u03b6\u03bb\u0003\u0088"+
		"D\u0000\u03b7\u03b8\u0005\u00b8\u0000\u0000\u03b8\u03ba\u0003\u0088D\u0000"+
		"\u03b9\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000"+
		"\u03bc\u0085\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000"+
		"\u03be\u03bf\u0005\u00b2\u0000\u0000\u03bf\u03c0\u0003\u0088D\u0000\u03c0"+
		"\u03c1\u0005\u00b3\u0000\u0000\u03c1\u0087\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c3\u0006D\uffff\uffff\u0000\u03c3\u03c4\u0005\u0015\u0000\u0000\u03c4"+
		"\u03ef\u0003\u0088D%\u03c5\u03ef\u0003\u009aM\u0000\u03c6\u03c7\u0003"+
		"\u00c2a\u0000\u03c7\u03c8\u0005\u00b4\u0000\u0000\u03c8\u03c9\u0003\u0088"+
		"D\u0000\u03c9\u03ca\u0005\u00b5\u0000\u0000\u03ca\u03ef\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cc\u0005\u00b2\u0000\u0000\u03cc\u03cd\u0003\u00eew\u0000"+
		"\u03cd\u03ce\u0005\u00b3\u0000\u0000\u03ce\u03cf\u0003\u0088D\"\u03cf"+
		"\u03ef\u0001\u0000\u0000\u0000\u03d0\u03d1\u0007\u0005\u0000\u0000\u03d1"+
		"\u03ef\u0003\u0088D!\u03d2\u03d3\u0007\u0006\u0000\u0000\u03d3\u03ef\u0003"+
		"\u0088D \u03d4\u03d5\u0007\u0007\u0000\u0000\u03d5\u03ef\u0003\u00cae"+
		"\u0000\u03d6\u03d7\u0003\u00cae\u0000\u03d7\u03d8\u0007\u0007\u0000\u0000"+
		"\u03d8\u03ef\u0001\u0000\u0000\u0000\u03d9\u03da\u0005K\u0000\u0000\u03da"+
		"\u03ef\u0003\u0088D\u001d\u03db\u03ef\u0003\u008cF\u0000\u03dc\u03ef\u0003"+
		"\u00cae\u0000\u03dd\u03ef\u0003\u00ba]\u0000\u03de\u03ef\u0003\u00c4b"+
		"\u0000\u03df\u03ef\u0005\u00bf\u0000\u0000\u03e0\u03ef\u0003\u0086C\u0000"+
		"\u03e1\u03ef\u0003\u0094J\u0000\u03e2\u03ef\u0003\u0096K\u0000\u03e3\u03e4"+
		"\u0003\u008eG\u0000\u03e4\u03e5\u0005\u00bb\u0000\u0000\u03e5\u03e6\u0003"+
		"\u0088D\u0005\u03e6\u03ef\u0001\u0000\u0000\u0000\u03e7\u03e8\u0003\u008a"+
		"E\u0000\u03e8\u03ea\u0003\u009cN\u0000\u03e9\u03eb\u0003 \u0010\u0000"+
		"\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed\u0003\u0088D\u0004\u03ed"+
		"\u03ef\u0001\u0000\u0000\u0000\u03ee\u03c2\u0001\u0000\u0000\u0000\u03ee"+
		"\u03c5\u0001\u0000\u0000\u0000\u03ee\u03c6\u0001\u0000\u0000\u0000\u03ee"+
		"\u03cb\u0001\u0000\u0000\u0000\u03ee\u03d0\u0001\u0000\u0000\u0000\u03ee"+
		"\u03d2\u0001\u0000\u0000\u0000\u03ee\u03d4\u0001\u0000\u0000\u0000\u03ee"+
		"\u03d6\u0001\u0000\u0000\u0000\u03ee\u03d9\u0001\u0000\u0000\u0000\u03ee"+
		"\u03db\u0001\u0000\u0000\u0000\u03ee\u03dc\u0001\u0000\u0000\u0000\u03ee"+
		"\u03dd\u0001\u0000\u0000\u0000\u03ee\u03de\u0001\u0000\u0000\u0000\u03ee"+
		"\u03df\u0001\u0000\u0000\u0000\u03ee\u03e0\u0001\u0000\u0000\u0000\u03ee"+
		"\u03e1\u0001\u0000\u0000\u0000\u03ee\u03e2\u0001\u0000\u0000\u0000\u03ee"+
		"\u03e3\u0001\u0000\u0000\u0000\u03ee\u03e7\u0001\u0000\u0000\u0000\u03ef"+
		"\u042c\u0001\u0000\u0000\u0000\u03f0\u03f1\n\u0014\u0000\u0000\u03f1\u03f2"+
		"\u0005\u008e\u0000\u0000\u03f2\u042b\u0003\u0088D\u0014\u03f3\u03f4\n"+
		"\u0012\u0000\u0000\u03f4\u03f5\u0007\b\u0000\u0000\u03f5\u042b\u0003\u0088"+
		"D\u0013\u03f6\u03f7\n\u0011\u0000\u0000\u03f7\u03f8\u0007\t\u0000\u0000"+
		"\u03f8\u042b\u0003\u0088D\u0012\u03f9\u03fa\n\u0010\u0000\u0000\u03fa"+
		"\u03fb\u0007\n\u0000\u0000\u03fb\u042b\u0003\u0088D\u0011\u03fc\u03fd"+
		"\n\u000f\u0000\u0000\u03fd\u03fe\u0007\u000b\u0000\u0000\u03fe\u042b\u0003"+
		"\u0088D\u0010\u03ff\u0400\n\u000e\u0000\u0000\u0400\u0401\u0007\f\u0000"+
		"\u0000\u0401\u042b\u0003\u0088D\u000f\u0402\u0403\n\r\u0000\u0000\u0403"+
		"\u0404\u0005\u00a4\u0000\u0000\u0404\u042b\u0003\u0088D\u000e\u0405\u0406"+
		"\n\f\u0000\u0000\u0406\u0407\u0005\u00a7\u0000\u0000\u0407\u042b\u0003"+
		"\u0088D\r\u0408\u0409\n\u000b\u0000\u0000\u0409\u040a\u0005\u00a5\u0000"+
		"\u0000\u040a\u042b\u0003\u0088D\f\u040b\u040c\n\n\u0000\u0000\u040c\u040d"+
		"\u0005\u0099\u0000\u0000\u040d\u042b\u0003\u0088D\u000b\u040e\u040f\n"+
		"\t\u0000\u0000\u040f\u0410\u0005\u0098\u0000\u0000\u0410\u042b\u0003\u0088"+
		"D\n\u0411\u0412\n\b\u0000\u0000\u0412\u0414\u0005\u00b1\u0000\u0000\u0413"+
		"\u0415\u0003\u0088D\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414\u0415"+
		"\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0417"+
		"\u0005\u00b9\u0000\u0000\u0417\u042b\u0003\u0088D\t\u0418\u0419\n\u0007"+
		"\u0000\u0000\u0419\u041a\u0005\u009a\u0000\u0000\u041a\u042b\u0003\u0088"+
		"D\b\u041b\u041c\n\u0006\u0000\u0000\u041c\u041d\u0005\u007f\u0000\u0000"+
		"\u041d\u042b\u0003\u0088D\u0007\u041e\u041f\n\u0003\u0000\u0000\u041f"+
		"\u0420\u0005A\u0000\u0000\u0420\u042b\u0003\u0088D\u0004\u0421\u0422\n"+
		"\u0002\u0000\u0000\u0422\u0423\u0005C\u0000\u0000\u0423\u042b\u0003\u0088"+
		"D\u0003\u0424\u0425\n\u0001\u0000\u0000\u0425\u0426\u0005B\u0000\u0000"+
		"\u0426\u042b\u0003\u0088D\u0002\u0427\u0428\n\u0013\u0000\u0000\u0428"+
		"\u0429\u00058\u0000\u0000\u0429\u042b\u0003\u00a4R\u0000\u042a\u03f0\u0001"+
		"\u0000\u0000\u0000\u042a\u03f3\u0001\u0000\u0000\u0000\u042a\u03f6\u0001"+
		"\u0000\u0000\u0000\u042a\u03f9\u0001\u0000\u0000\u0000\u042a\u03fc\u0001"+
		"\u0000\u0000\u0000\u042a\u03ff\u0001\u0000\u0000\u0000\u042a\u0402\u0001"+
		"\u0000\u0000\u0000\u042a\u0405\u0001\u0000\u0000\u0000\u042a\u0408\u0001"+
		"\u0000\u0000\u0000\u042a\u040b\u0001\u0000\u0000\u0000\u042a\u040e\u0001"+
		"\u0000\u0000\u0000\u042a\u0411\u0001\u0000\u0000\u0000\u042a\u0418\u0001"+
		"\u0000\u0000\u0000\u042a\u041b\u0001\u0000\u0000\u0000\u042a\u041e\u0001"+
		"\u0000\u0000\u0000\u042a\u0421\u0001\u0000\u0000\u0000\u042a\u0424\u0001"+
		"\u0000\u0000\u0000\u042a\u0427\u0001\u0000\u0000\u0000\u042b\u042e\u0001"+
		"\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042d\u0001"+
		"\u0000\u0000\u0000\u042d\u0089\u0001\u0000\u0000\u0000\u042e\u042c\u0001"+
		"\u0000\u0000\u0000\u042f\u0432\u0003\u00cae\u0000\u0430\u0432\u0003\u008c"+
		"F\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0430\u0001\u0000\u0000"+
		"\u0000\u0432\u008b\u0001\u0000\u0000\u0000\u0433\u0434\u0005\u000b\u0000"+
		"\u0000\u0434\u0436\u0005\u00b2\u0000\u0000\u0435\u0437\u0003\u009eO\u0000"+
		"\u0436\u0435\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000"+
		"\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u043f\u0005\u00b3\u0000\u0000"+
		"\u0439\u043b\u0005\u00b4\u0000\u0000\u043a\u043c\u0003\u009eO\u0000\u043b"+
		"\u043a\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c"+
		"\u043d\u0001\u0000\u0000\u0000\u043d\u043f\u0005\u00b5\u0000\u0000\u043e"+
		"\u0433\u0001\u0000\u0000\u0000\u043e\u0439\u0001\u0000\u0000\u0000\u043f"+
		"\u0444\u0001\u0000\u0000\u0000\u0440\u0441\u0005\u00b4\u0000\u0000\u0441"+
		"\u0442\u0003\u0088D\u0000\u0442\u0443\u0005\u00b5\u0000\u0000\u0443\u0445"+
		"\u0001\u0000\u0000\u0000\u0444\u0440\u0001\u0000\u0000\u0000\u0444\u0445"+
		"\u0001\u0000\u0000\u0000\u0445\u008d\u0001\u0000\u0000\u0000\u0446\u044a"+
		"\u0005\u00b4\u0000\u0000\u0447\u0449\u0005\u00b8\u0000\u0000\u0448\u0447"+
		"\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000\u0000\u0000\u044a\u0448"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044d"+
		"\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u0456"+
		"\u0003\u0090H\u0000\u044e\u0450\u0005\u00b8\u0000\u0000\u044f\u044e\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0453\u0001"+
		"\u0000\u0000\u0000\u0453\u0455\u0003\u0090H\u0000\u0454\u044f\u0001\u0000"+
		"\u0000\u0000\u0455\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u045c\u0001\u0000"+
		"\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0459\u045b\u0005\u00b8"+
		"\u0000\u0000\u045a\u0459\u0001\u0000\u0000\u0000\u045b\u045e\u0001\u0000"+
		"\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000"+
		"\u0000\u0000\u045d\u045f\u0001\u0000\u0000\u0000\u045e\u045c\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u0005\u00b5\u0000\u0000\u0460\u0474\u0001\u0000"+
		"\u0000\u0000\u0461\u0462\u0005\u00b4\u0000\u0000\u0462\u046b\u0003\u0092"+
		"I\u0000\u0463\u0465\u0005\u00b8\u0000\u0000\u0464\u0463\u0001\u0000\u0000"+
		"\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000"+
		"\u0000\u0466\u0467\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000"+
		"\u0000\u0468\u046a\u0003\u0092I\u0000\u0469\u0464\u0001\u0000\u0000\u0000"+
		"\u046a\u046d\u0001\u0000\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000"+
		"\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000"+
		"\u046d\u046b\u0001\u0000\u0000\u0000\u046e\u0470\u0005\u00b8\u0000\u0000"+
		"\u046f\u046e\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000"+
		"\u0470\u0471\u0001\u0000\u0000\u0000\u0471\u0472\u0005\u00b5\u0000\u0000"+
		"\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u0446\u0001\u0000\u0000\u0000"+
		"\u0473\u0461\u0001\u0000\u0000\u0000\u0474\u008f\u0001\u0000\u0000\u0000"+
		"\u0475\u0476\u0003\u00cae\u0000\u0476\u0091\u0001\u0000\u0000\u0000\u0477"+
		"\u0478\u0003\u0088D\u0000\u0478\u0479\u0005\u0082\u0000\u0000\u0479\u047b"+
		"\u0001\u0000\u0000\u0000\u047a\u0477\u0001\u0000\u0000\u0000\u047a\u047b"+
		"\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000\u047c\u047d"+
		"\u0003\u00cae\u0000\u047d\u0093\u0001\u0000\u0000\u0000\u047e\u047f\u0005"+
		"0\u0000\u0000\u047f\u0480\u0005\u00b2\u0000\u0000\u0480\u0481\u0003\\"+
		".\u0000\u0481\u0484\u0005\u00b3\u0000\u0000\u0482\u0483\u0005\u00b9\u0000"+
		"\u0000\u0483\u0485\u0003`0\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484"+
		"\u0485\u0001\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486"+
		"\u0487\u0003.\u0017\u0000\u0487\u0490\u0001\u0000\u0000\u0000\u0488\u0489"+
		"\u0005c\u0000\u0000\u0489\u048a\u0005\u00b2\u0000\u0000\u048a\u048b\u0003"+
		"\\.\u0000\u048b\u048c\u0005\u00b3\u0000\u0000\u048c\u048d\u0005\u0082"+
		"\u0000\u0000\u048d\u048e\u0003\u0088D\u0000\u048e\u0490\u0001\u0000\u0000"+
		"\u0000\u048f\u047e\u0001\u0000\u0000\u0000\u048f\u0488\u0001\u0000\u0000"+
		"\u0000\u0490\u0095\u0001\u0000\u0000\u0000\u0491\u0492\u0005D\u0000\u0000"+
		"\u0492\u0493\u0005\u00b2\u0000\u0000\u0493\u0494\u0003\u0088D\u0000\u0494"+
		"\u0495\u0005\u00b3\u0000\u0000\u0495\u0496\u0005\u00b6\u0000\u0000\u0496"+
		"\u049b\u0003\u0098L\u0000\u0497\u0498\u0005\u00b8\u0000\u0000\u0498\u049a"+
		"\u0003\u0098L\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u049a\u049d\u0001"+
		"\u0000\u0000\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049b\u049c\u0001"+
		"\u0000\u0000\u0000\u049c\u049f\u0001\u0000\u0000\u0000\u049d\u049b\u0001"+
		"\u0000\u0000\u0000\u049e\u04a0\u0005\u00b8\u0000\u0000\u049f\u049e\u0001"+
		"\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001"+
		"\u0000\u0000\u0000\u04a1\u04a2\u0005\u00b7\u0000\u0000\u04a2\u0097\u0001"+
		"\u0000\u0000\u0000\u04a3\u04a8\u0003\u0088D\u0000\u04a4\u04a5\u0005\u00b8"+
		"\u0000\u0000\u04a5\u04a7\u0003\u0088D\u0000\u04a6\u04a4\u0001\u0000\u0000"+
		"\u0000\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a6\u0001\u0000\u0000"+
		"\u0000\u04a8\u04a9\u0001\u0000\u0000\u0000\u04a9\u04ab\u0001\u0000\u0000"+
		"\u0000\u04aa\u04a8\u0001\u0000\u0000\u0000\u04ab\u04ac\u0005\u0082\u0000"+
		"\u0000\u04ac\u04ad\u0003\u0088D\u0000\u04ad\u0099\u0001\u0000\u0000\u0000"+
		"\u04ae\u04af\u0005F\u0000\u0000\u04af\u04b1\u0003\u00a4R\u0000\u04b0\u04b2"+
		"\u0003\u00b2Y\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b2\u009b\u0001\u0000\u0000\u0000\u04b3\u04b4\u0007"+
		"\r\u0000\u0000\u04b4\u009d\u0001\u0000\u0000\u0000\u04b5\u04ba\u0003\u00a0"+
		"P\u0000\u04b6\u04b7\u0005\u00b8\u0000\u0000\u04b7\u04b9\u0003\u00a0P\u0000"+
		"\u04b8\u04b6\u0001\u0000\u0000\u0000\u04b9\u04bc\u0001\u0000\u0000\u0000"+
		"\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000"+
		"\u04bb\u04be\u0001\u0000\u0000\u0000\u04bc\u04ba\u0001\u0000\u0000\u0000"+
		"\u04bd\u04bf\u0005\u00b8\u0000\u0000\u04be\u04bd\u0001\u0000\u0000\u0000"+
		"\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u009f\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c3\u0003\u0088D\u0000\u04c1\u04c2\u0005\u0082\u0000\u0000\u04c2"+
		"\u04c4\u0003\u0088D\u0000\u04c3\u04c1\u0001\u0000\u0000\u0000\u04c3\u04c4"+
		"\u0001\u0000\u0000\u0000\u04c4\u00a1\u0001\u0000\u0000\u0000\u04c5\u04c7"+
		"\u0003\u00aaU\u0000\u04c6\u04c8\u0003\u001e\u000f\u0000\u04c7\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04cb\u0001"+
		"\u0000\u0000\u0000\u04c9\u04cb\u0005T\u0000\u0000\u04ca\u04c5\u0001\u0000"+
		"\u0000\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb\u00a3\u0001\u0000"+
		"\u0000\u0000\u04cc\u04cf\u0003\u00aaU\u0000\u04cd\u04cf\u0003\u00a8T\u0000"+
		"\u04ce\u04cc\u0001\u0000\u0000\u0000\u04ce\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d1\u0001\u0000\u0000\u0000\u04d0\u04d2\u0003\u001e\u000f\u0000"+
		"\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d7\u0001\u0000\u0000\u0000\u04d3\u04d7\u0003\u00ecv\u0000\u04d4"+
		"\u04d7\u0005T\u0000\u0000\u04d5\u04d7\u0003\u00a6S\u0000\u04d6\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000\u04d7\u00a5\u0001"+
		"\u0000\u0000\u0000\u04d8\u04da\u0003 \u0010\u0000\u04d9\u04d8\u0001\u0000"+
		"\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04dc\u0001\u0000"+
		"\u0000\u0000\u04db\u04dd\u0005L\u0000\u0000\u04dc\u04db\u0001\u0000\u0000"+
		"\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd\u04df\u0001\u0000\u0000"+
		"\u0000\u04de\u04e0\u0003\u00e4r\u0000\u04df\u04de\u0001\u0000\u0000\u0000"+
		"\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e2\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e3\u0005J\u0000\u0000\u04e2\u04e1\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e3\u04f9\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e6\u0003\u0010\b\u0000\u04e5\u04e7\u0003\u0014\n\u0000\u04e6\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7\u04ea"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e9\u0005*\u0000\u0000\u04e9\u04eb\u0003"+
		"\u00a2Q\u0000\u04ea\u04e8\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000"+
		"\u0000\u0000\u04eb\u04ee\u0001\u0000\u0000\u0000\u04ec\u04ed\u00054\u0000"+
		"\u0000\u04ed\u04ef\u0003\u0012\t\u0000\u04ee\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04fa\u0001\u0000\u0000\u0000"+
		"\u04f0\u04f1\u0005>\u0000\u0000\u04f1\u04f3\u0003\u00e6s\u0000\u04f2\u04f4"+
		"\u0003\u0014\n\u0000\u04f3\u04f2\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001"+
		"\u0000\u0000\u0000\u04f4\u04f7\u0001\u0000\u0000\u0000\u04f5\u04f6\u0005"+
		"*\u0000\u0000\u04f6\u04f8\u0003\u0012\t\u0000\u04f7\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04fa\u0001\u0000"+
		"\u0000\u0000\u04f9\u04e4\u0001\u0000\u0000\u0000\u04f9\u04f0\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u04ff\u0005\u00b6"+
		"\u0000\u0000\u04fc\u04fe\u0003f3\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000"+
		"\u04fe\u0501\u0001\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000"+
		"\u04ff\u0500\u0001\u0000\u0000\u0000\u0500\u0502\u0001\u0000\u0000\u0000"+
		"\u0501\u04ff\u0001\u0000\u0000\u0000\u0502\u0503\u0005\u00b7\u0000\u0000"+
		"\u0503\u00a7\u0001\u0000\u0000\u0000\u0504\u0509\u0003\u00d6k\u0000\u0505"+
		"\u0506\u0005\u009f\u0000\u0000\u0506\u0508\u0003\u00d8l\u0000\u0507\u0505"+
		"\u0001\u0000\u0000\u0000\u0508\u050b\u0001\u0000\u0000\u0000\u0509\u0507"+
		"\u0001\u0000\u0000\u0000\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u00a9"+
		"\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050c\u050e"+
		"\u0005\u00a0\u0000\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050d\u050e"+
		"\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000\u050f\u0510"+
		"\u0003\u00acV\u0000\u0510\u00ab\u0001\u0000\u0000\u0000\u0511\u051f\u0003"+
		"\u00e6s\u0000\u0512\u0517\u0003\u00e6s\u0000\u0513\u0514\u0005\u00a0\u0000"+
		"\u0000\u0514\u0516\u0003\u00e6s\u0000\u0515\u0513\u0001\u0000\u0000\u0000"+
		"\u0516\u0519\u0001\u0000\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000"+
		"\u0517\u0518\u0001\u0000\u0000\u0000\u0518\u051c\u0001\u0000\u0000\u0000"+
		"\u0519\u0517\u0001\u0000\u0000\u0000\u051a\u051b\u0005\u00a0\u0000\u0000"+
		"\u051b\u051d\u0003\u00aeW\u0000\u051c\u051a\u0001\u0000\u0000\u0000\u051c"+
		"\u051d\u0001\u0000\u0000\u0000\u051d\u051f\u0001\u0000\u0000\u0000\u051e"+
		"\u0511\u0001\u0000\u0000\u0000\u051e\u0512\u0001\u0000\u0000\u0000\u051f"+
		"\u00ad\u0001\u0000\u0000\u0000\u0520\u0523\u0003\u00e6s\u0000\u0521\u0522"+
		"\u0005\f\u0000\u0000\u0522\u0524\u0003\u00e6s\u0000\u0523\u0521\u0001"+
		"\u0000\u0000\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524\u0534\u0001"+
		"\u0000\u0000\u0000\u0525\u0526\u0005\u00b6\u0000\u0000\u0526\u052b\u0003"+
		"\u00aeW\u0000\u0527\u0528\u0005\u00b8\u0000\u0000\u0528\u052a\u0003\u00ae"+
		"W\u0000\u0529\u0527\u0001\u0000\u0000\u0000\u052a\u052d\u0001\u0000\u0000"+
		"\u0000\u052b\u0529\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000\u0000"+
		"\u0000\u052c\u052f\u0001\u0000\u0000\u0000\u052d\u052b\u0001\u0000\u0000"+
		"\u0000\u052e\u0530\u0005\u00b8\u0000\u0000\u052f\u052e\u0001\u0000\u0000"+
		"\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000"+
		"\u0000\u0531\u0532\u0005\u00b7\u0000\u0000\u0532\u0534\u0001\u0000\u0000"+
		"\u0000\u0533\u0520\u0001\u0000\u0000\u0000\u0533\u0525\u0001\u0000\u0000"+
		"\u0000\u0534\u00af\u0001\u0000\u0000\u0000\u0535\u053a\u0003\u00aaU\u0000"+
		"\u0536\u0537\u0005\u00b8\u0000\u0000\u0537\u0539\u0003\u00aaU\u0000\u0538"+
		"\u0536\u0001\u0000\u0000\u0000\u0539\u053c\u0001\u0000\u0000\u0000\u053a"+
		"\u0538\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000\u0000\u0000\u053b"+
		"\u00b1\u0001\u0000\u0000\u0000\u053c\u053a\u0001\u0000\u0000\u0000\u053d"+
		"\u0546\u0005\u00b2\u0000\u0000\u053e\u0543\u0003\u00b4Z\u0000\u053f\u0540"+
		"\u0005\u00b8\u0000\u0000\u0540\u0542\u0003\u00b4Z\u0000\u0541\u053f\u0001"+
		"\u0000\u0000\u0000\u0542\u0545\u0001\u0000\u0000\u0000\u0543\u0541\u0001"+
		"\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0547\u0001"+
		"\u0000\u0000\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0546\u053e\u0001"+
		"\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u0549\u0001"+
		"\u0000\u0000\u0000\u0548\u054a\u0005\u00b8\u0000\u0000\u0549\u0548\u0001"+
		"\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054b\u0001"+
		"\u0000\u0000\u0000\u054b\u054c\u0005\u00b3\u0000\u0000\u054c\u00b3\u0001"+
		"\u0000\u0000\u0000\u054d\u054f\u0003\u00b6[\u0000\u054e\u054d\u0001\u0000"+
		"\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0551\u0001\u0000"+
		"\u0000\u0000\u0550\u0552\u0005\u00a1\u0000\u0000\u0551\u0550\u0001\u0000"+
		"\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000"+
		"\u0000\u0000\u0553\u0554\u0003\u0088D\u0000\u0554\u00b5\u0001\u0000\u0000"+
		"\u0000\u0555\u0556\u0003\u00e6s\u0000\u0556\u0557\u0005\u00b9\u0000\u0000"+
		"\u0557\u00b7\u0001\u0000\u0000\u0000\u0558\u057c\u0003\u00ba]\u0000\u0559"+
		"\u057c\u0003\u00c4b\u0000\u055a\u055b\u0005\u000b\u0000\u0000\u055b\u0560"+
		"\u0005\u00b2\u0000\u0000\u055c\u055e\u0003\u009eO\u0000\u055d\u055f\u0005"+
		"\u00b8\u0000\u0000\u055e\u055d\u0001\u0000\u0000\u0000\u055e\u055f\u0001"+
		"\u0000\u0000\u0000\u055f\u0561\u0001\u0000\u0000\u0000\u0560\u055c\u0001"+
		"\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0562\u0001"+
		"\u0000\u0000\u0000\u0562\u057c\u0005\u00b3\u0000\u0000\u0563\u0568\u0005"+
		"\u00b4\u0000\u0000\u0564\u0566\u0003\u009eO\u0000\u0565\u0567\u0005\u00b8"+
		"\u0000\u0000\u0566\u0565\u0001\u0000\u0000\u0000\u0566\u0567\u0001\u0000"+
		"\u0000\u0000\u0567\u0569\u0001\u0000\u0000\u0000\u0568\u0564\u0001\u0000"+
		"\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000"+
		"\u0000\u0000\u056a\u057c\u0005\u00b5\u0000\u0000\u056b\u056c\u0007\u000e"+
		"\u0000\u0000\u056c\u057c\u0003\u00b8\\\u0000\u056d\u0570\u0003\u00c4b"+
		"\u0000\u056e\u0570\u0003\u00ba]\u0000\u056f\u056d\u0001\u0000\u0000\u0000"+
		"\u056f\u056e\u0001\u0000\u0000\u0000\u0570\u0578\u0001\u0000\u0000\u0000"+
		"\u0571\u0574\u0005\u00b0\u0000\u0000\u0572\u0575\u0003\u00c4b\u0000\u0573"+
		"\u0575\u0003\u00ba]\u0000\u0574\u0572\u0001\u0000\u0000\u0000\u0574\u0573"+
		"\u0001\u0000\u0000\u0000\u0575\u0577\u0001\u0000\u0000\u0000\u0576\u0571"+
		"\u0001\u0000\u0000\u0000\u0577\u057a\u0001\u0000\u0000\u0000\u0578\u0576"+
		"\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000\u0000\u0579\u057c"+
		"\u0001\u0000\u0000\u0000\u057a\u0578\u0001\u0000\u0000\u0000\u057b\u0558"+
		"\u0001\u0000\u0000\u0000\u057b\u0559\u0001\u0000\u0000\u0000\u057b\u055a"+
		"\u0001\u0000\u0000\u0000\u057b\u0563\u0001\u0000\u0000\u0000\u057b\u056b"+
		"\u0001\u0000\u0000\u0000\u057b\u056f\u0001\u0000\u0000\u0000\u057c\u00b9"+
		"\u0001\u0000\u0000\u0000\u057d\u0583\u0005G\u0000\u0000\u057e\u0583\u0003"+
		"\u00bc^\u0000\u057f\u0583\u0003\u00eau\u0000\u0580\u0583\u0003\u00c0`"+
		"\u0000\u0581\u0583\u0003\u00aaU\u0000\u0582\u057d\u0001\u0000\u0000\u0000"+
		"\u0582\u057e\u0001\u0000\u0000\u0000\u0582\u057f\u0001\u0000\u0000\u0000"+
		"\u0582\u0580\u0001\u0000\u0000\u0000\u0582\u0581\u0001\u0000\u0000\u0000"+
		"\u0583\u00bb\u0001\u0000\u0000\u0000\u0584\u0589\u0005\u00c2\u0000\u0000"+
		"\u0585\u0589\u0005\u000f\u0000\u0000\u0586\u0589\u0003\u00be_\u0000\u0587"+
		"\u0589\u0003\u00c2a\u0000\u0588\u0584\u0001\u0000\u0000\u0000\u0588\u0585"+
		"\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000\u0000\u0000\u0588\u0587"+
		"\u0001\u0000\u0000\u0000\u0589\u00bd\u0001\u0000\u0000\u0000\u058a\u058b"+
		"\u0007\u000f\u0000\u0000\u058b\u00bf\u0001\u0000\u0000\u0000\u058c\u058d"+
		"\u0007\u0010\u0000\u0000\u058d\u0592\u0005\u009e\u0000\u0000\u058e\u0593"+
		"\u0003\u00e6s\u0000\u058f\u0593\u0005k\u0000\u0000\u0590\u0593\u0005g"+
		"\u0000\u0000\u0591\u0593\u0005h\u0000\u0000\u0592\u058e\u0001\u0000\u0000"+
		"\u0000\u0592\u058f\u0001\u0000\u0000\u0000\u0592\u0590\u0001\u0000\u0000"+
		"\u0000\u0592\u0591\u0001\u0000\u0000\u0000\u0593\u059f\u0001\u0000\u0000"+
		"\u0000\u0594\u0598\u0003\u00a2Q\u0000\u0595\u0598\u0003\u00dcn\u0000\u0596"+
		"\u0598\u0003\u00c4b\u0000\u0597\u0594\u0001\u0000\u0000\u0000\u0597\u0595"+
		"\u0001\u0000\u0000\u0000\u0597\u0596\u0001\u0000\u0000\u0000\u0598\u0599"+
		"\u0001\u0000\u0000\u0000\u0599\u059c\u0005\u009e\u0000\u0000\u059a\u059d"+
		"\u0003\u00e6s\u0000\u059b\u059d\u0003\u00dcn\u0000\u059c\u059a\u0001\u0000"+
		"\u0000\u0000\u059c\u059b\u0001\u0000\u0000\u0000\u059d\u059f\u0001\u0000"+
		"\u0000\u0000\u059e\u058c\u0001\u0000\u0000\u0000\u059e\u0597\u0001\u0000"+
		"\u0000\u0000\u059f\u00c1\u0001\u0000\u0000\u0000\u05a0\u05a1\u0005\u00bf"+
		"\u0000\u0000\u05a1\u00c3\u0001\u0000\u0000\u0000\u05a2\u05a4\u0005\u00c9"+
		"\u0000\u0000\u05a3\u05a5\u0005\u00d1\u0000\u0000\u05a4\u05a3\u0001\u0000"+
		"\u0000\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05b8\u0001\u0000"+
		"\u0000\u0000\u05a8\u05aa\u0005\u00c8\u0000\u0000\u05a9\u05ab\u0005\u00d1"+
		"\u0000\u0000\u05aa\u05a9\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000"+
		"\u0000\u0000\u05ad\u05b8\u0001\u0000\u0000\u0000\u05ae\u05b8\u0005\u00c6"+
		"\u0000\u0000\u05af\u05b3\u0005\u00c7\u0000\u0000\u05b0\u05b2\u0003\u00c6"+
		"c\u0000\u05b1\u05b0\u0001\u0000\u0000\u0000\u05b2\u05b5\u0001\u0000\u0000"+
		"\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000"+
		"\u0000\u05b4\u05b6\u0001\u0000\u0000\u0000\u05b5\u05b3\u0001\u0000\u0000"+
		"\u0000\u05b6\u05b8\u0005\u00c7\u0000\u0000\u05b7\u05a2\u0001\u0000\u0000"+
		"\u0000\u05b7\u05a8\u0001\u0000\u0000\u0000\u05b7\u05ae\u0001\u0000\u0000"+
		"\u0000\u05b7\u05af\u0001\u0000\u0000\u0000\u05b8\u00c5\u0001\u0000\u0000"+
		"\u0000\u05b9\u05bd\u0005\u00cd\u0000\u0000\u05ba\u05bd\u0005\u00cc\u0000"+
		"\u0000\u05bb\u05bd\u0003\u00cae\u0000\u05bc\u05b9\u0001\u0000\u0000\u0000"+
		"\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bc\u05bb\u0001\u0000\u0000\u0000"+
		"\u05bd\u00c7\u0001\u0000\u0000\u0000\u05be\u05c3\u0003\u00cae\u0000\u05bf"+
		"\u05c0\u0005\u00b8\u0000\u0000\u05c0\u05c2\u0003\u00cae\u0000\u05c1\u05bf"+
		"\u0001\u0000\u0000\u0000\u05c2\u05c5\u0001\u0000\u0000\u0000\u05c3\u05c1"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u00c9"+
		"\u0001\u0000\u0000\u0000\u05c5\u05c3\u0001\u0000\u0000\u0000\u05c6\u05ca"+
		"\u0003\u00ccf\u0000\u05c7\u05c9\u0003\u00ceg\u0000\u05c8\u05c7\u0001\u0000"+
		"\u0000\u0000\u05c9\u05cc\u0001\u0000\u0000\u0000\u05ca\u05c8\u0001\u0000"+
		"\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u00cb\u0001\u0000"+
		"\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000\u0000\u05cd\u05d4\u0003\u00d6"+
		"k\u0000\u05ce\u05d4\u0003\u00d0h\u0000\u05cf\u05d0\u0005\u00b2\u0000\u0000"+
		"\u05d0\u05d1\u0003\u009aM\u0000\u05d1\u05d2\u0005\u00b3\u0000\u0000\u05d2"+
		"\u05d4\u0001\u0000\u0000\u0000\u05d3\u05cd\u0001\u0000\u0000\u0000\u05d3"+
		"\u05ce\u0001\u0000\u0000\u0000\u05d3\u05cf\u0001\u0000\u0000\u0000\u05d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u05d5\u05d6\u0005\u009f\u0000\u0000\u05d6"+
		"\u05d8\u0003\u00d8l\u0000\u05d7\u05d9\u0003\u00d4j\u0000\u05d8\u05d7\u0001"+
		"\u0000\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u00cf\u0001"+
		"\u0000\u0000\u0000\u05da\u05db\u0003\u00d2i\u0000\u05db\u05dc\u0003\u00d4"+
		"j\u0000\u05dc\u00d1\u0001\u0000\u0000\u0000\u05dd\u05e2\u0003\u00aaU\u0000"+
		"\u05de\u05e2\u0003\u00c0`\u0000\u05df\u05e2\u0003\u00d6k\u0000\u05e0\u05e2"+
		"\u0003\u0086C\u0000\u05e1\u05dd\u0001\u0000\u0000\u0000\u05e1\u05de\u0001"+
		"\u0000\u0000\u0000\u05e1\u05df\u0001\u0000\u0000\u0000\u05e1\u05e0\u0001"+
		"\u0000\u0000\u0000\u05e2\u00d3\u0001\u0000\u0000\u0000\u05e3\u05e5\u0003"+
		"\u001e\u000f\u0000\u05e4\u05e3\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001"+
		"\u0000\u0000\u0000\u05e5\u05e7\u0001\u0000\u0000\u0000\u05e6\u05e8\u0003"+
		"\u00b2Y\u0000\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000"+
		"\u0000\u0000\u05e9\u05e7\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001\u0000"+
		"\u0000\u0000\u05ea\u05ee\u0001\u0000\u0000\u0000\u05eb\u05ed\u0003\u00de"+
		"o\u0000\u05ec\u05eb\u0001\u0000\u0000\u0000\u05ed\u05f0\u0001\u0000\u0000"+
		"\u0000\u05ee\u05ec\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001\u0000\u0000"+
		"\u0000\u05ef\u00d5\u0001\u0000\u0000\u0000\u05f0\u05ee\u0001\u0000\u0000"+
		"\u0000\u05f1\u05f4\u0003\u00dcn\u0000\u05f2\u05f3\u0005\u009e\u0000\u0000"+
		"\u05f3\u05f5\u0003\u00dcn\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000\u05f4"+
		"\u05f5\u0001\u0000\u0000\u0000\u05f5\u05fb\u0001\u0000\u0000\u0000\u05f6"+
		"\u05f7\u0003\u00a2Q\u0000\u05f7\u05f8\u0005\u009e\u0000\u0000\u05f8\u05f9"+
		"\u0003\u00dcn\u0000\u05f9\u05fb\u0001\u0000\u0000\u0000\u05fa\u05f1\u0001"+
		"\u0000\u0000\u0000\u05fa\u05f6\u0001\u0000\u0000\u0000\u05fb\u00d7\u0001"+
		"\u0000\u0000\u0000\u05fc\u05ff\u0003\u00dam\u0000\u05fd\u05ff\u0003\u00dc"+
		"n\u0000\u05fe\u05fc\u0001\u0000\u0000\u0000\u05fe\u05fd\u0001\u0000\u0000"+
		"\u0000\u05ff\u00d9\u0001\u0000\u0000\u0000\u0600\u0606\u0003\u00e6s\u0000"+
		"\u0601\u0602\u0005\u00b6\u0000\u0000\u0602\u0603\u0003\u0088D\u0000\u0603"+
		"\u0604\u0005\u00b7\u0000\u0000\u0604\u0606\u0001\u0000\u0000\u0000\u0605"+
		"\u0600\u0001\u0000\u0000\u0000\u0605\u0601\u0001\u0000\u0000\u0000\u0606"+
		"\u060a\u0001\u0000\u0000\u0000\u0607\u0609\u0003\u00deo\u0000\u0608\u0607"+
		"\u0001\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000\u060a\u0608"+
		"\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000\u060b\u00db"+
		"\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060d\u060f"+
		"\u0005\u00af\u0000\u0000\u060e\u060d\u0001\u0000\u0000\u0000\u060f\u0612"+
		"\u0001\u0000\u0000\u0000\u0610\u060e\u0001\u0000\u0000\u0000\u0610\u0611"+
		"\u0001\u0000\u0000\u0000\u0611\u0619\u0001\u0000\u0000\u0000\u0612\u0610"+
		"\u0001\u0000\u0000\u0000\u0613\u061a\u0005\u00be\u0000\u0000\u0614\u0615"+
		"\u0005\u00af\u0000\u0000\u0615\u0616\u0005\u00b6\u0000\u0000\u0616\u0617"+
		"\u0003\u0088D\u0000\u0617\u0618\u0005\u00b7\u0000\u0000\u0618\u061a\u0001"+
		"\u0000\u0000\u0000\u0619\u0613\u0001\u0000\u0000\u0000\u0619\u0614\u0001"+
		"\u0000\u0000\u0000\u061a\u061e\u0001\u0000\u0000\u0000\u061b\u061d\u0003"+
		"\u00deo\u0000\u061c\u061b\u0001\u0000\u0000\u0000\u061d\u0620\u0001\u0000"+
		"\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000\u061e\u061f\u0001\u0000"+
		"\u0000\u0000\u061f\u00dd\u0001\u0000\u0000\u0000\u0620\u061e\u0001\u0000"+
		"\u0000\u0000\u0621\u0623\u0005\u00b4\u0000\u0000\u0622\u0624\u0003\u0088"+
		"D\u0000\u0623\u0622\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000"+
		"\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u062b\u0005\u00b5\u0000"+
		"\u0000\u0626\u0627\u0005\u00b6\u0000\u0000\u0627\u0628\u0003\u0088D\u0000"+
		"\u0628\u0629\u0005\u00b7\u0000\u0000\u0629\u062b\u0001\u0000\u0000\u0000"+
		"\u062a\u0621\u0001\u0000\u0000\u0000\u062a\u0626\u0001\u0000\u0000\u0000"+
		"\u062b\u00df\u0001\u0000\u0000\u0000\u062c\u062e\u0003\u00e2q\u0000\u062d"+
		"\u062c\u0001\u0000\u0000\u0000\u062d\u062e\u0001\u0000\u0000\u0000\u062e"+
		"\u0635\u0001\u0000\u0000\u0000\u062f\u0631\u0005\u00b8\u0000\u0000\u0630"+
		"\u0632\u0003\u00e2q\u0000\u0631\u0630\u0001\u0000\u0000\u0000\u0631\u0632"+
		"\u0001\u0000\u0000\u0000\u0632\u0634\u0001\u0000\u0000\u0000\u0633\u062f"+
		"\u0001\u0000\u0000\u0000\u0634\u0637\u0001\u0000\u0000\u0000\u0635\u0633"+
		"\u0001\u0000\u0000\u0000\u0635\u0636\u0001\u0000\u0000\u0000\u0636\u00e1"+
		"\u0001\u0000\u0000\u0000\u0637\u0635\u0001\u0000\u0000\u0000\u0638\u0640"+
		"\u0003\u00cae\u0000\u0639\u063a\u0005@\u0000\u0000\u063a\u063b\u0005\u00b2"+
		"\u0000\u0000\u063b\u063c\u0003\u00e0p\u0000\u063c\u063d\u0005\u00b3\u0000"+
		"\u0000\u063d\u0640\u0001\u0000\u0000\u0000\u063e\u0640\u0003\u00a0P\u0000"+
		"\u063f\u0638\u0001\u0000\u0000\u0000\u063f\u0639\u0001\u0000\u0000\u0000"+
		"\u063f\u063e\u0001\u0000\u0000\u0000\u0640\u00e3\u0001\u0000\u0000\u0000"+
		"\u0641\u0642\u0007\u0011\u0000\u0000\u0642\u00e5\u0001\u0000\u0000\u0000"+
		"\u0643\u0644\u0007\u0012\u0000\u0000\u0644\u00e7\u0001\u0000\u0000\u0000"+
		"\u0645\u0646\u0007\u0013\u0000\u0000\u0646\u00e9\u0001\u0000\u0000\u0000"+
		"\u0647\u0648\u0007\u0014\u0000\u0000\u0648\u00eb\u0001\u0000\u0000\u0000"+
		"\u0649\u064a\u0007\u0015\u0000\u0000\u064a\u00ed\u0001\u0000\u0000\u0000"+
		"\u064b\u065c\u0005\u000e\u0000\u0000\u064c\u065c\u0005:\u0000\u0000\u064d"+
		"\u065c\u0005;\u0000\u0000\u064e\u065c\u0005=\u0000\u0000\u064f\u065c\u0005"+
		"<\u0000\u0000\u0650\u065c\u0005[\u0000\u0000\u0651\u065c\u0005\u001b\u0000"+
		"\u0000\u0652\u065c\u0005\u001c\u0000\u0000\u0653\u065c\u0005-\u0000\u0000"+
		"\u0654\u065c\u0005U\u0000\u0000\u0655\u065c\u0005\r\u0000\u0000\u0656"+
		"\u065c\u0005\\\u0000\u0000\u0657\u065c\u0005\u000b\u0000\u0000\u0658\u065c"+
		"\u0005H\u0000\u0000\u0659\u065c\u0005R\u0000\u0000\u065a\u065c\u0003\u00a2"+
		"Q\u0000\u065b\u064b\u0001\u0000\u0000\u0000\u065b\u064c\u0001\u0000\u0000"+
		"\u0000\u065b\u064d\u0001\u0000\u0000\u0000\u065b\u064e\u0001\u0000\u0000"+
		"\u0000\u065b\u064f\u0001\u0000\u0000\u0000\u065b\u0650\u0001\u0000\u0000"+
		"\u0000\u065b\u0651\u0001\u0000\u0000\u0000\u065b\u0652\u0001\u0000\u0000"+
		"\u0000\u065b\u0653\u0001\u0000\u0000\u0000\u065b\u0654\u0001\u0000\u0000"+
		"\u0000\u065b\u0655\u0001\u0000\u0000\u0000\u065b\u0656\u0001\u0000\u0000"+
		"\u0000\u065b\u0657\u0001\u0000\u0000\u0000\u065b\u0658\u0001\u0000\u0000"+
		"\u0000\u065b\u0659\u0001\u0000\u0000\u0000\u065b\u065a\u0001\u0000\u0000"+
		"\u0000\u065c\u00ef\u0001\u0000\u0000\u0000\u00ce\u00f1\u00f4\u00f9\u00ff"+
		"\u0107\u010d\u0118\u011d\u0124\u012b\u0130\u0137\u013a\u013f\u0142\u0145"+
		"\u0148\u014d\u0151\u0155\u015a\u015e\u0160\u0166\u0172\u0183\u018a\u0192"+
		"\u0196\u019b\u01a1\u01a9\u01b1\u01b7\u01be\u01c5\u01ca\u01d0\u01e4\u01f2"+
		"\u01f6\u01ff\u0203\u0208\u0222\u022d\u0231\u0235\u023e\u0248\u024d\u0253"+
		"\u0258\u025d\u0267\u026d\u0273\u0279\u028d\u0297\u02a4\u02ac\u02b3\u02b6"+
		"\u02bb\u02bf\u02c8\u02d7\u02dd\u02e1\u02e4\u02e9\u02ed\u02f1\u02f9\u0300"+
		"\u030d\u0313\u031c\u0322\u0326\u032d\u0335\u033c\u0340\u0342\u0348\u034f"+
		"\u0353\u0357\u0364\u0367\u036e\u0375\u0379\u037f\u0386\u038b\u0395\u0399"+
		"\u039f\u03a8\u03ad\u03b4\u03bb\u03ea\u03ee\u0414\u042a\u042c\u0431\u0436"+
		"\u043b\u043e\u0444\u044a\u0451\u0456\u045c\u0466\u046b\u046f\u0473\u047a"+
		"\u0484\u048f\u049b\u049f\u04a8\u04b1\u04ba\u04be\u04c3\u04c7\u04ca\u04ce"+
		"\u04d1\u04d6\u04d9\u04dc\u04df\u04e2\u04e6\u04ea\u04ee\u04f3\u04f7\u04f9"+
		"\u04ff\u0509\u050d\u0517\u051c\u051e\u0523\u052b\u052f\u0533\u053a\u0543"+
		"\u0546\u0549\u054e\u0551\u055e\u0560\u0566\u0568\u056f\u0574\u0578\u057b"+
		"\u0582\u0588\u0592\u0597\u059c\u059e\u05a6\u05ac\u05b3\u05b7\u05bc\u05c3"+
		"\u05ca\u05d3\u05d8\u05e1\u05e4\u05e9\u05ee\u05f4\u05fa\u05fe\u0605\u060a"+
		"\u0610\u0619\u061e\u0623\u062a\u062d\u0631\u0635\u063f\u065b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}