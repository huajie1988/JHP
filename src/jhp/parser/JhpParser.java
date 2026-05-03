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
		RULE_phpFile = 0, RULE_phpBlock = 1, RULE_importStatement = 2, RULE_topStatement = 3, 
		RULE_useDeclaration = 4, RULE_useDeclarationContentList = 5, RULE_useDeclarationContent = 6, 
		RULE_namespaceDeclaration = 7, RULE_namespaceStatement = 8, RULE_functionDeclaration = 9, 
		RULE_classDeclaration = 10, RULE_classEntryType = 11, RULE_interfaceList = 12, 
		RULE_typeParameterListInBrackets = 13, RULE_typeParameterList = 14, RULE_typeParameterWithDefaultsList = 15, 
		RULE_typeParameterDecl = 16, RULE_typeParameterWithDefaultDecl = 17, RULE_genericDynamicArgs = 18, 
		RULE_attributes = 19, RULE_attributeGroup = 20, RULE_attribute = 21, RULE_innerStatementList = 22, 
		RULE_innerStatement = 23, RULE_statement = 24, RULE_emptyStatement_ = 25, 
		RULE_blockStatement = 26, RULE_ifStatement = 27, RULE_elseIfStatement = 28, 
		RULE_elseIfColonStatement = 29, RULE_elseStatement = 30, RULE_elseColonStatement = 31, 
		RULE_whileStatement = 32, RULE_doWhileStatement = 33, RULE_forStatement = 34, 
		RULE_forInit = 35, RULE_forUpdate = 36, RULE_switchStatement = 37, RULE_switchBlock = 38, 
		RULE_breakStatement = 39, RULE_continueStatement = 40, RULE_returnStatement = 41, 
		RULE_expressionStatement = 42, RULE_unsetStatement = 43, RULE_foreachStatement = 44, 
		RULE_tryCatchFinally = 45, RULE_catchClause = 46, RULE_finallyStatement = 47, 
		RULE_throwStatement = 48, RULE_gotoStatement = 49, RULE_declareStatement = 50, 
		RULE_declareList = 51, RULE_directive = 52, RULE_formalParameterList = 53, 
		RULE_formalParameter = 54, RULE_typeHint = 55, RULE_globalStatement = 56, 
		RULE_globalVar = 57, RULE_echoStatement = 58, RULE_staticVariableStatement = 59, 
		RULE_classStatement = 60, RULE_traitAdaptations = 61, RULE_traitAdaptationStatement = 62, 
		RULE_traitPrecedence = 63, RULE_traitAlias = 64, RULE_traitMethodReference = 65, 
		RULE_baseCtorCall = 66, RULE_returnTypeDecl = 67, RULE_methodBody = 68, 
		RULE_propertyModifiers = 69, RULE_memberModifiers = 70, RULE_variableInitializer = 71, 
		RULE_identifierInitializer = 72, RULE_globalConstantDeclaration = 73, 
		RULE_enumDeclaration = 74, RULE_enumItem = 75, RULE_expressionList = 76, 
		RULE_parentheses = 77, RULE_expression = 78, RULE_assignable = 79, RULE_arrayCreation = 80, 
		RULE_arrayDestructuring = 81, RULE_indexedDestructItem = 82, RULE_keyedDestructItem = 83, 
		RULE_lambdaFunctionExpr = 84, RULE_matchExpr = 85, RULE_matchItem = 86, 
		RULE_newExpr = 87, RULE_assignmentOperator = 88, RULE_yieldExpression = 89, 
		RULE_arrayItemList = 90, RULE_arrayItem = 91, RULE_lambdaFunctionUseVars = 92, 
		RULE_lambdaFunctionUseVar = 93, RULE_qualifiedStaticTypeRef = 94, RULE_typeRef = 95, 
		RULE_anonymousClass = 96, RULE_indirectTypeRef = 97, RULE_qualifiedNamespaceName = 98, 
		RULE_namespaceNameList = 99, RULE_namespaceNameTail = 100, RULE_qualifiedNamespaceNameList = 101, 
		RULE_arguments = 102, RULE_actualArgument = 103, RULE_argumentName = 104, 
		RULE_constantInitializer = 105, RULE_constant = 106, RULE_literalConstant = 107, 
		RULE_numericConstant = 108, RULE_classConstant = 109, RULE_stringConstant = 110, 
		RULE_string = 111, RULE_interpolatedStringPart = 112, RULE_chainList = 113, 
		RULE_chain = 114, RULE_chainOrigin = 115, RULE_memberAccess = 116, RULE_functionCall = 117, 
		RULE_functionCallName = 118, RULE_actualArguments = 119, RULE_chainBase = 120, 
		RULE_keyedFieldName = 121, RULE_keyedSimpleFieldName = 122, RULE_keyedVariable = 123, 
		RULE_squareCurlyExpression = 124, RULE_assignmentList = 125, RULE_assignmentListElement = 126, 
		RULE_modifier = 127, RULE_identifier = 128, RULE_memberModifier = 129, 
		RULE_magicConstant = 130, RULE_primitiveType = 131, RULE_castOperation = 132;
	private static String[] makeRuleNames() {
		return new String[] {
			"phpFile", "phpBlock", "importStatement", "topStatement", "useDeclaration", 
			"useDeclarationContentList", "useDeclarationContent", "namespaceDeclaration", 
			"namespaceStatement", "functionDeclaration", "classDeclaration", "classEntryType", 
			"interfaceList", "typeParameterListInBrackets", "typeParameterList", 
			"typeParameterWithDefaultsList", "typeParameterDecl", "typeParameterWithDefaultDecl", 
			"genericDynamicArgs", "attributes", "attributeGroup", "attribute", "innerStatementList", 
			"innerStatement", "statement", "emptyStatement_", "blockStatement", "ifStatement", 
			"elseIfStatement", "elseIfColonStatement", "elseStatement", "elseColonStatement", 
			"whileStatement", "doWhileStatement", "forStatement", "forInit", "forUpdate", 
			"switchStatement", "switchBlock", "breakStatement", "continueStatement", 
			"returnStatement", "expressionStatement", "unsetStatement", "foreachStatement", 
			"tryCatchFinally", "catchClause", "finallyStatement", "throwStatement", 
			"gotoStatement", "declareStatement", "declareList", "directive", "formalParameterList", 
			"formalParameter", "typeHint", "globalStatement", "globalVar", "echoStatement", 
			"staticVariableStatement", "classStatement", "traitAdaptations", "traitAdaptationStatement", 
			"traitPrecedence", "traitAlias", "traitMethodReference", "baseCtorCall", 
			"returnTypeDecl", "methodBody", "propertyModifiers", "memberModifiers", 
			"variableInitializer", "identifierInitializer", "globalConstantDeclaration", 
			"enumDeclaration", "enumItem", "expressionList", "parentheses", "expression", 
			"assignable", "arrayCreation", "arrayDestructuring", "indexedDestructItem", 
			"keyedDestructItem", "lambdaFunctionExpr", "matchExpr", "matchItem", 
			"newExpr", "assignmentOperator", "yieldExpression", "arrayItemList", 
			"arrayItem", "lambdaFunctionUseVars", "lambdaFunctionUseVar", "qualifiedStaticTypeRef", 
			"typeRef", "anonymousClass", "indirectTypeRef", "qualifiedNamespaceName", 
			"namespaceNameList", "namespaceNameTail", "qualifiedNamespaceNameList", 
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
			"'instanceof'", "'insteadof'", "'int8'", "'int16'", "'int64'", null, 
			"'interface'", "'isset'", "'list'", "'and'", "'or'", "'xor'", "'match'", 
			"'namespace'", "'new'", "'null'", "'object'", "'parent'", "'partial'", 
			"'print'", "'private'", "'protected'", "'public'", "'readonly'", "'require'", 
			"'require_once'", "'resource'", "'return'", "'static'", "'string'", "'switch'", 
			"'throw'", "'trait'", "'try'", "'clrtypeof'", null, "'unicode'", "'unset'", 
			"'use'", "'var'", "'while'", "'yield'", "'from'", "'fn'", "'ticks'", 
			"'encoding'", "'strict_types'", "'__get'", "'__set'", "'__call'", "'__callstatic'", 
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(266);
				match(Shebang);
				}
			}

			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					importStatement();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -15L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0)) {
				{
				{
				setState(275);
				topStatement();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					importStatement();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				topStatement();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -15L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0) );
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
		public TerminalNode Import() { return getToken(JhpParser.Import, 0); }
		public TerminalNode Namespace() { return getToken(JhpParser.Namespace, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Import);
			setState(295);
			match(Namespace);
			setState(296);
			namespaceNameList();
			setState(297);
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
	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
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
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
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
		enterRule(_localctx, 6, RULE_topStatement);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				globalConstantDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(305);
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
	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public TerminalNode Const() { return getToken(JhpParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(Use);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(312);
			useDeclarationContentList();
			setState(313);
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
	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(JhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(JhpParser.NamespaceSeparator, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterUseDeclarationContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitUseDeclarationContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitUseDeclarationContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(315);
				match(NamespaceSeparator);
				}
			}

			setState(318);
			useDeclarationContent();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(319);
				match(Comma);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(320);
					match(NamespaceSeparator);
					}
				}

				setState(323);
				useDeclarationContent();
				}
				}
				setState(328);
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
	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterUseDeclarationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitUseDeclarationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitUseDeclarationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useDeclarationContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(JhpParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(Namespace);
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==Label) {
					{
					setState(332);
					namespaceNameList();
					}
				}

				setState(335);
				match(OpenCurlyBracket);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -15L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0)) {
					{
					{
					setState(336);
					namespaceStatement();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(343);
				namespaceNameList();
				setState(344);
				match(SemiColon);
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
	public static class NamespaceStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterNamespaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitNamespaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitNamespaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_namespaceStatement);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				globalConstantDeclaration();
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
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
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
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(355);
				attributes();
				}
			}

			setState(358);
			match(Function_);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(359);
				match(Ampersand);
				}
			}

			setState(362);
			identifier();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(363);
				typeParameterListInBrackets();
				}
			}

			setState(366);
			match(OpenRoundBracket);
			setState(367);
			formalParameterList();
			setState(368);
			match(CloseRoundBracket);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(369);
				match(Colon);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(370);
					match(QuestionMark);
					}
				}

				setState(373);
				typeHint(0);
				}
			}

			setState(376);
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
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(378);
				attributes();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(381);
				match(Private);
				}
			}

			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(384);
				modifier();
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(387);
				match(Partial);
				}
			}

			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(390);
				classEntryType();
				setState(391);
				identifier();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(392);
					typeParameterListInBrackets();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(395);
					match(Extends);
					setState(396);
					qualifiedStaticTypeRef();
					}
				}

				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(399);
					match(Implements);
					setState(400);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(403);
				match(Interface);
				setState(404);
				identifier();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(405);
					typeParameterListInBrackets();
					}
				}

				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(408);
					match(Extends);
					setState(409);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			match(OpenCurlyBracket);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 786703L) != 0)) {
				{
				{
				setState(415);
				classStatement();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
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
		enterRule(_localctx, 22, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 24, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			qualifiedStaticTypeRef();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(426);
				match(Comma);
				setState(427);
				qualifiedStaticTypeRef();
				}
				}
				setState(432);
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
		enterRule(_localctx, 26, RULE_typeParameterListInBrackets);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(Lgeneric);
				setState(434);
				typeParameterList();
				setState(435);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(Lgeneric);
				setState(438);
				typeParameterWithDefaultsList();
				setState(439);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(Lgeneric);
				setState(442);
				typeParameterList();
				setState(443);
				match(Comma);
				setState(444);
				typeParameterWithDefaultsList();
				setState(445);
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
		enterRule(_localctx, 28, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			typeParameterDecl();
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					match(Comma);
					setState(451);
					typeParameterDecl();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 30, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			typeParameterWithDefaultDecl();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(458);
				match(Comma);
				setState(459);
				typeParameterWithDefaultDecl();
				}
				}
				setState(464);
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
		enterRule(_localctx, 32, RULE_typeParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(465);
				attributes();
				}
			}

			setState(468);
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
		enterRule(_localctx, 34, RULE_typeParameterWithDefaultDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(470);
				attributes();
				}
			}

			setState(473);
			identifier();
			setState(474);
			match(Eq);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(475);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(476);
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
		enterRule(_localctx, 36, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(Lgeneric);
			setState(480);
			typeRef();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(481);
				match(Comma);
				setState(482);
				typeRef();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
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
		enterRule(_localctx, 38, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(490);
				attributeGroup();
				}
				}
				setState(493); 
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
		enterRule(_localctx, 40, RULE_attributeGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(AttributeStart);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(496);
				identifier();
				setState(497);
				match(Colon);
				}
				break;
			}
			setState(501);
			attribute();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(502);
				match(Comma);
				setState(503);
				attribute();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
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
		enterRule(_localctx, 42, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			qualifiedNamespaceName();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(512);
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
		enterRule(_localctx, 44, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					innerStatement();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 46, RULE_innerStatement);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
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
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
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
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
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
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				identifier();
				setState(527);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(534);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(535);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(536);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(537);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(538);
				yieldExpression();
				setState(539);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(541);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(542);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(543);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(544);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(545);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(546);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(547);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(548);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(549);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(550);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(551);
				emptyStatement_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(552);
				attributes();
				setState(553);
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
		enterRule(_localctx, 50, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		enterRule(_localctx, 52, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(OpenCurlyBracket);
			setState(560);
			innerStatementList();
			setState(561);
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
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(If);
				setState(564);
				parentheses();
				setState(565);
				statement();
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(566);
						elseIfStatement();
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(572);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(If);
				setState(576);
				parentheses();
				setState(577);
				match(Colon);
				setState(578);
				innerStatementList();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(579);
					elseIfColonStatement();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(585);
					elseColonStatement();
					}
				}

				setState(588);
				match(EndIf);
				setState(589);
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
		enterRule(_localctx, 56, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(ElseIf);
			setState(594);
			parentheses();
			setState(595);
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
		enterRule(_localctx, 58, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(ElseIf);
			setState(598);
			parentheses();
			setState(599);
			match(Colon);
			setState(600);
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
		enterRule(_localctx, 60, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Else);
			setState(603);
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
		enterRule(_localctx, 62, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(Else);
			setState(606);
			match(Colon);
			setState(607);
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
		enterRule(_localctx, 64, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(While);
			setState(610);
			parentheses();
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(611);
				statement();
				}
				break;
			case Colon:
				{
				setState(612);
				match(Colon);
				setState(613);
				innerStatementList();
				setState(614);
				match(EndWhile);
				setState(615);
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
		enterRule(_localctx, 66, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(Do);
			setState(620);
			statement();
			setState(621);
			match(While);
			setState(622);
			parentheses();
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
		enterRule(_localctx, 68, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(For);
			setState(626);
			match(OpenRoundBracket);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(627);
				forInit();
				}
			}

			setState(630);
			match(SemiColon);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(631);
				expressionList();
				}
			}

			setState(634);
			match(SemiColon);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(635);
				forUpdate();
				}
			}

			setState(638);
			match(CloseRoundBracket);
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(639);
				statement();
				}
				break;
			case Colon:
				{
				setState(640);
				match(Colon);
				setState(641);
				innerStatementList();
				setState(642);
				match(EndFor);
				setState(643);
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
		enterRule(_localctx, 70, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
		enterRule(_localctx, 72, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		enterRule(_localctx, 74, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(Switch);
			setState(652);
			parentheses();
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(653);
				match(OpenCurlyBracket);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(654);
					match(SemiColon);
					}
				}

				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(657);
					switchBlock();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(663);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(664);
				match(Colon);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(665);
					match(SemiColon);
					}
				}

				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(668);
					switchBlock();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(EndSwitch);
				setState(675);
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
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(JhpParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(JhpParser.Colon, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JhpParser.SemiColon, i);
		}
		public List<TerminalNode> Case() { return getTokens(JhpParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(JhpParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(JhpParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(JhpParser.Default, i);
		}
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
		enterRule(_localctx, 76, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(681);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(678);
						match(Case);
						setState(679);
						expression(0);
						}
						break;
					case Default:
						{
						setState(680);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(683);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(686); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(688);
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
		enterRule(_localctx, 78, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(Break);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(691);
				expression(0);
				}
			}

			setState(694);
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
		enterRule(_localctx, 80, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(Continue);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(697);
				expression(0);
				}
			}

			setState(700);
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
		enterRule(_localctx, 82, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(Return);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(703);
				expression(0);
				}
			}

			setState(706);
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
		enterRule(_localctx, 84, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			expression(0);
			setState(709);
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
	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(JhpParser.Unset, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterUnsetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitUnsetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitUnsetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(Unset);
			setState(712);
			match(OpenRoundBracket);
			setState(713);
			chainList();
			setState(714);
			match(CloseRoundBracket);
			setState(715);
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
		public List<TerminalNode> Ampersand() { return getTokens(JhpParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(JhpParser.Ampersand, i);
		}
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
		enterRule(_localctx, 88, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(Foreach);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(718);
				match(OpenRoundBracket);
				setState(719);
				expression(0);
				setState(720);
				match(As);
				setState(721);
				arrayDestructuring();
				setState(722);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(724);
				match(OpenRoundBracket);
				setState(725);
				chain();
				setState(726);
				match(As);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(727);
					match(Ampersand);
					}
				}

				setState(730);
				assignable();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(731);
					match(DoubleArrow);
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(732);
						match(Ampersand);
						}
					}

					setState(735);
					chain();
					}
				}

				setState(738);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(740);
				match(OpenRoundBracket);
				setState(741);
				expression(0);
				setState(742);
				match(As);
				setState(743);
				assignable();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(744);
					match(DoubleArrow);
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(745);
						match(Ampersand);
						}
					}

					setState(748);
					chain();
					}
				}

				setState(751);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				{
				setState(753);
				match(OpenRoundBracket);
				setState(754);
				chain();
				setState(755);
				match(As);
				setState(756);
				match(List);
				setState(757);
				match(OpenRoundBracket);
				setState(758);
				assignmentList();
				setState(759);
				match(CloseRoundBracket);
				setState(760);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(764);
				statement();
				}
				break;
			case Colon:
				{
				setState(765);
				match(Colon);
				setState(766);
				innerStatementList();
				setState(767);
				match(EndForeach);
				setState(768);
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
		enterRule(_localctx, 90, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(Try);
			setState(773);
			blockStatement();
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(775); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(774);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(777); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(779);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(782);
					catchClause();
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(788);
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
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(JhpParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(JhpParser.Pipe, i);
		}
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
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
		enterRule(_localctx, 92, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(Catch);
			setState(792);
			match(OpenRoundBracket);
			setState(793);
			qualifiedStaticTypeRef();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(794);
				match(Pipe);
				setState(795);
				qualifiedStaticTypeRef();
				}
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VarName) {
				{
				setState(801);
				match(VarName);
				}
			}

			setState(804);
			match(CloseRoundBracket);
			setState(805);
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
		enterRule(_localctx, 94, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(Finally);
			setState(808);
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
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(Throw);
			setState(811);
			expression(0);
			setState(812);
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
	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(JhpParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(Goto);
			setState(815);
			identifier();
			setState(816);
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
	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(JhpParser.Declare, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(JhpParser.EndDeclare, 0); }
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitDeclareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(Declare);
			setState(819);
			match(OpenRoundBracket);
			setState(820);
			declareList();
			setState(821);
			match(CloseRoundBracket);
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(822);
				statement();
				}
				break;
			case Colon:
				{
				setState(823);
				match(Colon);
				setState(824);
				innerStatementList();
				setState(825);
				match(EndDeclare);
				setState(826);
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
	public static class DeclareListContext extends ParserRuleContext {
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitDeclareList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitDeclareList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			directive();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(831);
				match(Comma);
				setState(832);
				directive();
				}
				}
				setState(837);
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode Ticks() { return getToken(JhpParser.Ticks, 0); }
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode Real() { return getToken(JhpParser.Real, 0); }
		public TerminalNode Encoding() { return getToken(JhpParser.Encoding, 0); }
		public TerminalNode SingleQuoteString() { return getToken(JhpParser.SingleQuoteString, 0); }
		public TerminalNode StrictTypes() { return getToken(JhpParser.StrictTypes, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_directive);
		try {
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ticks:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				match(Ticks);
				setState(839);
				match(Eq);
				setState(842);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Octal:
				case Decimal:
				case Hex:
				case Binary:
					{
					setState(840);
					numericConstant();
					}
					break;
				case Real:
					{
					setState(841);
					match(Real);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Encoding:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				match(Encoding);
				setState(845);
				match(Eq);
				setState(846);
				match(SingleQuoteString);
				}
				break;
			case StrictTypes:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(StrictTypes);
				setState(848);
				match(Eq);
				setState(849);
				numericConstant();
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
		enterRule(_localctx, 106, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -960L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 3221356563L) != 0)) {
				{
				setState(852);
				formalParameter();
				}
			}

			setState(859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(855);
					match(Comma);
					setState(856);
					formalParameter();
					}
					} 
				}
				setState(861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(862);
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
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
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
		enterRule(_localctx, 108, RULE_formalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(865);
				attributes();
				}
			}

			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(868);
					memberModifier();
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(874);
				match(QuestionMark);
				}
			}

			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(877);
				typeHint(0);
				}
			}

			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(880);
				match(Ampersand);
				}
			}

			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(883);
				match(Ellipsis);
				}
			}

			setState(886);
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
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(JhpParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_typeHint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(889);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(890);
				match(Callable);
				}
				break;
			case 3:
				{
				setState(891);
				primitiveType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeHintContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeHint);
					setState(894);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(895);
					match(Pipe);
					setState(896);
					typeHint(2);
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(JhpParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(Global);
			setState(903);
			globalVar();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(904);
				match(Comma);
				setState(905);
				globalVar();
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
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
	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(JhpParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_globalVar);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(Dollar);
				setState(915);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				match(Dollar);
				setState(917);
				match(OpenCurlyBracket);
				setState(918);
				expression(0);
				setState(919);
				match(CloseCurlyBracket);
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
		enterRule(_localctx, 116, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(Echo);
			setState(924);
			expressionList();
			setState(925);
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
		enterRule(_localctx, 118, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(Static);
			setState(928);
			variableInitializer();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(929);
				match(Comma);
				setState(930);
				variableInitializer();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
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
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
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
		enterRule(_localctx, 120, RULE_classStatement);
		int _la;
		try {
			setState(997);
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
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(938);
					attributes();
					}
				}

				setState(991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(941);
					propertyModifiers();
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
						{
						setState(942);
						typeHint(0);
						}
					}

					setState(945);
					variableInitializer();
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(946);
						match(Comma);
						setState(947);
						variableInitializer();
						}
						}
						setState(952);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(953);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
						{
						setState(955);
						memberModifiers();
						}
					}

					setState(989);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(958);
						match(Const);
						setState(960);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
						case 1:
							{
							setState(959);
							typeHint(0);
							}
							break;
						}
						setState(962);
						identifierInitializer();
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(963);
							match(Comma);
							setState(964);
							identifierInitializer();
							}
							}
							setState(969);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(970);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(972);
						match(Function_);
						setState(974);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Ampersand) {
							{
							setState(973);
							match(Ampersand);
							}
						}

						setState(976);
						identifier();
						setState(978);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(977);
							typeParameterListInBrackets();
							}
						}

						setState(980);
						match(OpenRoundBracket);
						setState(981);
						formalParameterList();
						setState(982);
						match(CloseRoundBracket);
						setState(985);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(983);
							baseCtorCall();
							}
							break;
						case 2:
							{
							setState(984);
							returnTypeDecl();
							}
							break;
						}
						setState(987);
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
				setState(993);
				match(Use);
				setState(994);
				qualifiedNamespaceNameList();
				setState(995);
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
		enterRule(_localctx, 122, RULE_traitAdaptations);
		int _la;
		try {
			setState(1008);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(OpenCurlyBracket);
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(1001);
					traitAdaptationStatement();
					}
					}
					setState(1006);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1007);
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
		enterRule(_localctx, 124, RULE_traitAdaptationStatement);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
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
		enterRule(_localctx, 126, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			qualifiedNamespaceName();
			setState(1015);
			match(DoubleColon);
			setState(1016);
			identifier();
			setState(1017);
			match(InsteadOf);
			setState(1018);
			qualifiedNamespaceNameList();
			setState(1019);
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
		enterRule(_localctx, 128, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			traitMethodReference();
			setState(1022);
			match(As);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1023);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1024);
					memberModifier();
					}
					break;
				}
				setState(1027);
				identifier();
				}
				break;
			}
			setState(1030);
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
		enterRule(_localctx, 130, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1032);
				qualifiedNamespaceName();
				setState(1033);
				match(DoubleColon);
				}
				break;
			}
			setState(1037);
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
		enterRule(_localctx, 132, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(Colon);
			setState(1040);
			identifier();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1041);
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
		enterRule(_localctx, 134, RULE_returnTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(Colon);
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(1045);
				match(QuestionMark);
				}
			}

			setState(1048);
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
		enterRule(_localctx, 136, RULE_methodBody);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
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
		public TerminalNode Var() { return getToken(JhpParser.Var, 0); }
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
		enterRule(_localctx, 138, RULE_propertyModifiers);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Readonly:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(Var);
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
		enterRule(_localctx, 140, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1058);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1061); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		enterRule(_localctx, 142, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(VarName);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1064);
				match(Eq);
				setState(1065);
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
		enterRule(_localctx, 144, RULE_identifierInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			identifier();
			setState(1069);
			match(Eq);
			setState(1070);
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
	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(JhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(JhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1072);
				attributes();
				}
			}

			setState(1075);
			match(Const);
			setState(1076);
			identifierInitializer();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1077);
				match(Comma);
				setState(1078);
				identifierInitializer();
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084);
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
		enterRule(_localctx, 148, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(Enum_);
			setState(1087);
			identifier();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1088);
				match(Colon);
				setState(1089);
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

			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(1092);
				match(Implements);
				setState(1093);
				interfaceList();
				}
			}

			setState(1096);
			match(OpenCurlyBracket);
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271069996096L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(1097);
				enumItem();
				}
				}
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1103);
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
		enterRule(_localctx, 150, RULE_enumItem);
		int _la;
		try {
			setState(1121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				match(Case);
				setState(1106);
				identifier();
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(1107);
					match(Eq);
					setState(1108);
					expression(0);
					}
				}

				setState(1111);
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
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
					{
					setState(1113);
					memberModifiers();
					}
				}

				setState(1116);
				functionDeclaration();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				match(Use);
				setState(1118);
				qualifiedNamespaceNameList();
				setState(1119);
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
		enterRule(_localctx, 152, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			expression(0);
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1124);
				match(Comma);
				setState(1125);
				expression(0);
				}
				}
				setState(1130);
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
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
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
		enterRule(_localctx, 154, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(OpenRoundBracket);
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1132);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1133);
				yieldExpression();
				}
				break;
			}
			setState(1136);
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
	public static class SpecialWordExpressionContext extends ExpressionContext {
		public TerminalNode Yield() { return getToken(JhpParser.Yield, 0); }
		public TerminalNode List() { return getToken(JhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(JhpParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(JhpParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(JhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(JhpParser.Exit, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Throw() { return getToken(JhpParser.Throw, 0); }
		public SpecialWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterSpecialWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitSpecialWordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitSpecialWordExpression(this);
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
	public static class BackQuoteStringExpressionContext extends ExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(JhpParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterBackQuoteStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitBackQuoteStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitBackQuoteStringExpression(this);
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
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
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
	public static class IncludeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Include() { return getToken(JhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(JhpParser.IncludeOnce, 0); }
		public IncludeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterIncludeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitIncludeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitIncludeExpression(this);
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
	public static class RequireExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Require() { return getToken(JhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(JhpParser.RequireOnce, 0); }
		public RequireExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterRequireExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitRequireExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitRequireExpression(this);
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1139);
				match(Clone);
				setState(1140);
				expression(48);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1141);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1142);
				stringConstant();
				setState(1143);
				match(OpenSquareBracket);
				setState(1144);
				expression(0);
				setState(1145);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1147);
				match(OpenRoundBracket);
				setState(1148);
				castOperation();
				setState(1149);
				match(CloseRoundBracket);
				setState(1150);
				expression(45);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1152);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1153);
				expression(44);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1155);
				expression(43);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1156);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1157);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				chain();
				setState(1159);
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
				setState(1161);
				match(Print);
				setState(1162);
				expression(40);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1163);
				arrayCreation();
				}
				break;
			case 11:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1164);
				chain();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1165);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1166);
				string();
				}
				break;
			case 14:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1167);
				match(Label);
				}
				break;
			case 15:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				match(BackQuoteString);
				}
				break;
			case 16:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1169);
				parentheses();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1171);
				match(List);
				setState(1172);
				match(OpenRoundBracket);
				setState(1173);
				assignmentList();
				setState(1174);
				match(CloseRoundBracket);
				setState(1175);
				match(Eq);
				setState(1176);
				expression(31);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1178);
				match(IsSet);
				setState(1179);
				match(OpenRoundBracket);
				setState(1180);
				chainList();
				setState(1181);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1183);
				match(Empty);
				setState(1184);
				match(OpenRoundBracket);
				setState(1185);
				chain();
				setState(1186);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1188);
				match(Eval);
				setState(1189);
				match(OpenRoundBracket);
				setState(1190);
				expression(0);
				setState(1191);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1193);
				match(Exit);
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1194);
					match(OpenRoundBracket);
					setState(1195);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1196);
					parentheses();
					}
					break;
				}
				}
				break;
			case 23:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1199);
				lambdaFunctionExpr();
				}
				break;
			case 24:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1200);
				matchExpr();
				}
				break;
			case 25:
				{
				_localctx = new IncludeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1201);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1202);
				expression(9);
				}
				break;
			case 26:
				{
				_localctx = new RequireExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1204);
				expression(8);
				}
				break;
			case 27:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1205);
				match(Throw);
				setState(1206);
				expression(7);
				}
				break;
			case 28:
				{
				_localctx = new ArrayDestructExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1207);
				arrayDestructuring();
				setState(1208);
				match(Eq);
				setState(1209);
				expression(6);
				}
				break;
			case 29:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1211);
				assignable();
				setState(1212);
				assignmentOperator();
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1213);
					attributes();
					}
				}

				setState(1216);
				expression(5);
				}
				break;
			case 30:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1218);
				assignable();
				setState(1219);
				match(Eq);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1220);
					attributes();
					}
				}

				setState(1223);
				match(Ampersand);
				setState(1226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1224);
					chain();
					}
					break;
				case 2:
					{
					setState(1225);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1230);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1231);
						((ExponentiationExpressionContext)_localctx).op = match(Pow);
						setState(1232);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1233);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1234);
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
						setState(1235);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1236);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1237);
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
						setState(1238);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1240);
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
						setState(1241);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1242);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1243);
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
						setState(1244);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1245);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1246);
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
						setState(1247);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1248);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1249);
						((BitwiseAndExpressionContext)_localctx).op = match(Ampersand);
						setState(1250);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1251);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1252);
						((BitwiseExcOrExpressionContext)_localctx).op = match(Caret);
						setState(1253);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1254);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1255);
						((BitwiseIncOrExpressionContext)_localctx).op = match(Pipe);
						setState(1256);
						expression(16);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1257);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1258);
						((LogicalAndExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1259);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1260);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1261);
						((LogicalIncOrExpressionContext)_localctx).op = match(BooleanOr);
						setState(1262);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1263);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1264);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
							{
							setState(1265);
							expression(0);
							}
						}

						setState(1268);
						match(Colon);
						setState(1269);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new CoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1271);
						((CoalesceExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1272);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1273);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1274);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1275);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1277);
						((LogicalAndExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1278);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1280);
						((LogicalExcOrExpressionContext)_localctx).op = match(LogicalXor);
						setState(1281);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1282);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1283);
						((LogicalIncOrExpressionContext)_localctx).op = match(LogicalOr);
						setState(1284);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1286);
						match(InstanceOf);
						setState(1287);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 158, RULE_assignable);
		try {
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				arrayCreation();
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
		enterRule(_localctx, 160, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1297);
				match(Array);
				setState(1298);
				match(OpenRoundBracket);
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1299);
					arrayItemList();
					}
				}

				setState(1302);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1303);
				match(OpenSquareBracket);
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1304);
					arrayItemList();
					}
				}

				setState(1307);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1310);
				match(OpenSquareBracket);
				setState(1311);
				expression(0);
				setState(1312);
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
		enterRule(_localctx, 162, RULE_arrayDestructuring);
		int _la;
		try {
			int _alt;
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				match(OpenSquareBracket);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1317);
					match(Comma);
					}
					}
					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1323);
				indexedDestructItem();
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1325); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1324);
							match(Comma);
							}
							}
							setState(1327); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1329);
						indexedDestructItem();
						}
						} 
					}
					setState(1334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1335);
					match(Comma);
					}
					}
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1341);
				match(CloseSquareBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				match(OpenSquareBracket);
				setState(1344);
				keyedDestructItem();
				setState(1353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1346); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1345);
							match(Comma);
							}
							}
							setState(1348); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1350);
						keyedDestructItem();
						}
						} 
					}
					setState(1355);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1356);
					match(Comma);
					}
				}

				setState(1359);
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
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
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
		enterRule(_localctx, 164, RULE_indexedDestructItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1363);
				match(Ampersand);
				}
			}

			setState(1366);
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
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
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
		enterRule(_localctx, 166, RULE_keyedDestructItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1368);
				expression(0);
				setState(1369);
				match(DoubleArrow);
				}
				break;
			}
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1373);
				match(Ampersand);
				}
			}

			setState(1376);
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
		public TerminalNode Static() { return getToken(JhpParser.Static, 0); }
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
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
		enterRule(_localctx, 168, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1378);
					match(Static);
					}
				}

				setState(1381);
				match(Function_);
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1382);
					match(Ampersand);
					}
				}

				setState(1385);
				match(OpenRoundBracket);
				setState(1386);
				formalParameterList();
				setState(1387);
				match(CloseRoundBracket);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1388);
					lambdaFunctionUseVars();
					}
				}

				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1391);
					match(Colon);
					setState(1392);
					typeHint(0);
					}
				}

				setState(1395);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				match(LambdaFn);
				setState(1398);
				match(OpenRoundBracket);
				setState(1399);
				formalParameterList();
				setState(1400);
				match(CloseRoundBracket);
				setState(1401);
				match(DoubleArrow);
				setState(1402);
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
		enterRule(_localctx, 170, RULE_matchExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(Match_);
			setState(1407);
			match(OpenRoundBracket);
			setState(1408);
			expression(0);
			setState(1409);
			match(CloseRoundBracket);
			setState(1410);
			match(OpenCurlyBracket);
			setState(1411);
			matchItem();
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1412);
					match(Comma);
					setState(1413);
					matchItem();
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1419);
				match(Comma);
				}
			}

			setState(1422);
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
		enterRule(_localctx, 172, RULE_matchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			expression(0);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1425);
				match(Comma);
				setState(1426);
				expression(0);
				}
				}
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1432);
			match(DoubleArrow);
			setState(1433);
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
		enterRule(_localctx, 174, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(New);
			setState(1436);
			typeRef();
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1437);
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
		enterRule(_localctx, 176, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
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
	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(JhpParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode From() { return getToken(JhpParser.From, 0); }
		public TerminalNode DoubleArrow() { return getToken(JhpParser.DoubleArrow, 0); }
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(Yield);
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1443);
				expression(0);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1444);
					match(DoubleArrow);
					setState(1445);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1448);
				match(From);
				setState(1449);
				expression(0);
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
		enterRule(_localctx, 180, RULE_arrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			arrayItem();
			setState(1457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1453);
					match(Comma);
					setState(1454);
					arrayItem();
					}
					} 
				}
				setState(1459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1460);
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
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
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
		enterRule(_localctx, 182, RULE_arrayItem);
		int _la;
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				expression(0);
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1464);
					match(DoubleArrow);
					setState(1465);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
					{
					setState(1468);
					expression(0);
					setState(1469);
					match(DoubleArrow);
					}
				}

				setState(1473);
				match(Ampersand);
				setState(1474);
				chain();
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
	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLambdaFunctionUseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLambdaFunctionUseVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(Use);
			setState(1478);
			match(OpenRoundBracket);
			setState(1479);
			lambdaFunctionUseVar();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1480);
				match(Comma);
				setState(1481);
				lambdaFunctionUseVar();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1487);
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
	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(JhpParser.VarName, 0); }
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterLambdaFunctionUseVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitLambdaFunctionUseVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1489);
				match(Ampersand);
				}
			}

			setState(1492);
			match(VarName);
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
		enterRule(_localctx, 188, RULE_qualifiedStaticTypeRef);
		try {
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				qualifiedNamespaceName();
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1495);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
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
		enterRule(_localctx, 190, RULE_typeRef);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1501);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1502);
					indirectTypeRef();
					}
					break;
				}
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1505);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1510);
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
		enterRule(_localctx, 192, RULE_anonymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1513);
				attributes();
				}
			}

			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1516);
				match(Private);
				}
			}

			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1519);
				modifier();
				}
			}

			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1522);
				match(Partial);
				}
			}

			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1525);
				classEntryType();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1526);
					typeParameterListInBrackets();
					}
				}

				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1529);
					match(Extends);
					setState(1530);
					qualifiedStaticTypeRef();
					}
				}

				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1533);
					match(Implements);
					setState(1534);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1537);
				match(Interface);
				setState(1538);
				identifier();
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1539);
					typeParameterListInBrackets();
					}
				}

				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1542);
					match(Extends);
					setState(1543);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1548);
			match(OpenCurlyBracket);
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 786703L) != 0)) {
				{
				{
				setState(1549);
				classStatement();
				}
				}
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1555);
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
		enterRule(_localctx, 194, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			chainBase();
			setState(1562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1558);
					match(ObjectOperator);
					setState(1559);
					keyedFieldName();
					}
					} 
				}
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
		public TerminalNode Namespace() { return getToken(JhpParser.Namespace, 0); }
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
		enterRule(_localctx, 196, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1565);
				match(Namespace);
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1568);
				match(NamespaceSeparator);
				}
			}

			setState(1571);
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
		enterRule(_localctx, 198, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				identifier();
				setState(1579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1575);
						match(NamespaceSeparator);
						setState(1576);
						identifier();
						}
						} 
					}
					setState(1581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1582);
					match(NamespaceSeparator);
					setState(1583);
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
		enterRule(_localctx, 200, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
				setState(1588);
				identifier();
				setState(1591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1589);
					match(As);
					setState(1590);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				match(OpenCurlyBracket);
				setState(1594);
				namespaceNameTail();
				setState(1599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1595);
						match(Comma);
						setState(1596);
						namespaceNameTail();
						}
						} 
					}
					setState(1601);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				}
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1602);
					match(Comma);
					}
				}

				setState(1605);
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
		enterRule(_localctx, 202, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			qualifiedNamespaceName();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1610);
				match(Comma);
				setState(1611);
				qualifiedNamespaceName();
				}
				}
				setState(1616);
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
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
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
		enterRule(_localctx, 204, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			match(OpenRoundBracket);
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1618);
				actualArgument();
				setState(1623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1619);
						match(Comma);
						setState(1620);
						actualArgument();
						}
						} 
					}
					setState(1625);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1626);
				yieldExpression();
				}
				break;
			}
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1629);
				match(Comma);
				}
			}

			setState(1632);
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
		public TerminalNode Ampersand() { return getToken(JhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
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
		enterRule(_localctx, 206, RULE_actualArgument);
		int _la;
		try {
			setState(1643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1634);
					argumentName();
					}
					break;
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1637);
					match(Ellipsis);
					}
				}

				setState(1640);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				match(Ampersand);
				setState(1642);
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
		enterRule(_localctx, 208, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			identifier();
			setState(1646);
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
		enterRule(_localctx, 210, RULE_constantInitializer);
		int _la;
		try {
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1650);
				match(Array);
				setState(1651);
				match(OpenRoundBracket);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1652);
					arrayItemList();
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1653);
						match(Comma);
						}
					}

					}
				}

				setState(1658);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1659);
				match(OpenSquareBracket);
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1660);
					arrayItemList();
					setState(1662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1661);
						match(Comma);
						}
					}

					}
				}

				setState(1666);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1667);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1668);
				constantInitializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1669);
					string();
					}
					break;
				case 2:
					{
					setState(1670);
					constant();
					}
					break;
				}
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(1673);
					match(Dot);
					setState(1676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						setState(1674);
						string();
						}
						break;
					case 2:
						{
						setState(1675);
						constant();
						}
						break;
					}
					}
					}
					setState(1682);
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
		enterRule(_localctx, 212, RULE_constant);
		try {
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1686);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1687);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1688);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1689);
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
		enterRule(_localctx, 214, RULE_literalConstant);
		try {
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1693);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1694);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1695);
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
		enterRule(_localctx, 216, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
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
		enterRule(_localctx, 218, RULE_classConstant);
		int _la;
		try {
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1701);
				match(DoubleColon);
				setState(1706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1702);
					identifier();
					}
					break;
				case 2:
					{
					setState(1703);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1704);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1705);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case Enum_:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Match_:
				case Namespace:
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
				case Require:
				case RequireOnce:
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
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case LambdaFn:
				case Ticks:
				case Encoding:
				case StrictTypes:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
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
					setState(1708);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1709);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1710);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1713);
				match(DoubleColon);
				setState(1716);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case Enum_:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Match_:
				case Namespace:
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
				case Require:
				case RequireOnce:
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
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case LambdaFn:
				case Ticks:
				case Encoding:
				case StrictTypes:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
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
					setState(1714);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1715);
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
		enterRule(_localctx, 220, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
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
		enterRule(_localctx, 222, RULE_string);
		try {
			int _alt;
			setState(1743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				match(StartHereDoc);
				setState(1724); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1723);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1726); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1728);
				match(StartNowDoc);
				setState(1730); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1729);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1732); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1735);
				match(DoubleQuote);
				setState(1739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1736);
						interpolatedStringPart();
						}
						} 
					}
					setState(1741);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
				setState(1742);
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
		enterRule(_localctx, 224, RULE_interpolatedStringPart);
		try {
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1745);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				match(UnicodeEscape);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
				setState(1747);
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
		enterRule(_localctx, 226, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			chain();
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1751);
				match(Comma);
				setState(1752);
				chain();
				}
				}
				setState(1757);
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
		enterRule(_localctx, 228, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			chainOrigin();
			setState(1762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1759);
					memberAccess();
					}
					} 
				}
				setState(1764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
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
		enterRule(_localctx, 230, RULE_chainOrigin);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1767);
				match(OpenRoundBracket);
				setState(1768);
				newExpr();
				setState(1769);
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
		enterRule(_localctx, 232, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(ObjectOperator);
			setState(1774);
			keyedFieldName();
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1775);
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
		enterRule(_localctx, 234, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			functionCallName();
			setState(1779);
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
		enterRule(_localctx, 236, RULE_functionCallName);
		try {
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1783);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1784);
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
		enterRule(_localctx, 238, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1787);
				genericDynamicArgs();
				}
			}

			setState(1791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1790);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1795);
					squareCurlyExpression();
					}
					} 
				}
				setState(1800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 240, RULE_chainBase);
		try {
			setState(1810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				keyedVariable();
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1802);
					match(DoubleColon);
					setState(1803);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
				setState(1806);
				qualifiedStaticTypeRef();
				setState(1807);
				match(DoubleColon);
				setState(1808);
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
		enterRule(_localctx, 242, RULE_keyedFieldName);
		try {
			setState(1814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
				setState(1812);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
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
		enterRule(_localctx, 244, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case Enum_:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
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
			case Require:
			case RequireOnce:
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
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Ticks:
			case Encoding:
			case StrictTypes:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
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
				setState(1816);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1817);
				match(OpenCurlyBracket);
				setState(1818);
				expression(0);
				setState(1819);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1823);
					squareCurlyExpression();
					}
					} 
				}
				setState(1828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		enterRule(_localctx, 246, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					match(Dollar);
					}
					} 
				}
				setState(1834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1835);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1836);
				match(Dollar);
				setState(1837);
				match(OpenCurlyBracket);
				setState(1838);
				expression(0);
				setState(1839);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1843);
					squareCurlyExpression();
					}
					} 
				}
				setState(1848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
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
		enterRule(_localctx, 248, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				match(OpenSquareBracket);
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
					{
					setState(1850);
					expression(0);
					}
				}

				setState(1853);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1854);
				match(OpenCurlyBracket);
				setState(1855);
				expression(0);
				setState(1856);
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
		enterRule(_localctx, 250, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
				{
				setState(1860);
				assignmentListElement();
				}
			}

			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1863);
				match(Comma);
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -1L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1864);
					assignmentListElement();
					}
				}

				}
				}
				setState(1871);
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
		enterRule(_localctx, 252, RULE_assignmentListElement);
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				match(List);
				setState(1874);
				match(OpenRoundBracket);
				setState(1875);
				assignmentList();
				setState(1876);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
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
		enterRule(_localctx, 254, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
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
		public TerminalNode Array() { return getToken(JhpParser.Array, 0); }
		public TerminalNode As() { return getToken(JhpParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(JhpParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(JhpParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(JhpParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(JhpParser.Break, 0); }
		public TerminalNode Callable() { return getToken(JhpParser.Callable, 0); }
		public TerminalNode Case() { return getToken(JhpParser.Case, 0); }
		public TerminalNode Catch() { return getToken(JhpParser.Catch, 0); }
		public TerminalNode Class() { return getToken(JhpParser.Class, 0); }
		public TerminalNode Clone() { return getToken(JhpParser.Clone, 0); }
		public TerminalNode Const() { return getToken(JhpParser.Const, 0); }
		public TerminalNode Continue() { return getToken(JhpParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(JhpParser.Declare, 0); }
		public TerminalNode Default() { return getToken(JhpParser.Default, 0); }
		public TerminalNode Do() { return getToken(JhpParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(JhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(JhpParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(JhpParser.Echo, 0); }
		public TerminalNode Else() { return getToken(JhpParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(JhpParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(JhpParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(JhpParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(JhpParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(JhpParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(JhpParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(JhpParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(JhpParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(JhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(JhpParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(JhpParser.Extends, 0); }
		public TerminalNode Final() { return getToken(JhpParser.Final, 0); }
		public TerminalNode Finally() { return getToken(JhpParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(JhpParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(JhpParser.For, 0); }
		public TerminalNode Foreach() { return getToken(JhpParser.Foreach, 0); }
		public TerminalNode Function_() { return getToken(JhpParser.Function_, 0); }
		public TerminalNode Global() { return getToken(JhpParser.Global, 0); }
		public TerminalNode Goto() { return getToken(JhpParser.Goto, 0); }
		public TerminalNode If() { return getToken(JhpParser.If, 0); }
		public TerminalNode Implements() { return getToken(JhpParser.Implements, 0); }
		public TerminalNode Import() { return getToken(JhpParser.Import, 0); }
		public TerminalNode Include() { return getToken(JhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(JhpParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(JhpParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(JhpParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(JhpParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(JhpParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(JhpParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(JhpParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(JhpParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(JhpParser.IsSet, 0); }
		public TerminalNode LambdaFn() { return getToken(JhpParser.LambdaFn, 0); }
		public TerminalNode List() { return getToken(JhpParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(JhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(JhpParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(JhpParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(JhpParser.Namespace, 0); }
		public TerminalNode New() { return getToken(JhpParser.New, 0); }
		public TerminalNode Null() { return getToken(JhpParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(JhpParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(JhpParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(JhpParser.Partial, 0); }
		public TerminalNode Print() { return getToken(JhpParser.Print, 0); }
		public TerminalNode Private() { return getToken(JhpParser.Private, 0); }
		public TerminalNode Protected() { return getToken(JhpParser.Protected, 0); }
		public TerminalNode Public() { return getToken(JhpParser.Public, 0); }
		public TerminalNode Readonly() { return getToken(JhpParser.Readonly, 0); }
		public TerminalNode Require() { return getToken(JhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(JhpParser.RequireOnce, 0); }
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
		public TerminalNode Unset() { return getToken(JhpParser.Unset, 0); }
		public TerminalNode Use() { return getToken(JhpParser.Use, 0); }
		public TerminalNode Var() { return getToken(JhpParser.Var, 0); }
		public TerminalNode While() { return getToken(JhpParser.While, 0); }
		public TerminalNode Yield() { return getToken(JhpParser.Yield, 0); }
		public TerminalNode From() { return getToken(JhpParser.From, 0); }
		public TerminalNode Enum_() { return getToken(JhpParser.Enum_, 0); }
		public TerminalNode Match_() { return getToken(JhpParser.Match_, 0); }
		public TerminalNode Ticks() { return getToken(JhpParser.Ticks, 0); }
		public TerminalNode Encoding() { return getToken(JhpParser.Encoding, 0); }
		public TerminalNode StrictTypes() { return getToken(JhpParser.StrictTypes, 0); }
		public TerminalNode Get() { return getToken(JhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(JhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(JhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(JhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(JhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(JhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(JhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(JhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(JhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(JhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(JhpParser.Unset__, 0); }
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
		enterRule(_localctx, 256, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1024L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==Label) ) {
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
		enterRule(_localctx, 258, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
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
		enterRule(_localctx, 260, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
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
		enterRule(_localctx, 262, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3458764514088994816L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 9217L) != 0)) ) {
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
		public TerminalNode Unset() { return getToken(JhpParser.Unset, 0); }
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
		enterRule(_localctx, 264, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4323490827050444800L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 3679233L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return typeHint_sempred((TypeHintContext)_localctx, predIndex);
		case 78:
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
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 18:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00d1\u0766\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0001\u0000\u0003\u0000\u010c\b\u0000\u0001"+
		"\u0000\u0005\u0000\u010f\b\u0000\n\u0000\f\u0000\u0112\t\u0000\u0001\u0000"+
		"\u0005\u0000\u0115\b\u0000\n\u0000\f\u0000\u0118\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0005\u0001\u011d\b\u0001\n\u0001\f\u0001\u0120\t\u0001"+
		"\u0001\u0001\u0004\u0001\u0123\b\u0001\u000b\u0001\f\u0001\u0124\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0133\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0137\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u013d\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0142\b\u0005\u0001\u0005"+
		"\u0005\u0005\u0145\b\u0005\n\u0005\f\u0005\u0148\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u014e\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0152\b\u0007\n\u0007\f\u0007\u0155\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u015b\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0162\b\b\u0001\t\u0003\t\u0165"+
		"\b\t\u0001\t\u0001\t\u0003\t\u0169\b\t\u0001\t\u0001\t\u0003\t\u016d\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0174\b\t\u0001\t\u0003"+
		"\t\u0177\b\t\u0001\t\u0001\t\u0001\n\u0003\n\u017c\b\n\u0001\n\u0003\n"+
		"\u017f\b\n\u0001\n\u0003\n\u0182\b\n\u0001\n\u0003\n\u0185\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u018a\b\n\u0001\n\u0001\n\u0003\n\u018e\b\n\u0001"+
		"\n\u0001\n\u0003\n\u0192\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0197\b\n"+
		"\u0001\n\u0001\n\u0003\n\u019b\b\n\u0003\n\u019d\b\n\u0001\n\u0001\n\u0005"+
		"\n\u01a1\b\n\n\n\f\n\u01a4\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u01ad\b\f\n\f\f\f\u01b0\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u01c0\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u01c5\b\u000e\n\u000e\f\u000e\u01c8\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u01cd\b\u000f\n\u000f\f\u000f\u01d0"+
		"\t\u000f\u0001\u0010\u0003\u0010\u01d3\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0003\u0011\u01d8\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01de\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u01e4\b\u0012\n\u0012\f\u0012\u01e7\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u01ec\b\u0013\u000b\u0013\f"+
		"\u0013\u01ed\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01f4\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01f9\b"+
		"\u0014\n\u0014\f\u0014\u01fc\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0202\b\u0015\u0001\u0016\u0005\u0016\u0205\b"+
		"\u0016\n\u0016\f\u0016\u0208\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u020d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u022c\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0238\b\u001b\n\u001b\f\u001b\u023b\t\u001b\u0001"+
		"\u001b\u0003\u001b\u023e\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0245\b\u001b\n\u001b\f\u001b\u0248\t\u001b"+
		"\u0001\u001b\u0003\u001b\u024b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0250\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u026a"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u0275\b\"\u0001\"\u0001\"\u0003\"\u0279\b\"\u0001\"\u0001\"\u0003"+
		"\"\u027d\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0286\b\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0290\b%\u0001%\u0005%\u0293\b%\n%\f%\u0296\t%\u0001%\u0001%\u0001%"+
		"\u0003%\u029b\b%\u0001%\u0005%\u029e\b%\n%\f%\u02a1\t%\u0001%\u0001%\u0003"+
		"%\u02a5\b%\u0001&\u0001&\u0001&\u0003&\u02aa\b&\u0001&\u0004&\u02ad\b"+
		"&\u000b&\f&\u02ae\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u02b5\b\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0003(\u02bb\b(\u0001(\u0001(\u0001)\u0001)\u0003"+
		")\u02c1\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u02d9\b,\u0001,\u0001,\u0001,\u0003,\u02de"+
		"\b,\u0001,\u0003,\u02e1\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u02eb\b,\u0001,\u0003,\u02ee\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02fb\b,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0303\b,\u0001-\u0001-\u0001"+
		"-\u0004-\u0308\b-\u000b-\f-\u0309\u0001-\u0003-\u030d\b-\u0001-\u0005"+
		"-\u0310\b-\n-\f-\u0313\t-\u0001-\u0003-\u0316\b-\u0001.\u0001.\u0001."+
		"\u0001.\u0001.\u0005.\u031d\b.\n.\f.\u0320\t.\u0001.\u0003.\u0323\b.\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u033d\b2\u00013\u00013\u00013\u00053\u0342"+
		"\b3\n3\f3\u0345\t3\u00014\u00014\u00014\u00014\u00034\u034b\b4\u00014"+
		"\u00014\u00014\u00014\u00014\u00014\u00034\u0353\b4\u00015\u00035\u0356"+
		"\b5\u00015\u00015\u00055\u035a\b5\n5\f5\u035d\t5\u00015\u00035\u0360\b"+
		"5\u00016\u00036\u0363\b6\u00016\u00056\u0366\b6\n6\f6\u0369\t6\u00016"+
		"\u00036\u036c\b6\u00016\u00036\u036f\b6\u00016\u00036\u0372\b6\u00016"+
		"\u00036\u0375\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00037\u037d"+
		"\b7\u00017\u00017\u00017\u00057\u0382\b7\n7\f7\u0385\t7\u00018\u00018"+
		"\u00018\u00018\u00058\u038b\b8\n8\f8\u038e\t8\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u039a\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0005;\u03a4\b;\n;\f;\u03a7"+
		"\t;\u0001;\u0001;\u0001<\u0003<\u03ac\b<\u0001<\u0001<\u0003<\u03b0\b"+
		"<\u0001<\u0001<\u0001<\u0005<\u03b5\b<\n<\f<\u03b8\t<\u0001<\u0001<\u0001"+
		"<\u0003<\u03bd\b<\u0001<\u0001<\u0003<\u03c1\b<\u0001<\u0001<\u0001<\u0005"+
		"<\u03c6\b<\n<\f<\u03c9\t<\u0001<\u0001<\u0001<\u0001<\u0003<\u03cf\b<"+
		"\u0001<\u0001<\u0003<\u03d3\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u03da\b<\u0001<\u0001<\u0003<\u03de\b<\u0003<\u03e0\b<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u03e6\b<\u0001=\u0001=\u0001=\u0005=\u03eb\b=\n"+
		"=\f=\u03ee\t=\u0001=\u0003=\u03f1\b=\u0001>\u0001>\u0003>\u03f5\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u0402\b@\u0001@\u0003@\u0405\b@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0003A\u040c\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u0413\bB\u0001"+
		"C\u0001C\u0003C\u0417\bC\u0001C\u0001C\u0001D\u0001D\u0003D\u041d\bD\u0001"+
		"E\u0001E\u0003E\u0421\bE\u0001F\u0004F\u0424\bF\u000bF\fF\u0425\u0001"+
		"G\u0001G\u0001G\u0003G\u042b\bG\u0001H\u0001H\u0001H\u0001H\u0001I\u0003"+
		"I\u0432\bI\u0001I\u0001I\u0001I\u0001I\u0005I\u0438\bI\nI\fI\u043b\tI"+
		"\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0003J\u0443\bJ\u0001J\u0001"+
		"J\u0003J\u0447\bJ\u0001J\u0001J\u0005J\u044b\bJ\nJ\fJ\u044e\tJ\u0001J"+
		"\u0001J\u0001K\u0001K\u0001K\u0001K\u0003K\u0456\bK\u0001K\u0001K\u0001"+
		"K\u0003K\u045b\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0462\bK\u0001"+
		"L\u0001L\u0001L\u0005L\u0467\bL\nL\fL\u046a\tL\u0001M\u0001M\u0001M\u0003"+
		"M\u046f\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u04ae\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003"+
		"N\u04bf\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u04c6\bN\u0001N\u0001"+
		"N\u0001N\u0003N\u04cb\bN\u0003N\u04cd\bN\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0003N\u04f3\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0005N\u0509\bN\nN\fN\u050c\tN\u0001O\u0001O\u0003"+
		"O\u0510\bO\u0001P\u0001P\u0001P\u0003P\u0515\bP\u0001P\u0001P\u0001P\u0003"+
		"P\u051a\bP\u0001P\u0003P\u051d\bP\u0001P\u0001P\u0001P\u0001P\u0003P\u0523"+
		"\bP\u0001Q\u0001Q\u0005Q\u0527\bQ\nQ\fQ\u052a\tQ\u0001Q\u0001Q\u0004Q"+
		"\u052e\bQ\u000bQ\fQ\u052f\u0001Q\u0005Q\u0533\bQ\nQ\fQ\u0536\tQ\u0001"+
		"Q\u0005Q\u0539\bQ\nQ\fQ\u053c\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0004"+
		"Q\u0543\bQ\u000bQ\fQ\u0544\u0001Q\u0005Q\u0548\bQ\nQ\fQ\u054b\tQ\u0001"+
		"Q\u0003Q\u054e\bQ\u0001Q\u0001Q\u0003Q\u0552\bQ\u0001R\u0003R\u0555\b"+
		"R\u0001R\u0001R\u0001S\u0001S\u0001S\u0003S\u055c\bS\u0001S\u0003S\u055f"+
		"\bS\u0001S\u0001S\u0001T\u0003T\u0564\bT\u0001T\u0001T\u0003T\u0568\b"+
		"T\u0001T\u0001T\u0001T\u0001T\u0003T\u056e\bT\u0001T\u0001T\u0003T\u0572"+
		"\bT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003"+
		"T\u057d\bT\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0005"+
		"U\u0587\bU\nU\fU\u058a\tU\u0001U\u0003U\u058d\bU\u0001U\u0001U\u0001V"+
		"\u0001V\u0001V\u0005V\u0594\bV\nV\fV\u0597\tV\u0001V\u0001V\u0001V\u0001"+
		"W\u0001W\u0001W\u0003W\u059f\bW\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u05a7\bY\u0001Y\u0001Y\u0003Y\u05ab\bY\u0001Z\u0001Z\u0001Z\u0005"+
		"Z\u05b0\bZ\nZ\fZ\u05b3\tZ\u0001Z\u0003Z\u05b6\bZ\u0001[\u0001[\u0001["+
		"\u0003[\u05bb\b[\u0001[\u0001[\u0001[\u0003[\u05c0\b[\u0001[\u0001[\u0003"+
		"[\u05c4\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u05cb\b\\\n"+
		"\\\f\\\u05ce\t\\\u0001\\\u0001\\\u0001]\u0003]\u05d3\b]\u0001]\u0001]"+
		"\u0001^\u0001^\u0003^\u05d9\b^\u0001^\u0003^\u05dc\b^\u0001_\u0001_\u0003"+
		"_\u05e0\b_\u0001_\u0003_\u05e3\b_\u0001_\u0001_\u0001_\u0003_\u05e8\b"+
		"_\u0001`\u0003`\u05eb\b`\u0001`\u0003`\u05ee\b`\u0001`\u0003`\u05f1\b"+
		"`\u0001`\u0003`\u05f4\b`\u0001`\u0001`\u0003`\u05f8\b`\u0001`\u0001`\u0003"+
		"`\u05fc\b`\u0001`\u0001`\u0003`\u0600\b`\u0001`\u0001`\u0001`\u0003`\u0605"+
		"\b`\u0001`\u0001`\u0003`\u0609\b`\u0003`\u060b\b`\u0001`\u0001`\u0005"+
		"`\u060f\b`\n`\f`\u0612\t`\u0001`\u0001`\u0001a\u0001a\u0001a\u0005a\u0619"+
		"\ba\na\fa\u061c\ta\u0001b\u0003b\u061f\bb\u0001b\u0003b\u0622\bb\u0001"+
		"b\u0001b\u0001c\u0001c\u0001c\u0001c\u0005c\u062a\bc\nc\fc\u062d\tc\u0001"+
		"c\u0001c\u0003c\u0631\bc\u0003c\u0633\bc\u0001d\u0001d\u0001d\u0003d\u0638"+
		"\bd\u0001d\u0001d\u0001d\u0001d\u0005d\u063e\bd\nd\fd\u0641\td\u0001d"+
		"\u0003d\u0644\bd\u0001d\u0001d\u0003d\u0648\bd\u0001e\u0001e\u0001e\u0005"+
		"e\u064d\be\ne\fe\u0650\te\u0001f\u0001f\u0001f\u0001f\u0005f\u0656\bf"+
		"\nf\ff\u0659\tf\u0001f\u0003f\u065c\bf\u0001f\u0003f\u065f\bf\u0001f\u0001"+
		"f\u0001g\u0003g\u0664\bg\u0001g\u0003g\u0667\bg\u0001g\u0001g\u0001g\u0003"+
		"g\u066c\bg\u0001h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u0677\bi\u0003i\u0679\bi\u0001i\u0001i\u0001i\u0001i\u0003i\u067f"+
		"\bi\u0003i\u0681\bi\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0688\b"+
		"i\u0001i\u0001i\u0001i\u0003i\u068d\bi\u0005i\u068f\bi\ni\fi\u0692\ti"+
		"\u0003i\u0694\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0003j\u069b\bj\u0001"+
		"k\u0001k\u0001k\u0001k\u0003k\u06a1\bk\u0001l\u0001l\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0003m\u06ab\bm\u0001m\u0001m\u0001m\u0003m\u06b0"+
		"\bm\u0001m\u0001m\u0001m\u0003m\u06b5\bm\u0003m\u06b7\bm\u0001n\u0001"+
		"n\u0001o\u0001o\u0004o\u06bd\bo\u000bo\fo\u06be\u0001o\u0001o\u0004o\u06c3"+
		"\bo\u000bo\fo\u06c4\u0001o\u0001o\u0001o\u0005o\u06ca\bo\no\fo\u06cd\t"+
		"o\u0001o\u0003o\u06d0\bo\u0001p\u0001p\u0001p\u0003p\u06d5\bp\u0001q\u0001"+
		"q\u0001q\u0005q\u06da\bq\nq\fq\u06dd\tq\u0001r\u0001r\u0005r\u06e1\br"+
		"\nr\fr\u06e4\tr\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0003s\u06ec"+
		"\bs\u0001t\u0001t\u0001t\u0003t\u06f1\bt\u0001u\u0001u\u0001u\u0001v\u0001"+
		"v\u0001v\u0001v\u0003v\u06fa\bv\u0001w\u0003w\u06fd\bw\u0001w\u0004w\u0700"+
		"\bw\u000bw\fw\u0701\u0001w\u0005w\u0705\bw\nw\fw\u0708\tw\u0001x\u0001"+
		"x\u0001x\u0003x\u070d\bx\u0001x\u0001x\u0001x\u0001x\u0003x\u0713\bx\u0001"+
		"y\u0001y\u0003y\u0717\by\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u071e"+
		"\bz\u0001z\u0005z\u0721\bz\nz\fz\u0724\tz\u0001{\u0005{\u0727\b{\n{\f"+
		"{\u072a\t{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003{\u0732\b{\u0001"+
		"{\u0005{\u0735\b{\n{\f{\u0738\t{\u0001|\u0001|\u0003|\u073c\b|\u0001|"+
		"\u0001|\u0001|\u0001|\u0001|\u0003|\u0743\b|\u0001}\u0003}\u0746\b}\u0001"+
		"}\u0001}\u0003}\u074a\b}\u0005}\u074c\b}\n}\f}\u074f\t}\u0001~\u0001~"+
		"\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u0758\b~\u0001\u007f\u0001"+
		"\u007f\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0000"+
		"\u0002n\u009c\u0085\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u0000"+
		"\u0018\u0002\u0000\u0016\u001600\u0002\u0000\u0014\u0014XX\u0001\u0000"+
		"\u00b9\u00ba\u0002\u0000==UU\u0001\u0000\u00ad\u00ae\u0002\u0000\u00a6"+
		"\u00a6\u00a8\u00a9\u0001\u0000\u0083\u0084\u0001\u000067\u0001\u0000P"+
		"Q\u0001\u0000\u00aa\u00ac\u0002\u0000\u00a8\u00a9\u00b0\u00b0\u0001\u0000"+
		"\u009c\u009d\u0002\u0000\u0089\u008a\u00a2\u00a3\u0001\u0000\u0085\u0088"+
		"\u0004\u0000\u008b\u008d\u008f\u0097\u009b\u009b\u00bb\u00bb\u0001\u0000"+
		"\u00a8\u00a9\u0002\u0000\u00c0\u00c1\u00c3\u00c4\u0002\u0000\u0014\u0014"+
		"II\u0002\u0000\n\n++\u0002\u0000\n~\u00bf\u00bf\u0004\u0000\n\n++LOTT"+
		"\u0001\u0000w~\u0007\u0000\u000b\u000b\u000e\u000e\u001c\u001c<=HHRRU"+
		"U\t\u0000\u000b\u000b\r\u000e\u001b\u001c--:=HHRRUU[]\u083f\u0000\u010b"+
		"\u0001\u0000\u0000\u0000\u0002\u011e\u0001\u0000\u0000\u0000\u0004\u0126"+
		"\u0001\u0000\u0000\u0000\u0006\u0132\u0001\u0000\u0000\u0000\b\u0134\u0001"+
		"\u0000\u0000\u0000\n\u013c\u0001\u0000\u0000\u0000\f\u0149\u0001\u0000"+
		"\u0000\u0000\u000e\u014b\u0001\u0000\u0000\u0000\u0010\u0161\u0001\u0000"+
		"\u0000\u0000\u0012\u0164\u0001\u0000\u0000\u0000\u0014\u017b\u0001\u0000"+
		"\u0000\u0000\u0016\u01a7\u0001\u0000\u0000\u0000\u0018\u01a9\u0001\u0000"+
		"\u0000\u0000\u001a\u01bf\u0001\u0000\u0000\u0000\u001c\u01c1\u0001\u0000"+
		"\u0000\u0000\u001e\u01c9\u0001\u0000\u0000\u0000 \u01d2\u0001\u0000\u0000"+
		"\u0000\"\u01d7\u0001\u0000\u0000\u0000$\u01df\u0001\u0000\u0000\u0000"+
		"&\u01eb\u0001\u0000\u0000\u0000(\u01ef\u0001\u0000\u0000\u0000*\u01ff"+
		"\u0001\u0000\u0000\u0000,\u0206\u0001\u0000\u0000\u0000.\u020c\u0001\u0000"+
		"\u0000\u00000\u022b\u0001\u0000\u0000\u00002\u022d\u0001\u0000\u0000\u0000"+
		"4\u022f\u0001\u0000\u0000\u00006\u024f\u0001\u0000\u0000\u00008\u0251"+
		"\u0001\u0000\u0000\u0000:\u0255\u0001\u0000\u0000\u0000<\u025a\u0001\u0000"+
		"\u0000\u0000>\u025d\u0001\u0000\u0000\u0000@\u0261\u0001\u0000\u0000\u0000"+
		"B\u026b\u0001\u0000\u0000\u0000D\u0271\u0001\u0000\u0000\u0000F\u0287"+
		"\u0001\u0000\u0000\u0000H\u0289\u0001\u0000\u0000\u0000J\u028b\u0001\u0000"+
		"\u0000\u0000L\u02ac\u0001\u0000\u0000\u0000N\u02b2\u0001\u0000\u0000\u0000"+
		"P\u02b8\u0001\u0000\u0000\u0000R\u02be\u0001\u0000\u0000\u0000T\u02c4"+
		"\u0001\u0000\u0000\u0000V\u02c7\u0001\u0000\u0000\u0000X\u02cd\u0001\u0000"+
		"\u0000\u0000Z\u0304\u0001\u0000\u0000\u0000\\\u0317\u0001\u0000\u0000"+
		"\u0000^\u0327\u0001\u0000\u0000\u0000`\u032a\u0001\u0000\u0000\u0000b"+
		"\u032e\u0001\u0000\u0000\u0000d\u0332\u0001\u0000\u0000\u0000f\u033e\u0001"+
		"\u0000\u0000\u0000h\u0352\u0001\u0000\u0000\u0000j\u0355\u0001\u0000\u0000"+
		"\u0000l\u0362\u0001\u0000\u0000\u0000n\u037c\u0001\u0000\u0000\u0000p"+
		"\u0386\u0001\u0000\u0000\u0000r\u0399\u0001\u0000\u0000\u0000t\u039b\u0001"+
		"\u0000\u0000\u0000v\u039f\u0001\u0000\u0000\u0000x\u03e5\u0001\u0000\u0000"+
		"\u0000z\u03f0\u0001\u0000\u0000\u0000|\u03f4\u0001\u0000\u0000\u0000~"+
		"\u03f6\u0001\u0000\u0000\u0000\u0080\u03fd\u0001\u0000\u0000\u0000\u0082"+
		"\u040b\u0001\u0000\u0000\u0000\u0084\u040f\u0001\u0000\u0000\u0000\u0086"+
		"\u0414\u0001\u0000\u0000\u0000\u0088\u041c\u0001\u0000\u0000\u0000\u008a"+
		"\u0420\u0001\u0000\u0000\u0000\u008c\u0423\u0001\u0000\u0000\u0000\u008e"+
		"\u0427\u0001\u0000\u0000\u0000\u0090\u042c\u0001\u0000\u0000\u0000\u0092"+
		"\u0431\u0001\u0000\u0000\u0000\u0094\u043e\u0001\u0000\u0000\u0000\u0096"+
		"\u0461\u0001\u0000\u0000\u0000\u0098\u0463\u0001\u0000\u0000\u0000\u009a"+
		"\u046b\u0001\u0000\u0000\u0000\u009c\u04cc\u0001\u0000\u0000\u0000\u009e"+
		"\u050f\u0001\u0000\u0000\u0000\u00a0\u051c\u0001\u0000\u0000\u0000\u00a2"+
		"\u0551\u0001\u0000\u0000\u0000\u00a4\u0554\u0001\u0000\u0000\u0000\u00a6"+
		"\u055b\u0001\u0000\u0000\u0000\u00a8\u057c\u0001\u0000\u0000\u0000\u00aa"+
		"\u057e\u0001\u0000\u0000\u0000\u00ac\u0590\u0001\u0000\u0000\u0000\u00ae"+
		"\u059b\u0001\u0000\u0000\u0000\u00b0\u05a0\u0001\u0000\u0000\u0000\u00b2"+
		"\u05a2\u0001\u0000\u0000\u0000\u00b4\u05ac\u0001\u0000\u0000\u0000\u00b6"+
		"\u05c3\u0001\u0000\u0000\u0000\u00b8\u05c5\u0001\u0000\u0000\u0000\u00ba"+
		"\u05d2\u0001\u0000\u0000\u0000\u00bc\u05db\u0001\u0000\u0000\u0000\u00be"+
		"\u05e7\u0001\u0000\u0000\u0000\u00c0\u05ea\u0001\u0000\u0000\u0000\u00c2"+
		"\u0615\u0001\u0000\u0000\u0000\u00c4\u061e\u0001\u0000\u0000\u0000\u00c6"+
		"\u0632\u0001\u0000\u0000\u0000\u00c8\u0647\u0001\u0000\u0000\u0000\u00ca"+
		"\u0649\u0001\u0000\u0000\u0000\u00cc\u0651\u0001\u0000\u0000\u0000\u00ce"+
		"\u066b\u0001\u0000\u0000\u0000\u00d0\u066d\u0001\u0000\u0000\u0000\u00d2"+
		"\u0693\u0001\u0000\u0000\u0000\u00d4\u069a\u0001\u0000\u0000\u0000\u00d6"+
		"\u06a0\u0001\u0000\u0000\u0000\u00d8\u06a2\u0001\u0000\u0000\u0000\u00da"+
		"\u06b6\u0001\u0000\u0000\u0000\u00dc\u06b8\u0001\u0000\u0000\u0000\u00de"+
		"\u06cf\u0001\u0000\u0000\u0000\u00e0\u06d4\u0001\u0000\u0000\u0000\u00e2"+
		"\u06d6\u0001\u0000\u0000\u0000\u00e4\u06de\u0001\u0000\u0000\u0000\u00e6"+
		"\u06eb\u0001\u0000\u0000\u0000\u00e8\u06ed\u0001\u0000\u0000\u0000\u00ea"+
		"\u06f2\u0001\u0000\u0000\u0000\u00ec\u06f9\u0001\u0000\u0000\u0000\u00ee"+
		"\u06fc\u0001\u0000\u0000\u0000\u00f0\u0712\u0001\u0000\u0000\u0000\u00f2"+
		"\u0716\u0001\u0000\u0000\u0000\u00f4\u071d\u0001\u0000\u0000\u0000\u00f6"+
		"\u0728\u0001\u0000\u0000\u0000\u00f8\u0742\u0001\u0000\u0000\u0000\u00fa"+
		"\u0745\u0001\u0000\u0000\u0000\u00fc\u0757\u0001\u0000\u0000\u0000\u00fe"+
		"\u0759\u0001\u0000\u0000\u0000\u0100\u075b\u0001\u0000\u0000\u0000\u0102"+
		"\u075d\u0001\u0000\u0000\u0000\u0104\u075f\u0001\u0000\u0000\u0000\u0106"+
		"\u0761\u0001\u0000\u0000\u0000\u0108\u0763\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0005\u0002\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u0110\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0003\u0004\u0002\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0116\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u0003\u0006\u0003\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0000\u0000\u0001\u011a\u0001\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0003\u0004\u0002\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0123\u0003\u0006\u0003\u0000\u0122"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0003\u0001\u0000\u0000\u0000\u0126\u0127\u00055\u0000\u0000\u0127\u0128"+
		"\u0005E\u0000\u0000\u0128\u0129\u0003\u00c6c\u0000\u0129\u012a\u0005\u00ba"+
		"\u0000\u0000\u012a\u0005\u0001\u0000\u0000\u0000\u012b\u0133\u00030\u0018"+
		"\u0000\u012c\u0133\u0003\b\u0004\u0000\u012d\u0133\u0003\u000e\u0007\u0000"+
		"\u012e\u0133\u0003\u0012\t\u0000\u012f\u0133\u0003\u0014\n\u0000\u0130"+
		"\u0133\u0003\u0092I\u0000\u0131\u0133\u0003\u0094J\u0000\u0132\u012b\u0001"+
		"\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012d\u0001"+
		"\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0007\u0001\u0000\u0000\u0000\u0134\u0136\u0005"+
		"^\u0000\u0000\u0135\u0137\u0007\u0000\u0000\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0003\n\u0005\u0000\u0139\u013a\u0005\u00ba\u0000"+
		"\u0000\u013a\t\u0001\u0000\u0000\u0000\u013b\u013d\u0005\u00a0\u0000\u0000"+
		"\u013c\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0146\u0003\f\u0006\u0000\u013f"+
		"\u0141\u0005\u00b8\u0000\u0000\u0140\u0142\u0005\u00a0\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0003\f\u0006\u0000\u0144\u013f"+
		"\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u000b"+
		"\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0003\u00c6c\u0000\u014a\r\u0001\u0000\u0000\u0000\u014b\u015a\u0005"+
		"E\u0000\u0000\u014c\u014e\u0003\u00c6c\u0000\u014d\u014c\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0153\u0005\u00b6\u0000\u0000\u0150\u0152\u0003\u0010\b\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u015b\u0005\u00b7\u0000\u0000\u0157\u0158\u0003\u00c6c\u0000\u0158"+
		"\u0159\u0005\u00ba\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a"+
		"\u014d\u0001\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015b"+
		"\u000f\u0001\u0000\u0000\u0000\u015c\u0162\u00030\u0018\u0000\u015d\u0162"+
		"\u0003\b\u0004\u0000\u015e\u0162\u0003\u0012\t\u0000\u015f\u0162\u0003"+
		"\u0014\n\u0000\u0160\u0162\u0003\u0092I\u0000\u0161\u015c\u0001\u0000"+
		"\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0011\u0001\u0000\u0000\u0000\u0163\u0165\u0003&\u0013"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u00050\u0000\u0000"+
		"\u0167\u0169\u0005\u00a4\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016c\u0003\u0100\u0080\u0000\u016b\u016d\u0003\u001a\r\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u00b2\u0000\u0000\u016f"+
		"\u0170\u0003j5\u0000\u0170\u0176\u0005\u00b3\u0000\u0000\u0171\u0173\u0005"+
		"\u00b9\u0000\u0000\u0172\u0174\u0005\u00b1\u0000\u0000\u0173\u0172\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175\u0177\u0003n7\u0000\u0176\u0171\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u00034\u001a\u0000\u0179\u0013\u0001\u0000\u0000\u0000"+
		"\u017a\u017c\u0003&\u0013\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d"+
		"\u017f\u0005L\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0182"+
		"\u0003\u00fe\u007f\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u0005J\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u019c\u0001\u0000\u0000\u0000\u0186\u0187\u0003"+
		"\u0016\u000b\u0000\u0187\u0189\u0003\u0100\u0080\u0000\u0188\u018a\u0003"+
		"\u001a\r\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u018c\u0005*\u0000"+
		"\u0000\u018c\u018e\u0003\u00bc^\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u00054\u0000\u0000\u0190\u0192\u0003\u0018\f\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u019d\u0001\u0000\u0000\u0000\u0193\u0194\u0005>\u0000\u0000\u0194\u0196"+
		"\u0003\u0100\u0080\u0000\u0195\u0197\u0003\u001a\r\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019a\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005*\u0000\u0000\u0199\u019b\u0003\u0018"+
		"\f\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0186\u0001\u0000\u0000"+
		"\u0000\u019c\u0193\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u01a2\u0005\u00b6\u0000\u0000\u019f\u01a1\u0003x<\u0000\u01a0"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005\u00b7\u0000\u0000\u01a6\u0015\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0007\u0001\u0000\u0000\u01a8\u0017\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ae\u0003\u00bc^\u0000\u01aa\u01ab\u0005\u00b8\u0000\u0000\u01ab\u01ad"+
		"\u0003\u00bc^\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u0019\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005\u0080\u0000\u0000\u01b2\u01b3\u0003"+
		"\u001c\u000e\u0000\u01b3\u01b4\u0005\u0081\u0000\u0000\u01b4\u01c0\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0005\u0080\u0000\u0000\u01b6\u01b7\u0003"+
		"\u001e\u000f\u0000\u01b7\u01b8\u0005\u0081\u0000\u0000\u01b8\u01c0\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\u0080\u0000\u0000\u01ba\u01bb\u0003"+
		"\u001c\u000e\u0000\u01bb\u01bc\u0005\u00b8\u0000\u0000\u01bc\u01bd\u0003"+
		"\u001e\u000f\u0000\u01bd\u01be\u0005\u0081\u0000\u0000\u01be\u01c0\u0001"+
		"\u0000\u0000\u0000\u01bf\u01b1\u0001\u0000\u0000\u0000\u01bf\u01b5\u0001"+
		"\u0000\u0000\u0000\u01bf\u01b9\u0001\u0000\u0000\u0000\u01c0\u001b\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c6\u0003 \u0010\u0000\u01c2\u01c3\u0005\u00b8"+
		"\u0000\u0000\u01c3\u01c5\u0003 \u0010\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u001d\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ce\u0003\"\u0011\u0000"+
		"\u01ca\u01cb\u0005\u00b8\u0000\u0000\u01cb\u01cd\u0003\"\u0011\u0000\u01cc"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u001f\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d3\u0003&\u0013\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5"+
		"\u0003\u0100\u0080\u0000\u01d5!\u0001\u0000\u0000\u0000\u01d6\u01d8\u0003"+
		"&\u0013\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0003\u0100"+
		"\u0080\u0000\u01da\u01dd\u0005\u00bb\u0000\u0000\u01db\u01de\u0003\u00bc"+
		"^\u0000\u01dc\u01de\u0003\u0106\u0083\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de#\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0005\u0080\u0000\u0000\u01e0\u01e5\u0003\u00be_\u0000\u01e1"+
		"\u01e2\u0005\u00b8\u0000\u0000\u01e2\u01e4\u0003\u00be_\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\u0081\u0000\u0000\u01e9%\u0001\u0000\u0000\u0000\u01ea\u01ec\u0003"+
		"(\u0014\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ee\'\u0001\u0000\u0000\u0000\u01ef\u01f3\u0005\u0006\u0000"+
		"\u0000\u01f0\u01f1\u0003\u0100\u0080\u0000\u01f1\u01f2\u0005\u00b9\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01fa\u0003*\u0015\u0000\u01f6\u01f7\u0005\u00b8\u0000\u0000"+
		"\u01f7\u01f9\u0003*\u0015\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u00b5\u0000\u0000\u01fe"+
		")\u0001\u0000\u0000\u0000\u01ff\u0201\u0003\u00c4b\u0000\u0200\u0202\u0003"+
		"\u00ccf\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202+\u0001\u0000\u0000\u0000\u0203\u0205\u0003.\u0017\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000"+
		"\u0207-\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209"+
		"\u020d\u00030\u0018\u0000\u020a\u020d\u0003\u0012\t\u0000\u020b\u020d"+
		"\u0003\u0014\n\u0000\u020c\u0209\u0001\u0000\u0000\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d/\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0003\u0100\u0080\u0000\u020f\u0210\u0005\u00b9"+
		"\u0000\u0000\u0210\u022c\u0001\u0000\u0000\u0000\u0211\u022c\u00034\u001a"+
		"\u0000\u0212\u022c\u00036\u001b\u0000\u0213\u022c\u0003@ \u0000\u0214"+
		"\u022c\u0003B!\u0000\u0215\u022c\u0003D\"\u0000\u0216\u022c\u0003J%\u0000"+
		"\u0217\u022c\u0003N\'\u0000\u0218\u022c\u0003P(\u0000\u0219\u022c\u0003"+
		"R)\u0000\u021a\u021b\u0003\u00b2Y\u0000\u021b\u021c\u0005\u00ba\u0000"+
		"\u0000\u021c\u022c\u0001\u0000\u0000\u0000\u021d\u022c\u0003p8\u0000\u021e"+
		"\u022c\u0003v;\u0000\u021f\u022c\u0003t:\u0000\u0220\u022c\u0003T*\u0000"+
		"\u0221\u022c\u0003V+\u0000\u0222\u022c\u0003X,\u0000\u0223\u022c\u0003"+
		"Z-\u0000\u0224\u022c\u0003`0\u0000\u0225\u022c\u0003b1\u0000\u0226\u022c"+
		"\u0003d2\u0000\u0227\u022c\u00032\u0019\u0000\u0228\u0229\u0003&\u0013"+
		"\u0000\u0229\u022a\u0003T*\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b"+
		"\u020e\u0001\u0000\u0000\u0000\u022b\u0211\u0001\u0000\u0000\u0000\u022b"+
		"\u0212\u0001\u0000\u0000\u0000\u022b\u0213\u0001\u0000\u0000\u0000\u022b"+
		"\u0214\u0001\u0000\u0000\u0000\u022b\u0215\u0001\u0000\u0000\u0000\u022b"+
		"\u0216\u0001\u0000\u0000\u0000\u022b\u0217\u0001\u0000\u0000\u0000\u022b"+
		"\u0218\u0001\u0000\u0000\u0000\u022b\u0219\u0001\u0000\u0000\u0000\u022b"+
		"\u021a\u0001\u0000\u0000\u0000\u022b\u021d\u0001\u0000\u0000\u0000\u022b"+
		"\u021e\u0001\u0000\u0000\u0000\u022b\u021f\u0001\u0000\u0000\u0000\u022b"+
		"\u0220\u0001\u0000\u0000\u0000\u022b\u0221\u0001\u0000\u0000\u0000\u022b"+
		"\u0222\u0001\u0000\u0000\u0000\u022b\u0223\u0001\u0000\u0000\u0000\u022b"+
		"\u0224\u0001\u0000\u0000\u0000\u022b\u0225\u0001\u0000\u0000\u0000\u022b"+
		"\u0226\u0001\u0000\u0000\u0000\u022b\u0227\u0001\u0000\u0000\u0000\u022b"+
		"\u0228\u0001\u0000\u0000\u0000\u022c1\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0005\u00ba\u0000\u0000\u022e3\u0001\u0000\u0000\u0000\u022f\u0230\u0005"+
		"\u00b6\u0000\u0000\u0230\u0231\u0003,\u0016\u0000\u0231\u0232\u0005\u00b7"+
		"\u0000\u0000\u02325\u0001\u0000\u0000\u0000\u0233\u0234\u00053\u0000\u0000"+
		"\u0234\u0235\u0003\u009aM\u0000\u0235\u0239\u00030\u0018\u0000\u0236\u0238"+
		"\u00038\u001c\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u023b\u0001"+
		"\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023c\u023e\u0003<\u001e\u0000\u023d\u023c\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0250\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u00053\u0000\u0000\u0240\u0241\u0003\u009aM\u0000"+
		"\u0241\u0242\u0005\u00b9\u0000\u0000\u0242\u0246\u0003,\u0016\u0000\u0243"+
		"\u0245\u0003:\u001d\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245\u0248"+
		"\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246"+
		"\u0001\u0000\u0000\u0000\u0249\u024b\u0003>\u001f\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0005%\u0000\u0000\u024d\u024e\u0005\u00ba"+
		"\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u0233\u0001\u0000"+
		"\u0000\u0000\u024f\u023f\u0001\u0000\u0000\u0000\u02507\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0005\u001f\u0000\u0000\u0252\u0253\u0003\u009aM\u0000"+
		"\u0253\u0254\u00030\u0018\u0000\u02549\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\u001f\u0000\u0000\u0256\u0257\u0003\u009aM\u0000\u0257\u0258\u0005"+
		"\u00b9\u0000\u0000\u0258\u0259\u0003,\u0016\u0000\u0259;\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005\u001e\u0000\u0000\u025b\u025c\u00030\u0018\u0000"+
		"\u025c=\u0001\u0000\u0000\u0000\u025d\u025e\u0005\u001e\u0000\u0000\u025e"+
		"\u025f\u0005\u00b9\u0000\u0000\u025f\u0260\u0003,\u0016\u0000\u0260?\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0005`\u0000\u0000\u0262\u0269\u0003\u009a"+
		"M\u0000\u0263\u026a\u00030\u0018\u0000\u0264\u0265\u0005\u00b9\u0000\u0000"+
		"\u0265\u0266\u0003,\u0016\u0000\u0266\u0267\u0005\'\u0000\u0000\u0267"+
		"\u0268\u0005\u00ba\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269"+
		"\u0263\u0001\u0000\u0000\u0000\u0269\u0264\u0001\u0000\u0000\u0000\u026a"+
		"A\u0001\u0000\u0000\u0000\u026b\u026c\u0005\u001a\u0000\u0000\u026c\u026d"+
		"\u00030\u0018\u0000\u026d\u026e\u0005`\u0000\u0000\u026e\u026f\u0003\u009a"+
		"M\u0000\u026f\u0270\u0005\u00ba\u0000\u0000\u0270C\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0005.\u0000\u0000\u0272\u0274\u0005\u00b2\u0000\u0000\u0273"+
		"\u0275\u0003F#\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0274\u0275\u0001"+
		"\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0005"+
		"\u00ba\u0000\u0000\u0277\u0279\u0003\u0098L\u0000\u0278\u0277\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000"+
		"\u0000\u0000\u027a\u027c\u0005\u00ba\u0000\u0000\u027b\u027d\u0003H$\u0000"+
		"\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0285\u0005\u00b3\u0000\u0000"+
		"\u027f\u0286\u00030\u0018\u0000\u0280\u0281\u0005\u00b9\u0000\u0000\u0281"+
		"\u0282\u0003,\u0016\u0000\u0282\u0283\u0005#\u0000\u0000\u0283\u0284\u0005"+
		"\u00ba\u0000\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u027f\u0001"+
		"\u0000\u0000\u0000\u0285\u0280\u0001\u0000\u0000\u0000\u0286E\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0003\u0098L\u0000\u0288G\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0003\u0098L\u0000\u028aI\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0005V\u0000\u0000\u028c\u02a4\u0003\u009aM\u0000\u028d\u028f\u0005\u00b6"+
		"\u0000\u0000\u028e\u0290\u0005\u00ba\u0000\u0000\u028f\u028e\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0294\u0001\u0000"+
		"\u0000\u0000\u0291\u0293\u0003L&\u0000\u0292\u0291\u0001\u0000\u0000\u0000"+
		"\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000"+
		"\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001\u0000\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u02a5\u0005\u00b7\u0000\u0000"+
		"\u0298\u029a\u0005\u00b9\u0000\u0000\u0299\u029b\u0005\u00ba\u0000\u0000"+
		"\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029b\u029f\u0001\u0000\u0000\u0000\u029c\u029e\u0003L&\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0005&\u0000\u0000\u02a3\u02a5\u0005\u00ba\u0000\u0000\u02a4\u028d\u0001"+
		"\u0000\u0000\u0000\u02a4\u0298\u0001\u0000\u0000\u0000\u02a5K\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0005\u0012\u0000\u0000\u02a7\u02aa\u0003\u009c"+
		"N\u0000\u02a8\u02aa\u0005\u0019\u0000\u0000\u02a9\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ad\u0007\u0002\u0000\u0000\u02ac\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b0\u02b1\u0003,\u0016\u0000\u02b1M\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b4\u0005\u0010\u0000\u0000\u02b3\u02b5\u0003\u009cN\u0000\u02b4\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u00ba\u0000\u0000\u02b7O\u0001"+
		"\u0000\u0000\u0000\u02b8\u02ba\u0005\u0017\u0000\u0000\u02b9\u02bb\u0003"+
		"\u009cN\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005\u00ba"+
		"\u0000\u0000\u02bdQ\u0001\u0000\u0000\u0000\u02be\u02c0\u0005S\u0000\u0000"+
		"\u02bf\u02c1\u0003\u009cN\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0005\u00ba\u0000\u0000\u02c3S\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0003\u009cN\u0000\u02c5\u02c6\u0005\u00ba\u0000\u0000\u02c6U\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0005]\u0000\u0000\u02c8\u02c9\u0005\u00b2\u0000"+
		"\u0000\u02c9\u02ca\u0003\u00e2q\u0000\u02ca\u02cb\u0005\u00b3\u0000\u0000"+
		"\u02cb\u02cc\u0005\u00ba\u0000\u0000\u02ccW\u0001\u0000\u0000\u0000\u02cd"+
		"\u02fa\u0005/\u0000\u0000\u02ce\u02cf\u0005\u00b2\u0000\u0000\u02cf\u02d0"+
		"\u0003\u009cN\u0000\u02d0\u02d1\u0005\f\u0000\u0000\u02d1\u02d2\u0003"+
		"\u00a2Q\u0000\u02d2\u02d3\u0005\u00b3\u0000\u0000\u02d3\u02fb\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0005\u00b2\u0000\u0000\u02d5\u02d6\u0003\u00e4"+
		"r\u0000\u02d6\u02d8\u0005\f\u0000\u0000\u02d7\u02d9\u0005\u00a4\u0000"+
		"\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02e0\u0003\u009eO\u0000"+
		"\u02db\u02dd\u0005\u0082\u0000\u0000\u02dc\u02de\u0005\u00a4\u0000\u0000"+
		"\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e1\u0003\u00e4r\u0000\u02e0"+
		"\u02db\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005\u00b3\u0000\u0000\u02e3"+
		"\u02fb\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u00b2\u0000\u0000\u02e5"+
		"\u02e6\u0003\u009cN\u0000\u02e6\u02e7\u0005\f\u0000\u0000\u02e7\u02ed"+
		"\u0003\u009eO\u0000\u02e8\u02ea\u0005\u0082\u0000\u0000\u02e9\u02eb\u0005"+
		"\u00a4\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003"+
		"\u00e4r\u0000\u02ed\u02e8\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u00b3"+
		"\u0000\u0000\u02f0\u02fb\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005\u00b2"+
		"\u0000\u0000\u02f2\u02f3\u0003\u00e4r\u0000\u02f3\u02f4\u0005\f\u0000"+
		"\u0000\u02f4\u02f5\u0005@\u0000\u0000\u02f5\u02f6\u0005\u00b2\u0000\u0000"+
		"\u02f6\u02f7\u0003\u00fa}\u0000\u02f7\u02f8\u0005\u00b3\u0000\u0000\u02f8"+
		"\u02f9\u0005\u00b3\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa"+
		"\u02ce\u0001\u0000\u0000\u0000\u02fa\u02d4\u0001\u0000\u0000\u0000\u02fa"+
		"\u02e4\u0001\u0000\u0000\u0000\u02fa\u02f1\u0001\u0000\u0000\u0000\u02fb"+
		"\u0302\u0001\u0000\u0000\u0000\u02fc\u0303\u00030\u0018\u0000\u02fd\u02fe"+
		"\u0005\u00b9\u0000\u0000\u02fe\u02ff\u0003,\u0016\u0000\u02ff\u0300\u0005"+
		"$\u0000\u0000\u0300\u0301\u0005\u00ba\u0000\u0000\u0301\u0303\u0001\u0000"+
		"\u0000\u0000\u0302\u02fc\u0001\u0000\u0000\u0000\u0302\u02fd\u0001\u0000"+
		"\u0000\u0000\u0303Y\u0001\u0000\u0000\u0000\u0304\u0305\u0005Y\u0000\u0000"+
		"\u0305\u0315\u00034\u001a\u0000\u0306\u0308\u0003\\.\u0000\u0307\u0306"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u0307"+
		"\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c"+
		"\u0001\u0000\u0000\u0000\u030b\u030d\u0003^/\u0000\u030c\u030b\u0001\u0000"+
		"\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u0316\u0001\u0000"+
		"\u0000\u0000\u030e\u0310\u0003\\.\u0000\u030f\u030e\u0001\u0000\u0000"+
		"\u0000\u0310\u0313\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000"+
		"\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0314\u0001\u0000\u0000"+
		"\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0316\u0003^/\u0000\u0315"+
		"\u0307\u0001\u0000\u0000\u0000\u0315\u0311\u0001\u0000\u0000\u0000\u0316"+
		"[\u0001\u0000\u0000\u0000\u0317\u0318\u0005\u0013\u0000\u0000\u0318\u0319"+
		"\u0005\u00b2\u0000\u0000\u0319\u031e\u0003\u00bc^\u0000\u031a\u031b\u0005"+
		"\u00a5\u0000\u0000\u031b\u031d\u0003\u00bc^\u0000\u031c\u031a\u0001\u0000"+
		"\u0000\u0000\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000"+
		"\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0323\u0005\u00be"+
		"\u0000\u0000\u0322\u0321\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000"+
		"\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0005\u00b3"+
		"\u0000\u0000\u0325\u0326\u00034\u001a\u0000\u0326]\u0001\u0000\u0000\u0000"+
		"\u0327\u0328\u0005,\u0000\u0000\u0328\u0329\u00034\u001a\u0000\u0329_"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0005W\u0000\u0000\u032b\u032c\u0003"+
		"\u009cN\u0000\u032c\u032d\u0005\u00ba\u0000\u0000\u032da\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u00052\u0000\u0000\u032f\u0330\u0003\u0100\u0080\u0000"+
		"\u0330\u0331\u0005\u00ba\u0000\u0000\u0331c\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0005\u0018\u0000\u0000\u0333\u0334\u0005\u00b2\u0000\u0000\u0334"+
		"\u0335\u0003f3\u0000\u0335\u033c\u0005\u00b3\u0000\u0000\u0336\u033d\u0003"+
		"0\u0018\u0000\u0337\u0338\u0005\u00b9\u0000\u0000\u0338\u0339\u0003,\u0016"+
		"\u0000\u0339\u033a\u0005\"\u0000\u0000\u033a\u033b\u0005\u00ba\u0000\u0000"+
		"\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u0336\u0001\u0000\u0000\u0000"+
		"\u033c\u0337\u0001\u0000\u0000\u0000\u033de\u0001\u0000\u0000\u0000\u033e"+
		"\u0343\u0003h4\u0000\u033f\u0340\u0005\u00b8\u0000\u0000\u0340\u0342\u0003"+
		"h4\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344g\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000"+
		"\u0346\u0347\u0005d\u0000\u0000\u0347\u034a\u0005\u00bb\u0000\u0000\u0348"+
		"\u034b\u0003\u00d8l\u0000\u0349\u034b\u0005\u00c2\u0000\u0000\u034a\u0348"+
		"\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b\u0353"+
		"\u0001\u0000\u0000\u0000\u034c\u034d\u0005e\u0000\u0000\u034d\u034e\u0005"+
		"\u00bb\u0000\u0000\u034e\u0353\u0005\u00c6\u0000\u0000\u034f\u0350\u0005"+
		"f\u0000\u0000\u0350\u0351\u0005\u00bb\u0000\u0000\u0351\u0353\u0003\u00d8"+
		"l\u0000\u0352\u0346\u0001\u0000\u0000\u0000\u0352\u034c\u0001\u0000\u0000"+
		"\u0000\u0352\u034f\u0001\u0000\u0000\u0000\u0353i\u0001\u0000\u0000\u0000"+
		"\u0354\u0356\u0003l6\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\u0001\u0000\u0000\u0000\u0356\u035b\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0005\u00b8\u0000\u0000\u0358\u035a\u0003l6\u0000\u0359\u0357\u0001\u0000"+
		"\u0000\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035f\u0001\u0000"+
		"\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035e\u0360\u0005\u00b8"+
		"\u0000\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000"+
		"\u0000\u0000\u0360k\u0001\u0000\u0000\u0000\u0361\u0363\u0003&\u0013\u0000"+
		"\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u0367\u0001\u0000\u0000\u0000\u0364\u0366\u0003\u0102\u0081\u0000"+
		"\u0365\u0364\u0001\u0000\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000"+
		"\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000"+
		"\u0368\u036b\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000"+
		"\u036a\u036c\u0005\u00b1\u0000\u0000\u036b\u036a\u0001\u0000\u0000\u0000"+
		"\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0001\u0000\u0000\u0000"+
		"\u036d\u036f\u0003n7\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0371\u0001\u0000\u0000\u0000\u0370\u0372"+
		"\u0005\u00a4\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0001\u0000\u0000\u0000\u0372\u0374\u0001\u0000\u0000\u0000\u0373\u0375"+
		"\u0005\u00a1\u0000\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0374\u0375"+
		"\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377"+
		"\u0003\u008eG\u0000\u0377m\u0001\u0000\u0000\u0000\u0378\u0379\u00067"+
		"\uffff\uffff\u0000\u0379\u037d\u0003\u00bc^\u0000\u037a\u037d\u0005\u0011"+
		"\u0000\u0000\u037b\u037d\u0003\u0106\u0083\u0000\u037c\u0378\u0001\u0000"+
		"\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037c\u037b\u0001\u0000"+
		"\u0000\u0000\u037d\u0383\u0001\u0000\u0000\u0000\u037e\u037f\n\u0001\u0000"+
		"\u0000\u037f\u0380\u0005\u00a5\u0000\u0000\u0380\u0382\u0003n7\u0002\u0381"+
		"\u037e\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000\u0000\u0000\u0383"+
		"\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384"+
		"o\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u00051\u0000\u0000\u0387\u038c\u0003r9\u0000\u0388\u0389\u0005\u00b8"+
		"\u0000\u0000\u0389\u038b\u0003r9\u0000\u038a\u0388\u0001\u0000\u0000\u0000"+
		"\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000"+
		"\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0390\u0005\u00ba\u0000\u0000"+
		"\u0390q\u0001\u0000\u0000\u0000\u0391\u039a\u0005\u00be\u0000\u0000\u0392"+
		"\u0393\u0005\u00af\u0000\u0000\u0393\u039a\u0003\u00e4r\u0000\u0394\u0395"+
		"\u0005\u00af\u0000\u0000\u0395\u0396\u0005\u00b6\u0000\u0000\u0396\u0397"+
		"\u0003\u009cN\u0000\u0397\u0398\u0005\u00b7\u0000\u0000\u0398\u039a\u0001"+
		"\u0000\u0000\u0000\u0399\u0391\u0001\u0000\u0000\u0000\u0399\u0392\u0001"+
		"\u0000\u0000\u0000\u0399\u0394\u0001\u0000\u0000\u0000\u039as\u0001\u0000"+
		"\u0000\u0000\u039b\u039c\u0005\u001d\u0000\u0000\u039c\u039d\u0003\u0098"+
		"L\u0000\u039d\u039e\u0005\u00ba\u0000\u0000\u039eu\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0005T\u0000\u0000\u03a0\u03a5\u0003\u008eG\u0000\u03a1\u03a2"+
		"\u0005\u00b8\u0000\u0000\u03a2\u03a4\u0003\u008eG\u0000\u03a3\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a7\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a8\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005"+
		"\u00ba\u0000\u0000\u03a9w\u0001\u0000\u0000\u0000\u03aa\u03ac\u0003&\u0013"+
		"\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u03df\u0001\u0000\u0000\u0000\u03ad\u03af\u0003\u008aE\u0000"+
		"\u03ae\u03b0\u0003n7\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b6"+
		"\u0003\u008eG\u0000\u03b2\u03b3\u0005\u00b8\u0000\u0000\u03b3\u03b5\u0003"+
		"\u008eG\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u03b8\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b9\u03ba\u0005\u00ba\u0000\u0000\u03ba\u03e0\u0001\u0000"+
		"\u0000\u0000\u03bb\u03bd\u0003\u008cF\u0000\u03bc\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03dd\u0001\u0000\u0000"+
		"\u0000\u03be\u03c0\u0005\u0016\u0000\u0000\u03bf\u03c1\u0003n7\u0000\u03c0"+
		"\u03bf\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c7\u0003\u0090H\u0000\u03c3\u03c4"+
		"\u0005\u00b8\u0000\u0000\u03c4\u03c6\u0003\u0090H\u0000\u03c5\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03ca\u0001"+
		"\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005"+
		"\u00ba\u0000\u0000\u03cb\u03de\u0001\u0000\u0000\u0000\u03cc\u03ce\u0005"+
		"0\u0000\u0000\u03cd\u03cf\u0005\u00a4\u0000\u0000\u03ce\u03cd\u0001\u0000"+
		"\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d2\u0003\u0100\u0080\u0000\u03d1\u03d3\u0003\u001a"+
		"\r\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005\u00b2\u0000"+
		"\u0000\u03d5\u03d6\u0003j5\u0000\u03d6\u03d9\u0005\u00b3\u0000\u0000\u03d7"+
		"\u03da\u0003\u0084B\u0000\u03d8\u03da\u0003\u0086C\u0000\u03d9\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03d9\u03da\u0001"+
		"\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0003"+
		"\u0088D\u0000\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03be\u0001\u0000"+
		"\u0000\u0000\u03dd\u03cc\u0001\u0000\u0000\u0000\u03de\u03e0\u0001\u0000"+
		"\u0000\u0000\u03df\u03ad\u0001\u0000\u0000\u0000\u03df\u03bc\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e6\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005^\u0000"+
		"\u0000\u03e2\u03e3\u0003\u00cae\u0000\u03e3\u03e4\u0003z=\u0000\u03e4"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e5\u03ab\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e6y\u0001\u0000\u0000\u0000\u03e7\u03f1"+
		"\u0005\u00ba\u0000\u0000\u03e8\u03ec\u0005\u00b6\u0000\u0000\u03e9\u03eb"+
		"\u0003|>\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ee\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000"+
		"\u0000\u0000\u03ed\u03ef\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f1\u0005\u00b7\u0000\u0000\u03f0\u03e7\u0001\u0000"+
		"\u0000\u0000\u03f0\u03e8\u0001\u0000\u0000\u0000\u03f1{\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f5\u0003~?\u0000\u03f3\u03f5\u0003\u0080@\u0000\u03f4"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f5"+
		"}\u0001\u0000\u0000\u0000\u03f6\u03f7\u0003\u00c4b\u0000\u03f7\u03f8\u0005"+
		"\u009e\u0000\u0000\u03f8\u03f9\u0003\u0100\u0080\u0000\u03f9\u03fa\u0005"+
		"9\u0000\u0000\u03fa\u03fb\u0003\u00cae\u0000\u03fb\u03fc\u0005\u00ba\u0000"+
		"\u0000\u03fc\u007f\u0001\u0000\u0000\u0000\u03fd\u03fe\u0003\u0082A\u0000"+
		"\u03fe\u0404\u0005\f\u0000\u0000\u03ff\u0405\u0003\u0102\u0081\u0000\u0400"+
		"\u0402\u0003\u0102\u0081\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403"+
		"\u0405\u0003\u0100\u0080\u0000\u0404\u03ff\u0001\u0000\u0000\u0000\u0404"+
		"\u0401\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406"+
		"\u0407\u0005\u00ba\u0000\u0000\u0407\u0081\u0001\u0000\u0000\u0000\u0408"+
		"\u0409\u0003\u00c4b\u0000\u0409\u040a\u0005\u009e\u0000\u0000\u040a\u040c"+
		"\u0001\u0000\u0000\u0000\u040b\u0408\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040e"+
		"\u0003\u0100\u0080\u0000\u040e\u0083\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0005\u00b9\u0000\u0000\u0410\u0412\u0003\u0100\u0080\u0000\u0411\u0413"+
		"\u0003\u00ccf\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001"+
		"\u0000\u0000\u0000\u0413\u0085\u0001\u0000\u0000\u0000\u0414\u0416\u0005"+
		"\u00b9\u0000\u0000\u0415\u0417\u0005\u00b1\u0000\u0000\u0416\u0415\u0001"+
		"\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0001"+
		"\u0000\u0000\u0000\u0418\u0419\u0003n7\u0000\u0419\u0087\u0001\u0000\u0000"+
		"\u0000\u041a\u041d\u0005\u00ba\u0000\u0000\u041b\u041d\u00034\u001a\u0000"+
		"\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041b\u0001\u0000\u0000\u0000"+
		"\u041d\u0089\u0001\u0000\u0000\u0000\u041e\u0421\u0003\u008cF\u0000\u041f"+
		"\u0421\u0005_\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u041f"+
		"\u0001\u0000\u0000\u0000\u0421\u008b\u0001\u0000\u0000\u0000\u0422\u0424"+
		"\u0003\u0102\u0081\u0000\u0423\u0422\u0001\u0000\u0000\u0000\u0424\u0425"+
		"\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000\u0000\u0425\u0426"+
		"\u0001\u0000\u0000\u0000\u0426\u008d\u0001\u0000\u0000\u0000\u0427\u042a"+
		"\u0005\u00be\u0000\u0000\u0428\u0429\u0005\u00bb\u0000\u0000\u0429\u042b"+
		"\u0003\u00d2i\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042a\u042b\u0001"+
		"\u0000\u0000\u0000\u042b\u008f\u0001\u0000\u0000\u0000\u042c\u042d\u0003"+
		"\u0100\u0080\u0000\u042d\u042e\u0005\u00bb\u0000\u0000\u042e\u042f\u0003"+
		"\u00d2i\u0000\u042f\u0091\u0001\u0000\u0000\u0000\u0430\u0432\u0003&\u0013"+
		"\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0005\u0016\u0000"+
		"\u0000\u0434\u0439\u0003\u0090H\u0000\u0435\u0436\u0005\u00b8\u0000\u0000"+
		"\u0436\u0438\u0003\u0090H\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0438"+
		"\u043b\u0001\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u0439"+
		"\u043a\u0001\u0000\u0000\u0000\u043a\u043c\u0001\u0000\u0000\u0000\u043b"+
		"\u0439\u0001\u0000\u0000\u0000\u043c\u043d\u0005\u00ba\u0000\u0000\u043d"+
		"\u0093\u0001\u0000\u0000\u0000\u043e\u043f\u0005!\u0000\u0000\u043f\u0442"+
		"\u0003\u0100\u0080\u0000\u0440\u0441\u0005\u00b9\u0000\u0000\u0441\u0443"+
		"\u0007\u0003\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443"+
		"\u0001\u0000\u0000\u0000\u0443\u0446\u0001\u0000\u0000\u0000\u0444\u0445"+
		"\u00054\u0000\u0000\u0445\u0447\u0003\u0018\f\u0000\u0446\u0444\u0001"+
		"\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448\u0001"+
		"\u0000\u0000\u0000\u0448\u044c\u0005\u00b6\u0000\u0000\u0449\u044b\u0003"+
		"\u0096K\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044e\u0001\u0000"+
		"\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000"+
		"\u0000\u0000\u044d\u044f\u0001\u0000\u0000\u0000\u044e\u044c\u0001\u0000"+
		"\u0000\u0000\u044f\u0450\u0005\u00b7\u0000\u0000\u0450\u0095\u0001\u0000"+
		"\u0000\u0000\u0451\u0452\u0005\u0012\u0000\u0000\u0452\u0455\u0003\u0100"+
		"\u0080\u0000\u0453\u0454\u0005\u00bb\u0000\u0000\u0454\u0456\u0003\u009c"+
		"N\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0458\u0005\u00ba\u0000"+
		"\u0000\u0458\u0462\u0001\u0000\u0000\u0000\u0459\u045b\u0003\u008cF\u0000"+
		"\u045a\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u0462\u0003\u0012\t\u0000\u045d"+
		"\u045e\u0005^\u0000\u0000\u045e\u045f\u0003\u00cae\u0000\u045f\u0460\u0003"+
		"z=\u0000\u0460\u0462\u0001\u0000\u0000\u0000\u0461\u0451\u0001\u0000\u0000"+
		"\u0000\u0461\u045a\u0001\u0000\u0000\u0000\u0461\u045d\u0001\u0000\u0000"+
		"\u0000\u0462\u0097\u0001\u0000\u0000\u0000\u0463\u0468\u0003\u009cN\u0000"+
		"\u0464\u0465\u0005\u00b8\u0000\u0000\u0465\u0467\u0003\u009cN\u0000\u0466"+
		"\u0464\u0001\u0000\u0000\u0000\u0467\u046a\u0001\u0000\u0000\u0000\u0468"+
		"\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469"+
		"\u0099\u0001\u0000\u0000\u0000\u046a\u0468\u0001\u0000\u0000\u0000\u046b"+
		"\u046e\u0005\u00b2\u0000\u0000\u046c\u046f\u0003\u009cN\u0000\u046d\u046f"+
		"\u0003\u00b2Y\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e\u046d\u0001"+
		"\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0471\u0005"+
		"\u00b3\u0000\u0000\u0471\u009b\u0001\u0000\u0000\u0000\u0472\u0473\u0006"+
		"N\uffff\uffff\u0000\u0473\u0474\u0005\u0015\u0000\u0000\u0474\u04cd\u0003"+
		"\u009cN0\u0475\u04cd\u0003\u00aeW\u0000\u0476\u0477\u0003\u00dcn\u0000"+
		"\u0477\u0478\u0005\u00b4\u0000\u0000\u0478\u0479\u0003\u009cN\u0000\u0479"+
		"\u047a\u0005\u00b5\u0000\u0000\u047a\u04cd\u0001\u0000\u0000\u0000\u047b"+
		"\u047c\u0005\u00b2\u0000\u0000\u047c\u047d\u0003\u0108\u0084\u0000\u047d"+
		"\u047e\u0005\u00b3\u0000\u0000\u047e\u047f\u0003\u009cN-\u047f\u04cd\u0001"+
		"\u0000\u0000\u0000\u0480\u0481\u0007\u0004\u0000\u0000\u0481\u04cd\u0003"+
		"\u009cN,\u0482\u0483\u0007\u0005\u0000\u0000\u0483\u04cd\u0003\u009cN"+
		"+\u0484\u0485\u0007\u0006\u0000\u0000\u0485\u04cd\u0003\u00e4r\u0000\u0486"+
		"\u0487\u0003\u00e4r\u0000\u0487\u0488\u0007\u0006\u0000\u0000\u0488\u04cd"+
		"\u0001\u0000\u0000\u0000\u0489\u048a\u0005K\u0000\u0000\u048a\u04cd\u0003"+
		"\u009cN(\u048b\u04cd\u0003\u00a0P\u0000\u048c\u04cd\u0003\u00e4r\u0000"+
		"\u048d\u04cd\u0003\u00d4j\u0000\u048e\u04cd\u0003\u00deo\u0000\u048f\u04cd"+
		"\u0005\u00bf\u0000\u0000\u0490\u04cd\u0005\u00c5\u0000\u0000\u0491\u04cd"+
		"\u0003\u009aM\u0000\u0492\u04cd\u0005a\u0000\u0000\u0493\u0494\u0005@"+
		"\u0000\u0000\u0494\u0495\u0005\u00b2\u0000\u0000\u0495\u0496\u0003\u00fa"+
		"}\u0000\u0496\u0497\u0005\u00b3\u0000\u0000\u0497\u0498\u0005\u00bb\u0000"+
		"\u0000\u0498\u0499\u0003\u009cN\u001f\u0499\u04cd\u0001\u0000\u0000\u0000"+
		"\u049a\u049b\u0005?\u0000\u0000\u049b\u049c\u0005\u00b2\u0000\u0000\u049c"+
		"\u049d\u0003\u00e2q\u0000\u049d\u049e\u0005\u00b3\u0000\u0000\u049e\u04cd"+
		"\u0001\u0000\u0000\u0000\u049f\u04a0\u0005 \u0000\u0000\u04a0\u04a1\u0005"+
		"\u00b2\u0000\u0000\u04a1\u04a2\u0003\u00e4r\u0000\u04a2\u04a3\u0005\u00b3"+
		"\u0000\u0000\u04a3\u04cd\u0001\u0000\u0000\u0000\u04a4\u04a5\u0005(\u0000"+
		"\u0000\u04a5\u04a6\u0005\u00b2\u0000\u0000\u04a6\u04a7\u0003\u009cN\u0000"+
		"\u04a7\u04a8\u0005\u00b3\u0000\u0000\u04a8\u04cd\u0001\u0000\u0000\u0000"+
		"\u04a9\u04ad\u0005)\u0000\u0000\u04aa\u04ab\u0005\u00b2\u0000\u0000\u04ab"+
		"\u04ae\u0005\u00b3\u0000\u0000\u04ac\u04ae\u0003\u009aM\u0000\u04ad\u04aa"+
		"\u0001\u0000\u0000\u0000\u04ad\u04ac\u0001\u0000\u0000\u0000\u04ad\u04ae"+
		"\u0001\u0000\u0000\u0000\u04ae\u04cd\u0001\u0000\u0000\u0000\u04af\u04cd"+
		"\u0003\u00a8T\u0000\u04b0\u04cd\u0003\u00aaU\u0000\u04b1\u04b2\u0007\u0007"+
		"\u0000\u0000\u04b2\u04cd\u0003\u009cN\t\u04b3\u04b4\u0007\b\u0000\u0000"+
		"\u04b4\u04cd\u0003\u009cN\b\u04b5\u04b6\u0005W\u0000\u0000\u04b6\u04cd"+
		"\u0003\u009cN\u0007\u04b7\u04b8\u0003\u00a2Q\u0000\u04b8\u04b9\u0005\u00bb"+
		"\u0000\u0000\u04b9\u04ba\u0003\u009cN\u0006\u04ba\u04cd\u0001\u0000\u0000"+
		"\u0000\u04bb\u04bc\u0003\u009eO\u0000\u04bc\u04be\u0003\u00b0X\u0000\u04bd"+
		"\u04bf\u0003&\u0013\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04be\u04bf"+
		"\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1"+
		"\u0003\u009cN\u0005\u04c1\u04cd\u0001\u0000\u0000\u0000\u04c2\u04c3\u0003"+
		"\u009eO\u0000\u04c3\u04c5\u0005\u00bb\u0000\u0000\u04c4\u04c6\u0003&\u0013"+
		"\u0000\u04c5\u04c4\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04ca\u0005\u00a4\u0000"+
		"\u0000\u04c8\u04cb\u0003\u00e4r\u0000\u04c9\u04cb\u0003\u00aeW\u0000\u04ca"+
		"\u04c8\u0001\u0000\u0000\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb"+
		"\u04cd\u0001\u0000\u0000\u0000\u04cc\u0472\u0001\u0000\u0000\u0000\u04cc"+
		"\u0475\u0001\u0000\u0000\u0000\u04cc\u0476\u0001\u0000\u0000\u0000\u04cc"+
		"\u047b\u0001\u0000\u0000\u0000\u04cc\u0480\u0001\u0000\u0000\u0000\u04cc"+
		"\u0482\u0001\u0000\u0000\u0000\u04cc\u0484\u0001\u0000\u0000\u0000\u04cc"+
		"\u0486\u0001\u0000\u0000\u0000\u04cc\u0489\u0001\u0000\u0000\u0000\u04cc"+
		"\u048b\u0001\u0000\u0000\u0000\u04cc\u048c\u0001\u0000\u0000\u0000\u04cc"+
		"\u048d\u0001\u0000\u0000\u0000\u04cc\u048e\u0001\u0000\u0000\u0000\u04cc"+
		"\u048f\u0001\u0000\u0000\u0000\u04cc\u0490\u0001\u0000\u0000\u0000\u04cc"+
		"\u0491\u0001\u0000\u0000\u0000\u04cc\u0492\u0001\u0000\u0000\u0000\u04cc"+
		"\u0493\u0001\u0000\u0000\u0000\u04cc\u049a\u0001\u0000\u0000\u0000\u04cc"+
		"\u049f\u0001\u0000\u0000\u0000\u04cc\u04a4\u0001\u0000\u0000\u0000\u04cc"+
		"\u04a9\u0001\u0000\u0000\u0000\u04cc\u04af\u0001\u0000\u0000\u0000\u04cc"+
		"\u04b0\u0001\u0000\u0000\u0000\u04cc\u04b1\u0001\u0000\u0000\u0000\u04cc"+
		"\u04b3\u0001\u0000\u0000\u0000\u04cc\u04b5\u0001\u0000\u0000\u0000\u04cc"+
		"\u04b7\u0001\u0000\u0000\u0000\u04cc\u04bb\u0001\u0000\u0000\u0000\u04cc"+
		"\u04c2\u0001\u0000\u0000\u0000\u04cd\u050a\u0001\u0000\u0000\u0000\u04ce"+
		"\u04cf\n\u0018\u0000\u0000\u04cf\u04d0\u0005\u008e\u0000\u0000\u04d0\u0509"+
		"\u0003\u009cN\u0018\u04d1\u04d2\n\u0016\u0000\u0000\u04d2\u04d3\u0007"+
		"\t\u0000\u0000\u04d3\u0509\u0003\u009cN\u0017\u04d4\u04d5\n\u0015\u0000"+
		"\u0000\u04d5\u04d6\u0007\n\u0000\u0000\u04d6\u0509\u0003\u009cN\u0016"+
		"\u04d7\u04d8\n\u0014\u0000\u0000\u04d8\u04d9\u0007\u000b\u0000\u0000\u04d9"+
		"\u0509\u0003\u009cN\u0015\u04da\u04db\n\u0013\u0000\u0000\u04db\u04dc"+
		"\u0007\f\u0000\u0000\u04dc\u0509\u0003\u009cN\u0014\u04dd\u04de\n\u0012"+
		"\u0000\u0000\u04de\u04df\u0007\r\u0000\u0000\u04df\u0509\u0003\u009cN"+
		"\u0013\u04e0\u04e1\n\u0011\u0000\u0000\u04e1\u04e2\u0005\u00a4\u0000\u0000"+
		"\u04e2\u0509\u0003\u009cN\u0012\u04e3\u04e4\n\u0010\u0000\u0000\u04e4"+
		"\u04e5\u0005\u00a7\u0000\u0000\u04e5\u0509\u0003\u009cN\u0011\u04e6\u04e7"+
		"\n\u000f\u0000\u0000\u04e7\u04e8\u0005\u00a5\u0000\u0000\u04e8\u0509\u0003"+
		"\u009cN\u0010\u04e9\u04ea\n\u000e\u0000\u0000\u04ea\u04eb\u0005\u0099"+
		"\u0000\u0000\u04eb\u0509\u0003\u009cN\u000f\u04ec\u04ed\n\r\u0000\u0000"+
		"\u04ed\u04ee\u0005\u0098\u0000\u0000\u04ee\u0509\u0003\u009cN\u000e\u04ef"+
		"\u04f0\n\f\u0000\u0000\u04f0\u04f2\u0005\u00b1\u0000\u0000\u04f1\u04f3"+
		"\u0003\u009cN\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005"+
		"\u00b9\u0000\u0000\u04f5\u0509\u0003\u009cN\r\u04f6\u04f7\n\u000b\u0000"+
		"\u0000\u04f7\u04f8\u0005\u009a\u0000\u0000\u04f8\u0509\u0003\u009cN\f"+
		"\u04f9\u04fa\n\n\u0000\u0000\u04fa\u04fb\u0005\u007f\u0000\u0000\u04fb"+
		"\u0509\u0003\u009cN\u000b\u04fc\u04fd\n\u0003\u0000\u0000\u04fd\u04fe"+
		"\u0005A\u0000\u0000\u04fe\u0509\u0003\u009cN\u0004\u04ff\u0500\n\u0002"+
		"\u0000\u0000\u0500\u0501\u0005C\u0000\u0000\u0501\u0509\u0003\u009cN\u0003"+
		"\u0502\u0503\n\u0001\u0000\u0000\u0503\u0504\u0005B\u0000\u0000\u0504"+
		"\u0509\u0003\u009cN\u0002\u0505\u0506\n\u0017\u0000\u0000\u0506\u0507"+
		"\u00058\u0000\u0000\u0507\u0509\u0003\u00be_\u0000\u0508\u04ce\u0001\u0000"+
		"\u0000\u0000\u0508\u04d1\u0001\u0000\u0000\u0000\u0508\u04d4\u0001\u0000"+
		"\u0000\u0000\u0508\u04d7\u0001\u0000\u0000\u0000\u0508\u04da\u0001\u0000"+
		"\u0000\u0000\u0508\u04dd\u0001\u0000\u0000\u0000\u0508\u04e0\u0001\u0000"+
		"\u0000\u0000\u0508\u04e3\u0001\u0000\u0000\u0000\u0508\u04e6\u0001\u0000"+
		"\u0000\u0000\u0508\u04e9\u0001\u0000\u0000\u0000\u0508\u04ec\u0001\u0000"+
		"\u0000\u0000\u0508\u04ef\u0001\u0000\u0000\u0000\u0508\u04f6\u0001\u0000"+
		"\u0000\u0000\u0508\u04f9\u0001\u0000\u0000\u0000\u0508\u04fc\u0001\u0000"+
		"\u0000\u0000\u0508\u04ff\u0001\u0000\u0000\u0000\u0508\u0502\u0001\u0000"+
		"\u0000\u0000\u0508\u0505\u0001\u0000\u0000\u0000\u0509\u050c\u0001\u0000"+
		"\u0000\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000"+
		"\u0000\u0000\u050b\u009d\u0001\u0000\u0000\u0000\u050c\u050a\u0001\u0000"+
		"\u0000\u0000\u050d\u0510\u0003\u00e4r\u0000\u050e\u0510\u0003\u00a0P\u0000"+
		"\u050f\u050d\u0001\u0000\u0000\u0000\u050f\u050e\u0001\u0000\u0000\u0000"+
		"\u0510\u009f\u0001\u0000\u0000\u0000\u0511\u0512\u0005\u000b\u0000\u0000"+
		"\u0512\u0514\u0005\u00b2\u0000\u0000\u0513\u0515\u0003\u00b4Z\u0000\u0514"+
		"\u0513\u0001\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515"+
		"\u0516\u0001\u0000\u0000\u0000\u0516\u051d\u0005\u00b3\u0000\u0000\u0517"+
		"\u0519\u0005\u00b4\u0000\u0000\u0518\u051a\u0003\u00b4Z\u0000\u0519\u0518"+
		"\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000\u0000\u051a\u051b"+
		"\u0001\u0000\u0000\u0000\u051b\u051d\u0005\u00b5\u0000\u0000\u051c\u0511"+
		"\u0001\u0000\u0000\u0000\u051c\u0517\u0001\u0000\u0000\u0000\u051d\u0522"+
		"\u0001\u0000\u0000\u0000\u051e\u051f\u0005\u00b4\u0000\u0000\u051f\u0520"+
		"\u0003\u009cN\u0000\u0520\u0521\u0005\u00b5\u0000\u0000\u0521\u0523\u0001"+
		"\u0000\u0000\u0000\u0522\u051e\u0001\u0000\u0000\u0000\u0522\u0523\u0001"+
		"\u0000\u0000\u0000\u0523\u00a1\u0001\u0000\u0000\u0000\u0524\u0528\u0005"+
		"\u00b4\u0000\u0000\u0525\u0527\u0005\u00b8\u0000\u0000\u0526\u0525\u0001"+
		"\u0000\u0000\u0000\u0527\u052a\u0001\u0000\u0000\u0000\u0528\u0526\u0001"+
		"\u0000\u0000\u0000\u0528\u0529\u0001\u0000\u0000\u0000\u0529\u052b\u0001"+
		"\u0000\u0000\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052b\u0534\u0003"+
		"\u00a4R\u0000\u052c\u052e\u0005\u00b8\u0000\u0000\u052d\u052c\u0001\u0000"+
		"\u0000\u0000\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u052d\u0001\u0000"+
		"\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000"+
		"\u0000\u0000\u0531\u0533\u0003\u00a4R\u0000\u0532\u052d\u0001\u0000\u0000"+
		"\u0000\u0533\u0536\u0001\u0000\u0000\u0000\u0534\u0532\u0001\u0000\u0000"+
		"\u0000\u0534\u0535\u0001\u0000\u0000\u0000\u0535\u053a\u0001\u0000\u0000"+
		"\u0000\u0536\u0534\u0001\u0000\u0000\u0000\u0537\u0539\u0005\u00b8\u0000"+
		"\u0000\u0538\u0537\u0001\u0000\u0000\u0000\u0539\u053c\u0001\u0000\u0000"+
		"\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b\u0001\u0000\u0000"+
		"\u0000\u053b\u053d\u0001\u0000\u0000\u0000\u053c\u053a\u0001\u0000\u0000"+
		"\u0000\u053d\u053e\u0005\u00b5\u0000\u0000\u053e\u0552\u0001\u0000\u0000"+
		"\u0000\u053f\u0540\u0005\u00b4\u0000\u0000\u0540\u0549\u0003\u00a6S\u0000"+
		"\u0541\u0543\u0005\u00b8\u0000\u0000\u0542\u0541\u0001\u0000\u0000\u0000"+
		"\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0542\u0001\u0000\u0000\u0000"+
		"\u0544\u0545\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000"+
		"\u0546\u0548\u0003\u00a6S\u0000\u0547\u0542\u0001\u0000\u0000\u0000\u0548"+
		"\u054b\u0001\u0000\u0000\u0000\u0549\u0547\u0001\u0000\u0000\u0000\u0549"+
		"\u054a\u0001\u0000\u0000\u0000\u054a\u054d\u0001\u0000\u0000\u0000\u054b"+
		"\u0549\u0001\u0000\u0000\u0000\u054c\u054e\u0005\u00b8\u0000\u0000\u054d"+
		"\u054c\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e"+
		"\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0005\u00b5\u0000\u0000\u0550"+
		"\u0552\u0001\u0000\u0000\u0000\u0551\u0524\u0001\u0000\u0000\u0000\u0551"+
		"\u053f\u0001\u0000\u0000\u0000\u0552\u00a3\u0001\u0000\u0000\u0000\u0553"+
		"\u0555\u0005\u00a4\u0000\u0000\u0554\u0553\u0001\u0000\u0000\u0000\u0554"+
		"\u0555\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000\u0000\u0000\u0556"+
		"\u0557\u0003\u00e4r\u0000\u0557\u00a5\u0001\u0000\u0000\u0000\u0558\u0559"+
		"\u0003\u009cN\u0000\u0559\u055a\u0005\u0082\u0000\u0000\u055a\u055c\u0001"+
		"\u0000\u0000\u0000\u055b\u0558\u0001\u0000\u0000\u0000\u055b\u055c\u0001"+
		"\u0000\u0000\u0000\u055c\u055e\u0001\u0000\u0000\u0000\u055d\u055f\u0005"+
		"\u00a4\u0000\u0000\u055e\u055d\u0001\u0000\u0000\u0000\u055e\u055f\u0001"+
		"\u0000\u0000\u0000\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u0561\u0003"+
		"\u00e4r\u0000\u0561\u00a7\u0001\u0000\u0000\u0000\u0562\u0564\u0005T\u0000"+
		"\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000"+
		"\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0567\u00050\u0000\u0000"+
		"\u0566\u0568\u0005\u00a4\u0000\u0000\u0567\u0566\u0001\u0000\u0000\u0000"+
		"\u0567\u0568\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000"+
		"\u0569\u056a\u0005\u00b2\u0000\u0000\u056a\u056b\u0003j5\u0000\u056b\u056d"+
		"\u0005\u00b3\u0000\u0000\u056c\u056e\u0003\u00b8\\\u0000\u056d\u056c\u0001"+
		"\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u0571\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0005\u00b9\u0000\u0000\u0570\u0572\u0003"+
		"n7\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0571\u0572\u0001\u0000\u0000"+
		"\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0574\u00034\u001a\u0000"+
		"\u0574\u057d\u0001\u0000\u0000\u0000\u0575\u0576\u0005c\u0000\u0000\u0576"+
		"\u0577\u0005\u00b2\u0000\u0000\u0577\u0578\u0003j5\u0000\u0578\u0579\u0005"+
		"\u00b3\u0000\u0000\u0579\u057a\u0005\u0082\u0000\u0000\u057a\u057b\u0003"+
		"\u009cN\u0000\u057b\u057d\u0001\u0000\u0000\u0000\u057c\u0563\u0001\u0000"+
		"\u0000\u0000\u057c\u0575\u0001\u0000\u0000\u0000\u057d\u00a9\u0001\u0000"+
		"\u0000\u0000\u057e\u057f\u0005D\u0000\u0000\u057f\u0580\u0005\u00b2\u0000"+
		"\u0000\u0580\u0581\u0003\u009cN\u0000\u0581\u0582\u0005\u00b3\u0000\u0000"+
		"\u0582\u0583\u0005\u00b6\u0000\u0000\u0583\u0588\u0003\u00acV\u0000\u0584"+
		"\u0585\u0005\u00b8\u0000\u0000\u0585\u0587\u0003\u00acV\u0000\u0586\u0584"+
		"\u0001\u0000\u0000\u0000\u0587\u058a\u0001\u0000\u0000\u0000\u0588\u0586"+
		"\u0001\u0000\u0000\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058c"+
		"\u0001\u0000\u0000\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058b\u058d"+
		"\u0005\u00b8\u0000\u0000\u058c\u058b\u0001\u0000\u0000\u0000\u058c\u058d"+
		"\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e\u058f"+
		"\u0005\u00b7\u0000\u0000\u058f\u00ab\u0001\u0000\u0000\u0000\u0590\u0595"+
		"\u0003\u009cN\u0000\u0591\u0592\u0005\u00b8\u0000\u0000\u0592\u0594\u0003"+
		"\u009cN\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0594\u0597\u0001\u0000"+
		"\u0000\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0595\u0596\u0001\u0000"+
		"\u0000\u0000\u0596\u0598\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000"+
		"\u0000\u0000\u0598\u0599\u0005\u0082\u0000\u0000\u0599\u059a\u0003\u009c"+
		"N\u0000\u059a\u00ad\u0001\u0000\u0000\u0000\u059b\u059c\u0005F\u0000\u0000"+
		"\u059c\u059e\u0003\u00be_\u0000\u059d\u059f\u0003\u00ccf\u0000\u059e\u059d"+
		"\u0001\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000\u059f\u00af"+
		"\u0001\u0000\u0000\u0000\u05a0\u05a1\u0007\u000e\u0000\u0000\u05a1\u00b1"+
		"\u0001\u0000\u0000\u0000\u05a2\u05aa\u0005a\u0000\u0000\u05a3\u05a6\u0003"+
		"\u009cN\u0000\u05a4\u05a5\u0005\u0082\u0000\u0000\u05a5\u05a7\u0003\u009c"+
		"N\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a7\u05ab\u0001\u0000\u0000\u0000\u05a8\u05a9\u0005b\u0000\u0000"+
		"\u05a9\u05ab\u0003\u009cN\u0000\u05aa\u05a3\u0001\u0000\u0000\u0000\u05aa"+
		"\u05a8\u0001\u0000\u0000\u0000\u05ab\u00b3\u0001\u0000\u0000\u0000\u05ac"+
		"\u05b1\u0003\u00b6[\u0000\u05ad\u05ae\u0005\u00b8\u0000\u0000\u05ae\u05b0"+
		"\u0003\u00b6[\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05b0\u05b3\u0001"+
		"\u0000\u0000\u0000\u05b1\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001"+
		"\u0000\u0000\u0000\u05b2\u05b5\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b6\u0005\u00b8\u0000\u0000\u05b5\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b5\u05b6\u0001\u0000\u0000\u0000\u05b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u05b7\u05ba\u0003\u009cN\u0000\u05b8\u05b9\u0005\u0082"+
		"\u0000\u0000\u05b9\u05bb\u0003\u009cN\u0000\u05ba\u05b8\u0001\u0000\u0000"+
		"\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb\u05c4\u0001\u0000\u0000"+
		"\u0000\u05bc\u05bd\u0003\u009cN\u0000\u05bd\u05be\u0005\u0082\u0000\u0000"+
		"\u05be\u05c0\u0001\u0000\u0000\u0000\u05bf\u05bc\u0001\u0000\u0000\u0000"+
		"\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000"+
		"\u05c1\u05c2\u0005\u00a4\u0000\u0000\u05c2\u05c4\u0003\u00e4r\u0000\u05c3"+
		"\u05b7\u0001\u0000\u0000\u0000\u05c3\u05bf\u0001\u0000\u0000\u0000\u05c4"+
		"\u00b7\u0001\u0000\u0000\u0000\u05c5\u05c6\u0005^\u0000\u0000\u05c6\u05c7"+
		"\u0005\u00b2\u0000\u0000\u05c7\u05cc\u0003\u00ba]\u0000\u05c8\u05c9\u0005"+
		"\u00b8\u0000\u0000\u05c9\u05cb\u0003\u00ba]\u0000\u05ca\u05c8\u0001\u0000"+
		"\u0000\u0000\u05cb\u05ce\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000"+
		"\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000\u05cd\u05cf\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cc\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005\u00b3"+
		"\u0000\u0000\u05d0\u00b9\u0001\u0000\u0000\u0000\u05d1\u05d3\u0005\u00a4"+
		"\u0000\u0000\u05d2\u05d1\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d3\u05d4\u0001\u0000\u0000\u0000\u05d4\u05d5\u0005\u00be"+
		"\u0000\u0000\u05d5\u00bb\u0001\u0000\u0000\u0000\u05d6\u05d8\u0003\u00c4"+
		"b\u0000\u05d7\u05d9\u0003$\u0012\u0000\u05d8\u05d7\u0001\u0000\u0000\u0000"+
		"\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05dc\u0001\u0000\u0000\u0000"+
		"\u05da\u05dc\u0005T\u0000\u0000\u05db\u05d6\u0001\u0000\u0000\u0000\u05db"+
		"\u05da\u0001\u0000\u0000\u0000\u05dc\u00bd\u0001\u0000\u0000\u0000\u05dd"+
		"\u05e0\u0003\u00c4b\u0000\u05de\u05e0\u0003\u00c2a\u0000\u05df\u05dd\u0001"+
		"\u0000\u0000\u0000\u05df\u05de\u0001\u0000\u0000\u0000\u05e0\u05e2\u0001"+
		"\u0000\u0000\u0000\u05e1\u05e3\u0003$\u0012\u0000\u05e2\u05e1\u0001\u0000"+
		"\u0000\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e8\u0001\u0000"+
		"\u0000\u0000\u05e4\u05e8\u0003\u0106\u0083\u0000\u05e5\u05e8\u0005T\u0000"+
		"\u0000\u05e6\u05e8\u0003\u00c0`\u0000\u05e7\u05df\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e4\u0001\u0000\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000\u0000"+
		"\u05e7\u05e6\u0001\u0000\u0000\u0000\u05e8\u00bf\u0001\u0000\u0000\u0000"+
		"\u05e9\u05eb\u0003&\u0013\u0000\u05ea\u05e9\u0001\u0000\u0000\u0000\u05ea"+
		"\u05eb\u0001\u0000\u0000\u0000\u05eb\u05ed\u0001\u0000\u0000\u0000\u05ec"+
		"\u05ee\u0005L\u0000\u0000\u05ed\u05ec\u0001\u0000\u0000\u0000\u05ed\u05ee"+
		"\u0001\u0000\u0000\u0000\u05ee\u05f0\u0001\u0000\u0000\u0000\u05ef\u05f1"+
		"\u0003\u00fe\u007f\u0000\u05f0\u05ef\u0001\u0000\u0000\u0000\u05f0\u05f1"+
		"\u0001\u0000\u0000\u0000\u05f1\u05f3\u0001\u0000\u0000\u0000\u05f2\u05f4"+
		"\u0005J\u0000\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001"+
		"\u0000\u0000\u0000\u05f4\u060a\u0001\u0000\u0000\u0000\u05f5\u05f7\u0003"+
		"\u0016\u000b\u0000\u05f6\u05f8\u0003\u001a\r\u0000\u05f7\u05f6\u0001\u0000"+
		"\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000\u0000\u05f8\u05fb\u0001\u0000"+
		"\u0000\u0000\u05f9\u05fa\u0005*\u0000\u0000\u05fa\u05fc\u0003\u00bc^\u0000"+
		"\u05fb\u05f9\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000"+
		"\u05fc\u05ff\u0001\u0000\u0000\u0000\u05fd\u05fe\u00054\u0000\u0000\u05fe"+
		"\u0600\u0003\u0018\f\u0000\u05ff\u05fd\u0001\u0000\u0000\u0000\u05ff\u0600"+
		"\u0001\u0000\u0000\u0000\u0600\u060b\u0001\u0000\u0000\u0000\u0601\u0602"+
		"\u0005>\u0000\u0000\u0602\u0604\u0003\u0100\u0080\u0000\u0603\u0605\u0003"+
		"\u001a\r\u0000\u0604\u0603\u0001\u0000\u0000\u0000\u0604\u0605\u0001\u0000"+
		"\u0000\u0000\u0605\u0608\u0001\u0000\u0000\u0000\u0606\u0607\u0005*\u0000"+
		"\u0000\u0607\u0609\u0003\u0018\f\u0000\u0608\u0606\u0001\u0000\u0000\u0000"+
		"\u0608\u0609\u0001\u0000\u0000\u0000\u0609\u060b\u0001\u0000\u0000\u0000"+
		"\u060a\u05f5\u0001\u0000\u0000\u0000\u060a\u0601\u0001\u0000\u0000\u0000"+
		"\u060b\u060c\u0001\u0000\u0000\u0000\u060c\u0610\u0005\u00b6\u0000\u0000"+
		"\u060d\u060f\u0003x<\u0000\u060e\u060d\u0001\u0000\u0000\u0000\u060f\u0612"+
		"\u0001\u0000\u0000\u0000\u0610\u060e\u0001\u0000\u0000\u0000\u0610\u0611"+
		"\u0001\u0000\u0000\u0000\u0611\u0613\u0001\u0000\u0000\u0000\u0612\u0610"+
		"\u0001\u0000\u0000\u0000\u0613\u0614\u0005\u00b7\u0000\u0000\u0614\u00c1"+
		"\u0001\u0000\u0000\u0000\u0615\u061a\u0003\u00f0x\u0000\u0616\u0617\u0005"+
		"\u009f\u0000\u0000\u0617\u0619\u0003\u00f2y\u0000\u0618\u0616\u0001\u0000"+
		"\u0000\u0000\u0619\u061c\u0001\u0000\u0000\u0000\u061a\u0618\u0001\u0000"+
		"\u0000\u0000\u061a\u061b\u0001\u0000\u0000\u0000\u061b\u00c3\u0001\u0000"+
		"\u0000\u0000\u061c\u061a\u0001\u0000\u0000\u0000\u061d\u061f\u0005E\u0000"+
		"\u0000\u061e\u061d\u0001\u0000\u0000\u0000\u061e\u061f\u0001\u0000\u0000"+
		"\u0000\u061f\u0621\u0001\u0000\u0000\u0000\u0620\u0622\u0005\u00a0\u0000"+
		"\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000"+
		"\u0000\u0622\u0623\u0001\u0000\u0000\u0000\u0623\u0624\u0003\u00c6c\u0000"+
		"\u0624\u00c5\u0001\u0000\u0000\u0000\u0625\u0633\u0003\u0100\u0080\u0000"+
		"\u0626\u062b\u0003\u0100\u0080\u0000\u0627\u0628\u0005\u00a0\u0000\u0000"+
		"\u0628\u062a\u0003\u0100\u0080\u0000\u0629\u0627\u0001\u0000\u0000\u0000"+
		"\u062a\u062d\u0001\u0000\u0000\u0000\u062b\u0629\u0001\u0000\u0000\u0000"+
		"\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u0630\u0001\u0000\u0000\u0000"+
		"\u062d\u062b\u0001\u0000\u0000\u0000\u062e\u062f\u0005\u00a0\u0000\u0000"+
		"\u062f\u0631\u0003\u00c8d\u0000\u0630\u062e\u0001\u0000\u0000\u0000\u0630"+
		"\u0631\u0001\u0000\u0000\u0000\u0631\u0633\u0001\u0000\u0000\u0000\u0632"+
		"\u0625\u0001\u0000\u0000\u0000\u0632\u0626\u0001\u0000\u0000\u0000\u0633"+
		"\u00c7\u0001\u0000\u0000\u0000\u0634\u0637\u0003\u0100\u0080\u0000\u0635"+
		"\u0636\u0005\f\u0000\u0000\u0636\u0638\u0003\u0100\u0080\u0000\u0637\u0635"+
		"\u0001\u0000\u0000\u0000\u0637\u0638\u0001\u0000\u0000\u0000\u0638\u0648"+
		"\u0001\u0000\u0000\u0000\u0639\u063a\u0005\u00b6\u0000\u0000\u063a\u063f"+
		"\u0003\u00c8d\u0000\u063b\u063c\u0005\u00b8\u0000\u0000\u063c\u063e\u0003"+
		"\u00c8d\u0000\u063d\u063b\u0001\u0000\u0000\u0000\u063e\u0641\u0001\u0000"+
		"\u0000\u0000\u063f\u063d\u0001\u0000\u0000\u0000\u063f\u0640\u0001\u0000"+
		"\u0000\u0000\u0640\u0643\u0001\u0000\u0000\u0000\u0641\u063f\u0001\u0000"+
		"\u0000\u0000\u0642\u0644\u0005\u00b8\u0000\u0000\u0643\u0642\u0001\u0000"+
		"\u0000\u0000\u0643\u0644\u0001\u0000\u0000\u0000\u0644\u0645\u0001\u0000"+
		"\u0000\u0000\u0645\u0646\u0005\u00b7\u0000\u0000\u0646\u0648\u0001\u0000"+
		"\u0000\u0000\u0647\u0634\u0001\u0000\u0000\u0000\u0647\u0639\u0001\u0000"+
		"\u0000\u0000\u0648\u00c9\u0001\u0000\u0000\u0000\u0649\u064e\u0003\u00c4"+
		"b\u0000\u064a\u064b\u0005\u00b8\u0000\u0000\u064b\u064d\u0003\u00c4b\u0000"+
		"\u064c\u064a\u0001\u0000\u0000\u0000\u064d\u0650\u0001\u0000\u0000\u0000"+
		"\u064e\u064c\u0001\u0000\u0000\u0000\u064e\u064f\u0001\u0000\u0000\u0000"+
		"\u064f\u00cb\u0001\u0000\u0000\u0000\u0650\u064e\u0001\u0000\u0000\u0000"+
		"\u0651\u065b\u0005\u00b2\u0000\u0000\u0652\u0657\u0003\u00ceg\u0000\u0653"+
		"\u0654\u0005\u00b8\u0000\u0000\u0654\u0656\u0003\u00ceg\u0000\u0655\u0653"+
		"\u0001\u0000\u0000\u0000\u0656\u0659\u0001\u0000\u0000\u0000\u0657\u0655"+
		"\u0001\u0000\u0000\u0000\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u065c"+
		"\u0001\u0000\u0000\u0000\u0659\u0657\u0001\u0000\u0000\u0000\u065a\u065c"+
		"\u0003\u00b2Y\u0000\u065b\u0652\u0001\u0000\u0000\u0000\u065b\u065a\u0001"+
		"\u0000\u0000\u0000\u065b\u065c\u0001\u0000\u0000\u0000\u065c\u065e\u0001"+
		"\u0000\u0000\u0000\u065d\u065f\u0005\u00b8\u0000\u0000\u065e\u065d\u0001"+
		"\u0000\u0000\u0000\u065e\u065f\u0001\u0000\u0000\u0000\u065f\u0660\u0001"+
		"\u0000\u0000\u0000\u0660\u0661\u0005\u00b3\u0000\u0000\u0661\u00cd\u0001"+
		"\u0000\u0000\u0000\u0662\u0664\u0003\u00d0h\u0000\u0663\u0662\u0001\u0000"+
		"\u0000\u0000\u0663\u0664\u0001\u0000\u0000\u0000\u0664\u0666\u0001\u0000"+
		"\u0000\u0000\u0665\u0667\u0005\u00a1\u0000\u0000\u0666\u0665\u0001\u0000"+
		"\u0000\u0000\u0666\u0667\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000"+
		"\u0000\u0000\u0668\u066c\u0003\u009cN\u0000\u0669\u066a\u0005\u00a4\u0000"+
		"\u0000\u066a\u066c\u0003\u00e4r\u0000\u066b\u0663\u0001\u0000\u0000\u0000"+
		"\u066b\u0669\u0001\u0000\u0000\u0000\u066c\u00cf\u0001\u0000\u0000\u0000"+
		"\u066d\u066e\u0003\u0100\u0080\u0000\u066e\u066f\u0005\u00b9\u0000\u0000"+
		"\u066f\u00d1\u0001\u0000\u0000\u0000\u0670\u0694\u0003\u00d4j\u0000\u0671"+
		"\u0694\u0003\u00deo\u0000\u0672\u0673\u0005\u000b\u0000\u0000\u0673\u0678"+
		"\u0005\u00b2\u0000\u0000\u0674\u0676\u0003\u00b4Z\u0000\u0675\u0677\u0005"+
		"\u00b8\u0000\u0000\u0676\u0675\u0001\u0000\u0000\u0000\u0676\u0677\u0001"+
		"\u0000\u0000\u0000\u0677\u0679\u0001\u0000\u0000\u0000\u0678\u0674\u0001"+
		"\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000\u0000\u0679\u067a\u0001"+
		"\u0000\u0000\u0000\u067a\u0694\u0005\u00b3\u0000\u0000\u067b\u0680\u0005"+
		"\u00b4\u0000\u0000\u067c\u067e\u0003\u00b4Z\u0000\u067d\u067f\u0005\u00b8"+
		"\u0000\u0000\u067e\u067d\u0001\u0000\u0000\u0000\u067e\u067f\u0001\u0000"+
		"\u0000\u0000\u067f\u0681\u0001\u0000\u0000\u0000\u0680\u067c\u0001\u0000"+
		"\u0000\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0682\u0001\u0000"+
		"\u0000\u0000\u0682\u0694\u0005\u00b5\u0000\u0000\u0683\u0684\u0007\u000f"+
		"\u0000\u0000\u0684\u0694\u0003\u00d2i\u0000\u0685\u0688\u0003\u00deo\u0000"+
		"\u0686\u0688\u0003\u00d4j\u0000\u0687\u0685\u0001\u0000\u0000\u0000\u0687"+
		"\u0686\u0001\u0000\u0000\u0000\u0688\u0690\u0001\u0000\u0000\u0000\u0689"+
		"\u068c\u0005\u00b0\u0000\u0000\u068a\u068d\u0003\u00deo\u0000\u068b\u068d"+
		"\u0003\u00d4j\u0000\u068c\u068a\u0001\u0000\u0000\u0000\u068c\u068b\u0001"+
		"\u0000\u0000\u0000\u068d\u068f\u0001\u0000\u0000\u0000\u068e\u0689\u0001"+
		"\u0000\u0000\u0000\u068f\u0692\u0001\u0000\u0000\u0000\u0690\u068e\u0001"+
		"\u0000\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0694\u0001"+
		"\u0000\u0000\u0000\u0692\u0690\u0001\u0000\u0000\u0000\u0693\u0670\u0001"+
		"\u0000\u0000\u0000\u0693\u0671\u0001\u0000\u0000\u0000\u0693\u0672\u0001"+
		"\u0000\u0000\u0000\u0693\u067b\u0001\u0000\u0000\u0000\u0693\u0683\u0001"+
		"\u0000\u0000\u0000\u0693\u0687\u0001\u0000\u0000\u0000\u0694\u00d3\u0001"+
		"\u0000\u0000\u0000\u0695\u069b\u0005G\u0000\u0000\u0696\u069b\u0003\u00d6"+
		"k\u0000\u0697\u069b\u0003\u0104\u0082\u0000\u0698\u069b\u0003\u00dam\u0000"+
		"\u0699\u069b\u0003\u00c4b\u0000\u069a\u0695\u0001\u0000\u0000\u0000\u069a"+
		"\u0696\u0001\u0000\u0000\u0000\u069a\u0697\u0001\u0000\u0000\u0000\u069a"+
		"\u0698\u0001\u0000\u0000\u0000\u069a\u0699\u0001\u0000\u0000\u0000\u069b"+
		"\u00d5\u0001\u0000\u0000\u0000\u069c\u06a1\u0005\u00c2\u0000\u0000\u069d"+
		"\u06a1\u0005\u000f\u0000\u0000\u069e\u06a1\u0003\u00d8l\u0000\u069f\u06a1"+
		"\u0003\u00dcn\u0000\u06a0\u069c\u0001\u0000\u0000\u0000\u06a0\u069d\u0001"+
		"\u0000\u0000\u0000\u06a0\u069e\u0001\u0000\u0000\u0000\u06a0\u069f\u0001"+
		"\u0000\u0000\u0000\u06a1\u00d7\u0001\u0000\u0000\u0000\u06a2\u06a3\u0007"+
		"\u0010\u0000\u0000\u06a3\u00d9\u0001\u0000\u0000\u0000\u06a4\u06a5\u0007"+
		"\u0011\u0000\u0000\u06a5\u06aa\u0005\u009e\u0000\u0000\u06a6\u06ab\u0003"+
		"\u0100\u0080\u0000\u06a7\u06ab\u0005k\u0000\u0000\u06a8\u06ab\u0005g\u0000"+
		"\u0000\u06a9\u06ab\u0005h\u0000\u0000\u06aa\u06a6\u0001\u0000\u0000\u0000"+
		"\u06aa\u06a7\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000\u0000\u0000"+
		"\u06aa\u06a9\u0001\u0000\u0000\u0000\u06ab\u06b7\u0001\u0000\u0000\u0000"+
		"\u06ac\u06b0\u0003\u00bc^\u0000\u06ad\u06b0\u0003\u00f6{\u0000\u06ae\u06b0"+
		"\u0003\u00deo\u0000\u06af\u06ac\u0001\u0000\u0000\u0000\u06af\u06ad\u0001"+
		"\u0000\u0000\u0000\u06af\u06ae\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001"+
		"\u0000\u0000\u0000\u06b1\u06b4\u0005\u009e\u0000\u0000\u06b2\u06b5\u0003"+
		"\u0100\u0080\u0000\u06b3\u06b5\u0003\u00f6{\u0000\u06b4\u06b2\u0001\u0000"+
		"\u0000\u0000\u06b4\u06b3\u0001\u0000\u0000\u0000\u06b5\u06b7\u0001\u0000"+
		"\u0000\u0000\u06b6\u06a4\u0001\u0000\u0000\u0000\u06b6\u06af\u0001\u0000"+
		"\u0000\u0000\u06b7\u00db\u0001\u0000\u0000\u0000\u06b8\u06b9\u0005\u00bf"+
		"\u0000\u0000\u06b9\u00dd\u0001\u0000\u0000\u0000\u06ba\u06bc\u0005\u00c9"+
		"\u0000\u0000\u06bb\u06bd\u0005\u00d1\u0000\u0000\u06bc\u06bb\u0001\u0000"+
		"\u0000\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be\u06bc\u0001\u0000"+
		"\u0000\u0000\u06be\u06bf\u0001\u0000\u0000\u0000\u06bf\u06d0\u0001\u0000"+
		"\u0000\u0000\u06c0\u06c2\u0005\u00c8\u0000\u0000\u06c1\u06c3\u0005\u00d1"+
		"\u0000\u0000\u06c2\u06c1\u0001\u0000\u0000\u0000\u06c3\u06c4\u0001\u0000"+
		"\u0000\u0000\u06c4\u06c2\u0001\u0000\u0000\u0000\u06c4\u06c5\u0001\u0000"+
		"\u0000\u0000\u06c5\u06d0\u0001\u0000\u0000\u0000\u06c6\u06d0\u0005\u00c6"+
		"\u0000\u0000\u06c7\u06cb\u0005\u00c7\u0000\u0000\u06c8\u06ca\u0003\u00e0"+
		"p\u0000\u06c9\u06c8\u0001\u0000\u0000\u0000\u06ca\u06cd\u0001\u0000\u0000"+
		"\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000"+
		"\u0000\u06cc\u06ce\u0001\u0000\u0000\u0000\u06cd\u06cb\u0001\u0000\u0000"+
		"\u0000\u06ce\u06d0\u0005\u00c7\u0000\u0000\u06cf\u06ba\u0001\u0000\u0000"+
		"\u0000\u06cf\u06c0\u0001\u0000\u0000\u0000\u06cf\u06c6\u0001\u0000\u0000"+
		"\u0000\u06cf\u06c7\u0001\u0000\u0000\u0000\u06d0\u00df\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d5\u0005\u00cd\u0000\u0000\u06d2\u06d5\u0005\u00cc\u0000"+
		"\u0000\u06d3\u06d5\u0003\u00e4r\u0000\u06d4\u06d1\u0001\u0000\u0000\u0000"+
		"\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d4\u06d3\u0001\u0000\u0000\u0000"+
		"\u06d5\u00e1\u0001\u0000\u0000\u0000\u06d6\u06db\u0003\u00e4r\u0000\u06d7"+
		"\u06d8\u0005\u00b8\u0000\u0000\u06d8\u06da\u0003\u00e4r\u0000\u06d9\u06d7"+
		"\u0001\u0000\u0000\u0000\u06da\u06dd\u0001\u0000\u0000\u0000\u06db\u06d9"+
		"\u0001\u0000\u0000\u0000\u06db\u06dc\u0001\u0000\u0000\u0000\u06dc\u00e3"+
		"\u0001\u0000\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06de\u06e2"+
		"\u0003\u00e6s\u0000\u06df\u06e1\u0003\u00e8t\u0000\u06e0\u06df\u0001\u0000"+
		"\u0000\u0000\u06e1\u06e4\u0001\u0000\u0000\u0000\u06e2\u06e0\u0001\u0000"+
		"\u0000\u0000\u06e2\u06e3\u0001\u0000\u0000\u0000\u06e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u06e4\u06e2\u0001\u0000\u0000\u0000\u06e5\u06ec\u0003\u00f0"+
		"x\u0000\u06e6\u06ec\u0003\u00eau\u0000\u06e7\u06e8\u0005\u00b2\u0000\u0000"+
		"\u06e8\u06e9\u0003\u00aeW\u0000\u06e9\u06ea\u0005\u00b3\u0000\u0000\u06ea"+
		"\u06ec\u0001\u0000\u0000\u0000\u06eb\u06e5\u0001\u0000\u0000\u0000\u06eb"+
		"\u06e6\u0001\u0000\u0000\u0000\u06eb\u06e7\u0001\u0000\u0000\u0000\u06ec"+
		"\u00e7\u0001\u0000\u0000\u0000\u06ed\u06ee\u0005\u009f\u0000\u0000\u06ee"+
		"\u06f0\u0003\u00f2y\u0000\u06ef\u06f1\u0003\u00eew\u0000\u06f0\u06ef\u0001"+
		"\u0000\u0000\u0000\u06f0\u06f1\u0001\u0000\u0000\u0000\u06f1\u00e9\u0001"+
		"\u0000\u0000\u0000\u06f2\u06f3\u0003\u00ecv\u0000\u06f3\u06f4\u0003\u00ee"+
		"w\u0000\u06f4\u00eb\u0001\u0000\u0000\u0000\u06f5\u06fa\u0003\u00c4b\u0000"+
		"\u06f6\u06fa\u0003\u00dam\u0000\u06f7\u06fa\u0003\u00f0x\u0000\u06f8\u06fa"+
		"\u0003\u009aM\u0000\u06f9\u06f5\u0001\u0000\u0000\u0000\u06f9\u06f6\u0001"+
		"\u0000\u0000\u0000\u06f9\u06f7\u0001\u0000\u0000\u0000\u06f9\u06f8\u0001"+
		"\u0000\u0000\u0000\u06fa\u00ed\u0001\u0000\u0000\u0000\u06fb\u06fd\u0003"+
		"$\u0012\u0000\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000"+
		"\u0000\u0000\u06fd\u06ff\u0001\u0000\u0000\u0000\u06fe\u0700\u0003\u00cc"+
		"f\u0000\u06ff\u06fe\u0001\u0000\u0000\u0000\u0700\u0701\u0001\u0000\u0000"+
		"\u0000\u0701\u06ff\u0001\u0000\u0000\u0000\u0701\u0702\u0001\u0000\u0000"+
		"\u0000\u0702\u0706\u0001\u0000\u0000\u0000\u0703\u0705\u0003\u00f8|\u0000"+
		"\u0704\u0703\u0001\u0000\u0000\u0000\u0705\u0708\u0001\u0000\u0000\u0000"+
		"\u0706\u0704\u0001\u0000\u0000\u0000\u0706\u0707\u0001\u0000\u0000\u0000"+
		"\u0707\u00ef\u0001\u0000\u0000\u0000\u0708\u0706\u0001\u0000\u0000\u0000"+
		"\u0709\u070c\u0003\u00f6{\u0000\u070a\u070b\u0005\u009e\u0000\u0000\u070b"+
		"\u070d\u0003\u00f6{\u0000\u070c\u070a\u0001\u0000\u0000\u0000\u070c\u070d"+
		"\u0001\u0000\u0000\u0000\u070d\u0713\u0001\u0000\u0000\u0000\u070e\u070f"+
		"\u0003\u00bc^\u0000\u070f\u0710\u0005\u009e\u0000\u0000\u0710\u0711\u0003"+
		"\u00f6{\u0000\u0711\u0713\u0001\u0000\u0000\u0000\u0712\u0709\u0001\u0000"+
		"\u0000\u0000\u0712\u070e\u0001\u0000\u0000\u0000\u0713\u00f1\u0001\u0000"+
		"\u0000\u0000\u0714\u0717\u0003\u00f4z\u0000\u0715\u0717\u0003\u00f6{\u0000"+
		"\u0716\u0714\u0001\u0000\u0000\u0000\u0716\u0715\u0001\u0000\u0000\u0000"+
		"\u0717\u00f3\u0001\u0000\u0000\u0000\u0718\u071e\u0003\u0100\u0080\u0000"+
		"\u0719\u071a\u0005\u00b6\u0000\u0000\u071a\u071b\u0003\u009cN\u0000\u071b"+
		"\u071c\u0005\u00b7\u0000\u0000\u071c\u071e\u0001\u0000\u0000\u0000\u071d"+
		"\u0718\u0001\u0000\u0000\u0000\u071d\u0719\u0001\u0000\u0000\u0000\u071e"+
		"\u0722\u0001\u0000\u0000\u0000\u071f\u0721\u0003\u00f8|\u0000\u0720\u071f"+
		"\u0001\u0000\u0000\u0000\u0721\u0724\u0001\u0000\u0000\u0000\u0722\u0720"+
		"\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u00f5"+
		"\u0001\u0000\u0000\u0000\u0724\u0722\u0001\u0000\u0000\u0000\u0725\u0727"+
		"\u0005\u00af\u0000\u0000\u0726\u0725\u0001\u0000\u0000\u0000\u0727\u072a"+
		"\u0001\u0000\u0000\u0000\u0728\u0726\u0001\u0000\u0000\u0000\u0728\u0729"+
		"\u0001\u0000\u0000\u0000\u0729\u0731\u0001\u0000\u0000\u0000\u072a\u0728"+
		"\u0001\u0000\u0000\u0000\u072b\u0732\u0005\u00be\u0000\u0000\u072c\u072d"+
		"\u0005\u00af\u0000\u0000\u072d\u072e\u0005\u00b6\u0000\u0000\u072e\u072f"+
		"\u0003\u009cN\u0000\u072f\u0730\u0005\u00b7\u0000\u0000\u0730\u0732\u0001"+
		"\u0000\u0000\u0000\u0731\u072b\u0001\u0000\u0000\u0000\u0731\u072c\u0001"+
		"\u0000\u0000\u0000\u0732\u0736\u0001\u0000\u0000\u0000\u0733\u0735\u0003"+
		"\u00f8|\u0000\u0734\u0733\u0001\u0000\u0000\u0000\u0735\u0738\u0001\u0000"+
		"\u0000\u0000\u0736\u0734\u0001\u0000\u0000\u0000\u0736\u0737\u0001\u0000"+
		"\u0000\u0000\u0737\u00f7\u0001\u0000\u0000\u0000\u0738\u0736\u0001\u0000"+
		"\u0000\u0000\u0739\u073b\u0005\u00b4\u0000\u0000\u073a\u073c\u0003\u009c"+
		"N\u0000\u073b\u073a\u0001\u0000\u0000\u0000\u073b\u073c\u0001\u0000\u0000"+
		"\u0000\u073c\u073d\u0001\u0000\u0000\u0000\u073d\u0743\u0005\u00b5\u0000"+
		"\u0000\u073e\u073f\u0005\u00b6\u0000\u0000\u073f\u0740\u0003\u009cN\u0000"+
		"\u0740\u0741\u0005\u00b7\u0000\u0000\u0741\u0743\u0001\u0000\u0000\u0000"+
		"\u0742\u0739\u0001\u0000\u0000\u0000\u0742\u073e\u0001\u0000\u0000\u0000"+
		"\u0743\u00f9\u0001\u0000\u0000\u0000\u0744\u0746\u0003\u00fc~\u0000\u0745"+
		"\u0744\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746"+
		"\u074d\u0001\u0000\u0000\u0000\u0747\u0749\u0005\u00b8\u0000\u0000\u0748"+
		"\u074a\u0003\u00fc~\u0000\u0749\u0748\u0001\u0000\u0000\u0000\u0749\u074a"+
		"\u0001\u0000\u0000\u0000\u074a\u074c\u0001\u0000\u0000\u0000\u074b\u0747"+
		"\u0001\u0000\u0000\u0000\u074c\u074f\u0001\u0000\u0000\u0000\u074d\u074b"+
		"\u0001\u0000\u0000\u0000\u074d\u074e\u0001\u0000\u0000\u0000\u074e\u00fb"+
		"\u0001\u0000\u0000\u0000\u074f\u074d\u0001\u0000\u0000\u0000\u0750\u0758"+
		"\u0003\u00e4r\u0000\u0751\u0752\u0005@\u0000\u0000\u0752\u0753\u0005\u00b2"+
		"\u0000\u0000\u0753\u0754\u0003\u00fa}\u0000\u0754\u0755\u0005\u00b3\u0000"+
		"\u0000\u0755\u0758\u0001\u0000\u0000\u0000\u0756\u0758\u0003\u00b6[\u0000"+
		"\u0757\u0750\u0001\u0000\u0000\u0000\u0757\u0751\u0001\u0000\u0000\u0000"+
		"\u0757\u0756\u0001\u0000\u0000\u0000\u0758\u00fd\u0001\u0000\u0000\u0000"+
		"\u0759\u075a\u0007\u0012\u0000\u0000\u075a\u00ff\u0001\u0000\u0000\u0000"+
		"\u075b\u075c\u0007\u0013\u0000\u0000\u075c\u0101\u0001\u0000\u0000\u0000"+
		"\u075d\u075e\u0007\u0014\u0000\u0000\u075e\u0103\u0001\u0000\u0000\u0000"+
		"\u075f\u0760\u0007\u0015\u0000\u0000\u0760\u0105\u0001\u0000\u0000\u0000"+
		"\u0761\u0762\u0007\u0016\u0000\u0000\u0762\u0107\u0001\u0000\u0000\u0000"+
		"\u0763\u0764\u0007\u0017\u0000\u0000\u0764\u0109\u0001\u0000\u0000\u0000"+
		"\u00f6\u010b\u0110\u0116\u011e\u0124\u0132\u0136\u013c\u0141\u0146\u014d"+
		"\u0153\u015a\u0161\u0164\u0168\u016c\u0173\u0176\u017b\u017e\u0181\u0184"+
		"\u0189\u018d\u0191\u0196\u019a\u019c\u01a2\u01ae\u01bf\u01c6\u01ce\u01d2"+
		"\u01d7\u01dd\u01e5\u01ed\u01f3\u01fa\u0201\u0206\u020c\u022b\u0239\u023d"+
		"\u0246\u024a\u024f\u0269\u0274\u0278\u027c\u0285\u028f\u0294\u029a\u029f"+
		"\u02a4\u02a9\u02ae\u02b4\u02ba\u02c0\u02d8\u02dd\u02e0\u02ea\u02ed\u02fa"+
		"\u0302\u0309\u030c\u0311\u0315\u031e\u0322\u033c\u0343\u034a\u0352\u0355"+
		"\u035b\u035f\u0362\u0367\u036b\u036e\u0371\u0374\u037c\u0383\u038c\u0399"+
		"\u03a5\u03ab\u03af\u03b6\u03bc\u03c0\u03c7\u03ce\u03d2\u03d9\u03dd\u03df"+
		"\u03e5\u03ec\u03f0\u03f4\u0401\u0404\u040b\u0412\u0416\u041c\u0420\u0425"+
		"\u042a\u0431\u0439\u0442\u0446\u044c\u0455\u045a\u0461\u0468\u046e\u04ad"+
		"\u04be\u04c5\u04ca\u04cc\u04f2\u0508\u050a\u050f\u0514\u0519\u051c\u0522"+
		"\u0528\u052f\u0534\u053a\u0544\u0549\u054d\u0551\u0554\u055b\u055e\u0563"+
		"\u0567\u056d\u0571\u057c\u0588\u058c\u0595\u059e\u05a6\u05aa\u05b1\u05b5"+
		"\u05ba\u05bf\u05c3\u05cc\u05d2\u05d8\u05db\u05df\u05e2\u05e7\u05ea\u05ed"+
		"\u05f0\u05f3\u05f7\u05fb\u05ff\u0604\u0608\u060a\u0610\u061a\u061e\u0621"+
		"\u062b\u0630\u0632\u0637\u063f\u0643\u0647\u064e\u0657\u065b\u065e\u0663"+
		"\u0666\u066b\u0676\u0678\u067e\u0680\u0687\u068c\u0690\u0693\u069a\u06a0"+
		"\u06aa\u06af\u06b4\u06b6\u06be\u06c4\u06cb\u06cf\u06d4\u06db\u06e2\u06eb"+
		"\u06f0\u06f9\u06fc\u0701\u0706\u070c\u0712\u0716\u071d\u0722\u0728\u0731"+
		"\u0736\u073b\u0742\u0745\u0749\u074d\u0757";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}