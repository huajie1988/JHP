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
		RULE_switchBlockBody = 39, RULE_breakStatement = 40, RULE_continueStatement = 41, 
		RULE_returnStatement = 42, RULE_expressionStatement = 43, RULE_unsetStatement = 44, 
		RULE_foreachStatement = 45, RULE_tryCatchFinally = 46, RULE_catchClause = 47, 
		RULE_finallyStatement = 48, RULE_throwStatement = 49, RULE_gotoStatement = 50, 
		RULE_declareStatement = 51, RULE_declareList = 52, RULE_directive = 53, 
		RULE_formalParameterList = 54, RULE_formalParameter = 55, RULE_typeHint = 56, 
		RULE_globalStatement = 57, RULE_globalVar = 58, RULE_echoStatement = 59, 
		RULE_staticVariableStatement = 60, RULE_classStatement = 61, RULE_traitAdaptations = 62, 
		RULE_traitAdaptationStatement = 63, RULE_traitPrecedence = 64, RULE_traitAlias = 65, 
		RULE_traitMethodReference = 66, RULE_baseCtorCall = 67, RULE_returnTypeDecl = 68, 
		RULE_methodBody = 69, RULE_propertyModifiers = 70, RULE_memberModifiers = 71, 
		RULE_variableInitializer = 72, RULE_identifierInitializer = 73, RULE_globalConstantDeclaration = 74, 
		RULE_enumDeclaration = 75, RULE_enumItem = 76, RULE_expressionList = 77, 
		RULE_parentheses = 78, RULE_expression = 79, RULE_assignable = 80, RULE_arrayCreation = 81, 
		RULE_arrayDestructuring = 82, RULE_indexedDestructItem = 83, RULE_keyedDestructItem = 84, 
		RULE_lambdaFunctionExpr = 85, RULE_matchExpr = 86, RULE_matchItem = 87, 
		RULE_newExpr = 88, RULE_assignmentOperator = 89, RULE_yieldExpression = 90, 
		RULE_arrayItemList = 91, RULE_arrayItem = 92, RULE_lambdaFunctionUseVars = 93, 
		RULE_lambdaFunctionUseVar = 94, RULE_qualifiedStaticTypeRef = 95, RULE_typeRef = 96, 
		RULE_anonymousClass = 97, RULE_indirectTypeRef = 98, RULE_qualifiedNamespaceName = 99, 
		RULE_namespaceNameList = 100, RULE_namespaceNameTail = 101, RULE_qualifiedNamespaceNameList = 102, 
		RULE_arguments = 103, RULE_actualArgument = 104, RULE_argumentName = 105, 
		RULE_constantInitializer = 106, RULE_constant = 107, RULE_literalConstant = 108, 
		RULE_numericConstant = 109, RULE_classConstant = 110, RULE_stringConstant = 111, 
		RULE_string = 112, RULE_interpolatedStringPart = 113, RULE_chainList = 114, 
		RULE_chain = 115, RULE_chainOrigin = 116, RULE_memberAccess = 117, RULE_functionCall = 118, 
		RULE_functionCallName = 119, RULE_actualArguments = 120, RULE_chainBase = 121, 
		RULE_keyedFieldName = 122, RULE_keyedSimpleFieldName = 123, RULE_keyedVariable = 124, 
		RULE_squareCurlyExpression = 125, RULE_assignmentList = 126, RULE_assignmentListElement = 127, 
		RULE_modifier = 128, RULE_identifier = 129, RULE_memberModifier = 130, 
		RULE_magicConstant = 131, RULE_primitiveType = 132, RULE_castOperation = 133;
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
			"switchStatement", "switchBlock", "switchBlockBody", "breakStatement", 
			"continueStatement", "returnStatement", "expressionStatement", "unsetStatement", 
			"foreachStatement", "tryCatchFinally", "catchClause", "finallyStatement", 
			"throwStatement", "gotoStatement", "declareStatement", "declareList", 
			"directive", "formalParameterList", "formalParameter", "typeHint", "globalStatement", 
			"globalVar", "echoStatement", "staticVariableStatement", "classStatement", 
			"traitAdaptations", "traitAdaptationStatement", "traitPrecedence", "traitAlias", 
			"traitMethodReference", "baseCtorCall", "returnTypeDecl", "methodBody", 
			"propertyModifiers", "memberModifiers", "variableInitializer", "identifierInitializer", 
			"globalConstantDeclaration", "enumDeclaration", "enumItem", "expressionList", 
			"parentheses", "expression", "assignable", "arrayCreation", "arrayDestructuring", 
			"indexedDestructItem", "keyedDestructItem", "lambdaFunctionExpr", "matchExpr", 
			"matchItem", "newExpr", "assignmentOperator", "yieldExpression", "arrayItemList", 
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
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(268);
				match(Shebang);
				}
			}

			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					importStatement();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -524303L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0)) {
				{
				{
				setState(277);
				topStatement();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					importStatement();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291);
				topStatement();
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -524303L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0) );
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
			setState(296);
			match(Import);
			setState(297);
			match(Namespace);
			setState(298);
			namespaceNameList();
			setState(299);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				globalConstantDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
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
			setState(310);
			match(Use);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(311);
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
			setState(314);
			useDeclarationContentList();
			setState(315);
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
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(317);
				match(NamespaceSeparator);
				}
			}

			setState(320);
			useDeclarationContent();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(321);
				match(Comma);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(322);
					match(NamespaceSeparator);
					}
				}

				setState(325);
				useDeclarationContent();
				}
				}
				setState(330);
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
			setState(331);
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
			setState(333);
			match(Namespace);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==Label) {
					{
					setState(334);
					namespaceNameList();
					}
				}

				setState(337);
				match(OpenCurlyBracket);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -524303L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061644215716937727L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4397045441345L) != 0)) {
					{
					{
					setState(338);
					namespaceStatement();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(345);
				namespaceNameList();
				setState(346);
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
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
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(357);
				attributes();
				}
			}

			setState(360);
			match(Function_);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(361);
				match(Ampersand);
				}
			}

			setState(364);
			identifier();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(365);
				typeParameterListInBrackets();
				}
			}

			setState(368);
			match(OpenRoundBracket);
			setState(369);
			formalParameterList();
			setState(370);
			match(CloseRoundBracket);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(371);
				match(Colon);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(372);
					match(QuestionMark);
					}
				}

				setState(375);
				typeHint(0);
				}
			}

			setState(378);
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
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(380);
				attributes();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(383);
				match(Private);
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(386);
				modifier();
				}
			}

			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(389);
				match(Partial);
				}
			}

			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(392);
				classEntryType();
				setState(393);
				identifier();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(394);
					typeParameterListInBrackets();
					}
				}

				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(397);
					match(Extends);
					setState(398);
					qualifiedStaticTypeRef();
					}
				}

				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(401);
					match(Implements);
					setState(402);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(405);
				match(Interface);
				setState(406);
				identifier();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(407);
					typeParameterListInBrackets();
					}
				}

				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(410);
					match(Extends);
					setState(411);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(416);
			match(OpenCurlyBracket);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 786703L) != 0)) {
				{
				{
				setState(417);
				classStatement();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
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
			setState(425);
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
			setState(427);
			qualifiedStaticTypeRef();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(428);
				match(Comma);
				setState(429);
				qualifiedStaticTypeRef();
				}
				}
				setState(434);
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
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(Lgeneric);
				setState(436);
				typeParameterList();
				setState(437);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(Lgeneric);
				setState(440);
				typeParameterWithDefaultsList();
				setState(441);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(Lgeneric);
				setState(444);
				typeParameterList();
				setState(445);
				match(Comma);
				setState(446);
				typeParameterWithDefaultsList();
				setState(447);
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
			setState(451);
			typeParameterDecl();
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					match(Comma);
					setState(453);
					typeParameterDecl();
					}
					} 
				}
				setState(458);
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
			setState(459);
			typeParameterWithDefaultDecl();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(460);
				match(Comma);
				setState(461);
				typeParameterWithDefaultDecl();
				}
				}
				setState(466);
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
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(467);
				attributes();
				}
			}

			setState(470);
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
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(472);
				attributes();
				}
			}

			setState(475);
			identifier();
			setState(476);
			match(Eq);
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(477);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(478);
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
			setState(481);
			match(Lgeneric);
			setState(482);
			typeRef();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(483);
				match(Comma);
				setState(484);
				typeRef();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
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
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(492);
				attributeGroup();
				}
				}
				setState(495); 
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
			setState(497);
			match(AttributeStart);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(498);
				identifier();
				setState(499);
				match(Colon);
				}
				break;
			}
			setState(503);
			attribute();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(504);
				match(Comma);
				setState(505);
				attribute();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
			setState(513);
			qualifiedNamespaceName();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(514);
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
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517);
					innerStatement();
					}
					} 
				}
				setState(522);
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
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
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
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				identifier();
				setState(529);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(538);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(539);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(540);
				yieldExpression();
				setState(541);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(543);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(544);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(545);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(546);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(547);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(548);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(549);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(550);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(551);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(552);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(553);
				emptyStatement_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(554);
				attributes();
				setState(555);
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
			setState(559);
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
			setState(561);
			match(OpenCurlyBracket);
			setState(562);
			innerStatementList();
			setState(563);
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
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(If);
				setState(566);
				parentheses();
				setState(567);
				statement();
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(568);
						elseIfStatement();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(574);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(If);
				setState(578);
				parentheses();
				setState(579);
				match(Colon);
				setState(580);
				innerStatementList();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(581);
					elseIfColonStatement();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(587);
					elseColonStatement();
					}
				}

				setState(590);
				match(EndIf);
				setState(591);
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
			setState(595);
			match(ElseIf);
			setState(596);
			parentheses();
			setState(597);
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
			setState(599);
			match(ElseIf);
			setState(600);
			parentheses();
			setState(601);
			match(Colon);
			setState(602);
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
			setState(604);
			match(Else);
			setState(605);
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
			setState(607);
			match(Else);
			setState(608);
			match(Colon);
			setState(609);
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
			setState(611);
			match(While);
			setState(612);
			parentheses();
			setState(619);
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
				setState(613);
				statement();
				}
				break;
			case Colon:
				{
				setState(614);
				match(Colon);
				setState(615);
				innerStatementList();
				setState(616);
				match(EndWhile);
				setState(617);
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
			setState(621);
			match(Do);
			setState(622);
			statement();
			setState(623);
			match(While);
			setState(624);
			parentheses();
			setState(625);
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
			setState(627);
			match(For);
			setState(628);
			match(OpenRoundBracket);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(629);
				forInit();
				}
			}

			setState(632);
			match(SemiColon);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(633);
				expressionList();
				}
			}

			setState(636);
			match(SemiColon);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(637);
				forUpdate();
				}
			}

			setState(640);
			match(CloseRoundBracket);
			setState(647);
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
				setState(641);
				statement();
				}
				break;
			case Colon:
				{
				setState(642);
				match(Colon);
				setState(643);
				innerStatementList();
				setState(644);
				match(EndFor);
				setState(645);
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
			setState(651);
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
			setState(653);
			match(Switch);
			setState(654);
			parentheses();
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(655);
				match(OpenCurlyBracket);
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(656);
					match(SemiColon);
					}
				}

				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(659);
					switchBlock();
					}
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(665);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(666);
				match(Colon);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(667);
					match(SemiColon);
					}
				}

				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(670);
					switchBlock();
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(676);
				match(EndSwitch);
				setState(677);
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
		enterRule(_localctx, 76, RULE_switchBlock);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(Case);
				setState(681);
				expression(0);
				setState(682);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(683);
				switchBlockBody();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(Default);
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(687);
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
		enterRule(_localctx, 78, RULE_switchBlockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
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
		enterRule(_localctx, 80, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(Break);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(693);
				expression(0);
				}
			}

			setState(696);
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
		enterRule(_localctx, 82, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(Continue);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(699);
				expression(0);
				}
			}

			setState(702);
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
		enterRule(_localctx, 84, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(Return);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
				{
				setState(705);
				expression(0);
				}
			}

			setState(708);
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
		enterRule(_localctx, 86, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			expression(0);
			setState(711);
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
		enterRule(_localctx, 88, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(Unset);
			setState(714);
			match(OpenRoundBracket);
			setState(715);
			chainList();
			setState(716);
			match(CloseRoundBracket);
			setState(717);
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
		enterRule(_localctx, 90, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Foreach);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(720);
				match(OpenRoundBracket);
				setState(721);
				expression(0);
				setState(722);
				match(As);
				setState(723);
				arrayDestructuring();
				setState(724);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(726);
				match(OpenRoundBracket);
				setState(727);
				chain();
				setState(728);
				match(As);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(729);
					match(Ampersand);
					}
				}

				setState(732);
				assignable();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(733);
					match(DoubleArrow);
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(734);
						match(Ampersand);
						}
					}

					setState(737);
					chain();
					}
				}

				setState(740);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(742);
				match(OpenRoundBracket);
				setState(743);
				expression(0);
				setState(744);
				match(As);
				setState(745);
				assignable();
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(746);
					match(DoubleArrow);
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(747);
						match(Ampersand);
						}
					}

					setState(750);
					chain();
					}
				}

				setState(753);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				{
				setState(755);
				match(OpenRoundBracket);
				setState(756);
				chain();
				setState(757);
				match(As);
				setState(758);
				match(List);
				setState(759);
				match(OpenRoundBracket);
				setState(760);
				assignmentList();
				setState(761);
				match(CloseRoundBracket);
				setState(762);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(772);
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
				setState(766);
				statement();
				}
				break;
			case Colon:
				{
				setState(767);
				match(Colon);
				setState(768);
				innerStatementList();
				setState(769);
				match(EndForeach);
				setState(770);
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
		enterRule(_localctx, 92, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Try);
			setState(775);
			blockStatement();
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(777); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(776);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(779); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(781);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(784);
					catchClause();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
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
		enterRule(_localctx, 94, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(Catch);
			setState(794);
			match(OpenRoundBracket);
			setState(795);
			qualifiedStaticTypeRef();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(796);
				match(Pipe);
				setState(797);
				qualifiedStaticTypeRef();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VarName) {
				{
				setState(803);
				match(VarName);
				}
			}

			setState(806);
			match(CloseRoundBracket);
			setState(807);
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
		enterRule(_localctx, 96, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(Finally);
			setState(810);
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
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(Throw);
			setState(813);
			expression(0);
			setState(814);
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
		enterRule(_localctx, 100, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(Goto);
			setState(817);
			identifier();
			setState(818);
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
		enterRule(_localctx, 102, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(Declare);
			setState(821);
			match(OpenRoundBracket);
			setState(822);
			declareList();
			setState(823);
			match(CloseRoundBracket);
			setState(830);
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
				setState(824);
				statement();
				}
				break;
			case Colon:
				{
				setState(825);
				match(Colon);
				setState(826);
				innerStatementList();
				setState(827);
				match(EndDeclare);
				setState(828);
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
		enterRule(_localctx, 104, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			directive();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(833);
				match(Comma);
				setState(834);
				directive();
				}
				}
				setState(839);
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
		enterRule(_localctx, 106, RULE_directive);
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ticks:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(Ticks);
				setState(841);
				match(Eq);
				setState(844);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Octal:
				case Decimal:
				case Hex:
				case Binary:
					{
					setState(842);
					numericConstant();
					}
					break;
				case Real:
					{
					setState(843);
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
				setState(846);
				match(Encoding);
				setState(847);
				match(Eq);
				setState(848);
				match(SingleQuoteString);
				}
				break;
			case StrictTypes:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(StrictTypes);
				setState(850);
				match(Eq);
				setState(851);
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
		enterRule(_localctx, 108, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555392L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 3221356563L) != 0)) {
				{
				setState(854);
				formalParameter();
				}
			}

			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					match(Comma);
					setState(858);
					formalParameter();
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(864);
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
		enterRule(_localctx, 110, RULE_formalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(867);
				attributes();
				}
			}

			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(870);
					memberModifier();
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(876);
				match(QuestionMark);
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(879);
				typeHint(0);
				}
			}

			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(882);
				match(Ampersand);
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(885);
				match(Ellipsis);
				}
			}

			setState(888);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_typeHint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(891);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(892);
				match(Callable);
				}
				break;
			case 3:
				{
				setState(893);
				primitiveType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeHintContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeHint);
					setState(896);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(897);
					match(Pipe);
					setState(898);
					typeHint(2);
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 114, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(Global);
			setState(905);
			globalVar();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(906);
				match(Comma);
				setState(907);
				globalVar();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
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
		enterRule(_localctx, 116, RULE_globalVar);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(Dollar);
				setState(917);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(Dollar);
				setState(919);
				match(OpenCurlyBracket);
				setState(920);
				expression(0);
				setState(921);
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
		enterRule(_localctx, 118, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(Echo);
			setState(926);
			expressionList();
			setState(927);
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
		enterRule(_localctx, 120, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(Static);
			setState(930);
			variableInitializer();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(931);
				match(Comma);
				setState(932);
				variableInitializer();
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
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
		enterRule(_localctx, 122, RULE_classStatement);
		int _la;
		try {
			setState(999);
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
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(940);
					attributes();
					}
				}

				setState(993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(943);
					propertyModifiers();
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
						{
						setState(944);
						typeHint(0);
						}
					}

					setState(947);
					variableInitializer();
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(948);
						match(Comma);
						setState(949);
						variableInitializer();
						}
						}
						setState(954);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(955);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
						{
						setState(957);
						memberModifiers();
						}
					}

					setState(991);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(960);
						match(Const);
						setState(962);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(961);
							typeHint(0);
							}
							break;
						}
						setState(964);
						identifierInitializer();
						setState(969);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(965);
							match(Comma);
							setState(966);
							identifierInitializer();
							}
							}
							setState(971);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(972);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(974);
						match(Function_);
						setState(976);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Ampersand) {
							{
							setState(975);
							match(Ampersand);
							}
						}

						setState(978);
						identifier();
						setState(980);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(979);
							typeParameterListInBrackets();
							}
						}

						setState(982);
						match(OpenRoundBracket);
						setState(983);
						formalParameterList();
						setState(984);
						match(CloseRoundBracket);
						setState(987);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
						case 1:
							{
							setState(985);
							baseCtorCall();
							}
							break;
						case 2:
							{
							setState(986);
							returnTypeDecl();
							}
							break;
						}
						setState(989);
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
				setState(995);
				match(Use);
				setState(996);
				qualifiedNamespaceNameList();
				setState(997);
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
		enterRule(_localctx, 124, RULE_traitAdaptations);
		int _la;
		try {
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(OpenCurlyBracket);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(1003);
					traitAdaptationStatement();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
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
		enterRule(_localctx, 126, RULE_traitAdaptationStatement);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
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
		enterRule(_localctx, 128, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			qualifiedNamespaceName();
			setState(1017);
			match(DoubleColon);
			setState(1018);
			identifier();
			setState(1019);
			match(InsteadOf);
			setState(1020);
			qualifiedNamespaceNameList();
			setState(1021);
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
		enterRule(_localctx, 130, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			traitMethodReference();
			setState(1024);
			match(As);
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1025);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1026);
					memberModifier();
					}
					break;
				}
				setState(1029);
				identifier();
				}
				break;
			}
			setState(1032);
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
		enterRule(_localctx, 132, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1034);
				qualifiedNamespaceName();
				setState(1035);
				match(DoubleColon);
				}
				break;
			}
			setState(1039);
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
		enterRule(_localctx, 134, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(Colon);
			setState(1042);
			identifier();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1043);
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
		enterRule(_localctx, 136, RULE_returnTypeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(Colon);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(1047);
				match(QuestionMark);
				}
			}

			setState(1050);
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
		enterRule(_localctx, 138, RULE_methodBody);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
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
		enterRule(_localctx, 140, RULE_propertyModifiers);
		try {
			setState(1058);
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
				setState(1056);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
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
		enterRule(_localctx, 142, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1061); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1060);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1063); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		enterRule(_localctx, 144, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(VarName);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1066);
				match(Eq);
				setState(1067);
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
		enterRule(_localctx, 146, RULE_identifierInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			identifier();
			setState(1071);
			match(Eq);
			setState(1072);
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
		enterRule(_localctx, 148, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1074);
				attributes();
				}
			}

			setState(1077);
			match(Const);
			setState(1078);
			identifierInitializer();
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1079);
				match(Comma);
				setState(1080);
				identifierInitializer();
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086);
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
		enterRule(_localctx, 150, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(Enum_);
			setState(1089);
			identifier();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1090);
				match(Colon);
				setState(1091);
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

			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(1094);
				match(Implements);
				setState(1095);
				interfaceList();
				}
			}

			setState(1098);
			match(OpenCurlyBracket);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271069996096L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(1099);
				enumItem();
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1105);
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
		enterRule(_localctx, 152, RULE_enumItem);
		int _la;
		try {
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				match(Case);
				setState(1108);
				identifier();
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(1109);
					match(Eq);
					setState(1110);
					expression(0);
					}
				}

				setState(1113);
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
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
					{
					setState(1115);
					memberModifiers();
					}
				}

				setState(1118);
				functionDeclaration();
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				match(Use);
				setState(1120);
				qualifiedNamespaceNameList();
				setState(1121);
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
		enterRule(_localctx, 154, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			expression(0);
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1126);
				match(Comma);
				setState(1127);
				expression(0);
				}
				}
				setState(1132);
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
		enterRule(_localctx, 156, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(OpenRoundBracket);
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1134);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1135);
				yieldExpression();
				}
				break;
			}
			setState(1138);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1141);
				match(Clone);
				setState(1142);
				expression(48);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1143);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1144);
				stringConstant();
				setState(1145);
				match(OpenSquareBracket);
				setState(1146);
				expression(0);
				setState(1147);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1149);
				match(OpenRoundBracket);
				setState(1150);
				castOperation();
				setState(1151);
				match(CloseRoundBracket);
				setState(1152);
				expression(45);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1155);
				expression(44);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1156);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1157);
				expression(43);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1159);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1160);
				chain();
				setState(1161);
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
				setState(1163);
				match(Print);
				setState(1164);
				expression(40);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1165);
				arrayCreation();
				}
				break;
			case 11:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1166);
				chain();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1167);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				string();
				}
				break;
			case 14:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1169);
				match(Label);
				}
				break;
			case 15:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				match(BackQuoteString);
				}
				break;
			case 16:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1171);
				parentheses();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1172);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1173);
				match(List);
				setState(1174);
				match(OpenRoundBracket);
				setState(1175);
				assignmentList();
				setState(1176);
				match(CloseRoundBracket);
				setState(1177);
				match(Eq);
				setState(1178);
				expression(31);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1180);
				match(IsSet);
				setState(1181);
				match(OpenRoundBracket);
				setState(1182);
				chainList();
				setState(1183);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1185);
				match(Empty);
				setState(1186);
				match(OpenRoundBracket);
				setState(1187);
				chain();
				setState(1188);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1190);
				match(Eval);
				setState(1191);
				match(OpenRoundBracket);
				setState(1192);
				expression(0);
				setState(1193);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1195);
				match(Exit);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1196);
					match(OpenRoundBracket);
					setState(1197);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1198);
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
				setState(1201);
				lambdaFunctionExpr();
				}
				break;
			case 24:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1202);
				matchExpr();
				}
				break;
			case 25:
				{
				_localctx = new IncludeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1204);
				expression(9);
				}
				break;
			case 26:
				{
				_localctx = new RequireExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1205);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1206);
				expression(8);
				}
				break;
			case 27:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1207);
				match(Throw);
				setState(1208);
				expression(7);
				}
				break;
			case 28:
				{
				_localctx = new ArrayDestructExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1209);
				arrayDestructuring();
				setState(1210);
				match(Eq);
				setState(1211);
				expression(6);
				}
				break;
			case 29:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1213);
				assignable();
				setState(1214);
				assignmentOperator();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1215);
					attributes();
					}
				}

				setState(1218);
				expression(5);
				}
				break;
			case 30:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1220);
				assignable();
				setState(1221);
				match(Eq);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1222);
					attributes();
					}
				}

				setState(1225);
				match(Ampersand);
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1226);
					chain();
					}
					break;
				case 2:
					{
					setState(1227);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1232);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1233);
						((ExponentiationExpressionContext)_localctx).op = match(Pow);
						setState(1234);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1235);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1236);
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
						setState(1237);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1238);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1239);
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
						setState(1240);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1241);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1242);
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
						setState(1243);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1244);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1245);
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
						setState(1246);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1247);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1248);
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
						setState(1249);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1250);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1251);
						((BitwiseAndExpressionContext)_localctx).op = match(Ampersand);
						setState(1252);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1253);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1254);
						((BitwiseExcOrExpressionContext)_localctx).op = match(Caret);
						setState(1255);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1256);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1257);
						((BitwiseIncOrExpressionContext)_localctx).op = match(Pipe);
						setState(1258);
						expression(16);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1259);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1260);
						((LogicalAndExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1261);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1262);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1263);
						((LogicalIncOrExpressionContext)_localctx).op = match(BooleanOr);
						setState(1264);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1265);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1266);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1268);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
							{
							setState(1267);
							expression(0);
							}
						}

						setState(1270);
						match(Colon);
						setState(1271);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new CoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1272);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1273);
						((CoalesceExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1274);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1275);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1276);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1277);
						expression(11);
						}
						break;
					case 15:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1279);
						((LogicalAndExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1280);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1282);
						((LogicalExcOrExpressionContext)_localctx).op = match(LogicalXor);
						setState(1283);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1284);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1285);
						((LogicalIncOrExpressionContext)_localctx).op = match(LogicalOr);
						setState(1286);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1287);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1288);
						match(InstanceOf);
						setState(1289);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		enterRule(_localctx, 160, RULE_assignable);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
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
		enterRule(_localctx, 162, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1299);
				match(Array);
				setState(1300);
				match(OpenRoundBracket);
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1301);
					arrayItemList();
					}
				}

				setState(1304);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1305);
				match(OpenSquareBracket);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1306);
					arrayItemList();
					}
				}

				setState(1309);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1312);
				match(OpenSquareBracket);
				setState(1313);
				expression(0);
				setState(1314);
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
		enterRule(_localctx, 164, RULE_arrayDestructuring);
		int _la;
		try {
			int _alt;
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				match(OpenSquareBracket);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1319);
					match(Comma);
					}
					}
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1325);
				indexedDestructItem();
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1327); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1326);
							match(Comma);
							}
							}
							setState(1329); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1331);
						indexedDestructItem();
						}
						} 
					}
					setState(1336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1337);
					match(Comma);
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1343);
				match(CloseSquareBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				match(OpenSquareBracket);
				setState(1346);
				keyedDestructItem();
				setState(1355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1348); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1347);
							match(Comma);
							}
							}
							setState(1350); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1352);
						keyedDestructItem();
						}
						} 
					}
					setState(1357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1358);
					match(Comma);
					}
				}

				setState(1361);
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
		enterRule(_localctx, 166, RULE_indexedDestructItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1365);
				match(Ampersand);
				}
			}

			setState(1368);
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
		enterRule(_localctx, 168, RULE_keyedDestructItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1370);
				expression(0);
				setState(1371);
				match(DoubleArrow);
				}
				break;
			}
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1375);
				match(Ampersand);
				}
			}

			setState(1378);
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
		enterRule(_localctx, 170, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1380);
					match(Static);
					}
				}

				setState(1383);
				match(Function_);
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1384);
					match(Ampersand);
					}
				}

				setState(1387);
				match(OpenRoundBracket);
				setState(1388);
				formalParameterList();
				setState(1389);
				match(CloseRoundBracket);
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1390);
					lambdaFunctionUseVars();
					}
				}

				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1393);
					match(Colon);
					setState(1394);
					typeHint(0);
					}
				}

				setState(1397);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				match(LambdaFn);
				setState(1400);
				match(OpenRoundBracket);
				setState(1401);
				formalParameterList();
				setState(1402);
				match(CloseRoundBracket);
				setState(1403);
				match(DoubleArrow);
				setState(1404);
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
		enterRule(_localctx, 172, RULE_matchExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			match(Match_);
			setState(1409);
			match(OpenRoundBracket);
			setState(1410);
			expression(0);
			setState(1411);
			match(CloseRoundBracket);
			setState(1412);
			match(OpenCurlyBracket);
			setState(1413);
			matchItem();
			setState(1418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1414);
					match(Comma);
					setState(1415);
					matchItem();
					}
					} 
				}
				setState(1420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1421);
				match(Comma);
				}
			}

			setState(1424);
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
		enterRule(_localctx, 174, RULE_matchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			expression(0);
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1427);
				match(Comma);
				setState(1428);
				expression(0);
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1434);
			match(DoubleArrow);
			setState(1435);
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
		enterRule(_localctx, 176, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(New);
			setState(1438);
			typeRef();
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1439);
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
		enterRule(_localctx, 178, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
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
		enterRule(_localctx, 180, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(Yield);
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1445);
				expression(0);
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1446);
					match(DoubleArrow);
					setState(1447);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1450);
				match(From);
				setState(1451);
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
		enterRule(_localctx, 182, RULE_arrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			arrayItem();
			setState(1459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1455);
					match(Comma);
					setState(1456);
					arrayItem();
					}
					} 
				}
				setState(1461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1462);
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
		enterRule(_localctx, 184, RULE_arrayItem);
		int _la;
		try {
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				expression(0);
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1466);
					match(DoubleArrow);
					setState(1467);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
					{
					setState(1470);
					expression(0);
					setState(1471);
					match(DoubleArrow);
					}
				}

				setState(1475);
				match(Ampersand);
				setState(1476);
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
		enterRule(_localctx, 186, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(Use);
			setState(1480);
			match(OpenRoundBracket);
			setState(1481);
			lambdaFunctionUseVar();
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1482);
				match(Comma);
				setState(1483);
				lambdaFunctionUseVar();
				}
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1489);
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
		enterRule(_localctx, 188, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1491);
				match(Ampersand);
				}
			}

			setState(1494);
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
		enterRule(_localctx, 190, RULE_qualifiedStaticTypeRef);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				qualifiedNamespaceName();
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1497);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
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
		enterRule(_localctx, 192, RULE_typeRef);
		try {
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1503);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1504);
					indirectTypeRef();
					}
					break;
				}
				setState(1508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1507);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
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
		enterRule(_localctx, 194, RULE_anonymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1515);
				attributes();
				}
			}

			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1518);
				match(Private);
				}
			}

			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1521);
				modifier();
				}
			}

			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1524);
				match(Partial);
				}
			}

			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1527);
				classEntryType();
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1528);
					typeParameterListInBrackets();
					}
				}

				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1531);
					match(Extends);
					setState(1532);
					qualifiedStaticTypeRef();
					}
				}

				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1535);
					match(Implements);
					setState(1536);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1539);
				match(Interface);
				setState(1540);
				identifier();
				setState(1542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1541);
					typeParameterListInBrackets();
					}
				}

				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1544);
					match(Extends);
					setState(1545);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1550);
			match(OpenCurlyBracket);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 786703L) != 0)) {
				{
				{
				setState(1551);
				classStatement();
				}
				}
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1557);
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
		enterRule(_localctx, 196, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			chainBase();
			setState(1564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1560);
					match(ObjectOperator);
					setState(1561);
					keyedFieldName();
					}
					} 
				}
				setState(1566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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
		enterRule(_localctx, 198, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1567);
				match(Namespace);
				}
				break;
			}
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1570);
				match(NamespaceSeparator);
				}
			}

			setState(1573);
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
		enterRule(_localctx, 200, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				identifier();
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1577);
						match(NamespaceSeparator);
						setState(1578);
						identifier();
						}
						} 
					}
					setState(1583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1584);
					match(NamespaceSeparator);
					setState(1585);
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
		enterRule(_localctx, 202, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1609);
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
				setState(1590);
				identifier();
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1591);
					match(As);
					setState(1592);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				match(OpenCurlyBracket);
				setState(1596);
				namespaceNameTail();
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1597);
						match(Comma);
						setState(1598);
						namespaceNameTail();
						}
						} 
					}
					setState(1603);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1604);
					match(Comma);
					}
				}

				setState(1607);
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
		enterRule(_localctx, 204, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			qualifiedNamespaceName();
			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1612);
				match(Comma);
				setState(1613);
				qualifiedNamespaceName();
				}
				}
				setState(1618);
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
		enterRule(_localctx, 206, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(OpenRoundBracket);
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1620);
				actualArgument();
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1621);
						match(Comma);
						setState(1622);
						actualArgument();
						}
						} 
					}
					setState(1627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1628);
				yieldExpression();
				}
				break;
			}
			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1631);
				match(Comma);
				}
			}

			setState(1634);
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
		enterRule(_localctx, 208, RULE_actualArgument);
		int _la;
		try {
			setState(1645);
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
				setState(1637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1636);
					argumentName();
					}
					break;
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1639);
					match(Ellipsis);
					}
				}

				setState(1642);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1643);
				match(Ampersand);
				setState(1644);
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
		enterRule(_localctx, 210, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			identifier();
			setState(1648);
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
		enterRule(_localctx, 212, RULE_constantInitializer);
		int _la;
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1650);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1652);
				match(Array);
				setState(1653);
				match(OpenRoundBracket);
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1654);
					arrayItemList();
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1655);
						match(Comma);
						}
					}

					}
				}

				setState(1660);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1661);
				match(OpenSquareBracket);
				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1662);
					arrayItemList();
					setState(1664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1663);
						match(Comma);
						}
					}

					}
				}

				setState(1668);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1669);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1670);
				constantInitializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1671);
					string();
					}
					break;
				case 2:
					{
					setState(1672);
					constant();
					}
					break;
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(1675);
					match(Dot);
					setState(1678);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1676);
						string();
						}
						break;
					case 2:
						{
						setState(1677);
						constant();
						}
						break;
					}
					}
					}
					setState(1684);
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
		enterRule(_localctx, 214, RULE_constant);
		try {
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1689);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1690);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1691);
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
		enterRule(_localctx, 216, RULE_literalConstant);
		try {
			setState(1698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1695);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1696);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1697);
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
		enterRule(_localctx, 218, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
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
		enterRule(_localctx, 220, RULE_classConstant);
		int _la;
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1703);
				match(DoubleColon);
				setState(1708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1704);
					identifier();
					}
					break;
				case 2:
					{
					setState(1705);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1706);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1707);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
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
					setState(1710);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1711);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1712);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1715);
				match(DoubleColon);
				setState(1718);
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
					setState(1716);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1717);
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
		enterRule(_localctx, 222, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
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
		enterRule(_localctx, 224, RULE_string);
		try {
			int _alt;
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				match(StartHereDoc);
				setState(1726); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1725);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1728); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1730);
				match(StartNowDoc);
				setState(1732); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1731);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1734); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1736);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1737);
				match(DoubleQuote);
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1738);
						interpolatedStringPart();
						}
						} 
					}
					setState(1743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
				setState(1744);
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
		enterRule(_localctx, 226, RULE_interpolatedStringPart);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
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
				setState(1749);
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
		enterRule(_localctx, 228, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			chain();
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1753);
				match(Comma);
				setState(1754);
				chain();
				}
				}
				setState(1759);
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
		enterRule(_localctx, 230, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			chainOrigin();
			setState(1764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1761);
					memberAccess();
					}
					} 
				}
				setState(1766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
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
		enterRule(_localctx, 232, RULE_chainOrigin);
		try {
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1767);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1768);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1769);
				match(OpenRoundBracket);
				setState(1770);
				newExpr();
				setState(1771);
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
		enterRule(_localctx, 234, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			match(ObjectOperator);
			setState(1776);
			keyedFieldName();
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1777);
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
		enterRule(_localctx, 236, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			functionCallName();
			setState(1781);
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
		enterRule(_localctx, 238, RULE_functionCallName);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1786);
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
		enterRule(_localctx, 240, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1789);
				genericDynamicArgs();
				}
			}

			setState(1793); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1792);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1795); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1797);
					squareCurlyExpression();
					}
					} 
				}
				setState(1802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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
		enterRule(_localctx, 242, RULE_chainBase);
		try {
			setState(1812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				keyedVariable();
				setState(1806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1804);
					match(DoubleColon);
					setState(1805);
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
				setState(1808);
				qualifiedStaticTypeRef();
				setState(1809);
				match(DoubleColon);
				setState(1810);
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
		enterRule(_localctx, 244, RULE_keyedFieldName);
		try {
			setState(1816);
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
				setState(1814);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1815);
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
		enterRule(_localctx, 246, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
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
				setState(1818);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1819);
				match(OpenCurlyBracket);
				setState(1820);
				expression(0);
				setState(1821);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1825);
					squareCurlyExpression();
					}
					} 
				}
				setState(1830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		enterRule(_localctx, 248, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1831);
					match(Dollar);
					}
					} 
				}
				setState(1836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			}
			setState(1843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1837);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1838);
				match(Dollar);
				setState(1839);
				match(OpenCurlyBracket);
				setState(1840);
				expression(0);
				setState(1841);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1845);
					squareCurlyExpression();
					}
					} 
				}
				setState(1850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		enterRule(_localctx, 250, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1851);
				match(OpenSquareBracket);
				setState(1853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138177L) != 0)) {
					{
					setState(1852);
					expression(0);
					}
				}

				setState(1855);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1856);
				match(OpenCurlyBracket);
				setState(1857);
				expression(0);
				setState(1858);
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
		enterRule(_localctx, 252, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
				{
				setState(1862);
				assignmentListElement();
				}
			}

			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1865);
				match(Comma);
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -32769L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441352763482308607L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4396974138193L) != 0)) {
					{
					setState(1866);
					assignmentListElement();
					}
				}

				}
				}
				setState(1873);
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
		enterRule(_localctx, 254, RULE_assignmentListElement);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				match(List);
				setState(1876);
				match(OpenRoundBracket);
				setState(1877);
				assignmentList();
				setState(1878);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1880);
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
		enterRule(_localctx, 256, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
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
		enterRule(_localctx, 258, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -33555456L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9223372036854775807L) != 0) || _la==Label) ) {
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
		enterRule(_localctx, 260, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
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
		enterRule(_localctx, 262, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
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
		enterRule(_localctx, 264, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
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
		enterRule(_localctx, 266, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
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
		case 56:
			return typeHint_sempred((TypeHintContext)_localctx, predIndex);
		case 79:
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
		"\u0004\u0001\u00d1\u0768\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0001\u0000\u0003"+
		"\u0000\u010e\b\u0000\u0001\u0000\u0005\u0000\u0111\b\u0000\n\u0000\f\u0000"+
		"\u0114\t\u0000\u0001\u0000\u0005\u0000\u0117\b\u0000\n\u0000\f\u0000\u011a"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u011f\b\u0001"+
		"\n\u0001\f\u0001\u0122\t\u0001\u0001\u0001\u0004\u0001\u0125\b\u0001\u000b"+
		"\u0001\f\u0001\u0126\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0135\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0139\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003"+
		"\u0005\u013f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0144"+
		"\b\u0005\u0001\u0005\u0005\u0005\u0147\b\u0005\n\u0005\f\u0005\u014a\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0150"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0154\b\u0007\n\u0007\f\u0007"+
		"\u0157\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u015d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0164\b"+
		"\b\u0001\t\u0003\t\u0167\b\t\u0001\t\u0001\t\u0003\t\u016b\b\t\u0001\t"+
		"\u0001\t\u0003\t\u016f\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0176\b\t\u0001\t\u0003\t\u0179\b\t\u0001\t\u0001\t\u0001\n\u0003\n"+
		"\u017e\b\n\u0001\n\u0003\n\u0181\b\n\u0001\n\u0003\n\u0184\b\n\u0001\n"+
		"\u0003\n\u0187\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u018c\b\n\u0001\n\u0001"+
		"\n\u0003\n\u0190\b\n\u0001\n\u0001\n\u0003\n\u0194\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0199\b\n\u0001\n\u0001\n\u0003\n\u019d\b\n\u0003\n\u019f"+
		"\b\n\u0001\n\u0001\n\u0005\n\u01a3\b\n\n\n\f\n\u01a6\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u01af\b\f\n"+
		"\f\f\f\u01b2\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01c2"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01c7\b\u000e\n\u000e"+
		"\f\u000e\u01ca\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u01cf\b\u000f\n\u000f\f\u000f\u01d2\t\u000f\u0001\u0010\u0003\u0010\u01d5"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u01da\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01e0\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01e6\b\u0012"+
		"\n\u0012\f\u0012\u01e9\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013\u01ee\b\u0013\u000b\u0013\f\u0013\u01ef\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01f6\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u01fb\b\u0014\n\u0014\f\u0014\u01fe\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0204\b\u0015\u0001"+
		"\u0016\u0005\u0016\u0207\b\u0016\n\u0016\f\u0016\u020a\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u020f\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u022e\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u023a\b\u001b\n\u001b"+
		"\f\u001b\u023d\t\u001b\u0001\u001b\u0003\u001b\u0240\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0247\b\u001b"+
		"\n\u001b\f\u001b\u024a\t\u001b\u0001\u001b\u0003\u001b\u024d\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0252\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u026c\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0003\"\u0277\b\"\u0001\"\u0001\"\u0003\"\u027b"+
		"\b\"\u0001\"\u0001\"\u0003\"\u027f\b\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u0288\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0003%\u0292\b%\u0001%\u0005%\u0295\b%\n"+
		"%\f%\u0298\t%\u0001%\u0001%\u0001%\u0003%\u029d\b%\u0001%\u0005%\u02a0"+
		"\b%\n%\f%\u02a3\t%\u0001%\u0001%\u0003%\u02a7\b%\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02b1\b&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0003(\u02b7\b(\u0001(\u0001(\u0001)\u0001)\u0003)\u02bd\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0003*\u02c3\b*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02db\b-\u0001"+
		"-\u0001-\u0001-\u0003-\u02e0\b-\u0001-\u0003-\u02e3\b-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02ed\b-\u0001-\u0003-\u02f0"+
		"\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u02fd\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0305\b-\u0001.\u0001.\u0001.\u0004.\u030a\b.\u000b.\f.\u030b\u0001"+
		".\u0003.\u030f\b.\u0001.\u0005.\u0312\b.\n.\f.\u0315\t.\u0001.\u0003."+
		"\u0318\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u031f\b/\n/\f/\u0322"+
		"\t/\u0001/\u0003/\u0325\b/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u033f\b3\u0001"+
		"4\u00014\u00014\u00054\u0344\b4\n4\f4\u0347\t4\u00015\u00015\u00015\u0001"+
		"5\u00035\u034d\b5\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0355"+
		"\b5\u00016\u00036\u0358\b6\u00016\u00016\u00056\u035c\b6\n6\f6\u035f\t"+
		"6\u00016\u00036\u0362\b6\u00017\u00037\u0365\b7\u00017\u00057\u0368\b"+
		"7\n7\f7\u036b\t7\u00017\u00037\u036e\b7\u00017\u00037\u0371\b7\u00017"+
		"\u00037\u0374\b7\u00017\u00037\u0377\b7\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00038\u037f\b8\u00018\u00018\u00018\u00058\u0384\b8\n8\f8\u0387"+
		"\t8\u00019\u00019\u00019\u00019\u00059\u038d\b9\n9\f9\u0390\t9\u00019"+
		"\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003"+
		":\u039c\b:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0005"+
		"<\u03a6\b<\n<\f<\u03a9\t<\u0001<\u0001<\u0001=\u0003=\u03ae\b=\u0001="+
		"\u0001=\u0003=\u03b2\b=\u0001=\u0001=\u0001=\u0005=\u03b7\b=\n=\f=\u03ba"+
		"\t=\u0001=\u0001=\u0001=\u0003=\u03bf\b=\u0001=\u0001=\u0003=\u03c3\b"+
		"=\u0001=\u0001=\u0001=\u0005=\u03c8\b=\n=\f=\u03cb\t=\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u03d1\b=\u0001=\u0001=\u0003=\u03d5\b=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u03dc\b=\u0001=\u0001=\u0003=\u03e0\b=\u0003=\u03e2"+
		"\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u03e8\b=\u0001>\u0001>\u0001>\u0005"+
		">\u03ed\b>\n>\f>\u03f0\t>\u0001>\u0003>\u03f3\b>\u0001?\u0001?\u0003?"+
		"\u03f7\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0404\bA\u0001A\u0003A\u0407\bA\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0003B\u040e\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0003"+
		"C\u0415\bC\u0001D\u0001D\u0003D\u0419\bD\u0001D\u0001D\u0001E\u0001E\u0003"+
		"E\u041f\bE\u0001F\u0001F\u0003F\u0423\bF\u0001G\u0004G\u0426\bG\u000b"+
		"G\fG\u0427\u0001H\u0001H\u0001H\u0003H\u042d\bH\u0001I\u0001I\u0001I\u0001"+
		"I\u0001J\u0003J\u0434\bJ\u0001J\u0001J\u0001J\u0001J\u0005J\u043a\bJ\n"+
		"J\fJ\u043d\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0003K\u0445\b"+
		"K\u0001K\u0001K\u0003K\u0449\bK\u0001K\u0001K\u0005K\u044d\bK\nK\fK\u0450"+
		"\tK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0003L\u0458\bL\u0001L\u0001"+
		"L\u0001L\u0003L\u045d\bL\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u0464"+
		"\bL\u0001M\u0001M\u0001M\u0005M\u0469\bM\nM\fM\u046c\tM\u0001N\u0001N"+
		"\u0001N\u0003N\u0471\bN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0003O\u04b0\bO\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0003O\u04c1\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u04c8"+
		"\bO\u0001O\u0001O\u0001O\u0003O\u04cd\bO\u0003O\u04cf\bO\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0003O\u04f5\bO\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u050b\bO\nO\fO\u050e"+
		"\tO\u0001P\u0001P\u0003P\u0512\bP\u0001Q\u0001Q\u0001Q\u0003Q\u0517\b"+
		"Q\u0001Q\u0001Q\u0001Q\u0003Q\u051c\bQ\u0001Q\u0003Q\u051f\bQ\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0003Q\u0525\bQ\u0001R\u0001R\u0005R\u0529\bR\nR\fR\u052c"+
		"\tR\u0001R\u0001R\u0004R\u0530\bR\u000bR\fR\u0531\u0001R\u0005R\u0535"+
		"\bR\nR\fR\u0538\tR\u0001R\u0005R\u053b\bR\nR\fR\u053e\tR\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0004R\u0545\bR\u000bR\fR\u0546\u0001R\u0005R\u054a"+
		"\bR\nR\fR\u054d\tR\u0001R\u0003R\u0550\bR\u0001R\u0001R\u0003R\u0554\b"+
		"R\u0001S\u0003S\u0557\bS\u0001S\u0001S\u0001T\u0001T\u0001T\u0003T\u055e"+
		"\bT\u0001T\u0003T\u0561\bT\u0001T\u0001T\u0001U\u0003U\u0566\bU\u0001"+
		"U\u0001U\u0003U\u056a\bU\u0001U\u0001U\u0001U\u0001U\u0003U\u0570\bU\u0001"+
		"U\u0001U\u0003U\u0574\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u057f\bU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0005V\u0589\bV\nV\fV\u058c\tV\u0001V\u0003V\u058f\bV"+
		"\u0001V\u0001V\u0001W\u0001W\u0001W\u0005W\u0596\bW\nW\fW\u0599\tW\u0001"+
		"W\u0001W\u0001W\u0001X\u0001X\u0001X\u0003X\u05a1\bX\u0001Y\u0001Y\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0003Z\u05a9\bZ\u0001Z\u0001Z\u0003Z\u05ad\bZ\u0001"+
		"[\u0001[\u0001[\u0005[\u05b2\b[\n[\f[\u05b5\t[\u0001[\u0003[\u05b8\b["+
		"\u0001\\\u0001\\\u0001\\\u0003\\\u05bd\b\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u05c2\b\\\u0001\\\u0001\\\u0003\\\u05c6\b\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0005]\u05cd\b]\n]\f]\u05d0\t]\u0001]\u0001]\u0001^\u0003^\u05d5"+
		"\b^\u0001^\u0001^\u0001_\u0001_\u0003_\u05db\b_\u0001_\u0003_\u05de\b"+
		"_\u0001`\u0001`\u0003`\u05e2\b`\u0001`\u0003`\u05e5\b`\u0001`\u0001`\u0001"+
		"`\u0003`\u05ea\b`\u0001a\u0003a\u05ed\ba\u0001a\u0003a\u05f0\ba\u0001"+
		"a\u0003a\u05f3\ba\u0001a\u0003a\u05f6\ba\u0001a\u0001a\u0003a\u05fa\b"+
		"a\u0001a\u0001a\u0003a\u05fe\ba\u0001a\u0001a\u0003a\u0602\ba\u0001a\u0001"+
		"a\u0001a\u0003a\u0607\ba\u0001a\u0001a\u0003a\u060b\ba\u0003a\u060d\b"+
		"a\u0001a\u0001a\u0005a\u0611\ba\na\fa\u0614\ta\u0001a\u0001a\u0001b\u0001"+
		"b\u0001b\u0005b\u061b\bb\nb\fb\u061e\tb\u0001c\u0003c\u0621\bc\u0001c"+
		"\u0003c\u0624\bc\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0005d\u062c"+
		"\bd\nd\fd\u062f\td\u0001d\u0001d\u0003d\u0633\bd\u0003d\u0635\bd\u0001"+
		"e\u0001e\u0001e\u0003e\u063a\be\u0001e\u0001e\u0001e\u0001e\u0005e\u0640"+
		"\be\ne\fe\u0643\te\u0001e\u0003e\u0646\be\u0001e\u0001e\u0003e\u064a\b"+
		"e\u0001f\u0001f\u0001f\u0005f\u064f\bf\nf\ff\u0652\tf\u0001g\u0001g\u0001"+
		"g\u0001g\u0005g\u0658\bg\ng\fg\u065b\tg\u0001g\u0003g\u065e\bg\u0001g"+
		"\u0003g\u0661\bg\u0001g\u0001g\u0001h\u0003h\u0666\bh\u0001h\u0003h\u0669"+
		"\bh\u0001h\u0001h\u0001h\u0003h\u066e\bh\u0001i\u0001i\u0001i\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0003j\u0679\bj\u0003j\u067b\bj\u0001j\u0001"+
		"j\u0001j\u0001j\u0003j\u0681\bj\u0003j\u0683\bj\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0003j\u068a\bj\u0001j\u0001j\u0001j\u0003j\u068f\bj\u0005j\u0691"+
		"\bj\nj\fj\u0694\tj\u0003j\u0696\bj\u0001k\u0001k\u0001k\u0001k\u0001k"+
		"\u0003k\u069d\bk\u0001l\u0001l\u0001l\u0001l\u0003l\u06a3\bl\u0001m\u0001"+
		"m\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0003n\u06ad\bn\u0001n\u0001"+
		"n\u0001n\u0003n\u06b2\bn\u0001n\u0001n\u0001n\u0003n\u06b7\bn\u0003n\u06b9"+
		"\bn\u0001o\u0001o\u0001p\u0001p\u0004p\u06bf\bp\u000bp\fp\u06c0\u0001"+
		"p\u0001p\u0004p\u06c5\bp\u000bp\fp\u06c6\u0001p\u0001p\u0001p\u0005p\u06cc"+
		"\bp\np\fp\u06cf\tp\u0001p\u0003p\u06d2\bp\u0001q\u0001q\u0001q\u0003q"+
		"\u06d7\bq\u0001r\u0001r\u0001r\u0005r\u06dc\br\nr\fr\u06df\tr\u0001s\u0001"+
		"s\u0005s\u06e3\bs\ns\fs\u06e6\ts\u0001t\u0001t\u0001t\u0001t\u0001t\u0001"+
		"t\u0003t\u06ee\bt\u0001u\u0001u\u0001u\u0003u\u06f3\bu\u0001v\u0001v\u0001"+
		"v\u0001w\u0001w\u0001w\u0001w\u0003w\u06fc\bw\u0001x\u0003x\u06ff\bx\u0001"+
		"x\u0004x\u0702\bx\u000bx\fx\u0703\u0001x\u0005x\u0707\bx\nx\fx\u070a\t"+
		"x\u0001y\u0001y\u0001y\u0003y\u070f\by\u0001y\u0001y\u0001y\u0001y\u0003"+
		"y\u0715\by\u0001z\u0001z\u0003z\u0719\bz\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0003{\u0720\b{\u0001{\u0005{\u0723\b{\n{\f{\u0726\t{\u0001|\u0005|"+
		"\u0729\b|\n|\f|\u072c\t|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003"+
		"|\u0734\b|\u0001|\u0005|\u0737\b|\n|\f|\u073a\t|\u0001}\u0001}\u0003}"+
		"\u073e\b}\u0001}\u0001}\u0001}\u0001}\u0001}\u0003}\u0745\b}\u0001~\u0003"+
		"~\u0748\b~\u0001~\u0001~\u0003~\u074c\b~\u0005~\u074e\b~\n~\f~\u0751\t"+
		"~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0003\u007f\u075a\b\u007f\u0001\u0080\u0001\u0080\u0001\u0081"+
		"\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001\u0084"+
		"\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0000\u0002p\u009e\u0086"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u0000\u0018\u0002\u0000"+
		"\u0016\u001600\u0002\u0000\u0014\u0014XX\u0001\u0000\u00b9\u00ba\u0002"+
		"\u0000==UU\u0001\u0000\u00ad\u00ae\u0002\u0000\u00a6\u00a6\u00a8\u00a9"+
		"\u0001\u0000\u0083\u0084\u0001\u000067\u0001\u0000PQ\u0001\u0000\u00aa"+
		"\u00ac\u0002\u0000\u00a8\u00a9\u00b0\u00b0\u0001\u0000\u009c\u009d\u0002"+
		"\u0000\u0089\u008a\u00a2\u00a3\u0001\u0000\u0085\u0088\u0004\u0000\u008b"+
		"\u008d\u008f\u0097\u009b\u009b\u00bb\u00bb\u0001\u0000\u00a8\u00a9\u0002"+
		"\u0000\u00c0\u00c1\u00c3\u00c4\u0002\u0000\u0014\u0014II\u0002\u0000\n"+
		"\n++\u0003\u0000\n\u0018\u001a~\u00bf\u00bf\u0004\u0000\n\n++LOTT\u0001"+
		"\u0000w~\u0007\u0000\u000b\u000b\u000e\u000e\u001c\u001c<=HHRRUU\t\u0000"+
		"\u000b\u000b\r\u000e\u001b\u001c--:=HHRRUU[]\u083f\u0000\u010d\u0001\u0000"+
		"\u0000\u0000\u0002\u0120\u0001\u0000\u0000\u0000\u0004\u0128\u0001\u0000"+
		"\u0000\u0000\u0006\u0134\u0001\u0000\u0000\u0000\b\u0136\u0001\u0000\u0000"+
		"\u0000\n\u013e\u0001\u0000\u0000\u0000\f\u014b\u0001\u0000\u0000\u0000"+
		"\u000e\u014d\u0001\u0000\u0000\u0000\u0010\u0163\u0001\u0000\u0000\u0000"+
		"\u0012\u0166\u0001\u0000\u0000\u0000\u0014\u017d\u0001\u0000\u0000\u0000"+
		"\u0016\u01a9\u0001\u0000\u0000\u0000\u0018\u01ab\u0001\u0000\u0000\u0000"+
		"\u001a\u01c1\u0001\u0000\u0000\u0000\u001c\u01c3\u0001\u0000\u0000\u0000"+
		"\u001e\u01cb\u0001\u0000\u0000\u0000 \u01d4\u0001\u0000\u0000\u0000\""+
		"\u01d9\u0001\u0000\u0000\u0000$\u01e1\u0001\u0000\u0000\u0000&\u01ed\u0001"+
		"\u0000\u0000\u0000(\u01f1\u0001\u0000\u0000\u0000*\u0201\u0001\u0000\u0000"+
		"\u0000,\u0208\u0001\u0000\u0000\u0000.\u020e\u0001\u0000\u0000\u00000"+
		"\u022d\u0001\u0000\u0000\u00002\u022f\u0001\u0000\u0000\u00004\u0231\u0001"+
		"\u0000\u0000\u00006\u0251\u0001\u0000\u0000\u00008\u0253\u0001\u0000\u0000"+
		"\u0000:\u0257\u0001\u0000\u0000\u0000<\u025c\u0001\u0000\u0000\u0000>"+
		"\u025f\u0001\u0000\u0000\u0000@\u0263\u0001\u0000\u0000\u0000B\u026d\u0001"+
		"\u0000\u0000\u0000D\u0273\u0001\u0000\u0000\u0000F\u0289\u0001\u0000\u0000"+
		"\u0000H\u028b\u0001\u0000\u0000\u0000J\u028d\u0001\u0000\u0000\u0000L"+
		"\u02b0\u0001\u0000\u0000\u0000N\u02b2\u0001\u0000\u0000\u0000P\u02b4\u0001"+
		"\u0000\u0000\u0000R\u02ba\u0001\u0000\u0000\u0000T\u02c0\u0001\u0000\u0000"+
		"\u0000V\u02c6\u0001\u0000\u0000\u0000X\u02c9\u0001\u0000\u0000\u0000Z"+
		"\u02cf\u0001\u0000\u0000\u0000\\\u0306\u0001\u0000\u0000\u0000^\u0319"+
		"\u0001\u0000\u0000\u0000`\u0329\u0001\u0000\u0000\u0000b\u032c\u0001\u0000"+
		"\u0000\u0000d\u0330\u0001\u0000\u0000\u0000f\u0334\u0001\u0000\u0000\u0000"+
		"h\u0340\u0001\u0000\u0000\u0000j\u0354\u0001\u0000\u0000\u0000l\u0357"+
		"\u0001\u0000\u0000\u0000n\u0364\u0001\u0000\u0000\u0000p\u037e\u0001\u0000"+
		"\u0000\u0000r\u0388\u0001\u0000\u0000\u0000t\u039b\u0001\u0000\u0000\u0000"+
		"v\u039d\u0001\u0000\u0000\u0000x\u03a1\u0001\u0000\u0000\u0000z\u03e7"+
		"\u0001\u0000\u0000\u0000|\u03f2\u0001\u0000\u0000\u0000~\u03f6\u0001\u0000"+
		"\u0000\u0000\u0080\u03f8\u0001\u0000\u0000\u0000\u0082\u03ff\u0001\u0000"+
		"\u0000\u0000\u0084\u040d\u0001\u0000\u0000\u0000\u0086\u0411\u0001\u0000"+
		"\u0000\u0000\u0088\u0416\u0001\u0000\u0000\u0000\u008a\u041e\u0001\u0000"+
		"\u0000\u0000\u008c\u0422\u0001\u0000\u0000\u0000\u008e\u0425\u0001\u0000"+
		"\u0000\u0000\u0090\u0429\u0001\u0000\u0000\u0000\u0092\u042e\u0001\u0000"+
		"\u0000\u0000\u0094\u0433\u0001\u0000\u0000\u0000\u0096\u0440\u0001\u0000"+
		"\u0000\u0000\u0098\u0463\u0001\u0000\u0000\u0000\u009a\u0465\u0001\u0000"+
		"\u0000\u0000\u009c\u046d\u0001\u0000\u0000\u0000\u009e\u04ce\u0001\u0000"+
		"\u0000\u0000\u00a0\u0511\u0001\u0000\u0000\u0000\u00a2\u051e\u0001\u0000"+
		"\u0000\u0000\u00a4\u0553\u0001\u0000\u0000\u0000\u00a6\u0556\u0001\u0000"+
		"\u0000\u0000\u00a8\u055d\u0001\u0000\u0000\u0000\u00aa\u057e\u0001\u0000"+
		"\u0000\u0000\u00ac\u0580\u0001\u0000\u0000\u0000\u00ae\u0592\u0001\u0000"+
		"\u0000\u0000\u00b0\u059d\u0001\u0000\u0000\u0000\u00b2\u05a2\u0001\u0000"+
		"\u0000\u0000\u00b4\u05a4\u0001\u0000\u0000\u0000\u00b6\u05ae\u0001\u0000"+
		"\u0000\u0000\u00b8\u05c5\u0001\u0000\u0000\u0000\u00ba\u05c7\u0001\u0000"+
		"\u0000\u0000\u00bc\u05d4\u0001\u0000\u0000\u0000\u00be\u05dd\u0001\u0000"+
		"\u0000\u0000\u00c0\u05e9\u0001\u0000\u0000\u0000\u00c2\u05ec\u0001\u0000"+
		"\u0000\u0000\u00c4\u0617\u0001\u0000\u0000\u0000\u00c6\u0620\u0001\u0000"+
		"\u0000\u0000\u00c8\u0634\u0001\u0000\u0000\u0000\u00ca\u0649\u0001\u0000"+
		"\u0000\u0000\u00cc\u064b\u0001\u0000\u0000\u0000\u00ce\u0653\u0001\u0000"+
		"\u0000\u0000\u00d0\u066d\u0001\u0000\u0000\u0000\u00d2\u066f\u0001\u0000"+
		"\u0000\u0000\u00d4\u0695\u0001\u0000\u0000\u0000\u00d6\u069c\u0001\u0000"+
		"\u0000\u0000\u00d8\u06a2\u0001\u0000\u0000\u0000\u00da\u06a4\u0001\u0000"+
		"\u0000\u0000\u00dc\u06b8\u0001\u0000\u0000\u0000\u00de\u06ba\u0001\u0000"+
		"\u0000\u0000\u00e0\u06d1\u0001\u0000\u0000\u0000\u00e2\u06d6\u0001\u0000"+
		"\u0000\u0000\u00e4\u06d8\u0001\u0000\u0000\u0000\u00e6\u06e0\u0001\u0000"+
		"\u0000\u0000\u00e8\u06ed\u0001\u0000\u0000\u0000\u00ea\u06ef\u0001\u0000"+
		"\u0000\u0000\u00ec\u06f4\u0001\u0000\u0000\u0000\u00ee\u06fb\u0001\u0000"+
		"\u0000\u0000\u00f0\u06fe\u0001\u0000\u0000\u0000\u00f2\u0714\u0001\u0000"+
		"\u0000\u0000\u00f4\u0718\u0001\u0000\u0000\u0000\u00f6\u071f\u0001\u0000"+
		"\u0000\u0000\u00f8\u072a\u0001\u0000\u0000\u0000\u00fa\u0744\u0001\u0000"+
		"\u0000\u0000\u00fc\u0747\u0001\u0000\u0000\u0000\u00fe\u0759\u0001\u0000"+
		"\u0000\u0000\u0100\u075b\u0001\u0000\u0000\u0000\u0102\u075d\u0001\u0000"+
		"\u0000\u0000\u0104\u075f\u0001\u0000\u0000\u0000\u0106\u0761\u0001\u0000"+
		"\u0000\u0000\u0108\u0763\u0001\u0000\u0000\u0000\u010a\u0765\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0005\u0002\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0112\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0003\u0004\u0002\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0118\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u0003\u0006"+
		"\u0003\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\u0000\u0000\u0001\u011c\u0001\u0001\u0000"+
		"\u0000\u0000\u011d\u011f\u0003\u0004\u0002\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0125\u0003\u0006"+
		"\u0003\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0003\u0001\u0000\u0000\u0000\u0128\u0129\u00055\u0000"+
		"\u0000\u0129\u012a\u0005E\u0000\u0000\u012a\u012b\u0003\u00c8d\u0000\u012b"+
		"\u012c\u0005\u00ba\u0000\u0000\u012c\u0005\u0001\u0000\u0000\u0000\u012d"+
		"\u0135\u00030\u0018\u0000\u012e\u0135\u0003\b\u0004\u0000\u012f\u0135"+
		"\u0003\u000e\u0007\u0000\u0130\u0135\u0003\u0012\t\u0000\u0131\u0135\u0003"+
		"\u0014\n\u0000\u0132\u0135\u0003\u0094J\u0000\u0133\u0135\u0003\u0096"+
		"K\u0000\u0134\u012d\u0001\u0000\u0000\u0000\u0134\u012e\u0001\u0000\u0000"+
		"\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000"+
		"\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0007\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u0005^\u0000\u0000\u0137\u0139\u0007\u0000\u0000\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0003\n\u0005\u0000\u013b"+
		"\u013c\u0005\u00ba\u0000\u0000\u013c\t\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0005\u00a0\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0148"+
		"\u0003\f\u0006\u0000\u0141\u0143\u0005\u00b8\u0000\u0000\u0142\u0144\u0005"+
		"\u00a0\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0003"+
		"\f\u0006\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u000b\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0003\u00c8d\u0000\u014c\r\u0001\u0000\u0000"+
		"\u0000\u014d\u015c\u0005E\u0000\u0000\u014e\u0150\u0003\u00c8d\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0155\u0005\u00b6\u0000\u0000\u0152"+
		"\u0154\u0003\u0010\b\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0158\u015d\u0005\u00b7\u0000\u0000\u0159\u015a"+
		"\u0003\u00c8d\u0000\u015a\u015b\u0005\u00ba\u0000\u0000\u015b\u015d\u0001"+
		"\u0000\u0000\u0000\u015c\u014f\u0001\u0000\u0000\u0000\u015c\u0159\u0001"+
		"\u0000\u0000\u0000\u015d\u000f\u0001\u0000\u0000\u0000\u015e\u0164\u0003"+
		"0\u0018\u0000\u015f\u0164\u0003\b\u0004\u0000\u0160\u0164\u0003\u0012"+
		"\t\u0000\u0161\u0164\u0003\u0014\n\u0000\u0162\u0164\u0003\u0094J\u0000"+
		"\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000"+
		"\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0011\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0003&\u0013\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u016a\u00050\u0000\u0000\u0169\u016b\u0005\u00a4\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u0102\u0081\u0000\u016d\u016f"+
		"\u0003\u001a\r\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\u00b2\u0000\u0000\u0171\u0172\u0003l6\u0000\u0172\u0178\u0005\u00b3\u0000"+
		"\u0000\u0173\u0175\u0005\u00b9\u0000\u0000\u0174\u0176\u0005\u00b1\u0000"+
		"\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0003p8\u0000\u0178"+
		"\u0173\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u00034\u001a\u0000\u017b\u0013"+
		"\u0001\u0000\u0000\u0000\u017c\u017e\u0003&\u0013\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u0181\u0005L\u0000\u0000\u0180\u017f\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000"+
		"\u0000\u0000\u0182\u0184\u0003\u0100\u0080\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0005J\u0000\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u019e\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0003\u0016\u000b\u0000\u0189\u018b\u0003\u0102\u0081"+
		"\u0000\u018a\u018c\u0003\u001a\r\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005*\u0000\u0000\u018e\u0190\u0003\u00be_\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u00054\u0000\u0000\u0192\u0194\u0003"+
		"\u0018\f\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u019f\u0001\u0000\u0000\u0000\u0195\u0196\u0005>\u0000"+
		"\u0000\u0196\u0198\u0003\u0102\u0081\u0000\u0197\u0199\u0003\u001a\r\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u019b\u0005*\u0000\u0000\u019b"+
		"\u019d\u0003\u0018\f\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0188"+
		"\u0001\u0000\u0000\u0000\u019e\u0195\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a4\u0005\u00b6\u0000\u0000\u01a1\u01a3"+
		"\u0003z=\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0005\u00b7\u0000\u0000\u01a8\u0015\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0007\u0001\u0000\u0000\u01aa\u0017\u0001\u0000"+
		"\u0000\u0000\u01ab\u01b0\u0003\u00be_\u0000\u01ac\u01ad\u0005\u00b8\u0000"+
		"\u0000\u01ad\u01af\u0003\u00be_\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000"+
		"\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u0019\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0080\u0000\u0000"+
		"\u01b4\u01b5\u0003\u001c\u000e\u0000\u01b5\u01b6\u0005\u0081\u0000\u0000"+
		"\u01b6\u01c2\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u0080\u0000\u0000"+
		"\u01b8\u01b9\u0003\u001e\u000f\u0000\u01b9\u01ba\u0005\u0081\u0000\u0000"+
		"\u01ba\u01c2\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0080\u0000\u0000"+
		"\u01bc\u01bd\u0003\u001c\u000e\u0000\u01bd\u01be\u0005\u00b8\u0000\u0000"+
		"\u01be\u01bf\u0003\u001e\u000f\u0000\u01bf\u01c0\u0005\u0081\u0000\u0000"+
		"\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01b3\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b7\u0001\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c2\u001b\u0001\u0000\u0000\u0000\u01c3\u01c8\u0003 \u0010\u0000\u01c4"+
		"\u01c5\u0005\u00b8\u0000\u0000\u01c5\u01c7\u0003 \u0010\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u001d"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01d0"+
		"\u0003\"\u0011\u0000\u01cc\u01cd\u0005\u00b8\u0000\u0000\u01cd\u01cf\u0003"+
		"\"\u0011\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u001f\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0003&\u0013\u0000\u01d4\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0003\u0102\u0081\u0000\u01d7!\u0001\u0000\u0000\u0000"+
		"\u01d8\u01da\u0003&\u0013\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0003\u0102\u0081\u0000\u01dc\u01df\u0005\u00bb\u0000\u0000\u01dd"+
		"\u01e0\u0003\u00be_\u0000\u01de\u01e0\u0003\u0108\u0084\u0000\u01df\u01dd"+
		"\u0001\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0#\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0005\u0080\u0000\u0000\u01e2\u01e7\u0003"+
		"\u00c0`\u0000\u01e3\u01e4\u0005\u00b8\u0000\u0000\u01e4\u01e6\u0003\u00c0"+
		"`\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0005\u0081\u0000\u0000\u01eb%\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ee\u0003(\u0014\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f0\'\u0001\u0000\u0000\u0000\u01f1\u01f5"+
		"\u0005\u0006\u0000\u0000\u01f2\u01f3\u0003\u0102\u0081\u0000\u01f3\u01f4"+
		"\u0005\u00b9\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01fc\u0003*\u0015\u0000\u01f8\u01f9\u0005"+
		"\u00b8\u0000\u0000\u01f9\u01fb\u0003*\u0015\u0000\u01fa\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u00b5"+
		"\u0000\u0000\u0200)\u0001\u0000\u0000\u0000\u0201\u0203\u0003\u00c6c\u0000"+
		"\u0202\u0204\u0003\u00ceg\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204+\u0001\u0000\u0000\u0000\u0205\u0207"+
		"\u0003.\u0017\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207\u020a\u0001"+
		"\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001"+
		"\u0000\u0000\u0000\u0209-\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020b\u020f\u00030\u0018\u0000\u020c\u020f\u0003\u0012\t"+
		"\u0000\u020d\u020f\u0003\u0014\n\u0000\u020e\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"+
		"\u020f/\u0001\u0000\u0000\u0000\u0210\u0211\u0003\u0102\u0081\u0000\u0211"+
		"\u0212\u0005\u00b9\u0000\u0000\u0212\u022e\u0001\u0000\u0000\u0000\u0213"+
		"\u022e\u00034\u001a\u0000\u0214\u022e\u00036\u001b\u0000\u0215\u022e\u0003"+
		"@ \u0000\u0216\u022e\u0003B!\u0000\u0217\u022e\u0003D\"\u0000\u0218\u022e"+
		"\u0003J%\u0000\u0219\u022e\u0003P(\u0000\u021a\u022e\u0003R)\u0000\u021b"+
		"\u022e\u0003T*\u0000\u021c\u021d\u0003\u00b4Z\u0000\u021d\u021e\u0005"+
		"\u00ba\u0000\u0000\u021e\u022e\u0001\u0000\u0000\u0000\u021f\u022e\u0003"+
		"r9\u0000\u0220\u022e\u0003x<\u0000\u0221\u022e\u0003v;\u0000\u0222\u022e"+
		"\u0003V+\u0000\u0223\u022e\u0003X,\u0000\u0224\u022e\u0003Z-\u0000\u0225"+
		"\u022e\u0003\\.\u0000\u0226\u022e\u0003b1\u0000\u0227\u022e\u0003d2\u0000"+
		"\u0228\u022e\u0003f3\u0000\u0229\u022e\u00032\u0019\u0000\u022a\u022b"+
		"\u0003&\u0013\u0000\u022b\u022c\u0003V+\u0000\u022c\u022e\u0001\u0000"+
		"\u0000\u0000\u022d\u0210\u0001\u0000\u0000\u0000\u022d\u0213\u0001\u0000"+
		"\u0000\u0000\u022d\u0214\u0001\u0000\u0000\u0000\u022d\u0215\u0001\u0000"+
		"\u0000\u0000\u022d\u0216\u0001\u0000\u0000\u0000\u022d\u0217\u0001\u0000"+
		"\u0000\u0000\u022d\u0218\u0001\u0000\u0000\u0000\u022d\u0219\u0001\u0000"+
		"\u0000\u0000\u022d\u021a\u0001\u0000\u0000\u0000\u022d\u021b\u0001\u0000"+
		"\u0000\u0000\u022d\u021c\u0001\u0000\u0000\u0000\u022d\u021f\u0001\u0000"+
		"\u0000\u0000\u022d\u0220\u0001\u0000\u0000\u0000\u022d\u0221\u0001\u0000"+
		"\u0000\u0000\u022d\u0222\u0001\u0000\u0000\u0000\u022d\u0223\u0001\u0000"+
		"\u0000\u0000\u022d\u0224\u0001\u0000\u0000\u0000\u022d\u0225\u0001\u0000"+
		"\u0000\u0000\u022d\u0226\u0001\u0000\u0000\u0000\u022d\u0227\u0001\u0000"+
		"\u0000\u0000\u022d\u0228\u0001\u0000\u0000\u0000\u022d\u0229\u0001\u0000"+
		"\u0000\u0000\u022d\u022a\u0001\u0000\u0000\u0000\u022e1\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0005\u00ba\u0000\u0000\u02303\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005\u00b6\u0000\u0000\u0232\u0233\u0003,\u0016\u0000\u0233"+
		"\u0234\u0005\u00b7\u0000\u0000\u02345\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u00053\u0000\u0000\u0236\u0237\u0003\u009cN\u0000\u0237\u023b\u00030"+
		"\u0018\u0000\u0238\u023a\u00038\u001c\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0240\u0003<\u001e\u0000"+
		"\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0252\u0001\u0000\u0000\u0000\u0241\u0242\u00053\u0000\u0000\u0242"+
		"\u0243\u0003\u009cN\u0000\u0243\u0244\u0005\u00b9\u0000\u0000\u0244\u0248"+
		"\u0003,\u0016\u0000\u0245\u0247\u0003:\u001d\u0000\u0246\u0245\u0001\u0000"+
		"\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024c\u0001\u0000"+
		"\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024d\u0003>\u001f"+
		"\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0005%\u0000\u0000"+
		"\u024f\u0250\u0005\u00ba\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000"+
		"\u0251\u0235\u0001\u0000\u0000\u0000\u0251\u0241\u0001\u0000\u0000\u0000"+
		"\u02527\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u001f\u0000\u0000\u0254"+
		"\u0255\u0003\u009cN\u0000\u0255\u0256\u00030\u0018\u0000\u02569\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0005\u001f\u0000\u0000\u0258\u0259\u0003"+
		"\u009cN\u0000\u0259\u025a\u0005\u00b9\u0000\u0000\u025a\u025b\u0003,\u0016"+
		"\u0000\u025b;\u0001\u0000\u0000\u0000\u025c\u025d\u0005\u001e\u0000\u0000"+
		"\u025d\u025e\u00030\u0018\u0000\u025e=\u0001\u0000\u0000\u0000\u025f\u0260"+
		"\u0005\u001e\u0000\u0000\u0260\u0261\u0005\u00b9\u0000\u0000\u0261\u0262"+
		"\u0003,\u0016\u0000\u0262?\u0001\u0000\u0000\u0000\u0263\u0264\u0005`"+
		"\u0000\u0000\u0264\u026b\u0003\u009cN\u0000\u0265\u026c\u00030\u0018\u0000"+
		"\u0266\u0267\u0005\u00b9\u0000\u0000\u0267\u0268\u0003,\u0016\u0000\u0268"+
		"\u0269\u0005\'\u0000\u0000\u0269\u026a\u0005\u00ba\u0000\u0000\u026a\u026c"+
		"\u0001\u0000\u0000\u0000\u026b\u0265\u0001\u0000\u0000\u0000\u026b\u0266"+
		"\u0001\u0000\u0000\u0000\u026cA\u0001\u0000\u0000\u0000\u026d\u026e\u0005"+
		"\u001a\u0000\u0000\u026e\u026f\u00030\u0018\u0000\u026f\u0270\u0005`\u0000"+
		"\u0000\u0270\u0271\u0003\u009cN\u0000\u0271\u0272\u0005\u00ba\u0000\u0000"+
		"\u0272C\u0001\u0000\u0000\u0000\u0273\u0274\u0005.\u0000\u0000\u0274\u0276"+
		"\u0005\u00b2\u0000\u0000\u0275\u0277\u0003F#\u0000\u0276\u0275\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0005\u00ba\u0000\u0000\u0279\u027b\u0003\u009a"+
		"M\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0005\u00ba\u0000"+
		"\u0000\u027d\u027f\u0003H$\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280"+
		"\u0287\u0005\u00b3\u0000\u0000\u0281\u0288\u00030\u0018\u0000\u0282\u0283"+
		"\u0005\u00b9\u0000\u0000\u0283\u0284\u0003,\u0016\u0000\u0284\u0285\u0005"+
		"#\u0000\u0000\u0285\u0286\u0005\u00ba\u0000\u0000\u0286\u0288\u0001\u0000"+
		"\u0000\u0000\u0287\u0281\u0001\u0000\u0000\u0000\u0287\u0282\u0001\u0000"+
		"\u0000\u0000\u0288E\u0001\u0000\u0000\u0000\u0289\u028a\u0003\u009aM\u0000"+
		"\u028aG\u0001\u0000\u0000\u0000\u028b\u028c\u0003\u009aM\u0000\u028cI"+
		"\u0001\u0000\u0000\u0000\u028d\u028e\u0005V\u0000\u0000\u028e\u02a6\u0003"+
		"\u009cN\u0000\u028f\u0291\u0005\u00b6\u0000\u0000\u0290\u0292\u0005\u00ba"+
		"\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000"+
		"\u0000\u0000\u0292\u0296\u0001\u0000\u0000\u0000\u0293\u0295\u0003L&\u0000"+
		"\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000"+
		"\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u02a7\u0005\u00b7\u0000\u0000\u029a\u029c\u0005\u00b9\u0000\u0000"+
		"\u029b\u029d\u0005\u00ba\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u02a1\u0001\u0000\u0000\u0000"+
		"\u029e\u02a0\u0003L&\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005&\u0000\u0000\u02a5\u02a7\u0005"+
		"\u00ba\u0000\u0000\u02a6\u028f\u0001\u0000\u0000\u0000\u02a6\u029a\u0001"+
		"\u0000\u0000\u0000\u02a7K\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\u0012"+
		"\u0000\u0000\u02a9\u02aa\u0003\u009eO\u0000\u02aa\u02ab\u0007\u0002\u0000"+
		"\u0000\u02ab\u02ac\u0003N\'\u0000\u02ac\u02b1\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0005\u0019\u0000\u0000\u02ae\u02af\u0007\u0002\u0000\u0000"+
		"\u02af\u02b1\u0003N\'\u0000\u02b0\u02a8\u0001\u0000\u0000\u0000\u02b0"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b1M\u0001\u0000\u0000\u0000\u02b2\u02b3"+
		"\u0003,\u0016\u0000\u02b3O\u0001\u0000\u0000\u0000\u02b4\u02b6\u0005\u0010"+
		"\u0000\u0000\u02b5\u02b7\u0003\u009eO\u0000\u02b6\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0005\u00ba\u0000\u0000\u02b9Q\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bc\u0005\u0017\u0000\u0000\u02bb\u02bd\u0003\u009eO\u0000\u02bc"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u00ba\u0000\u0000\u02bf"+
		"S\u0001\u0000\u0000\u0000\u02c0\u02c2\u0005S\u0000\u0000\u02c1\u02c3\u0003"+
		"\u009eO\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005\u00ba"+
		"\u0000\u0000\u02c5U\u0001\u0000\u0000\u0000\u02c6\u02c7\u0003\u009eO\u0000"+
		"\u02c7\u02c8\u0005\u00ba\u0000\u0000\u02c8W\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0005]\u0000\u0000\u02ca\u02cb\u0005\u00b2\u0000\u0000\u02cb\u02cc"+
		"\u0003\u00e4r\u0000\u02cc\u02cd\u0005\u00b3\u0000\u0000\u02cd\u02ce\u0005"+
		"\u00ba\u0000\u0000\u02ceY\u0001\u0000\u0000\u0000\u02cf\u02fc\u0005/\u0000"+
		"\u0000\u02d0\u02d1\u0005\u00b2\u0000\u0000\u02d1\u02d2\u0003\u009eO\u0000"+
		"\u02d2\u02d3\u0005\f\u0000\u0000\u02d3\u02d4\u0003\u00a4R\u0000\u02d4"+
		"\u02d5\u0005\u00b3\u0000\u0000\u02d5\u02fd\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0005\u00b2\u0000\u0000\u02d7\u02d8\u0003\u00e6s\u0000\u02d8\u02da"+
		"\u0005\f\u0000\u0000\u02d9\u02db\u0005\u00a4\u0000\u0000\u02da\u02d9\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e2\u0003\u00a0P\u0000\u02dd\u02df\u0005\u0082"+
		"\u0000\u0000\u02de\u02e0\u0005\u00a4\u0000\u0000\u02df\u02de\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0003\u00e6s\u0000\u02e2\u02dd\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0005\u00b3\u0000\u0000\u02e5\u02fd\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0005\u00b2\u0000\u0000\u02e7\u02e8\u0003\u009eO\u0000"+
		"\u02e8\u02e9\u0005\f\u0000\u0000\u02e9\u02ef\u0003\u00a0P\u0000\u02ea"+
		"\u02ec\u0005\u0082\u0000\u0000\u02eb\u02ed\u0005\u00a4\u0000\u0000\u02ec"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f0\u0003\u00e6s\u0000\u02ef\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005\u00b3\u0000\u0000\u02f2\u02fd"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005\u00b2\u0000\u0000\u02f4\u02f5"+
		"\u0003\u00e6s\u0000\u02f5\u02f6\u0005\f\u0000\u0000\u02f6\u02f7\u0005"+
		"@\u0000\u0000\u02f7\u02f8\u0005\u00b2\u0000\u0000\u02f8\u02f9\u0003\u00fc"+
		"~\u0000\u02f9\u02fa\u0005\u00b3\u0000\u0000\u02fa\u02fb\u0005\u00b3\u0000"+
		"\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02d0\u0001\u0000\u0000"+
		"\u0000\u02fc\u02d6\u0001\u0000\u0000\u0000\u02fc\u02e6\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f3\u0001\u0000\u0000\u0000\u02fd\u0304\u0001\u0000\u0000"+
		"\u0000\u02fe\u0305\u00030\u0018\u0000\u02ff\u0300\u0005\u00b9\u0000\u0000"+
		"\u0300\u0301\u0003,\u0016\u0000\u0301\u0302\u0005$\u0000\u0000\u0302\u0303"+
		"\u0005\u00ba\u0000\u0000\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u02fe"+
		"\u0001\u0000\u0000\u0000\u0304\u02ff\u0001\u0000\u0000\u0000\u0305[\u0001"+
		"\u0000\u0000\u0000\u0306\u0307\u0005Y\u0000\u0000\u0307\u0317\u00034\u001a"+
		"\u0000\u0308\u030a\u0003^/\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b"+
		"\u030c\u0001\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d"+
		"\u030f\u0003`0\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001"+
		"\u0000\u0000\u0000\u030f\u0318\u0001\u0000\u0000\u0000\u0310\u0312\u0003"+
		"^/\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0312\u0315\u0001\u0000\u0000"+
		"\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000"+
		"\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000"+
		"\u0000\u0316\u0318\u0003`0\u0000\u0317\u0309\u0001\u0000\u0000\u0000\u0317"+
		"\u0313\u0001\u0000\u0000\u0000\u0318]\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0005\u0013\u0000\u0000\u031a\u031b\u0005\u00b2\u0000\u0000\u031b\u0320"+
		"\u0003\u00be_\u0000\u031c\u031d\u0005\u00a5\u0000\u0000\u031d\u031f\u0003"+
		"\u00be_\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000"+
		"\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"+
		"\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0005\u00be\u0000\u0000\u0324\u0323\u0001\u0000"+
		"\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005\u00b3\u0000\u0000\u0327\u0328\u00034\u001a"+
		"\u0000\u0328_\u0001\u0000\u0000\u0000\u0329\u032a\u0005,\u0000\u0000\u032a"+
		"\u032b\u00034\u001a\u0000\u032ba\u0001\u0000\u0000\u0000\u032c\u032d\u0005"+
		"W\u0000\u0000\u032d\u032e\u0003\u009eO\u0000\u032e\u032f\u0005\u00ba\u0000"+
		"\u0000\u032fc\u0001\u0000\u0000\u0000\u0330\u0331\u00052\u0000\u0000\u0331"+
		"\u0332\u0003\u0102\u0081\u0000\u0332\u0333\u0005\u00ba\u0000\u0000\u0333"+
		"e\u0001\u0000\u0000\u0000\u0334\u0335\u0005\u0018\u0000\u0000\u0335\u0336"+
		"\u0005\u00b2\u0000\u0000\u0336\u0337\u0003h4\u0000\u0337\u033e\u0005\u00b3"+
		"\u0000\u0000\u0338\u033f\u00030\u0018\u0000\u0339\u033a\u0005\u00b9\u0000"+
		"\u0000\u033a\u033b\u0003,\u0016\u0000\u033b\u033c\u0005\"\u0000\u0000"+
		"\u033c\u033d\u0005\u00ba\u0000\u0000\u033d\u033f\u0001\u0000\u0000\u0000"+
		"\u033e\u0338\u0001\u0000\u0000\u0000\u033e\u0339\u0001\u0000\u0000\u0000"+
		"\u033fg\u0001\u0000\u0000\u0000\u0340\u0345\u0003j5\u0000\u0341\u0342"+
		"\u0005\u00b8\u0000\u0000\u0342\u0344\u0003j5\u0000\u0343\u0341\u0001\u0000"+
		"\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346i\u0001\u0000\u0000"+
		"\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u0349\u0005d\u0000\u0000"+
		"\u0349\u034c\u0005\u00bb\u0000\u0000\u034a\u034d\u0003\u00dam\u0000\u034b"+
		"\u034d\u0005\u00c2\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c"+
		"\u034b\u0001\u0000\u0000\u0000\u034d\u0355\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0005e\u0000\u0000\u034f\u0350\u0005\u00bb\u0000\u0000\u0350\u0355"+
		"\u0005\u00c6\u0000\u0000\u0351\u0352\u0005f\u0000\u0000\u0352\u0353\u0005"+
		"\u00bb\u0000\u0000\u0353\u0355\u0003\u00dam\u0000\u0354\u0348\u0001\u0000"+
		"\u0000\u0000\u0354\u034e\u0001\u0000\u0000\u0000\u0354\u0351\u0001\u0000"+
		"\u0000\u0000\u0355k\u0001\u0000\u0000\u0000\u0356\u0358\u0003n7\u0000"+
		"\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000"+
		"\u0358\u035d\u0001\u0000\u0000\u0000\u0359\u035a\u0005\u00b8\u0000\u0000"+
		"\u035a\u035c\u0003n7\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035f"+
		"\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e"+
		"\u0001\u0000\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d"+
		"\u0001\u0000\u0000\u0000\u0360\u0362\u0005\u00b8\u0000\u0000\u0361\u0360"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362m\u0001"+
		"\u0000\u0000\u0000\u0363\u0365\u0003&\u0013\u0000\u0364\u0363\u0001\u0000"+
		"\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0369\u0001\u0000"+
		"\u0000\u0000\u0366\u0368\u0003\u0104\u0082\u0000\u0367\u0366\u0001\u0000"+
		"\u0000\u0000\u0368\u036b\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000"+
		"\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000"+
		"\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036c\u036e\u0005\u00b1"+
		"\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000"+
		"\u0000\u0000\u036e\u0370\u0001\u0000\u0000\u0000\u036f\u0371\u0003p8\u0000"+
		"\u0370\u036f\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000"+
		"\u0371\u0373\u0001\u0000\u0000\u0000\u0372\u0374\u0005\u00a4\u0000\u0000"+
		"\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000"+
		"\u0374\u0376\u0001\u0000\u0000\u0000\u0375\u0377\u0005\u00a1\u0000\u0000"+
		"\u0376\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0003\u0090H\u0000\u0379"+
		"o\u0001\u0000\u0000\u0000\u037a\u037b\u00068\uffff\uffff\u0000\u037b\u037f"+
		"\u0003\u00be_\u0000\u037c\u037f\u0005\u0011\u0000\u0000\u037d\u037f\u0003"+
		"\u0108\u0084\u0000\u037e\u037a\u0001\u0000\u0000\u0000\u037e\u037c\u0001"+
		"\u0000\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037f\u0385\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\n\u0001\u0000\u0000\u0381\u0382\u0005\u00a5"+
		"\u0000\u0000\u0382\u0384\u0003p8\u0002\u0383\u0380\u0001\u0000\u0000\u0000"+
		"\u0384\u0387\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000"+
		"\u0385\u0386\u0001\u0000\u0000\u0000\u0386q\u0001\u0000\u0000\u0000\u0387"+
		"\u0385\u0001\u0000\u0000\u0000\u0388\u0389\u00051\u0000\u0000\u0389\u038e"+
		"\u0003t:\u0000\u038a\u038b\u0005\u00b8\u0000\u0000\u038b\u038d\u0003t"+
		":\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d\u0390\u0001\u0000\u0000"+
		"\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000"+
		"\u0000\u0391\u0392\u0005\u00ba\u0000\u0000\u0392s\u0001\u0000\u0000\u0000"+
		"\u0393\u039c\u0005\u00be\u0000\u0000\u0394\u0395\u0005\u00af\u0000\u0000"+
		"\u0395\u039c\u0003\u00e6s\u0000\u0396\u0397\u0005\u00af\u0000\u0000\u0397"+
		"\u0398\u0005\u00b6\u0000\u0000\u0398\u0399\u0003\u009eO\u0000\u0399\u039a"+
		"\u0005\u00b7\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0393"+
		"\u0001\u0000\u0000\u0000\u039b\u0394\u0001\u0000\u0000\u0000\u039b\u0396"+
		"\u0001\u0000\u0000\u0000\u039cu\u0001\u0000\u0000\u0000\u039d\u039e\u0005"+
		"\u001d\u0000\u0000\u039e\u039f\u0003\u009aM\u0000\u039f\u03a0\u0005\u00ba"+
		"\u0000\u0000\u03a0w\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005T\u0000\u0000"+
		"\u03a2\u03a7\u0003\u0090H\u0000\u03a3\u03a4\u0005\u00b8\u0000\u0000\u03a4"+
		"\u03a6\u0003\u0090H\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a8\u03aa\u0001\u0000\u0000\u0000\u03a9\u03a7"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\u00ba\u0000\u0000\u03aby\u0001"+
		"\u0000\u0000\u0000\u03ac\u03ae\u0003&\u0013\u0000\u03ad\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03e1\u0001\u0000"+
		"\u0000\u0000\u03af\u03b1\u0003\u008cF\u0000\u03b0\u03b2\u0003p8\u0000"+
		"\u03b1\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b8\u0003\u0090H\u0000\u03b4"+
		"\u03b5\u0005\u00b8\u0000\u0000\u03b5\u03b7\u0003\u0090H\u0000\u03b6\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b7\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bb"+
		"\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03bc"+
		"\u0005\u00ba\u0000\u0000\u03bc\u03e2\u0001\u0000\u0000\u0000\u03bd\u03bf"+
		"\u0003\u008eG\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001"+
		"\u0000\u0000\u0000\u03bf\u03df\u0001\u0000\u0000\u0000\u03c0\u03c2\u0005"+
		"\u0016\u0000\u0000\u03c1\u03c3\u0003p8\u0000\u03c2\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c9\u0003\u0092I\u0000\u03c5\u03c6\u0005\u00b8\u0000\u0000"+
		"\u03c6\u03c8\u0003\u0092I\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c8"+
		"\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03c9"+
		"\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cc\u0001\u0000\u0000\u0000\u03cb"+
		"\u03c9\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005\u00ba\u0000\u0000\u03cd"+
		"\u03e0\u0001\u0000\u0000\u0000\u03ce\u03d0\u00050\u0000\u0000\u03cf\u03d1"+
		"\u0005\u00a4\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d4"+
		"\u0003\u0102\u0081\u0000\u03d3\u03d5\u0003\u001a\r\u0000\u03d4\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d7\u0005\u00b2\u0000\u0000\u03d7\u03d8\u0003"+
		"l6\u0000\u03d8\u03db\u0005\u00b3\u0000\u0000\u03d9\u03dc\u0003\u0086C"+
		"\u0000\u03da\u03dc\u0003\u0088D\u0000\u03db\u03d9\u0001\u0000\u0000\u0000"+
		"\u03db\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000"+
		"\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03de\u0003\u008aE\u0000\u03de"+
		"\u03e0\u0001\u0000\u0000\u0000\u03df\u03c0\u0001\u0000\u0000\u0000\u03df"+
		"\u03ce\u0001\u0000\u0000\u0000\u03e0\u03e2\u0001\u0000\u0000\u0000\u03e1"+
		"\u03af\u0001\u0000\u0000\u0000\u03e1\u03be\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e8\u0001\u0000\u0000\u0000\u03e3\u03e4\u0005^\u0000\u0000\u03e4\u03e5"+
		"\u0003\u00ccf\u0000\u03e5\u03e6\u0003|>\u0000\u03e6\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e7\u03ad\u0001\u0000\u0000\u0000\u03e7\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e8{\u0001\u0000\u0000\u0000\u03e9\u03f3\u0005\u00ba\u0000"+
		"\u0000\u03ea\u03ee\u0005\u00b6\u0000\u0000\u03eb\u03ed\u0003~?\u0000\u03ec"+
		"\u03eb\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000\u0000\u0000\u03ee"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f1"+
		"\u03f3\u0005\u00b7\u0000\u0000\u03f2\u03e9\u0001\u0000\u0000\u0000\u03f2"+
		"\u03ea\u0001\u0000\u0000\u0000\u03f3}\u0001\u0000\u0000\u0000\u03f4\u03f7"+
		"\u0003\u0080@\u0000\u03f5\u03f7\u0003\u0082A\u0000\u03f6\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f7\u007f\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0003\u00c6c\u0000\u03f9\u03fa\u0005\u009e\u0000"+
		"\u0000\u03fa\u03fb\u0003\u0102\u0081\u0000\u03fb\u03fc\u00059\u0000\u0000"+
		"\u03fc\u03fd\u0003\u00ccf\u0000\u03fd\u03fe\u0005\u00ba\u0000\u0000\u03fe"+
		"\u0081\u0001\u0000\u0000\u0000\u03ff\u0400\u0003\u0084B\u0000\u0400\u0406"+
		"\u0005\f\u0000\u0000\u0401\u0407\u0003\u0104\u0082\u0000\u0402\u0404\u0003"+
		"\u0104\u0082\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0403\u0404\u0001"+
		"\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0407\u0003"+
		"\u0102\u0081\u0000\u0406\u0401\u0001\u0000\u0000\u0000\u0406\u0403\u0001"+
		"\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0005"+
		"\u00ba\u0000\u0000\u0409\u0083\u0001\u0000\u0000\u0000\u040a\u040b\u0003"+
		"\u00c6c\u0000\u040b\u040c\u0005\u009e\u0000\u0000\u040c\u040e\u0001\u0000"+
		"\u0000\u0000\u040d\u040a\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410\u0003\u0102"+
		"\u0081\u0000\u0410\u0085\u0001\u0000\u0000\u0000\u0411\u0412\u0005\u00b9"+
		"\u0000\u0000\u0412\u0414\u0003\u0102\u0081\u0000\u0413\u0415\u0003\u00ce"+
		"g\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000"+
		"\u0000\u0415\u0087\u0001\u0000\u0000\u0000\u0416\u0418\u0005\u00b9\u0000"+
		"\u0000\u0417\u0419\u0005\u00b1\u0000\u0000\u0418\u0417\u0001\u0000\u0000"+
		"\u0000\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000"+
		"\u0000\u041a\u041b\u0003p8\u0000\u041b\u0089\u0001\u0000\u0000\u0000\u041c"+
		"\u041f\u0005\u00ba\u0000\u0000\u041d\u041f\u00034\u001a\u0000\u041e\u041c"+
		"\u0001\u0000\u0000\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f\u008b"+
		"\u0001\u0000\u0000\u0000\u0420\u0423\u0003\u008eG\u0000\u0421\u0423\u0005"+
		"_\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0421\u0001\u0000"+
		"\u0000\u0000\u0423\u008d\u0001\u0000\u0000\u0000\u0424\u0426\u0003\u0104"+
		"\u0082\u0000\u0425\u0424\u0001\u0000\u0000\u0000\u0426\u0427\u0001\u0000"+
		"\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000"+
		"\u0000\u0000\u0428\u008f\u0001\u0000\u0000\u0000\u0429\u042c\u0005\u00be"+
		"\u0000\u0000\u042a\u042b\u0005\u00bb\u0000\u0000\u042b\u042d\u0003\u00d4"+
		"j\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000"+
		"\u0000\u042d\u0091\u0001\u0000\u0000\u0000\u042e\u042f\u0003\u0102\u0081"+
		"\u0000\u042f\u0430\u0005\u00bb\u0000\u0000\u0430\u0431\u0003\u00d4j\u0000"+
		"\u0431\u0093\u0001\u0000\u0000\u0000\u0432\u0434\u0003&\u0013\u0000\u0433"+
		"\u0432\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434"+
		"\u0435\u0001\u0000\u0000\u0000\u0435\u0436\u0005\u0016\u0000\u0000\u0436"+
		"\u043b\u0003\u0092I\u0000\u0437\u0438\u0005\u00b8\u0000\u0000\u0438\u043a"+
		"\u0003\u0092I\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043d\u0001"+
		"\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001"+
		"\u0000\u0000\u0000\u043c\u043e\u0001\u0000\u0000\u0000\u043d\u043b\u0001"+
		"\u0000\u0000\u0000\u043e\u043f\u0005\u00ba\u0000\u0000\u043f\u0095\u0001"+
		"\u0000\u0000\u0000\u0440\u0441\u0005!\u0000\u0000\u0441\u0444\u0003\u0102"+
		"\u0081\u0000\u0442\u0443\u0005\u00b9\u0000\u0000\u0443\u0445\u0007\u0003"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000"+
		"\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0447\u00054\u0000"+
		"\u0000\u0447\u0449\u0003\u0018\f\u0000\u0448\u0446\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000"+
		"\u044a\u044e\u0005\u00b6\u0000\u0000\u044b\u044d\u0003\u0098L\u0000\u044c"+
		"\u044b\u0001\u0000\u0000\u0000\u044d\u0450\u0001\u0000\u0000\u0000\u044e"+
		"\u044c\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f"+
		"\u0451\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0005\u00b7\u0000\u0000\u0452\u0097\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u0005\u0012\u0000\u0000\u0454\u0457\u0003\u0102\u0081\u0000\u0455"+
		"\u0456\u0005\u00bb\u0000\u0000\u0456\u0458\u0003\u009eO\u0000\u0457\u0455"+
		"\u0001\u0000\u0000\u0000\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u0459"+
		"\u0001\u0000\u0000\u0000\u0459\u045a\u0005\u00ba\u0000\u0000\u045a\u0464"+
		"\u0001\u0000\u0000\u0000\u045b\u045d\u0003\u008eG\u0000\u045c\u045b\u0001"+
		"\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045e\u0001"+
		"\u0000\u0000\u0000\u045e\u0464\u0003\u0012\t\u0000\u045f\u0460\u0005^"+
		"\u0000\u0000\u0460\u0461\u0003\u00ccf\u0000\u0461\u0462\u0003|>\u0000"+
		"\u0462\u0464\u0001\u0000\u0000\u0000\u0463\u0453\u0001\u0000\u0000\u0000"+
		"\u0463\u045c\u0001\u0000\u0000\u0000\u0463\u045f\u0001\u0000\u0000\u0000"+
		"\u0464\u0099\u0001\u0000\u0000\u0000\u0465\u046a\u0003\u009eO\u0000\u0466"+
		"\u0467\u0005\u00b8\u0000\u0000\u0467\u0469\u0003\u009eO\u0000\u0468\u0466"+
		"\u0001\u0000\u0000\u0000\u0469\u046c\u0001\u0000\u0000\u0000\u046a\u0468"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u009b"+
		"\u0001\u0000\u0000\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046d\u0470"+
		"\u0005\u00b2\u0000\u0000\u046e\u0471\u0003\u009eO\u0000\u046f\u0471\u0003"+
		"\u00b4Z\u0000\u0470\u046e\u0001\u0000\u0000\u0000\u0470\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0473\u0005\u00b3"+
		"\u0000\u0000\u0473\u009d\u0001\u0000\u0000\u0000\u0474\u0475\u0006O\uffff"+
		"\uffff\u0000\u0475\u0476\u0005\u0015\u0000\u0000\u0476\u04cf\u0003\u009e"+
		"O0\u0477\u04cf\u0003\u00b0X\u0000\u0478\u0479\u0003\u00deo\u0000\u0479"+
		"\u047a\u0005\u00b4\u0000\u0000\u047a\u047b\u0003\u009eO\u0000\u047b\u047c"+
		"\u0005\u00b5\u0000\u0000\u047c\u04cf\u0001\u0000\u0000\u0000\u047d\u047e"+
		"\u0005\u00b2\u0000\u0000\u047e\u047f\u0003\u010a\u0085\u0000\u047f\u0480"+
		"\u0005\u00b3\u0000\u0000\u0480\u0481\u0003\u009eO-\u0481\u04cf\u0001\u0000"+
		"\u0000\u0000\u0482\u0483\u0007\u0004\u0000\u0000\u0483\u04cf\u0003\u009e"+
		"O,\u0484\u0485\u0007\u0005\u0000\u0000\u0485\u04cf\u0003\u009eO+\u0486"+
		"\u0487\u0007\u0006\u0000\u0000\u0487\u04cf\u0003\u00e6s\u0000\u0488\u0489"+
		"\u0003\u00e6s\u0000\u0489\u048a\u0007\u0006\u0000\u0000\u048a\u04cf\u0001"+
		"\u0000\u0000\u0000\u048b\u048c\u0005K\u0000\u0000\u048c\u04cf\u0003\u009e"+
		"O(\u048d\u04cf\u0003\u00a2Q\u0000\u048e\u04cf\u0003\u00e6s\u0000\u048f"+
		"\u04cf\u0003\u00d6k\u0000\u0490\u04cf\u0003\u00e0p\u0000\u0491\u04cf\u0005"+
		"\u00bf\u0000\u0000\u0492\u04cf\u0005\u00c5\u0000\u0000\u0493\u04cf\u0003"+
		"\u009cN\u0000\u0494\u04cf\u0005a\u0000\u0000\u0495\u0496\u0005@\u0000"+
		"\u0000\u0496\u0497\u0005\u00b2\u0000\u0000\u0497\u0498\u0003\u00fc~\u0000"+
		"\u0498\u0499\u0005\u00b3\u0000\u0000\u0499\u049a\u0005\u00bb\u0000\u0000"+
		"\u049a\u049b\u0003\u009eO\u001f\u049b\u04cf\u0001\u0000\u0000\u0000\u049c"+
		"\u049d\u0005?\u0000\u0000\u049d\u049e\u0005\u00b2\u0000\u0000\u049e\u049f"+
		"\u0003\u00e4r\u0000\u049f\u04a0\u0005\u00b3\u0000\u0000\u04a0\u04cf\u0001"+
		"\u0000\u0000\u0000\u04a1\u04a2\u0005 \u0000\u0000\u04a2\u04a3\u0005\u00b2"+
		"\u0000\u0000\u04a3\u04a4\u0003\u00e6s\u0000\u04a4\u04a5\u0005\u00b3\u0000"+
		"\u0000\u04a5\u04cf\u0001\u0000\u0000\u0000\u04a6\u04a7\u0005(\u0000\u0000"+
		"\u04a7\u04a8\u0005\u00b2\u0000\u0000\u04a8\u04a9\u0003\u009eO\u0000\u04a9"+
		"\u04aa\u0005\u00b3\u0000\u0000\u04aa\u04cf\u0001\u0000\u0000\u0000\u04ab"+
		"\u04af\u0005)\u0000\u0000\u04ac\u04ad\u0005\u00b2\u0000\u0000\u04ad\u04b0"+
		"\u0005\u00b3\u0000\u0000\u04ae\u04b0\u0003\u009cN\u0000\u04af\u04ac\u0001"+
		"\u0000\u0000\u0000\u04af\u04ae\u0001\u0000\u0000\u0000\u04af\u04b0\u0001"+
		"\u0000\u0000\u0000\u04b0\u04cf\u0001\u0000\u0000\u0000\u04b1\u04cf\u0003"+
		"\u00aaU\u0000\u04b2\u04cf\u0003\u00acV\u0000\u04b3\u04b4\u0007\u0007\u0000"+
		"\u0000\u04b4\u04cf\u0003\u009eO\t\u04b5\u04b6\u0007\b\u0000\u0000\u04b6"+
		"\u04cf\u0003\u009eO\b\u04b7\u04b8\u0005W\u0000\u0000\u04b8\u04cf\u0003"+
		"\u009eO\u0007\u04b9\u04ba\u0003\u00a4R\u0000\u04ba\u04bb\u0005\u00bb\u0000"+
		"\u0000\u04bb\u04bc\u0003\u009eO\u0006\u04bc\u04cf\u0001\u0000\u0000\u0000"+
		"\u04bd\u04be\u0003\u00a0P\u0000\u04be\u04c0\u0003\u00b2Y\u0000\u04bf\u04c1"+
		"\u0003&\u0013\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001"+
		"\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c3\u0003"+
		"\u009eO\u0005\u04c3\u04cf\u0001\u0000\u0000\u0000\u04c4\u04c5\u0003\u00a0"+
		"P\u0000\u04c5\u04c7\u0005\u00bb\u0000\u0000\u04c6\u04c8\u0003&\u0013\u0000"+
		"\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04cc\u0005\u00a4\u0000\u0000"+
		"\u04ca\u04cd\u0003\u00e6s\u0000\u04cb\u04cd\u0003\u00b0X\u0000\u04cc\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cb\u0001\u0000\u0000\u0000\u04cd\u04cf"+
		"\u0001\u0000\u0000\u0000\u04ce\u0474\u0001\u0000\u0000\u0000\u04ce\u0477"+
		"\u0001\u0000\u0000\u0000\u04ce\u0478\u0001\u0000\u0000\u0000\u04ce\u047d"+
		"\u0001\u0000\u0000\u0000\u04ce\u0482\u0001\u0000\u0000\u0000\u04ce\u0484"+
		"\u0001\u0000\u0000\u0000\u04ce\u0486\u0001\u0000\u0000\u0000\u04ce\u0488"+
		"\u0001\u0000\u0000\u0000\u04ce\u048b\u0001\u0000\u0000\u0000\u04ce\u048d"+
		"\u0001\u0000\u0000\u0000\u04ce\u048e\u0001\u0000\u0000\u0000\u04ce\u048f"+
		"\u0001\u0000\u0000\u0000\u04ce\u0490\u0001\u0000\u0000\u0000\u04ce\u0491"+
		"\u0001\u0000\u0000\u0000\u04ce\u0492\u0001\u0000\u0000\u0000\u04ce\u0493"+
		"\u0001\u0000\u0000\u0000\u04ce\u0494\u0001\u0000\u0000\u0000\u04ce\u0495"+
		"\u0001\u0000\u0000\u0000\u04ce\u049c\u0001\u0000\u0000\u0000\u04ce\u04a1"+
		"\u0001\u0000\u0000\u0000\u04ce\u04a6\u0001\u0000\u0000\u0000\u04ce\u04ab"+
		"\u0001\u0000\u0000\u0000\u04ce\u04b1\u0001\u0000\u0000\u0000\u04ce\u04b2"+
		"\u0001\u0000\u0000\u0000\u04ce\u04b3\u0001\u0000\u0000\u0000\u04ce\u04b5"+
		"\u0001\u0000\u0000\u0000\u04ce\u04b7\u0001\u0000\u0000\u0000\u04ce\u04b9"+
		"\u0001\u0000\u0000\u0000\u04ce\u04bd\u0001\u0000\u0000\u0000\u04ce\u04c4"+
		"\u0001\u0000\u0000\u0000\u04cf\u050c\u0001\u0000\u0000\u0000\u04d0\u04d1"+
		"\n\u0018\u0000\u0000\u04d1\u04d2\u0005\u008e\u0000\u0000\u04d2\u050b\u0003"+
		"\u009eO\u0018\u04d3\u04d4\n\u0016\u0000\u0000\u04d4\u04d5\u0007\t\u0000"+
		"\u0000\u04d5\u050b\u0003\u009eO\u0017\u04d6\u04d7\n\u0015\u0000\u0000"+
		"\u04d7\u04d8\u0007\n\u0000\u0000\u04d8\u050b\u0003\u009eO\u0016\u04d9"+
		"\u04da\n\u0014\u0000\u0000\u04da\u04db\u0007\u000b\u0000\u0000\u04db\u050b"+
		"\u0003\u009eO\u0015\u04dc\u04dd\n\u0013\u0000\u0000\u04dd\u04de\u0007"+
		"\f\u0000\u0000\u04de\u050b\u0003\u009eO\u0014\u04df\u04e0\n\u0012\u0000"+
		"\u0000\u04e0\u04e1\u0007\r\u0000\u0000\u04e1\u050b\u0003\u009eO\u0013"+
		"\u04e2\u04e3\n\u0011\u0000\u0000\u04e3\u04e4\u0005\u00a4\u0000\u0000\u04e4"+
		"\u050b\u0003\u009eO\u0012\u04e5\u04e6\n\u0010\u0000\u0000\u04e6\u04e7"+
		"\u0005\u00a7\u0000\u0000\u04e7\u050b\u0003\u009eO\u0011\u04e8\u04e9\n"+
		"\u000f\u0000\u0000\u04e9\u04ea\u0005\u00a5\u0000\u0000\u04ea\u050b\u0003"+
		"\u009eO\u0010\u04eb\u04ec\n\u000e\u0000\u0000\u04ec\u04ed\u0005\u0099"+
		"\u0000\u0000\u04ed\u050b\u0003\u009eO\u000f\u04ee\u04ef\n\r\u0000\u0000"+
		"\u04ef\u04f0\u0005\u0098\u0000\u0000\u04f0\u050b\u0003\u009eO\u000e\u04f1"+
		"\u04f2\n\f\u0000\u0000\u04f2\u04f4\u0005\u00b1\u0000\u0000\u04f3\u04f5"+
		"\u0003\u009eO\u0000\u04f4\u04f3\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000\u0000\u04f6\u04f7\u0005"+
		"\u00b9\u0000\u0000\u04f7\u050b\u0003\u009eO\r\u04f8\u04f9\n\u000b\u0000"+
		"\u0000\u04f9\u04fa\u0005\u009a\u0000\u0000\u04fa\u050b\u0003\u009eO\f"+
		"\u04fb\u04fc\n\n\u0000\u0000\u04fc\u04fd\u0005\u007f\u0000\u0000\u04fd"+
		"\u050b\u0003\u009eO\u000b\u04fe\u04ff\n\u0003\u0000\u0000\u04ff\u0500"+
		"\u0005A\u0000\u0000\u0500\u050b\u0003\u009eO\u0004\u0501\u0502\n\u0002"+
		"\u0000\u0000\u0502\u0503\u0005C\u0000\u0000\u0503\u050b\u0003\u009eO\u0003"+
		"\u0504\u0505\n\u0001\u0000\u0000\u0505\u0506\u0005B\u0000\u0000\u0506"+
		"\u050b\u0003\u009eO\u0002\u0507\u0508\n\u0017\u0000\u0000\u0508\u0509"+
		"\u00058\u0000\u0000\u0509\u050b\u0003\u00c0`\u0000\u050a\u04d0\u0001\u0000"+
		"\u0000\u0000\u050a\u04d3\u0001\u0000\u0000\u0000\u050a\u04d6\u0001\u0000"+
		"\u0000\u0000\u050a\u04d9\u0001\u0000\u0000\u0000\u050a\u04dc\u0001\u0000"+
		"\u0000\u0000\u050a\u04df\u0001\u0000\u0000\u0000\u050a\u04e2\u0001\u0000"+
		"\u0000\u0000\u050a\u04e5\u0001\u0000\u0000\u0000\u050a\u04e8\u0001\u0000"+
		"\u0000\u0000\u050a\u04eb\u0001\u0000\u0000\u0000\u050a\u04ee\u0001\u0000"+
		"\u0000\u0000\u050a\u04f1\u0001\u0000\u0000\u0000\u050a\u04f8\u0001\u0000"+
		"\u0000\u0000\u050a\u04fb\u0001\u0000\u0000\u0000\u050a\u04fe\u0001\u0000"+
		"\u0000\u0000\u050a\u0501\u0001\u0000\u0000\u0000\u050a\u0504\u0001\u0000"+
		"\u0000\u0000\u050a\u0507\u0001\u0000\u0000\u0000\u050b\u050e\u0001\u0000"+
		"\u0000\u0000\u050c\u050a\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000"+
		"\u0000\u0000\u050d\u009f\u0001\u0000\u0000\u0000\u050e\u050c\u0001\u0000"+
		"\u0000\u0000\u050f\u0512\u0003\u00e6s\u0000\u0510\u0512\u0003\u00a2Q\u0000"+
		"\u0511\u050f\u0001\u0000\u0000\u0000\u0511\u0510\u0001\u0000\u0000\u0000"+
		"\u0512\u00a1\u0001\u0000\u0000\u0000\u0513\u0514\u0005\u000b\u0000\u0000"+
		"\u0514\u0516\u0005\u00b2\u0000\u0000\u0515\u0517\u0003\u00b6[\u0000\u0516"+
		"\u0515\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000\u0000\u0517"+
		"\u0518\u0001\u0000\u0000\u0000\u0518\u051f\u0005\u00b3\u0000\u0000\u0519"+
		"\u051b\u0005\u00b4\u0000\u0000\u051a\u051c\u0003\u00b6[\u0000\u051b\u051a"+
		"\u0001\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051d"+
		"\u0001\u0000\u0000\u0000\u051d\u051f\u0005\u00b5\u0000\u0000\u051e\u0513"+
		"\u0001\u0000\u0000\u0000\u051e\u0519\u0001\u0000\u0000\u0000\u051f\u0524"+
		"\u0001\u0000\u0000\u0000\u0520\u0521\u0005\u00b4\u0000\u0000\u0521\u0522"+
		"\u0003\u009eO\u0000\u0522\u0523\u0005\u00b5\u0000\u0000\u0523\u0525\u0001"+
		"\u0000\u0000\u0000\u0524\u0520\u0001\u0000\u0000\u0000\u0524\u0525\u0001"+
		"\u0000\u0000\u0000\u0525\u00a3\u0001\u0000\u0000\u0000\u0526\u052a\u0005"+
		"\u00b4\u0000\u0000\u0527\u0529\u0005\u00b8\u0000\u0000\u0528\u0527\u0001"+
		"\u0000\u0000\u0000\u0529\u052c\u0001\u0000\u0000\u0000\u052a\u0528\u0001"+
		"\u0000\u0000\u0000\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u052d\u0001"+
		"\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000\u0000\u052d\u0536\u0003"+
		"\u00a6S\u0000\u052e\u0530\u0005\u00b8\u0000\u0000\u052f\u052e\u0001\u0000"+
		"\u0000\u0000\u0530\u0531\u0001\u0000\u0000\u0000\u0531\u052f\u0001\u0000"+
		"\u0000\u0000\u0531\u0532\u0001\u0000\u0000\u0000\u0532\u0533\u0001\u0000"+
		"\u0000\u0000\u0533\u0535\u0003\u00a6S\u0000\u0534\u052f\u0001\u0000\u0000"+
		"\u0000\u0535\u0538\u0001\u0000\u0000\u0000\u0536\u0534\u0001\u0000\u0000"+
		"\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u053c\u0001\u0000\u0000"+
		"\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0539\u053b\u0005\u00b8\u0000"+
		"\u0000\u053a\u0539\u0001\u0000\u0000\u0000\u053b\u053e\u0001\u0000\u0000"+
		"\u0000\u053c\u053a\u0001\u0000\u0000\u0000\u053c\u053d\u0001\u0000\u0000"+
		"\u0000\u053d\u053f\u0001\u0000\u0000\u0000\u053e\u053c\u0001\u0000\u0000"+
		"\u0000\u053f\u0540\u0005\u00b5\u0000\u0000\u0540\u0554\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0005\u00b4\u0000\u0000\u0542\u054b\u0003\u00a8T\u0000"+
		"\u0543\u0545\u0005\u00b8\u0000\u0000\u0544\u0543\u0001\u0000\u0000\u0000"+
		"\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0544\u0001\u0000\u0000\u0000"+
		"\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000\u0000\u0000"+
		"\u0548\u054a\u0003\u00a8T\u0000\u0549\u0544\u0001\u0000\u0000\u0000\u054a"+
		"\u054d\u0001\u0000\u0000\u0000\u054b\u0549\u0001\u0000\u0000\u0000\u054b"+
		"\u054c\u0001\u0000\u0000\u0000\u054c\u054f\u0001\u0000\u0000\u0000\u054d"+
		"\u054b\u0001\u0000\u0000\u0000\u054e\u0550\u0005\u00b8\u0000\u0000\u054f"+
		"\u054e\u0001\u0000\u0000\u0000\u054f\u0550\u0001\u0000\u0000\u0000\u0550"+
		"\u0551\u0001\u0000\u0000\u0000\u0551\u0552\u0005\u00b5\u0000\u0000\u0552"+
		"\u0554\u0001\u0000\u0000\u0000\u0553\u0526\u0001\u0000\u0000\u0000\u0553"+
		"\u0541\u0001\u0000\u0000\u0000\u0554\u00a5\u0001\u0000\u0000\u0000\u0555"+
		"\u0557\u0005\u00a4\u0000\u0000\u0556\u0555\u0001\u0000\u0000\u0000\u0556"+
		"\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558"+
		"\u0559\u0003\u00e6s\u0000\u0559\u00a7\u0001\u0000\u0000\u0000\u055a\u055b"+
		"\u0003\u009eO\u0000\u055b\u055c\u0005\u0082\u0000\u0000\u055c\u055e\u0001"+
		"\u0000\u0000\u0000\u055d\u055a\u0001\u0000\u0000\u0000\u055d\u055e\u0001"+
		"\u0000\u0000\u0000\u055e\u0560\u0001\u0000\u0000\u0000\u055f\u0561\u0005"+
		"\u00a4\u0000\u0000\u0560\u055f\u0001\u0000\u0000\u0000\u0560\u0561\u0001"+
		"\u0000\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000\u0562\u0563\u0003"+
		"\u00e6s\u0000\u0563\u00a9\u0001\u0000\u0000\u0000\u0564\u0566\u0005T\u0000"+
		"\u0000\u0565\u0564\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000"+
		"\u0000\u0566\u0567\u0001\u0000\u0000\u0000\u0567\u0569\u00050\u0000\u0000"+
		"\u0568\u056a\u0005\u00a4\u0000\u0000\u0569\u0568\u0001\u0000\u0000\u0000"+
		"\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000\u0000"+
		"\u056b\u056c\u0005\u00b2\u0000\u0000\u056c\u056d\u0003l6\u0000\u056d\u056f"+
		"\u0005\u00b3\u0000\u0000\u056e\u0570\u0003\u00ba]\u0000\u056f\u056e\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0573\u0001"+
		"\u0000\u0000\u0000\u0571\u0572\u0005\u00b9\u0000\u0000\u0572\u0574\u0003"+
		"p8\u0000\u0573\u0571\u0001\u0000\u0000\u0000\u0573\u0574\u0001\u0000\u0000"+
		"\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575\u0576\u00034\u001a\u0000"+
		"\u0576\u057f\u0001\u0000\u0000\u0000\u0577\u0578\u0005c\u0000\u0000\u0578"+
		"\u0579\u0005\u00b2\u0000\u0000\u0579\u057a\u0003l6\u0000\u057a\u057b\u0005"+
		"\u00b3\u0000\u0000\u057b\u057c\u0005\u0082\u0000\u0000\u057c\u057d\u0003"+
		"\u009eO\u0000\u057d\u057f\u0001\u0000\u0000\u0000\u057e\u0565\u0001\u0000"+
		"\u0000\u0000\u057e\u0577\u0001\u0000\u0000\u0000\u057f\u00ab\u0001\u0000"+
		"\u0000\u0000\u0580\u0581\u0005D\u0000\u0000\u0581\u0582\u0005\u00b2\u0000"+
		"\u0000\u0582\u0583\u0003\u009eO\u0000\u0583\u0584\u0005\u00b3\u0000\u0000"+
		"\u0584\u0585\u0005\u00b6\u0000\u0000\u0585\u058a\u0003\u00aeW\u0000\u0586"+
		"\u0587\u0005\u00b8\u0000\u0000\u0587\u0589\u0003\u00aeW\u0000\u0588\u0586"+
		"\u0001\u0000\u0000\u0000\u0589\u058c\u0001\u0000\u0000\u0000\u058a\u0588"+
		"\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058e"+
		"\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000\u058d\u058f"+
		"\u0005\u00b8\u0000\u0000\u058e\u058d\u0001\u0000\u0000\u0000\u058e\u058f"+
		"\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0591"+
		"\u0005\u00b7\u0000\u0000\u0591\u00ad\u0001\u0000\u0000\u0000\u0592\u0597"+
		"\u0003\u009eO\u0000\u0593\u0594\u0005\u00b8\u0000\u0000\u0594\u0596\u0003"+
		"\u009eO\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0596\u0599\u0001\u0000"+
		"\u0000\u0000\u0597\u0595\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000"+
		"\u0000\u0000\u0598\u059a\u0001\u0000\u0000\u0000\u0599\u0597\u0001\u0000"+
		"\u0000\u0000\u059a\u059b\u0005\u0082\u0000\u0000\u059b\u059c\u0003\u009e"+
		"O\u0000\u059c\u00af\u0001\u0000\u0000\u0000\u059d\u059e\u0005F\u0000\u0000"+
		"\u059e\u05a0\u0003\u00c0`\u0000\u059f\u05a1\u0003\u00ceg\u0000\u05a0\u059f"+
		"\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u00b1"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a3\u0007\u000e\u0000\u0000\u05a3\u00b3"+
		"\u0001\u0000\u0000\u0000\u05a4\u05ac\u0005a\u0000\u0000\u05a5\u05a8\u0003"+
		"\u009eO\u0000\u05a6\u05a7\u0005\u0082\u0000\u0000\u05a7\u05a9\u0003\u009e"+
		"O\u0000\u05a8\u05a6\u0001\u0000\u0000\u0000\u05a8\u05a9\u0001\u0000\u0000"+
		"\u0000\u05a9\u05ad\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005b\u0000\u0000"+
		"\u05ab\u05ad\u0003\u009eO\u0000\u05ac\u05a5\u0001\u0000\u0000\u0000\u05ac"+
		"\u05aa\u0001\u0000\u0000\u0000\u05ad\u00b5\u0001\u0000\u0000\u0000\u05ae"+
		"\u05b3\u0003\u00b8\\\u0000\u05af\u05b0\u0005\u00b8\u0000\u0000\u05b0\u05b2"+
		"\u0003\u00b8\\\u0000\u05b1\u05af\u0001\u0000\u0000\u0000\u05b2\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b4\u05b7\u0001\u0000\u0000\u0000\u05b5\u05b3\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b8\u0005\u00b8\u0000\u0000\u05b7\u05b6\u0001"+
		"\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u05b9\u05bc\u0003\u009eO\u0000\u05ba\u05bb\u0005\u0082"+
		"\u0000\u0000\u05bb\u05bd\u0003\u009eO\u0000\u05bc\u05ba\u0001\u0000\u0000"+
		"\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000\u05bd\u05c6\u0001\u0000\u0000"+
		"\u0000\u05be\u05bf\u0003\u009eO\u0000\u05bf\u05c0\u0005\u0082\u0000\u0000"+
		"\u05c0\u05c2\u0001\u0000\u0000\u0000\u05c1\u05be\u0001\u0000\u0000\u0000"+
		"\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000\u0000"+
		"\u05c3\u05c4\u0005\u00a4\u0000\u0000\u05c4\u05c6\u0003\u00e6s\u0000\u05c5"+
		"\u05b9\u0001\u0000\u0000\u0000\u05c5\u05c1\u0001\u0000\u0000\u0000\u05c6"+
		"\u00b9\u0001\u0000\u0000\u0000\u05c7\u05c8\u0005^\u0000\u0000\u05c8\u05c9"+
		"\u0005\u00b2\u0000\u0000\u05c9\u05ce\u0003\u00bc^\u0000\u05ca\u05cb\u0005"+
		"\u00b8\u0000\u0000\u05cb\u05cd\u0003\u00bc^\u0000\u05cc\u05ca\u0001\u0000"+
		"\u0000\u0000\u05cd\u05d0\u0001\u0000\u0000\u0000\u05ce\u05cc\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d0\u05ce\u0001\u0000\u0000\u0000\u05d1\u05d2\u0005\u00b3"+
		"\u0000\u0000\u05d2\u00bb\u0001\u0000\u0000\u0000\u05d3\u05d5\u0005\u00a4"+
		"\u0000\u0000\u05d4\u05d3\u0001\u0000\u0000\u0000\u05d4\u05d5\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d7\u0005\u00be"+
		"\u0000\u0000\u05d7\u00bd\u0001\u0000\u0000\u0000\u05d8\u05da\u0003\u00c6"+
		"c\u0000\u05d9\u05db\u0003$\u0012\u0000\u05da\u05d9\u0001\u0000\u0000\u0000"+
		"\u05da\u05db\u0001\u0000\u0000\u0000\u05db\u05de\u0001\u0000\u0000\u0000"+
		"\u05dc\u05de\u0005T\u0000\u0000\u05dd\u05d8\u0001\u0000\u0000\u0000\u05dd"+
		"\u05dc\u0001\u0000\u0000\u0000\u05de\u00bf\u0001\u0000\u0000\u0000\u05df"+
		"\u05e2\u0003\u00c6c\u0000\u05e0\u05e2\u0003\u00c4b\u0000\u05e1\u05df\u0001"+
		"\u0000\u0000\u0000\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e2\u05e4\u0001"+
		"\u0000\u0000\u0000\u05e3\u05e5\u0003$\u0012\u0000\u05e4\u05e3\u0001\u0000"+
		"\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5\u05ea\u0001\u0000"+
		"\u0000\u0000\u05e6\u05ea\u0003\u0108\u0084\u0000\u05e7\u05ea\u0005T\u0000"+
		"\u0000\u05e8\u05ea\u0003\u00c2a\u0000\u05e9\u05e1\u0001\u0000\u0000\u0000"+
		"\u05e9\u05e6\u0001\u0000\u0000\u0000\u05e9\u05e7\u0001\u0000\u0000\u0000"+
		"\u05e9\u05e8\u0001\u0000\u0000\u0000\u05ea\u00c1\u0001\u0000\u0000\u0000"+
		"\u05eb\u05ed\u0003&\u0013\u0000\u05ec\u05eb\u0001\u0000\u0000\u0000\u05ec"+
		"\u05ed\u0001\u0000\u0000\u0000\u05ed\u05ef\u0001\u0000\u0000\u0000\u05ee"+
		"\u05f0\u0005L\u0000\u0000\u05ef\u05ee\u0001\u0000\u0000\u0000\u05ef\u05f0"+
		"\u0001\u0000\u0000\u0000\u05f0\u05f2\u0001\u0000\u0000\u0000\u05f1\u05f3"+
		"\u0003\u0100\u0080\u0000\u05f2\u05f1\u0001\u0000\u0000\u0000\u05f2\u05f3"+
		"\u0001\u0000\u0000\u0000\u05f3\u05f5\u0001\u0000\u0000\u0000\u05f4\u05f6"+
		"\u0005J\u0000\u0000\u05f5\u05f4\u0001\u0000\u0000\u0000\u05f5\u05f6\u0001"+
		"\u0000\u0000\u0000\u05f6\u060c\u0001\u0000\u0000\u0000\u05f7\u05f9\u0003"+
		"\u0016\u000b\u0000\u05f8\u05fa\u0003\u001a\r\u0000\u05f9\u05f8\u0001\u0000"+
		"\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000\u05fa\u05fd\u0001\u0000"+
		"\u0000\u0000\u05fb\u05fc\u0005*\u0000\u0000\u05fc\u05fe\u0003\u00be_\u0000"+
		"\u05fd\u05fb\u0001\u0000\u0000\u0000\u05fd\u05fe\u0001\u0000\u0000\u0000"+
		"\u05fe\u0601\u0001\u0000\u0000\u0000\u05ff\u0600\u00054\u0000\u0000\u0600"+
		"\u0602\u0003\u0018\f\u0000\u0601\u05ff\u0001\u0000\u0000\u0000\u0601\u0602"+
		"\u0001\u0000\u0000\u0000\u0602\u060d\u0001\u0000\u0000\u0000\u0603\u0604"+
		"\u0005>\u0000\u0000\u0604\u0606\u0003\u0102\u0081\u0000\u0605\u0607\u0003"+
		"\u001a\r\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000"+
		"\u0000\u0000\u0607\u060a\u0001\u0000\u0000\u0000\u0608\u0609\u0005*\u0000"+
		"\u0000\u0609\u060b\u0003\u0018\f\u0000\u060a\u0608\u0001\u0000\u0000\u0000"+
		"\u060a\u060b\u0001\u0000\u0000\u0000\u060b\u060d\u0001\u0000\u0000\u0000"+
		"\u060c\u05f7\u0001\u0000\u0000\u0000\u060c\u0603\u0001\u0000\u0000\u0000"+
		"\u060d\u060e\u0001\u0000\u0000\u0000\u060e\u0612\u0005\u00b6\u0000\u0000"+
		"\u060f\u0611\u0003z=\u0000\u0610\u060f\u0001\u0000\u0000\u0000\u0611\u0614"+
		"\u0001\u0000\u0000\u0000\u0612\u0610\u0001\u0000\u0000\u0000\u0612\u0613"+
		"\u0001\u0000\u0000\u0000\u0613\u0615\u0001\u0000\u0000\u0000\u0614\u0612"+
		"\u0001\u0000\u0000\u0000\u0615\u0616\u0005\u00b7\u0000\u0000\u0616\u00c3"+
		"\u0001\u0000\u0000\u0000\u0617\u061c\u0003\u00f2y\u0000\u0618\u0619\u0005"+
		"\u009f\u0000\u0000\u0619\u061b\u0003\u00f4z\u0000\u061a\u0618\u0001\u0000"+
		"\u0000\u0000\u061b\u061e\u0001\u0000\u0000\u0000\u061c\u061a\u0001\u0000"+
		"\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u00c5\u0001\u0000"+
		"\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000\u061f\u0621\u0005E\u0000"+
		"\u0000\u0620\u061f\u0001\u0000\u0000\u0000\u0620\u0621\u0001\u0000\u0000"+
		"\u0000\u0621\u0623\u0001\u0000\u0000\u0000\u0622\u0624\u0005\u00a0\u0000"+
		"\u0000\u0623\u0622\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000"+
		"\u0000\u0624\u0625\u0001\u0000\u0000\u0000\u0625\u0626\u0003\u00c8d\u0000"+
		"\u0626\u00c7\u0001\u0000\u0000\u0000\u0627\u0635\u0003\u0102\u0081\u0000"+
		"\u0628\u062d\u0003\u0102\u0081\u0000\u0629\u062a\u0005\u00a0\u0000\u0000"+
		"\u062a\u062c\u0003\u0102\u0081\u0000\u062b\u0629\u0001\u0000\u0000\u0000"+
		"\u062c\u062f\u0001\u0000\u0000\u0000\u062d\u062b\u0001\u0000\u0000\u0000"+
		"\u062d\u062e\u0001\u0000\u0000\u0000\u062e\u0632\u0001\u0000\u0000\u0000"+
		"\u062f\u062d\u0001\u0000\u0000\u0000\u0630\u0631\u0005\u00a0\u0000\u0000"+
		"\u0631\u0633\u0003\u00cae\u0000\u0632\u0630\u0001\u0000\u0000\u0000\u0632"+
		"\u0633\u0001\u0000\u0000\u0000\u0633\u0635\u0001\u0000\u0000\u0000\u0634"+
		"\u0627\u0001\u0000\u0000\u0000\u0634\u0628\u0001\u0000\u0000\u0000\u0635"+
		"\u00c9\u0001\u0000\u0000\u0000\u0636\u0639\u0003\u0102\u0081\u0000\u0637"+
		"\u0638\u0005\f\u0000\u0000\u0638\u063a\u0003\u0102\u0081\u0000\u0639\u0637"+
		"\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000\u0000\u0000\u063a\u064a"+
		"\u0001\u0000\u0000\u0000\u063b\u063c\u0005\u00b6\u0000\u0000\u063c\u0641"+
		"\u0003\u00cae\u0000\u063d\u063e\u0005\u00b8\u0000\u0000\u063e\u0640\u0003"+
		"\u00cae\u0000\u063f\u063d\u0001\u0000\u0000\u0000\u0640\u0643\u0001\u0000"+
		"\u0000\u0000\u0641\u063f\u0001\u0000\u0000\u0000\u0641\u0642\u0001\u0000"+
		"\u0000\u0000\u0642\u0645\u0001\u0000\u0000\u0000\u0643\u0641\u0001\u0000"+
		"\u0000\u0000\u0644\u0646\u0005\u00b8\u0000\u0000\u0645\u0644\u0001\u0000"+
		"\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000"+
		"\u0000\u0000\u0647\u0648\u0005\u00b7\u0000\u0000\u0648\u064a\u0001\u0000"+
		"\u0000\u0000\u0649\u0636\u0001\u0000\u0000\u0000\u0649\u063b\u0001\u0000"+
		"\u0000\u0000\u064a\u00cb\u0001\u0000\u0000\u0000\u064b\u0650\u0003\u00c6"+
		"c\u0000\u064c\u064d\u0005\u00b8\u0000\u0000\u064d\u064f\u0003\u00c6c\u0000"+
		"\u064e\u064c\u0001\u0000\u0000\u0000\u064f\u0652\u0001\u0000\u0000\u0000"+
		"\u0650\u064e\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000"+
		"\u0651\u00cd\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000\u0000\u0000"+
		"\u0653\u065d\u0005\u00b2\u0000\u0000\u0654\u0659\u0003\u00d0h\u0000\u0655"+
		"\u0656\u0005\u00b8\u0000\u0000\u0656\u0658\u0003\u00d0h\u0000\u0657\u0655"+
		"\u0001\u0000\u0000\u0000\u0658\u065b\u0001\u0000\u0000\u0000\u0659\u0657"+
		"\u0001\u0000\u0000\u0000\u0659\u065a\u0001\u0000\u0000\u0000\u065a\u065e"+
		"\u0001\u0000\u0000\u0000\u065b\u0659\u0001\u0000\u0000\u0000\u065c\u065e"+
		"\u0003\u00b4Z\u0000\u065d\u0654\u0001\u0000\u0000\u0000\u065d\u065c\u0001"+
		"\u0000\u0000\u0000\u065d\u065e\u0001\u0000\u0000\u0000\u065e\u0660\u0001"+
		"\u0000\u0000\u0000\u065f\u0661\u0005\u00b8\u0000\u0000\u0660\u065f\u0001"+
		"\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000\u0661\u0662\u0001"+
		"\u0000\u0000\u0000\u0662\u0663\u0005\u00b3\u0000\u0000\u0663\u00cf\u0001"+
		"\u0000\u0000\u0000\u0664\u0666\u0003\u00d2i\u0000\u0665\u0664\u0001\u0000"+
		"\u0000\u0000\u0665\u0666\u0001\u0000\u0000\u0000\u0666\u0668\u0001\u0000"+
		"\u0000\u0000\u0667\u0669\u0005\u00a1\u0000\u0000\u0668\u0667\u0001\u0000"+
		"\u0000\u0000\u0668\u0669\u0001\u0000\u0000\u0000\u0669\u066a\u0001\u0000"+
		"\u0000\u0000\u066a\u066e\u0003\u009eO\u0000\u066b\u066c\u0005\u00a4\u0000"+
		"\u0000\u066c\u066e\u0003\u00e6s\u0000\u066d\u0665\u0001\u0000\u0000\u0000"+
		"\u066d\u066b\u0001\u0000\u0000\u0000\u066e\u00d1\u0001\u0000\u0000\u0000"+
		"\u066f\u0670\u0003\u0102\u0081\u0000\u0670\u0671\u0005\u00b9\u0000\u0000"+
		"\u0671\u00d3\u0001\u0000\u0000\u0000\u0672\u0696\u0003\u00d6k\u0000\u0673"+
		"\u0696\u0003\u00e0p\u0000\u0674\u0675\u0005\u000b\u0000\u0000\u0675\u067a"+
		"\u0005\u00b2\u0000\u0000\u0676\u0678\u0003\u00b6[\u0000\u0677\u0679\u0005"+
		"\u00b8\u0000\u0000\u0678\u0677\u0001\u0000\u0000\u0000\u0678\u0679\u0001"+
		"\u0000\u0000\u0000\u0679\u067b\u0001\u0000\u0000\u0000\u067a\u0676\u0001"+
		"\u0000\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b\u067c\u0001"+
		"\u0000\u0000\u0000\u067c\u0696\u0005\u00b3\u0000\u0000\u067d\u0682\u0005"+
		"\u00b4\u0000\u0000\u067e\u0680\u0003\u00b6[\u0000\u067f\u0681\u0005\u00b8"+
		"\u0000\u0000\u0680\u067f\u0001\u0000\u0000\u0000\u0680\u0681\u0001\u0000"+
		"\u0000\u0000\u0681\u0683\u0001\u0000\u0000\u0000\u0682\u067e\u0001\u0000"+
		"\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000"+
		"\u0000\u0000\u0684\u0696\u0005\u00b5\u0000\u0000\u0685\u0686\u0007\u000f"+
		"\u0000\u0000\u0686\u0696\u0003\u00d4j\u0000\u0687\u068a\u0003\u00e0p\u0000"+
		"\u0688\u068a\u0003\u00d6k\u0000\u0689\u0687\u0001\u0000\u0000\u0000\u0689"+
		"\u0688\u0001\u0000\u0000\u0000\u068a\u0692\u0001\u0000\u0000\u0000\u068b"+
		"\u068e\u0005\u00b0\u0000\u0000\u068c\u068f\u0003\u00e0p\u0000\u068d\u068f"+
		"\u0003\u00d6k\u0000\u068e\u068c\u0001\u0000\u0000\u0000\u068e\u068d\u0001"+
		"\u0000\u0000\u0000\u068f\u0691\u0001\u0000\u0000\u0000\u0690\u068b\u0001"+
		"\u0000\u0000\u0000\u0691\u0694\u0001\u0000\u0000\u0000\u0692\u0690\u0001"+
		"\u0000\u0000\u0000\u0692\u0693\u0001\u0000\u0000\u0000\u0693\u0696\u0001"+
		"\u0000\u0000\u0000\u0694\u0692\u0001\u0000\u0000\u0000\u0695\u0672\u0001"+
		"\u0000\u0000\u0000\u0695\u0673\u0001\u0000\u0000\u0000\u0695\u0674\u0001"+
		"\u0000\u0000\u0000\u0695\u067d\u0001\u0000\u0000\u0000\u0695\u0685\u0001"+
		"\u0000\u0000\u0000\u0695\u0689\u0001\u0000\u0000\u0000\u0696\u00d5\u0001"+
		"\u0000\u0000\u0000\u0697\u069d\u0005G\u0000\u0000\u0698\u069d\u0003\u00d8"+
		"l\u0000\u0699\u069d\u0003\u0106\u0083\u0000\u069a\u069d\u0003\u00dcn\u0000"+
		"\u069b\u069d\u0003\u00c6c\u0000\u069c\u0697\u0001\u0000\u0000\u0000\u069c"+
		"\u0698\u0001\u0000\u0000\u0000\u069c\u0699\u0001\u0000\u0000\u0000\u069c"+
		"\u069a\u0001\u0000\u0000\u0000\u069c\u069b\u0001\u0000\u0000\u0000\u069d"+
		"\u00d7\u0001\u0000\u0000\u0000\u069e\u06a3\u0005\u00c2\u0000\u0000\u069f"+
		"\u06a3\u0005\u000f\u0000\u0000\u06a0\u06a3\u0003\u00dam\u0000\u06a1\u06a3"+
		"\u0003\u00deo\u0000\u06a2\u069e\u0001\u0000\u0000\u0000\u06a2\u069f\u0001"+
		"\u0000\u0000\u0000\u06a2\u06a0\u0001\u0000\u0000\u0000\u06a2\u06a1\u0001"+
		"\u0000\u0000\u0000\u06a3\u00d9\u0001\u0000\u0000\u0000\u06a4\u06a5\u0007"+
		"\u0010\u0000\u0000\u06a5\u00db\u0001\u0000\u0000\u0000\u06a6\u06a7\u0007"+
		"\u0011\u0000\u0000\u06a7\u06ac\u0005\u009e\u0000\u0000\u06a8\u06ad\u0003"+
		"\u0102\u0081\u0000\u06a9\u06ad\u0005k\u0000\u0000\u06aa\u06ad\u0005g\u0000"+
		"\u0000\u06ab\u06ad\u0005h\u0000\u0000\u06ac\u06a8\u0001\u0000\u0000\u0000"+
		"\u06ac\u06a9\u0001\u0000\u0000\u0000\u06ac\u06aa\u0001\u0000\u0000\u0000"+
		"\u06ac\u06ab\u0001\u0000\u0000\u0000\u06ad\u06b9\u0001\u0000\u0000\u0000"+
		"\u06ae\u06b2\u0003\u00be_\u0000\u06af\u06b2\u0003\u00f8|\u0000\u06b0\u06b2"+
		"\u0003\u00e0p\u0000\u06b1\u06ae\u0001\u0000\u0000\u0000\u06b1\u06af\u0001"+
		"\u0000\u0000\u0000\u06b1\u06b0\u0001\u0000\u0000\u0000\u06b2\u06b3\u0001"+
		"\u0000\u0000\u0000\u06b3\u06b6\u0005\u009e\u0000\u0000\u06b4\u06b7\u0003"+
		"\u0102\u0081\u0000\u06b5\u06b7\u0003\u00f8|\u0000\u06b6\u06b4\u0001\u0000"+
		"\u0000\u0000\u06b6\u06b5\u0001\u0000\u0000\u0000\u06b7\u06b9\u0001\u0000"+
		"\u0000\u0000\u06b8\u06a6\u0001\u0000\u0000\u0000\u06b8\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b9\u00dd\u0001\u0000\u0000\u0000\u06ba\u06bb\u0005\u00bf"+
		"\u0000\u0000\u06bb\u00df\u0001\u0000\u0000\u0000\u06bc\u06be\u0005\u00c9"+
		"\u0000\u0000\u06bd\u06bf\u0005\u00d1\u0000\u0000\u06be\u06bd\u0001\u0000"+
		"\u0000\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000\u06c0\u06be\u0001\u0000"+
		"\u0000\u0000\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06d2\u0001\u0000"+
		"\u0000\u0000\u06c2\u06c4\u0005\u00c8\u0000\u0000\u06c3\u06c5\u0005\u00d1"+
		"\u0000\u0000\u06c4\u06c3\u0001\u0000\u0000\u0000\u06c5\u06c6\u0001\u0000"+
		"\u0000\u0000\u06c6\u06c4\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000"+
		"\u0000\u0000\u06c7\u06d2\u0001\u0000\u0000\u0000\u06c8\u06d2\u0005\u00c6"+
		"\u0000\u0000\u06c9\u06cd\u0005\u00c7\u0000\u0000\u06ca\u06cc\u0003\u00e2"+
		"q\u0000\u06cb\u06ca\u0001\u0000\u0000\u0000\u06cc\u06cf\u0001\u0000\u0000"+
		"\u0000\u06cd\u06cb\u0001\u0000\u0000\u0000\u06cd\u06ce\u0001\u0000\u0000"+
		"\u0000\u06ce\u06d0\u0001\u0000\u0000\u0000\u06cf\u06cd\u0001\u0000\u0000"+
		"\u0000\u06d0\u06d2\u0005\u00c7\u0000\u0000\u06d1\u06bc\u0001\u0000\u0000"+
		"\u0000\u06d1\u06c2\u0001\u0000\u0000\u0000\u06d1\u06c8\u0001\u0000\u0000"+
		"\u0000\u06d1\u06c9\u0001\u0000\u0000\u0000\u06d2\u00e1\u0001\u0000\u0000"+
		"\u0000\u06d3\u06d7\u0005\u00cd\u0000\u0000\u06d4\u06d7\u0005\u00cc\u0000"+
		"\u0000\u06d5\u06d7\u0003\u00e6s\u0000\u06d6\u06d3\u0001\u0000\u0000\u0000"+
		"\u06d6\u06d4\u0001\u0000\u0000\u0000\u06d6\u06d5\u0001\u0000\u0000\u0000"+
		"\u06d7\u00e3\u0001\u0000\u0000\u0000\u06d8\u06dd\u0003\u00e6s\u0000\u06d9"+
		"\u06da\u0005\u00b8\u0000\u0000\u06da\u06dc\u0003\u00e6s\u0000\u06db\u06d9"+
		"\u0001\u0000\u0000\u0000\u06dc\u06df\u0001\u0000\u0000\u0000\u06dd\u06db"+
		"\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de\u00e5"+
		"\u0001\u0000\u0000\u0000\u06df\u06dd\u0001\u0000\u0000\u0000\u06e0\u06e4"+
		"\u0003\u00e8t\u0000\u06e1\u06e3\u0003\u00eau\u0000\u06e2\u06e1\u0001\u0000"+
		"\u0000\u0000\u06e3\u06e6\u0001\u0000\u0000\u0000\u06e4\u06e2\u0001\u0000"+
		"\u0000\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000\u06e7\u06ee\u0003\u00f2"+
		"y\u0000\u06e8\u06ee\u0003\u00ecv\u0000\u06e9\u06ea\u0005\u00b2\u0000\u0000"+
		"\u06ea\u06eb\u0003\u00b0X\u0000\u06eb\u06ec\u0005\u00b3\u0000\u0000\u06ec"+
		"\u06ee\u0001\u0000\u0000\u0000\u06ed\u06e7\u0001\u0000\u0000\u0000\u06ed"+
		"\u06e8\u0001\u0000\u0000\u0000\u06ed\u06e9\u0001\u0000\u0000\u0000\u06ee"+
		"\u00e9\u0001\u0000\u0000\u0000\u06ef\u06f0\u0005\u009f\u0000\u0000\u06f0"+
		"\u06f2\u0003\u00f4z\u0000\u06f1\u06f3\u0003\u00f0x\u0000\u06f2\u06f1\u0001"+
		"\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000\u0000\u06f3\u00eb\u0001"+
		"\u0000\u0000\u0000\u06f4\u06f5\u0003\u00eew\u0000\u06f5\u06f6\u0003\u00f0"+
		"x\u0000\u06f6\u00ed\u0001\u0000\u0000\u0000\u06f7\u06fc\u0003\u00c6c\u0000"+
		"\u06f8\u06fc\u0003\u00dcn\u0000\u06f9\u06fc\u0003\u00f2y\u0000\u06fa\u06fc"+
		"\u0003\u009cN\u0000\u06fb\u06f7\u0001\u0000\u0000\u0000\u06fb\u06f8\u0001"+
		"\u0000\u0000\u0000\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fb\u06fa\u0001"+
		"\u0000\u0000\u0000\u06fc\u00ef\u0001\u0000\u0000\u0000\u06fd\u06ff\u0003"+
		"$\u0012\u0000\u06fe\u06fd\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000"+
		"\u0000\u0000\u06ff\u0701\u0001\u0000\u0000\u0000\u0700\u0702\u0003\u00ce"+
		"g\u0000\u0701\u0700\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000"+
		"\u0000\u0703\u0701\u0001\u0000\u0000\u0000\u0703\u0704\u0001\u0000\u0000"+
		"\u0000\u0704\u0708\u0001\u0000\u0000\u0000\u0705\u0707\u0003\u00fa}\u0000"+
		"\u0706\u0705\u0001\u0000\u0000\u0000\u0707\u070a\u0001\u0000\u0000\u0000"+
		"\u0708\u0706\u0001\u0000\u0000\u0000\u0708\u0709\u0001\u0000\u0000\u0000"+
		"\u0709\u00f1\u0001\u0000\u0000\u0000\u070a\u0708\u0001\u0000\u0000\u0000"+
		"\u070b\u070e\u0003\u00f8|\u0000\u070c\u070d\u0005\u009e\u0000\u0000\u070d"+
		"\u070f\u0003\u00f8|\u0000\u070e\u070c\u0001\u0000\u0000\u0000\u070e\u070f"+
		"\u0001\u0000\u0000\u0000\u070f\u0715\u0001\u0000\u0000\u0000\u0710\u0711"+
		"\u0003\u00be_\u0000\u0711\u0712\u0005\u009e\u0000\u0000\u0712\u0713\u0003"+
		"\u00f8|\u0000\u0713\u0715\u0001\u0000\u0000\u0000\u0714\u070b\u0001\u0000"+
		"\u0000\u0000\u0714\u0710\u0001\u0000\u0000\u0000\u0715\u00f3\u0001\u0000"+
		"\u0000\u0000\u0716\u0719\u0003\u00f6{\u0000\u0717\u0719\u0003\u00f8|\u0000"+
		"\u0718\u0716\u0001\u0000\u0000\u0000\u0718\u0717\u0001\u0000\u0000\u0000"+
		"\u0719\u00f5\u0001\u0000\u0000\u0000\u071a\u0720\u0003\u0102\u0081\u0000"+
		"\u071b\u071c\u0005\u00b6\u0000\u0000\u071c\u071d\u0003\u009eO\u0000\u071d"+
		"\u071e\u0005\u00b7\u0000\u0000\u071e\u0720\u0001\u0000\u0000\u0000\u071f"+
		"\u071a\u0001\u0000\u0000\u0000\u071f\u071b\u0001\u0000\u0000\u0000\u0720"+
		"\u0724\u0001\u0000\u0000\u0000\u0721\u0723\u0003\u00fa}\u0000\u0722\u0721"+
		"\u0001\u0000\u0000\u0000\u0723\u0726\u0001\u0000\u0000\u0000\u0724\u0722"+
		"\u0001\u0000\u0000\u0000\u0724\u0725\u0001\u0000\u0000\u0000\u0725\u00f7"+
		"\u0001\u0000\u0000\u0000\u0726\u0724\u0001\u0000\u0000\u0000\u0727\u0729"+
		"\u0005\u00af\u0000\u0000\u0728\u0727\u0001\u0000\u0000\u0000\u0729\u072c"+
		"\u0001\u0000\u0000\u0000\u072a\u0728\u0001\u0000\u0000\u0000\u072a\u072b"+
		"\u0001\u0000\u0000\u0000\u072b\u0733\u0001\u0000\u0000\u0000\u072c\u072a"+
		"\u0001\u0000\u0000\u0000\u072d\u0734\u0005\u00be\u0000\u0000\u072e\u072f"+
		"\u0005\u00af\u0000\u0000\u072f\u0730\u0005\u00b6\u0000\u0000\u0730\u0731"+
		"\u0003\u009eO\u0000\u0731\u0732\u0005\u00b7\u0000\u0000\u0732\u0734\u0001"+
		"\u0000\u0000\u0000\u0733\u072d\u0001\u0000\u0000\u0000\u0733\u072e\u0001"+
		"\u0000\u0000\u0000\u0734\u0738\u0001\u0000\u0000\u0000\u0735\u0737\u0003"+
		"\u00fa}\u0000\u0736\u0735\u0001\u0000\u0000\u0000\u0737\u073a\u0001\u0000"+
		"\u0000\u0000\u0738\u0736\u0001\u0000\u0000\u0000\u0738\u0739\u0001\u0000"+
		"\u0000\u0000\u0739\u00f9\u0001\u0000\u0000\u0000\u073a\u0738\u0001\u0000"+
		"\u0000\u0000\u073b\u073d\u0005\u00b4\u0000\u0000\u073c\u073e\u0003\u009e"+
		"O\u0000\u073d\u073c\u0001\u0000\u0000\u0000\u073d\u073e\u0001\u0000\u0000"+
		"\u0000\u073e\u073f\u0001\u0000\u0000\u0000\u073f\u0745\u0005\u00b5\u0000"+
		"\u0000\u0740\u0741\u0005\u00b6\u0000\u0000\u0741\u0742\u0003\u009eO\u0000"+
		"\u0742\u0743\u0005\u00b7\u0000\u0000\u0743\u0745\u0001\u0000\u0000\u0000"+
		"\u0744\u073b\u0001\u0000\u0000\u0000\u0744\u0740\u0001\u0000\u0000\u0000"+
		"\u0745\u00fb\u0001\u0000\u0000\u0000\u0746\u0748\u0003\u00fe\u007f\u0000"+
		"\u0747\u0746\u0001\u0000\u0000\u0000\u0747\u0748\u0001\u0000\u0000\u0000"+
		"\u0748\u074f\u0001\u0000\u0000\u0000\u0749\u074b\u0005\u00b8\u0000\u0000"+
		"\u074a\u074c\u0003\u00fe\u007f\u0000\u074b\u074a\u0001\u0000\u0000\u0000"+
		"\u074b\u074c\u0001\u0000\u0000\u0000\u074c\u074e\u0001\u0000\u0000\u0000"+
		"\u074d\u0749\u0001\u0000\u0000\u0000\u074e\u0751\u0001\u0000\u0000\u0000"+
		"\u074f\u074d\u0001\u0000\u0000\u0000\u074f\u0750\u0001\u0000\u0000\u0000"+
		"\u0750\u00fd\u0001\u0000\u0000\u0000\u0751\u074f\u0001\u0000\u0000\u0000"+
		"\u0752\u075a\u0003\u00e6s\u0000\u0753\u0754\u0005@\u0000\u0000\u0754\u0755"+
		"\u0005\u00b2\u0000\u0000\u0755\u0756\u0003\u00fc~\u0000\u0756\u0757\u0005"+
		"\u00b3\u0000\u0000\u0757\u075a\u0001\u0000\u0000\u0000\u0758\u075a\u0003"+
		"\u00b8\\\u0000\u0759\u0752\u0001\u0000\u0000\u0000\u0759\u0753\u0001\u0000"+
		"\u0000\u0000\u0759\u0758\u0001\u0000\u0000\u0000\u075a\u00ff\u0001\u0000"+
		"\u0000\u0000\u075b\u075c\u0007\u0012\u0000\u0000\u075c\u0101\u0001\u0000"+
		"\u0000\u0000\u075d\u075e\u0007\u0013\u0000\u0000\u075e\u0103\u0001\u0000"+
		"\u0000\u0000\u075f\u0760\u0007\u0014\u0000\u0000\u0760\u0105\u0001\u0000"+
		"\u0000\u0000\u0761\u0762\u0007\u0015\u0000\u0000\u0762\u0107\u0001\u0000"+
		"\u0000\u0000\u0763\u0764\u0007\u0016\u0000\u0000\u0764\u0109\u0001\u0000"+
		"\u0000\u0000\u0765\u0766\u0007\u0017\u0000\u0000\u0766\u010b\u0001\u0000"+
		"\u0000\u0000\u00f5\u010d\u0112\u0118\u0120\u0126\u0134\u0138\u013e\u0143"+
		"\u0148\u014f\u0155\u015c\u0163\u0166\u016a\u016e\u0175\u0178\u017d\u0180"+
		"\u0183\u0186\u018b\u018f\u0193\u0198\u019c\u019e\u01a4\u01b0\u01c1\u01c8"+
		"\u01d0\u01d4\u01d9\u01df\u01e7\u01ef\u01f5\u01fc\u0203\u0208\u020e\u022d"+
		"\u023b\u023f\u0248\u024c\u0251\u026b\u0276\u027a\u027e\u0287\u0291\u0296"+
		"\u029c\u02a1\u02a6\u02b0\u02b6\u02bc\u02c2\u02da\u02df\u02e2\u02ec\u02ef"+
		"\u02fc\u0304\u030b\u030e\u0313\u0317\u0320\u0324\u033e\u0345\u034c\u0354"+
		"\u0357\u035d\u0361\u0364\u0369\u036d\u0370\u0373\u0376\u037e\u0385\u038e"+
		"\u039b\u03a7\u03ad\u03b1\u03b8\u03be\u03c2\u03c9\u03d0\u03d4\u03db\u03df"+
		"\u03e1\u03e7\u03ee\u03f2\u03f6\u0403\u0406\u040d\u0414\u0418\u041e\u0422"+
		"\u0427\u042c\u0433\u043b\u0444\u0448\u044e\u0457\u045c\u0463\u046a\u0470"+
		"\u04af\u04c0\u04c7\u04cc\u04ce\u04f4\u050a\u050c\u0511\u0516\u051b\u051e"+
		"\u0524\u052a\u0531\u0536\u053c\u0546\u054b\u054f\u0553\u0556\u055d\u0560"+
		"\u0565\u0569\u056f\u0573\u057e\u058a\u058e\u0597\u05a0\u05a8\u05ac\u05b3"+
		"\u05b7\u05bc\u05c1\u05c5\u05ce\u05d4\u05da\u05dd\u05e1\u05e4\u05e9\u05ec"+
		"\u05ef\u05f2\u05f5\u05f9\u05fd\u0601\u0606\u060a\u060c\u0612\u061c\u0620"+
		"\u0623\u062d\u0632\u0634\u0639\u0641\u0645\u0649\u0650\u0659\u065d\u0660"+
		"\u0665\u0668\u066d\u0678\u067a\u0680\u0682\u0689\u068e\u0692\u0695\u069c"+
		"\u06a2\u06ac\u06b1\u06b6\u06b8\u06c0\u06c6\u06cd\u06d1\u06d6\u06dd\u06e4"+
		"\u06ed\u06f2\u06fb\u06fe\u0703\u0708\u070e\u0714\u0718\u071f\u0724\u072a"+
		"\u0733\u0738\u073d\u0744\u0747\u074b\u074f\u0759";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}