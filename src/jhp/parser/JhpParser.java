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
		CommentEnd=208, EndHereDoc=209, EndNowDoc=210, HereDocText=211;
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
		RULE_typeRefWithGenerics = 91, RULE_argumentName = 92, RULE_constantInitializer = 93, 
		RULE_constant = 94, RULE_literalConstant = 95, RULE_numericConstant = 96, 
		RULE_classConstant = 97, RULE_stringConstant = 98, RULE_string = 99, RULE_interpolatedStringPart = 100, 
		RULE_chainList = 101, RULE_chain = 102, RULE_chainOrigin = 103, RULE_memberAccess = 104, 
		RULE_functionCall = 105, RULE_functionCallName = 106, RULE_actualArguments = 107, 
		RULE_chainBase = 108, RULE_keyedFieldName = 109, RULE_keyedSimpleFieldName = 110, 
		RULE_keyedVariable = 111, RULE_squareCurlyExpression = 112, RULE_assignmentList = 113, 
		RULE_assignmentListElement = 114, RULE_modifier = 115, RULE_identifier = 116, 
		RULE_memberModifier = 117, RULE_magicConstant = 118, RULE_primitiveType = 119, 
		RULE_castOperation = 120;
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
			"arguments", "actualArgument", "typeRefWithGenerics", "argumentName", 
			"constantInitializer", "constant", "literalConstant", "numericConstant", 
			"classConstant", "stringConstant", "string", "interpolatedStringPart", 
			"chainList", "chain", "chainOrigin", "memberAccess", "functionCall", 
			"functionCallName", "actualArguments", "chainBase", "keyedFieldName", 
			"keyedSimpleFieldName", "keyedVariable", "squareCurlyExpression", "assignmentList", 
			"assignmentListElement", "modifier", "identifier", "memberModifier", 
			"magicConstant", "primitiveType", "castOperation"
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
			"CommentEnd", "EndHereDoc", "EndNowDoc", "HereDocText"
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
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(242);
				match(Shebang);
				}
			}

			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(245);
				namespaceDeclaration();
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) {
				{
				{
				setState(248);
				importStatement();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & -212681334822011151L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 7061631013633389567L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259606487873L) != 0)) {
				{
				{
				setState(254);
				topStatement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) {
				{
				{
				setState(262);
				importStatement();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				topStatement();
				}
				}
				setState(271); 
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
			setState(273);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 2199157473283L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			importPath();
			setState(275);
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
			setState(277);
			identifier();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(NamespaceSeparator);
					setState(279);
					identifier();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(285);
				match(NamespaceSeparator);
				setState(286);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				namespaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
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
			setState(296);
			match(Namespace);
			setState(297);
			namespaceNameList();
			setState(298);
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
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(300);
				attributes();
				}
			}

			setState(303);
			match(Function_);
			setState(304);
			identifier();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(305);
				typeParameterListInBrackets();
				}
			}

			setState(308);
			match(OpenRoundBracket);
			setState(309);
			formalParameterList();
			setState(310);
			match(CloseRoundBracket);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(311);
				match(Colon);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(312);
					match(QuestionMark);
					}
				}

				setState(315);
				typeHint(0);
				}
			}

			setState(318);
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
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(320);
				attributes();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) {
				{
				setState(323);
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

			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(326);
				modifier();
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(329);
				match(Partial);
				}
			}

			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(332);
				classEntryType();
				setState(333);
				identifier();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(334);
					typeParameterListInBrackets();
					}
				}

				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(337);
					match(Extends);
					setState(338);
					qualifiedStaticTypeRef();
					}
				}

				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(341);
					match(Implements);
					setState(342);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(345);
				match(Interface);
				setState(346);
				identifier();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(347);
					typeParameterListInBrackets();
					}
				}

				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(350);
					match(Extends);
					setState(351);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			match(OpenCurlyBracket);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(357);
				classStatement();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
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
			setState(365);
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
			setState(367);
			qualifiedStaticTypeRef();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(368);
				match(Comma);
				setState(369);
				qualifiedStaticTypeRef();
				}
				}
				setState(374);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(Lgeneric);
				setState(376);
				typeParameterList();
				setState(377);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(Lgeneric);
				setState(380);
				typeParameterWithDefaultsList();
				setState(381);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(Lgeneric);
				setState(384);
				typeParameterList();
				setState(385);
				match(Comma);
				setState(386);
				typeParameterWithDefaultsList();
				setState(387);
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
			setState(391);
			typeParameterDecl();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					match(Comma);
					setState(393);
					typeParameterDecl();
					}
					} 
				}
				setState(398);
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
			setState(399);
			typeParameterWithDefaultDecl();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(400);
				match(Comma);
				setState(401);
				typeParameterWithDefaultDecl();
				}
				}
				setState(406);
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
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(407);
				attributes();
				}
			}

			setState(410);
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
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(412);
				attributes();
				}
			}

			setState(415);
			identifier();
			setState(416);
			match(Eq);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(417);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(418);
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
			setState(421);
			match(Lgeneric);
			setState(422);
			typeRef();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(423);
				match(Comma);
				setState(424);
				typeRef();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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
			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				attributeGroup();
				}
				}
				setState(435); 
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
			setState(437);
			match(AttributeStart);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(438);
				identifier();
				setState(439);
				match(Colon);
				}
				break;
			}
			setState(443);
			attribute();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(444);
				match(Comma);
				setState(445);
				attribute();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
			setState(453);
			qualifiedNamespaceName();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(454);
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
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					innerStatement();
					}
					} 
				}
				setState(462);
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
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
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(474);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(475);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(476);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(477);
				echoStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(478);
				expressionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(479);
				foreachStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(480);
				tryCatchFinally();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(481);
				throwStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(482);
				emptyStatement_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(483);
				attributes();
				setState(484);
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
			setState(488);
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
			setState(490);
			match(OpenCurlyBracket);
			setState(491);
			innerStatementList();
			setState(492);
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
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(If);
				setState(495);
				parentheses();
				setState(496);
				statement();
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(497);
						elseIfStatement();
						}
						} 
					}
					setState(502);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(503);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(If);
				setState(507);
				parentheses();
				setState(508);
				match(Colon);
				setState(509);
				innerStatementList();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(510);
					elseIfColonStatement();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(516);
					elseColonStatement();
					}
				}

				setState(519);
				match(EndIf);
				setState(520);
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
			setState(524);
			match(ElseIf);
			setState(525);
			parentheses();
			setState(526);
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
			setState(528);
			match(ElseIf);
			setState(529);
			parentheses();
			setState(530);
			match(Colon);
			setState(531);
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
			setState(533);
			match(Else);
			setState(534);
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
			setState(536);
			match(Else);
			setState(537);
			match(Colon);
			setState(538);
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
			setState(540);
			match(While);
			setState(541);
			parentheses();
			setState(548);
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
				setState(542);
				statement();
				}
				break;
			case Colon:
				{
				setState(543);
				match(Colon);
				setState(544);
				innerStatementList();
				setState(545);
				match(EndWhile);
				setState(546);
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
			setState(550);
			match(Do);
			setState(551);
			statement();
			setState(552);
			match(While);
			setState(553);
			parentheses();
			setState(554);
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
			setState(556);
			match(For);
			setState(557);
			match(OpenRoundBracket);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(558);
				forInit();
				}
			}

			setState(561);
			match(SemiColon);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(562);
				expressionList();
				}
			}

			setState(565);
			match(SemiColon);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(566);
				forUpdate();
				}
			}

			setState(569);
			match(CloseRoundBracket);
			setState(576);
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
				setState(570);
				statement();
				}
				break;
			case Colon:
				{
				setState(571);
				match(Colon);
				setState(572);
				innerStatementList();
				setState(573);
				match(EndFor);
				setState(574);
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
			setState(580);
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
			setState(582);
			match(Switch);
			setState(583);
			parentheses();
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(584);
				match(OpenCurlyBracket);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(585);
					match(SemiColon);
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(588);
					switchBlock();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(595);
				match(Colon);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(596);
					match(SemiColon);
					}
				}

				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(599);
					switchBlock();
					}
					}
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(605);
				match(EndSwitch);
				setState(606);
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
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(Case);
				setState(610);
				expression(0);
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(612);
				switchBlockBody();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(Default);
				setState(615);
				_la = _input.LA(1);
				if ( !(_la==Colon || _la==SemiColon) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(616);
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
			setState(619);
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
			setState(621);
			match(Break);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(622);
				expression(0);
				}
			}

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
			setState(627);
			match(Continue);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(628);
				expression(0);
				}
			}

			setState(631);
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
			setState(633);
			match(Return);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(634);
				expression(0);
				}
			}

			setState(637);
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
			setState(639);
			expression(0);
			setState(640);
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
			setState(642);
			match(Foreach);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(643);
				match(OpenRoundBracket);
				setState(644);
				expression(0);
				setState(645);
				match(As);
				setState(646);
				arrayDestructuring();
				setState(647);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(649);
				match(OpenRoundBracket);
				setState(650);
				chain();
				setState(651);
				match(As);
				setState(652);
				assignable();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(653);
					match(DoubleArrow);
					setState(654);
					chain();
					}
				}

				setState(657);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(659);
				match(OpenRoundBracket);
				setState(660);
				expression(0);
				setState(661);
				match(As);
				setState(662);
				assignable();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(663);
					match(DoubleArrow);
					setState(664);
					chain();
					}
				}

				setState(667);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				{
				setState(669);
				match(OpenRoundBracket);
				setState(670);
				chain();
				setState(671);
				match(As);
				setState(672);
				match(List);
				setState(673);
				match(OpenRoundBracket);
				setState(674);
				assignmentList();
				setState(675);
				match(CloseRoundBracket);
				setState(676);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(686);
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
				setState(680);
				statement();
				}
				break;
			case Colon:
				{
				setState(681);
				match(Colon);
				setState(682);
				innerStatementList();
				setState(683);
				match(EndForeach);
				setState(684);
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
			setState(688);
			match(Try);
			setState(689);
			blockStatement();
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(691); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(690);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(693); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(695);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(698);
					catchClause();
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(704);
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
			setState(707);
			match(Catch);
			setState(708);
			match(OpenRoundBracket);
			setState(709);
			qualifiedStaticTypeRef();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(710);
				match(Pipe);
				setState(711);
				qualifiedStaticTypeRef();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(VarName);
			setState(718);
			match(CloseRoundBracket);
			setState(719);
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
			setState(721);
			match(Finally);
			setState(722);
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
			setState(724);
			match(Throw);
			setState(725);
			expression(0);
			setState(726);
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
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8293938343561919552L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9222527069147955103L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 2147614721L) != 0)) {
				{
				setState(728);
				formalParameter();
				}
			}

			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(731);
					match(Comma);
					setState(732);
					formalParameter();
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(738);
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
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(741);
				attributes();
				}
			}

			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					memberModifier();
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(750);
				match(QuestionMark);
				}
			}

			setState(753);
			typeHint(0);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(754);
				match(Ellipsis);
				}
			}

			setState(757);
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
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(760);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(761);
				qualifiedStaticTypeRef();
				}
				break;
			case 3:
				{
				setState(762);
				match(Callable);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(770);
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
					setState(765);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(766);
					match(Pipe);
					setState(767);
					typeHint(2);
					}
					} 
				}
				setState(772);
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
			setState(773);
			match(Echo);
			setState(774);
			expressionList();
			setState(775);
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
			setState(777);
			match(Static);
			setState(778);
			variableInitializer();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(779);
				match(Comma);
				setState(780);
				variableInitializer();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
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
			setState(842);
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
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(788);
					attributes();
					}
				}

				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(791);
					propertyModifiers();
					setState(792);
					typeHint(0);
					setState(793);
					variableInitializer();
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(794);
						match(Comma);
						setState(795);
						variableInitializer();
						}
						}
						setState(800);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(801);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
						{
						setState(803);
						memberModifiers();
						}
					}

					setState(834);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(806);
						match(Const);
						setState(808);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(807);
							typeHint(0);
							}
							break;
						}
						setState(810);
						identifierInitializer();
						setState(815);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(811);
							match(Comma);
							setState(812);
							identifierInitializer();
							}
							}
							setState(817);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(818);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(820);
						match(Function_);
						setState(821);
						identifier();
						setState(823);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(822);
							typeParameterListInBrackets();
							}
						}

						setState(825);
						match(OpenRoundBracket);
						setState(826);
						formalParameterList();
						setState(827);
						match(CloseRoundBracket);
						setState(830);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
						case 1:
							{
							setState(828);
							baseCtorCall();
							}
							break;
						case 2:
							{
							setState(829);
							returnTypeDecl();
							}
							break;
						}
						setState(832);
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
				setState(838);
				match(Use);
				setState(839);
				qualifiedNamespaceNameList();
				setState(840);
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
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(OpenCurlyBracket);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4835138645100835840L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 9222527069147955103L) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(846);
					traitAdaptationStatement();
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
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
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
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
			setState(859);
			qualifiedNamespaceName();
			setState(860);
			match(DoubleColon);
			setState(861);
			identifier();
			setState(862);
			match(InsteadOf);
			setState(863);
			qualifiedNamespaceNameList();
			setState(864);
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
			setState(866);
			traitMethodReference();
			setState(867);
			match(As);
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(868);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(869);
					memberModifier();
					}
					break;
				}
				setState(872);
				identifier();
				}
				break;
			}
			setState(875);
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
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(877);
				qualifiedNamespaceName();
				setState(878);
				match(DoubleColon);
				}
				break;
			}
			setState(882);
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
			setState(884);
			match(Colon);
			setState(885);
			identifier();
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(886);
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
			setState(889);
			match(Colon);
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(890);
				match(QuestionMark);
				}
			}

			setState(893);
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
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
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
			setState(899);
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
			setState(902); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(901);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(904); 
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
			setState(906);
			match(VarName);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(907);
				match(Eq);
				setState(908);
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
			setState(911);
			identifier();
			setState(912);
			match(Eq);
			setState(913);
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
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> fieldNames = new ArrayList<IdentifierContext>();
		public TerminalNode Enum_() { return getToken(JhpParser.Enum_, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(JhpParser.CloseCurlyBracket, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JhpParser.Colon, 0); }
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
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
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
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
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(915);
				attributes();
				}
			}

			setState(918);
			match(Enum_);
			setState(919);
			((EnumDeclarationContext)_localctx).name = identifier();
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(920);
				match(Colon);
				setState(921);
				typeHint(0);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(922);
					match(Comma);
					setState(923);
					typeHint(0);
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(931);
				match(OpenRoundBracket);
				setState(932);
				((EnumDeclarationContext)_localctx).identifier = identifier();
				((EnumDeclarationContext)_localctx).fieldNames.add(((EnumDeclarationContext)_localctx).identifier);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(933);
					match(Comma);
					setState(934);
					((EnumDeclarationContext)_localctx).identifier = identifier();
					((EnumDeclarationContext)_localctx).fieldNames.add(((EnumDeclarationContext)_localctx).identifier);
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				match(CloseRoundBracket);
				}
			}

			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(944);
				match(Implements);
				setState(945);
				interfaceList();
				}
			}

			setState(948);
			match(OpenCurlyBracket);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271069996096L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
				{
				{
				setState(949);
				enumItem();
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
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
		public TerminalNode OpenRoundBracket() { return getToken(JhpParser.OpenRoundBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(JhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(JhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JhpParser.Comma, i);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
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
			setState(979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				match(Case);
				setState(958);
				identifier();
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(959);
					match(Eq);
					setState(960);
					match(OpenRoundBracket);
					setState(961);
					expression(0);
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(962);
						match(Comma);
						setState(963);
						expression(0);
						}
						}
						setState(968);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(969);
					match(CloseRoundBracket);
					}
				}

				setState(973);
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
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Abstract || _la==Final || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 271L) != 0)) {
					{
					setState(975);
					memberModifiers();
					}
				}

				setState(978);
				functionDeclaration();
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
			setState(981);
			expression(0);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(982);
				match(Comma);
				setState(983);
				expression(0);
				}
				}
				setState(988);
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
			setState(989);
			match(OpenRoundBracket);
			setState(990);
			expression(0);
			setState(991);
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
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(994);
				match(Clone);
				setState(995);
				expression(37);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(996);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(997);
				stringConstant();
				setState(998);
				match(OpenSquareBracket);
				setState(999);
				expression(0);
				setState(1000);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002);
				match(OpenRoundBracket);
				setState(1003);
				castOperation();
				setState(1004);
				match(CloseRoundBracket);
				setState(1005);
				expression(34);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1007);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1008);
				expression(33);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1010);
				expression(32);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1012);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				chain();
				setState(1014);
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
				setState(1016);
				match(Print);
				setState(1017);
				expression(29);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1018);
				arrayCreation();
				}
				break;
			case 11:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1019);
				chain();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1020);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1021);
				string();
				}
				break;
			case 14:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1022);
				match(Label);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1023);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1024);
				lambdaFunctionExpr();
				}
				break;
			case 17:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1025);
				matchExpr();
				}
				break;
			case 18:
				{
				_localctx = new ArrayDestructExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1026);
				arrayDestructuring();
				setState(1027);
				match(Eq);
				setState(1028);
				expression(5);
				}
				break;
			case 19:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1030);
				assignable();
				setState(1031);
				assignmentOperator();
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1032);
					attributes();
					}
				}

				setState(1035);
				expression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1097);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1039);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1040);
						((ExponentiationExpressionContext)_localctx).op = match(Pow);
						setState(1041);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1042);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1043);
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
						setState(1044);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1045);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1046);
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
						setState(1047);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1048);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1049);
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
						setState(1050);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1052);
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
						setState(1053);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1054);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1055);
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
						setState(1056);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1057);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1058);
						((BitwiseAndExpressionContext)_localctx).op = match(Ampersand);
						setState(1059);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1060);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1061);
						((BitwiseExcOrExpressionContext)_localctx).op = match(Caret);
						setState(1062);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1064);
						((BitwiseIncOrExpressionContext)_localctx).op = match(Pipe);
						setState(1065);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1066);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1067);
						((LogicalAndExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1068);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1069);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1070);
						((LogicalIncOrExpressionContext)_localctx).op = match(BooleanOr);
						setState(1071);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1072);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1073);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1075);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
							{
							setState(1074);
							expression(0);
							}
						}

						setState(1077);
						match(Colon);
						setState(1078);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new CoalesceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1079);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1080);
						((CoalesceExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1081);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1082);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1083);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1084);
						expression(7);
						}
						break;
					case 15:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1085);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1086);
						((LogicalAndExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1087);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExcOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1088);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1089);
						((LogicalExcOrExpressionContext)_localctx).op = match(LogicalXor);
						setState(1090);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalIncOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1091);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1092);
						((LogicalIncOrExpressionContext)_localctx).op = match(LogicalOr);
						setState(1093);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1094);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1095);
						match(InstanceOf);
						setState(1096);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
			setState(1104);
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
				setState(1102);
				chain();
				}
				break;
			case Array:
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
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
			setState(1117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1106);
				match(Array);
				setState(1107);
				match(OpenRoundBracket);
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1108);
					arrayItemList();
					}
				}

				setState(1111);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1112);
				match(OpenSquareBracket);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1113);
					arrayItemList();
					}
				}

				setState(1116);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1119);
				match(OpenSquareBracket);
				setState(1120);
				expression(0);
				setState(1121);
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
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(OpenSquareBracket);
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1126);
					match(Comma);
					}
					}
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1132);
				indexedDestructItem();
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1134); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1133);
							match(Comma);
							}
							}
							setState(1136); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1138);
						indexedDestructItem();
						}
						} 
					}
					setState(1143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1144);
					match(Comma);
					}
					}
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1150);
				match(CloseSquareBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				match(OpenSquareBracket);
				setState(1153);
				keyedDestructItem();
				setState(1162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1155); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1154);
							match(Comma);
							}
							}
							setState(1157); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(1159);
						keyedDestructItem();
						}
						} 
					}
					setState(1164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1165);
					match(Comma);
					}
				}

				setState(1168);
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
			setState(1172);
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
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1174);
				expression(0);
				setState(1175);
				match(DoubleArrow);
				}
				break;
			}
			setState(1179);
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
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(Function_);
				setState(1182);
				match(OpenRoundBracket);
				setState(1183);
				formalParameterList();
				setState(1184);
				match(CloseRoundBracket);
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1185);
					match(Colon);
					setState(1186);
					typeHint(0);
					}
				}

				setState(1189);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				match(LambdaFn);
				setState(1192);
				match(OpenRoundBracket);
				setState(1193);
				formalParameterList();
				setState(1194);
				match(CloseRoundBracket);
				setState(1195);
				match(DoubleArrow);
				setState(1196);
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
			setState(1200);
			match(Match_);
			setState(1201);
			match(OpenRoundBracket);
			setState(1202);
			expression(0);
			setState(1203);
			match(CloseRoundBracket);
			setState(1204);
			match(OpenCurlyBracket);
			setState(1205);
			matchItem();
			setState(1210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1206);
					match(Comma);
					setState(1207);
					matchItem();
					}
					} 
				}
				setState(1212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1213);
				match(Comma);
				}
			}

			setState(1216);
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
			setState(1218);
			expression(0);
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1219);
				match(Comma);
				setState(1220);
				expression(0);
				}
				}
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1226);
			match(DoubleArrow);
			setState(1227);
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
			setState(1229);
			match(New);
			setState(1230);
			typeRef();
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1231);
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
			setState(1234);
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
			setState(1236);
			arrayItem();
			setState(1241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1237);
					match(Comma);
					setState(1238);
					arrayItem();
					}
					} 
				}
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1244);
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
			setState(1247);
			expression(0);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleArrow) {
				{
				setState(1248);
				match(DoubleArrow);
				setState(1249);
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
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				qualifiedNamespaceName();
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1253);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
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
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1259);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1260);
					indirectTypeRef();
					}
					break;
				}
				setState(1264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1263);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1268);
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
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1271);
				attributes();
				}
			}

			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1274);
				match(Private);
				}
			}

			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1277);
				modifier();
				}
			}

			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1280);
				match(Partial);
				}
			}

			setState(1304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1283);
				classEntryType();
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1284);
					typeParameterListInBrackets();
					}
				}

				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1287);
					match(Extends);
					setState(1288);
					qualifiedStaticTypeRef();
					}
				}

				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1291);
					match(Implements);
					setState(1292);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1295);
				match(Interface);
				setState(1296);
				identifier();
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1297);
					typeParameterListInBrackets();
					}
				}

				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1300);
					match(Extends);
					setState(1301);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1306);
			match(OpenCurlyBracket);
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290271073928256L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 262415L) != 0)) {
				{
				{
				setState(1307);
				classStatement();
				}
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1313);
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
			setState(1315);
			chainBase();
			setState(1320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1316);
					match(ObjectOperator);
					setState(1317);
					keyedFieldName();
					}
					} 
				}
				setState(1322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
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
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1323);
				match(NamespaceSeparator);
				}
			}

			setState(1326);
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
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				identifier();
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1330);
						match(NamespaceSeparator);
						setState(1331);
						identifier();
						}
						} 
					}
					setState(1336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1337);
					match(NamespaceSeparator);
					setState(1338);
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
			setState(1362);
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
				setState(1343);
				identifier();
				setState(1346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1344);
					match(As);
					setState(1345);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
				match(OpenCurlyBracket);
				setState(1349);
				namespaceNameTail();
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1350);
						match(Comma);
						setState(1351);
						namespaceNameTail();
						}
						} 
					}
					setState(1356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1357);
					match(Comma);
					}
				}

				setState(1360);
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
			setState(1364);
			qualifiedNamespaceName();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1365);
				match(Comma);
				setState(1366);
				qualifiedNamespaceName();
				}
				}
				setState(1371);
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
			setState(1372);
			match(OpenRoundBracket);
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184707L) != 0)) {
				{
				setState(1373);
				actualArgument();
				setState(1378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1374);
						match(Comma);
						setState(1375);
						actualArgument();
						}
						} 
					}
					setState(1380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				}
			}

			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1383);
				match(Comma);
				}
			}

			setState(1386);
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
		public TypeRefWithGenericsContext typeRefWithGenerics() {
			return getRuleContext(TypeRefWithGenericsContext.class,0);
		}
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
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1388);
				argumentName();
				}
				break;
			}
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1391);
				match(Ellipsis);
				}
			}

			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1394);
				typeRefWithGenerics();
				}
				break;
			case 2:
				{
				setState(1395);
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
	public static class TypeRefWithGenericsContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TypeRefWithGenericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRefWithGenerics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).enterTypeRefWithGenerics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JhpParserListener ) ((JhpParserListener)listener).exitTypeRefWithGenerics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JhpParserVisitor ) return ((JhpParserVisitor<? extends T>)visitor).visitTypeRefWithGenerics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefWithGenericsContext typeRefWithGenerics() throws RecognitionException {
		TypeRefWithGenericsContext _localctx = new TypeRefWithGenericsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_typeRefWithGenerics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			qualifiedNamespaceName();
			setState(1399);
			genericDynamicArgs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode Eq() { return getToken(JhpParser.Eq, 0); }
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
		enterRule(_localctx, 184, RULE_argumentName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			identifier();
			setState(1402);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==Eq) ) {
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
		enterRule(_localctx, 186, RULE_constantInitializer);
		int _la;
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1406);
				match(Array);
				setState(1407);
				match(OpenRoundBracket);
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1408);
					arrayItemList();
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1409);
						match(Comma);
						}
					}

					}
				}

				setState(1414);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1415);
				match(OpenSquareBracket);
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1416);
					arrayItemList();
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1417);
						match(Comma);
						}
					}

					}
				}

				setState(1422);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1423);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1424);
				constantInitializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1425);
					string();
					}
					break;
				case 2:
					{
					setState(1426);
					constant();
					}
					break;
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(1429);
					match(Dot);
					setState(1432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1:
						{
						setState(1430);
						string();
						}
						break;
					case 2:
						{
						setState(1431);
						constant();
						}
						break;
					}
					}
					}
					setState(1438);
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
		enterRule(_localctx, 188, RULE_constant);
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1444);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1445);
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
		enterRule(_localctx, 190, RULE_literalConstant);
		try {
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
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
		enterRule(_localctx, 192, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
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
		enterRule(_localctx, 194, RULE_classConstant);
		int _la;
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1457);
				match(DoubleColon);
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1458);
					identifier();
					}
					break;
				case 2:
					{
					setState(1459);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1460);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1461);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
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
					setState(1464);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1465);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1466);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1469);
				match(DoubleColon);
				setState(1472);
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
					setState(1470);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1471);
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
		enterRule(_localctx, 196, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
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
		public TerminalNode EndHereDoc() { return getToken(JhpParser.EndHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(JhpParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(JhpParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(JhpParser.StartNowDoc, 0); }
		public TerminalNode EndNowDoc() { return getToken(JhpParser.EndNowDoc, 0); }
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
		enterRule(_localctx, 198, RULE_string);
		int _la;
		try {
			int _alt;
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				match(StartHereDoc);
				setState(1480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1479);
					match(HereDocText);
					}
					}
					setState(1482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HereDocText );
				setState(1484);
				match(EndHereDoc);
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				match(StartNowDoc);
				setState(1487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1486);
					match(HereDocText);
					}
					}
					setState(1489); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HereDocText );
				setState(1491);
				match(EndNowDoc);
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1492);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1493);
				match(DoubleQuote);
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1494);
						interpolatedStringPart();
						}
						} 
					}
					setState(1499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				setState(1500);
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
		enterRule(_localctx, 200, RULE_interpolatedStringPart);
		try {
			setState(1506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
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
				setState(1505);
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
		enterRule(_localctx, 202, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			chain();
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1509);
				match(Comma);
				setState(1510);
				chain();
				}
				}
				setState(1515);
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
		enterRule(_localctx, 204, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			chainOrigin();
			setState(1520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1517);
					memberAccess();
					}
					} 
				}
				setState(1522);
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
		enterRule(_localctx, 206, RULE_chainOrigin);
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1525);
				match(OpenRoundBracket);
				setState(1526);
				newExpr();
				setState(1527);
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
		enterRule(_localctx, 208, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(ObjectOperator);
			setState(1532);
			keyedFieldName();
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1533);
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
		enterRule(_localctx, 210, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			functionCallName();
			setState(1537);
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
		enterRule(_localctx, 212, RULE_functionCallName);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1541);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
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
		enterRule(_localctx, 214, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1545);
				genericDynamicArgs();
				}
			}

			setState(1549); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1548);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1551); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1553);
					squareCurlyExpression();
					}
					} 
				}
				setState(1558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 216, RULE_chainBase);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				keyedVariable();
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1560);
					match(DoubleColon);
					setState(1561);
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
				setState(1564);
				qualifiedStaticTypeRef();
				setState(1565);
				match(DoubleColon);
				setState(1566);
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
		enterRule(_localctx, 218, RULE_keyedFieldName);
		try {
			setState(1572);
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
				setState(1570);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571);
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
		enterRule(_localctx, 220, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
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
				setState(1574);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1575);
				match(OpenCurlyBracket);
				setState(1576);
				expression(0);
				setState(1577);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1581);
					squareCurlyExpression();
					}
					} 
				}
				setState(1586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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
		enterRule(_localctx, 222, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1587);
					match(Dollar);
					}
					} 
				}
				setState(1592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			setState(1599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1593);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1594);
				match(Dollar);
				setState(1595);
				match(OpenCurlyBracket);
				setState(1596);
				expression(0);
				setState(1597);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1601);
					squareCurlyExpression();
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		enterRule(_localctx, 224, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				match(OpenSquareBracket);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1608);
					expression(0);
					}
				}

				setState(1611);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(OpenCurlyBracket);
				setState(1613);
				expression(0);
				setState(1614);
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
		enterRule(_localctx, 226, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
				{
				setState(1618);
				assignmentListElement();
				}
			}

			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1621);
				match(Comma);
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & -589753335729799185L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 441351938352086847L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 4259535184705L) != 0)) {
					{
					setState(1622);
					assignmentListElement();
					}
				}

				}
				}
				setState(1629);
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
		enterRule(_localctx, 228, RULE_assignmentListElement);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				match(List);
				setState(1632);
				match(OpenRoundBracket);
				setState(1633);
				assignmentList();
				setState(1634);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
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
		enterRule(_localctx, 230, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
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
		enterRule(_localctx, 232, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
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
		enterRule(_localctx, 234, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
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
		enterRule(_localctx, 236, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
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
		enterRule(_localctx, 238, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
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
		enterRule(_localctx, 240, RULE_castOperation);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				match(BoolType);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				match(Int8Cast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				match(Int16Cast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1652);
				match(IntType);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1653);
				match(Int64Type);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1654);
				match(UintCast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1655);
				match(DoubleCast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1656);
				match(DoubleType);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1657);
				match(FloatCast);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1658);
				match(StringType);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1659);
				match(BinaryCast);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1660);
				match(UnicodeCast);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1661);
				match(Array);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1662);
				match(ObjectType);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1663);
				match(Resource);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1664);
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
		"\u0004\u0001\u00d3\u0684\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"w\u0002x\u0007x\u0001\u0000\u0003\u0000\u00f4\b\u0000\u0001\u0000\u0003"+
		"\u0000\u00f7\b\u0000\u0001\u0000\u0005\u0000\u00fa\b\u0000\n\u0000\f\u0000"+
		"\u00fd\t\u0000\u0001\u0000\u0005\u0000\u0100\b\u0000\n\u0000\f\u0000\u0103"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0108\b\u0001"+
		"\n\u0001\f\u0001\u010b\t\u0001\u0001\u0001\u0004\u0001\u010e\b\u0001\u000b"+
		"\u0001\f\u0001\u010f\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0119\b\u0003\n\u0003\f\u0003"+
		"\u011c\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0120\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0127"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u012e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0133"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u013a\b\u0006\u0001\u0006\u0003\u0006\u013d\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007\u0142\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0145\b\u0007\u0001\u0007\u0003\u0007\u0148\b\u0007\u0001\u0007\u0003"+
		"\u0007\u014b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0150"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0154\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0158\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u015d\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0161\b"+
		"\u0007\u0003\u0007\u0163\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0167"+
		"\b\u0007\n\u0007\f\u0007\u016a\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0173\b\t\n\t\f\t\u0176\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0186\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u018b\b\u000b\n\u000b\f\u000b\u018e\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0193\b\f\n\f\f\f\u0196\t\f\u0001\r\u0003"+
		"\r\u0199\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u019e\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01a4\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01aa\b\u000f\n"+
		"\u000f\f\u000f\u01ad\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010\u01b2\b\u0010\u000b\u0010\f\u0010\u01b3\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u01ba\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01bf\b\u0011\n\u0011\f\u0011\u01c2\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u01c8\b\u0012\u0001"+
		"\u0013\u0005\u0013\u01cb\b\u0013\n\u0013\f\u0013\u01ce\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01d3\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e7\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01f3\b\u0018"+
		"\n\u0018\f\u0018\u01f6\t\u0018\u0001\u0018\u0003\u0018\u01f9\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0200"+
		"\b\u0018\n\u0018\f\u0018\u0203\t\u0018\u0001\u0018\u0003\u0018\u0206\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u020b\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0225\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0230"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0234\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0238\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0241\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u024b"+
		"\b\"\u0001\"\u0005\"\u024e\b\"\n\"\f\"\u0251\t\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0256\b\"\u0001\"\u0005\"\u0259\b\"\n\"\f\"\u025c\t\"\u0001"+
		"\"\u0001\"\u0003\"\u0260\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u026a\b#\u0001$\u0001$\u0001%\u0001%\u0003%\u0270"+
		"\b%\u0001%\u0001%\u0001&\u0001&\u0003&\u0276\b&\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0003\'\u027c\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u0290\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u029a\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02a7\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u02af\b)\u0001*\u0001*\u0001*\u0004*\u02b4"+
		"\b*\u000b*\f*\u02b5\u0001*\u0003*\u02b9\b*\u0001*\u0005*\u02bc\b*\n*\f"+
		"*\u02bf\t*\u0001*\u0003*\u02c2\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u02c9\b+\n+\f+\u02cc\t+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001.\u0003.\u02da\b.\u0001.\u0001.\u0005"+
		".\u02de\b.\n.\f.\u02e1\t.\u0001.\u0003.\u02e4\b.\u0001/\u0003/\u02e7\b"+
		"/\u0001/\u0005/\u02ea\b/\n/\f/\u02ed\t/\u0001/\u0003/\u02f0\b/\u0001/"+
		"\u0001/\u0003/\u02f4\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0003"+
		"0\u02fc\b0\u00010\u00010\u00010\u00050\u0301\b0\n0\f0\u0304\t0\u00011"+
		"\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u030e\b2\n2\f"+
		"2\u0311\t2\u00012\u00012\u00013\u00033\u0316\b3\u00013\u00013\u00013\u0001"+
		"3\u00013\u00053\u031d\b3\n3\f3\u0320\t3\u00013\u00013\u00013\u00033\u0325"+
		"\b3\u00013\u00013\u00033\u0329\b3\u00013\u00013\u00013\u00053\u032e\b"+
		"3\n3\f3\u0331\t3\u00013\u00013\u00013\u00013\u00013\u00033\u0338\b3\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u033f\b3\u00013\u00013\u00033\u0343"+
		"\b3\u00033\u0345\b3\u00013\u00013\u00013\u00013\u00033\u034b\b3\u0001"+
		"4\u00014\u00014\u00054\u0350\b4\n4\f4\u0353\t4\u00014\u00034\u0356\b4"+
		"\u00015\u00015\u00035\u035a\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00037\u0367\b7\u00017\u00037\u036a"+
		"\b7\u00017\u00017\u00018\u00018\u00018\u00038\u0371\b8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00039\u0378\b9\u0001:\u0001:\u0003:\u037c\b:\u0001:\u0001"+
		":\u0001;\u0001;\u0003;\u0382\b;\u0001<\u0001<\u0001=\u0004=\u0387\b=\u000b"+
		"=\f=\u0388\u0001>\u0001>\u0001>\u0003>\u038e\b>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001@\u0003@\u0395\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005"+
		"@\u039d\b@\n@\f@\u03a0\t@\u0003@\u03a2\b@\u0001@\u0001@\u0001@\u0001@"+
		"\u0005@\u03a8\b@\n@\f@\u03ab\t@\u0001@\u0001@\u0003@\u03af\b@\u0001@\u0001"+
		"@\u0003@\u03b3\b@\u0001@\u0001@\u0005@\u03b7\b@\n@\f@\u03ba\t@\u0001@"+
		"\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u03c5"+
		"\bA\nA\fA\u03c8\tA\u0001A\u0001A\u0003A\u03cc\bA\u0001A\u0001A\u0001A"+
		"\u0003A\u03d1\bA\u0001A\u0003A\u03d4\bA\u0001B\u0001B\u0001B\u0005B\u03d9"+
		"\bB\nB\fB\u03dc\tB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u040a\bD\u0001D\u0001"+
		"D\u0003D\u040e\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0434"+
		"\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u044a\bD\nD\fD\u044d\tD\u0001E\u0001E\u0003E\u0451\bE\u0001F"+
		"\u0001F\u0001F\u0003F\u0456\bF\u0001F\u0001F\u0001F\u0003F\u045b\bF\u0001"+
		"F\u0003F\u045e\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u0464\bF\u0001G\u0001"+
		"G\u0005G\u0468\bG\nG\fG\u046b\tG\u0001G\u0001G\u0004G\u046f\bG\u000bG"+
		"\fG\u0470\u0001G\u0005G\u0474\bG\nG\fG\u0477\tG\u0001G\u0005G\u047a\b"+
		"G\nG\fG\u047d\tG\u0001G\u0001G\u0001G\u0001G\u0001G\u0004G\u0484\bG\u000b"+
		"G\fG\u0485\u0001G\u0005G\u0489\bG\nG\fG\u048c\tG\u0001G\u0003G\u048f\b"+
		"G\u0001G\u0001G\u0003G\u0493\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0003"+
		"I\u049a\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003"+
		"J\u04a4\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u04af\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0005K\u04b9\bK\nK\fK\u04bc\tK\u0001K\u0003K\u04bf\bK\u0001K\u0001K"+
		"\u0001L\u0001L\u0001L\u0005L\u04c6\bL\nL\fL\u04c9\tL\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0003M\u04d1\bM\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0005O\u04d8\bO\nO\fO\u04db\tO\u0001O\u0003O\u04de\bO\u0001P\u0001P"+
		"\u0001P\u0003P\u04e3\bP\u0001Q\u0001Q\u0003Q\u04e7\bQ\u0001Q\u0003Q\u04ea"+
		"\bQ\u0001R\u0001R\u0003R\u04ee\bR\u0001R\u0003R\u04f1\bR\u0001R\u0001"+
		"R\u0001R\u0003R\u04f6\bR\u0001S\u0003S\u04f9\bS\u0001S\u0003S\u04fc\b"+
		"S\u0001S\u0003S\u04ff\bS\u0001S\u0003S\u0502\bS\u0001S\u0001S\u0003S\u0506"+
		"\bS\u0001S\u0001S\u0003S\u050a\bS\u0001S\u0001S\u0003S\u050e\bS\u0001"+
		"S\u0001S\u0001S\u0003S\u0513\bS\u0001S\u0001S\u0003S\u0517\bS\u0003S\u0519"+
		"\bS\u0001S\u0001S\u0005S\u051d\bS\nS\fS\u0520\tS\u0001S\u0001S\u0001T"+
		"\u0001T\u0001T\u0005T\u0527\bT\nT\fT\u052a\tT\u0001U\u0003U\u052d\bU\u0001"+
		"U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u0535\bV\nV\fV\u0538\tV\u0001"+
		"V\u0001V\u0003V\u053c\bV\u0003V\u053e\bV\u0001W\u0001W\u0001W\u0003W\u0543"+
		"\bW\u0001W\u0001W\u0001W\u0001W\u0005W\u0549\bW\nW\fW\u054c\tW\u0001W"+
		"\u0003W\u054f\bW\u0001W\u0001W\u0003W\u0553\bW\u0001X\u0001X\u0001X\u0005"+
		"X\u0558\bX\nX\fX\u055b\tX\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0561\bY"+
		"\nY\fY\u0564\tY\u0003Y\u0566\bY\u0001Y\u0003Y\u0569\bY\u0001Y\u0001Y\u0001"+
		"Z\u0003Z\u056e\bZ\u0001Z\u0003Z\u0571\bZ\u0001Z\u0001Z\u0003Z\u0575\b"+
		"Z\u0001[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0003]\u0583\b]\u0003]\u0585\b]\u0001]\u0001]\u0001]\u0001"+
		"]\u0003]\u058b\b]\u0003]\u058d\b]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003"+
		"]\u0594\b]\u0001]\u0001]\u0001]\u0003]\u0599\b]\u0005]\u059b\b]\n]\f]"+
		"\u059e\t]\u0003]\u05a0\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u05a7"+
		"\b^\u0001_\u0001_\u0001_\u0001_\u0003_\u05ad\b_\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0003a\u05b7\ba\u0001a\u0001a\u0001a\u0003"+
		"a\u05bc\ba\u0001a\u0001a\u0001a\u0003a\u05c1\ba\u0003a\u05c3\ba\u0001"+
		"b\u0001b\u0001c\u0001c\u0004c\u05c9\bc\u000bc\fc\u05ca\u0001c\u0001c\u0001"+
		"c\u0004c\u05d0\bc\u000bc\fc\u05d1\u0001c\u0001c\u0001c\u0001c\u0005c\u05d8"+
		"\bc\nc\fc\u05db\tc\u0001c\u0003c\u05de\bc\u0001d\u0001d\u0001d\u0003d"+
		"\u05e3\bd\u0001e\u0001e\u0001e\u0005e\u05e8\be\ne\fe\u05eb\te\u0001f\u0001"+
		"f\u0005f\u05ef\bf\nf\ff\u05f2\tf\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0003g\u05fa\bg\u0001h\u0001h\u0001h\u0003h\u05ff\bh\u0001i\u0001i\u0001"+
		"i\u0001j\u0001j\u0001j\u0001j\u0003j\u0608\bj\u0001k\u0003k\u060b\bk\u0001"+
		"k\u0004k\u060e\bk\u000bk\fk\u060f\u0001k\u0005k\u0613\bk\nk\fk\u0616\t"+
		"k\u0001l\u0001l\u0001l\u0003l\u061b\bl\u0001l\u0001l\u0001l\u0001l\u0003"+
		"l\u0621\bl\u0001m\u0001m\u0003m\u0625\bm\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0003n\u062c\bn\u0001n\u0005n\u062f\bn\nn\fn\u0632\tn\u0001o\u0005o"+
		"\u0635\bo\no\fo\u0638\to\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003"+
		"o\u0640\bo\u0001o\u0005o\u0643\bo\no\fo\u0646\to\u0001p\u0001p\u0003p"+
		"\u064a\bp\u0001p\u0001p\u0001p\u0001p\u0001p\u0003p\u0651\bp\u0001q\u0003"+
		"q\u0654\bq\u0001q\u0001q\u0003q\u0658\bq\u0005q\u065a\bq\nq\fq\u065d\t"+
		"q\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0003r\u0666\br\u0001"+
		"s\u0001s\u0001t\u0001t\u0001u\u0001u\u0001v\u0001v\u0001w\u0001w\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u0682\bx\u0001x\u0000\u0002"+
		"`\u0088y\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u0000\u0016\u0003\u0000"+
		"56PP^^\u0001\u0000LN\u0002\u0000\u0014\u0014XX\u0001\u0000\u00b9\u00ba"+
		"\u0001\u0000\u00ad\u00ae\u0002\u0000\u00a6\u00a6\u00a8\u00a9\u0001\u0000"+
		"\u0083\u0084\u0001\u0000\u00aa\u00ac\u0002\u0000\u00a8\u00a9\u00b0\u00b0"+
		"\u0001\u0000\u009c\u009d\u0002\u0000\u0089\u008a\u00a2\u00a3\u0001\u0000"+
		"\u0085\u0088\u0004\u0000\u008b\u008d\u008f\u0097\u009b\u009b\u00bb\u00bb"+
		"\u0002\u0000\u00b9\u00b9\u00bb\u00bb\u0001\u0000\u00a8\u00a9\u0002\u0000"+
		"\u00c0\u00c1\u00c3\u00c4\u0002\u0000\u0014\u0014II\u0002\u0000\n\n++\u0013"+
		"\u0000\n\n\f\r\u000f\u0017\u001a\u001a\u001d\u001f!!#\'*,.03489>>@DGO"+
		"R\\_`gor~\u00bf\u00bf\u0004\u0000\n\n++LOTT\u0001\u0000w~\b\u0000\u000b"+
		"\u000b\u000e\u000e\u001c\u001c--<=HHRRUU\u0739\u0000\u00f3\u0001\u0000"+
		"\u0000\u0000\u0002\u0109\u0001\u0000\u0000\u0000\u0004\u0111\u0001\u0000"+
		"\u0000\u0000\u0006\u0115\u0001\u0000\u0000\u0000\b\u0126\u0001\u0000\u0000"+
		"\u0000\n\u0128\u0001\u0000\u0000\u0000\f\u012d\u0001\u0000\u0000\u0000"+
		"\u000e\u0141\u0001\u0000\u0000\u0000\u0010\u016d\u0001\u0000\u0000\u0000"+
		"\u0012\u016f\u0001\u0000\u0000\u0000\u0014\u0185\u0001\u0000\u0000\u0000"+
		"\u0016\u0187\u0001\u0000\u0000\u0000\u0018\u018f\u0001\u0000\u0000\u0000"+
		"\u001a\u0198\u0001\u0000\u0000\u0000\u001c\u019d\u0001\u0000\u0000\u0000"+
		"\u001e\u01a5\u0001\u0000\u0000\u0000 \u01b1\u0001\u0000\u0000\u0000\""+
		"\u01b5\u0001\u0000\u0000\u0000$\u01c5\u0001\u0000\u0000\u0000&\u01cc\u0001"+
		"\u0000\u0000\u0000(\u01d2\u0001\u0000\u0000\u0000*\u01e6\u0001\u0000\u0000"+
		"\u0000,\u01e8\u0001\u0000\u0000\u0000.\u01ea\u0001\u0000\u0000\u00000"+
		"\u020a\u0001\u0000\u0000\u00002\u020c\u0001\u0000\u0000\u00004\u0210\u0001"+
		"\u0000\u0000\u00006\u0215\u0001\u0000\u0000\u00008\u0218\u0001\u0000\u0000"+
		"\u0000:\u021c\u0001\u0000\u0000\u0000<\u0226\u0001\u0000\u0000\u0000>"+
		"\u022c\u0001\u0000\u0000\u0000@\u0242\u0001\u0000\u0000\u0000B\u0244\u0001"+
		"\u0000\u0000\u0000D\u0246\u0001\u0000\u0000\u0000F\u0269\u0001\u0000\u0000"+
		"\u0000H\u026b\u0001\u0000\u0000\u0000J\u026d\u0001\u0000\u0000\u0000L"+
		"\u0273\u0001\u0000\u0000\u0000N\u0279\u0001\u0000\u0000\u0000P\u027f\u0001"+
		"\u0000\u0000\u0000R\u0282\u0001\u0000\u0000\u0000T\u02b0\u0001\u0000\u0000"+
		"\u0000V\u02c3\u0001\u0000\u0000\u0000X\u02d1\u0001\u0000\u0000\u0000Z"+
		"\u02d4\u0001\u0000\u0000\u0000\\\u02d9\u0001\u0000\u0000\u0000^\u02e6"+
		"\u0001\u0000\u0000\u0000`\u02fb\u0001\u0000\u0000\u0000b\u0305\u0001\u0000"+
		"\u0000\u0000d\u0309\u0001\u0000\u0000\u0000f\u034a\u0001\u0000\u0000\u0000"+
		"h\u0355\u0001\u0000\u0000\u0000j\u0359\u0001\u0000\u0000\u0000l\u035b"+
		"\u0001\u0000\u0000\u0000n\u0362\u0001\u0000\u0000\u0000p\u0370\u0001\u0000"+
		"\u0000\u0000r\u0374\u0001\u0000\u0000\u0000t\u0379\u0001\u0000\u0000\u0000"+
		"v\u0381\u0001\u0000\u0000\u0000x\u0383\u0001\u0000\u0000\u0000z\u0386"+
		"\u0001\u0000\u0000\u0000|\u038a\u0001\u0000\u0000\u0000~\u038f\u0001\u0000"+
		"\u0000\u0000\u0080\u0394\u0001\u0000\u0000\u0000\u0082\u03d3\u0001\u0000"+
		"\u0000\u0000\u0084\u03d5\u0001\u0000\u0000\u0000\u0086\u03dd\u0001\u0000"+
		"\u0000\u0000\u0088\u040d\u0001\u0000\u0000\u0000\u008a\u0450\u0001\u0000"+
		"\u0000\u0000\u008c\u045d\u0001\u0000\u0000\u0000\u008e\u0492\u0001\u0000"+
		"\u0000\u0000\u0090\u0494\u0001\u0000\u0000\u0000\u0092\u0499\u0001\u0000"+
		"\u0000\u0000\u0094\u04ae\u0001\u0000\u0000\u0000\u0096\u04b0\u0001\u0000"+
		"\u0000\u0000\u0098\u04c2\u0001\u0000\u0000\u0000\u009a\u04cd\u0001\u0000"+
		"\u0000\u0000\u009c\u04d2\u0001\u0000\u0000\u0000\u009e\u04d4\u0001\u0000"+
		"\u0000\u0000\u00a0\u04df\u0001\u0000\u0000\u0000\u00a2\u04e9\u0001\u0000"+
		"\u0000\u0000\u00a4\u04f5\u0001\u0000\u0000\u0000\u00a6\u04f8\u0001\u0000"+
		"\u0000\u0000\u00a8\u0523\u0001\u0000\u0000\u0000\u00aa\u052c\u0001\u0000"+
		"\u0000\u0000\u00ac\u053d\u0001\u0000\u0000\u0000\u00ae\u0552\u0001\u0000"+
		"\u0000\u0000\u00b0\u0554\u0001\u0000\u0000\u0000\u00b2\u055c\u0001\u0000"+
		"\u0000\u0000\u00b4\u056d\u0001\u0000\u0000\u0000\u00b6\u0576\u0001\u0000"+
		"\u0000\u0000\u00b8\u0579\u0001\u0000\u0000\u0000\u00ba\u059f\u0001\u0000"+
		"\u0000\u0000\u00bc\u05a6\u0001\u0000\u0000\u0000\u00be\u05ac\u0001\u0000"+
		"\u0000\u0000\u00c0\u05ae\u0001\u0000\u0000\u0000\u00c2\u05c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u05c4\u0001\u0000\u0000\u0000\u00c6\u05dd\u0001\u0000"+
		"\u0000\u0000\u00c8\u05e2\u0001\u0000\u0000\u0000\u00ca\u05e4\u0001\u0000"+
		"\u0000\u0000\u00cc\u05ec\u0001\u0000\u0000\u0000\u00ce\u05f9\u0001\u0000"+
		"\u0000\u0000\u00d0\u05fb\u0001\u0000\u0000\u0000\u00d2\u0600\u0001\u0000"+
		"\u0000\u0000\u00d4\u0607\u0001\u0000\u0000\u0000\u00d6\u060a\u0001\u0000"+
		"\u0000\u0000\u00d8\u0620\u0001\u0000\u0000\u0000\u00da\u0624\u0001\u0000"+
		"\u0000\u0000\u00dc\u062b\u0001\u0000\u0000\u0000\u00de\u0636\u0001\u0000"+
		"\u0000\u0000\u00e0\u0650\u0001\u0000\u0000\u0000\u00e2\u0653\u0001\u0000"+
		"\u0000\u0000\u00e4\u0665\u0001\u0000\u0000\u0000\u00e6\u0667\u0001\u0000"+
		"\u0000\u0000\u00e8\u0669\u0001\u0000\u0000\u0000\u00ea\u066b\u0001\u0000"+
		"\u0000\u0000\u00ec\u066d\u0001\u0000\u0000\u0000\u00ee\u066f\u0001\u0000"+
		"\u0000\u0000\u00f0\u0681\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0002"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003\n\u0005"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fb\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u0004\u0002"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u0101\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe\u0100\u0003\b\u0004\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0000\u0000\u0001"+
		"\u0105\u0001\u0001\u0000\u0000\u0000\u0106\u0108\u0003\u0004\u0002\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0003\b\u0004\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0003\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0007\u0000\u0000\u0000\u0112\u0113\u0003\u0006\u0003\u0000\u0113"+
		"\u0114\u0005\u00ba\u0000\u0000\u0114\u0005\u0001\u0000\u0000\u0000\u0115"+
		"\u011a\u0003\u00e8t\u0000\u0116\u0117\u0005\u00a0\u0000\u0000\u0117\u0119"+
		"\u0003\u00e8t\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011f\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u00a0\u0000\u0000\u011e\u0120\u0005"+
		"\u00aa\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0007\u0001\u0000\u0000\u0000\u0121\u0127\u0003"+
		"*\u0015\u0000\u0122\u0127\u0003\n\u0005\u0000\u0123\u0127\u0003\f\u0006"+
		"\u0000\u0124\u0127\u0003\u000e\u0007\u0000\u0125\u0127\u0003\u0080@\u0000"+
		"\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000"+
		"\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0127\t\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0005E\u0000\u0000\u0129\u012a\u0003\u00acV\u0000\u012a\u012b\u0005"+
		"\u00ba\u0000\u0000\u012b\u000b\u0001\u0000\u0000\u0000\u012c\u012e\u0003"+
		" \u0010\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u00050\u0000"+
		"\u0000\u0130\u0132\u0003\u00e8t\u0000\u0131\u0133\u0003\u0014\n\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u00b2\u0000\u0000"+
		"\u0135\u0136\u0003\\.\u0000\u0136\u013c\u0005\u00b3\u0000\u0000\u0137"+
		"\u0139\u0005\u00b9\u0000\u0000\u0138\u013a\u0005\u00b1\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0003`0\u0000\u013c\u0137\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0003.\u0017\u0000\u013f\r\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0003 \u0010\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0007\u0001\u0000\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u0148\u0003\u00e6s\u0000\u0147\u0146\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0005J\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u0162\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003\u0010\b\u0000\u014d\u014f\u0003\u00e8t\u0000\u014e\u0150"+
		"\u0003\u0014\n\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u0152\u0005"+
		"*\u0000\u0000\u0152\u0154\u0003\u00a2Q\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u00054\u0000\u0000\u0156\u0158\u0003\u0012\t\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u0163\u0001\u0000\u0000\u0000\u0159\u015a\u0005>\u0000\u0000\u015a"+
		"\u015c\u0003\u00e8t\u0000\u015b\u015d\u0003\u0014\n\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015f\u0161\u0003"+
		"\u0012\t\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u014c\u0001\u0000"+
		"\u0000\u0000\u0162\u0159\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0168\u0005\u00b6\u0000\u0000\u0165\u0167\u0003f3\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005\u00b7\u0000\u0000\u016c\u000f\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0007\u0002\u0000\u0000\u016e\u0011\u0001\u0000\u0000\u0000"+
		"\u016f\u0174\u0003\u00a2Q\u0000\u0170\u0171\u0005\u00b8\u0000\u0000\u0171"+
		"\u0173\u0003\u00a2Q\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0013\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0080\u0000\u0000\u0178\u0179"+
		"\u0003\u0016\u000b\u0000\u0179\u017a\u0005\u0081\u0000\u0000\u017a\u0186"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0080\u0000\u0000\u017c\u017d"+
		"\u0003\u0018\f\u0000\u017d\u017e\u0005\u0081\u0000\u0000\u017e\u0186\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005\u0080\u0000\u0000\u0180\u0181\u0003"+
		"\u0016\u000b\u0000\u0181\u0182\u0005\u00b8\u0000\u0000\u0182\u0183\u0003"+
		"\u0018\f\u0000\u0183\u0184\u0005\u0081\u0000\u0000\u0184\u0186\u0001\u0000"+
		"\u0000\u0000\u0185\u0177\u0001\u0000\u0000\u0000\u0185\u017b\u0001\u0000"+
		"\u0000\u0000\u0185\u017f\u0001\u0000\u0000\u0000\u0186\u0015\u0001\u0000"+
		"\u0000\u0000\u0187\u018c\u0003\u001a\r\u0000\u0188\u0189\u0005\u00b8\u0000"+
		"\u0000\u0189\u018b\u0003\u001a\r\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0017\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0194\u0003\u001c\u000e\u0000"+
		"\u0190\u0191\u0005\u00b8\u0000\u0000\u0191\u0193\u0003\u001c\u000e\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0019\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0197\u0199\u0003 \u0010\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0003\u00e8t\u0000\u019b\u001b\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0003 \u0010\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0003"+
		"\u00e8t\u0000\u01a0\u01a3\u0005\u00bb\u0000\u0000\u01a1\u01a4\u0003\u00a2"+
		"Q\u0000\u01a2\u01a4\u0003\u00eew\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u001d\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005\u0080\u0000\u0000\u01a6\u01ab\u0003\u00a4R\u0000\u01a7"+
		"\u01a8\u0005\u00b8\u0000\u0000\u01a8\u01aa\u0003\u00a4R\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005\u0081\u0000\u0000\u01af\u001f\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\u0003\"\u0011\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4!\u0001\u0000\u0000\u0000\u01b5\u01b9\u0005\u0006"+
		"\u0000\u0000\u01b6\u01b7\u0003\u00e8t\u0000\u01b7\u01b8\u0005\u00b9\u0000"+
		"\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01c0\u0003$\u0012\u0000\u01bc\u01bd\u0005\u00b8\u0000\u0000"+
		"\u01bd\u01bf\u0003$\u0012\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u00b5\u0000\u0000\u01c4"+
		"#\u0001\u0000\u0000\u0000\u01c5\u01c7\u0003\u00aaU\u0000\u01c6\u01c8\u0003"+
		"\u00b2Y\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8%\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003(\u0014\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\'\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d3\u0003*\u0015\u0000\u01d0\u01d3\u0003\f\u0006\u0000\u01d1\u01d3"+
		"\u0003\u000e\u0007\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3)\u0001"+
		"\u0000\u0000\u0000\u01d4\u01e7\u0003.\u0017\u0000\u01d5\u01e7\u00030\u0018"+
		"\u0000\u01d6\u01e7\u0003:\u001d\u0000\u01d7\u01e7\u0003<\u001e\u0000\u01d8"+
		"\u01e7\u0003>\u001f\u0000\u01d9\u01e7\u0003D\"\u0000\u01da\u01e7\u0003"+
		"J%\u0000\u01db\u01e7\u0003L&\u0000\u01dc\u01e7\u0003N\'\u0000\u01dd\u01e7"+
		"\u0003b1\u0000\u01de\u01e7\u0003P(\u0000\u01df\u01e7\u0003R)\u0000\u01e0"+
		"\u01e7\u0003T*\u0000\u01e1\u01e7\u0003Z-\u0000\u01e2\u01e7\u0003,\u0016"+
		"\u0000\u01e3\u01e4\u0003 \u0010\u0000\u01e4\u01e5\u0003P(\u0000\u01e5"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e6\u01d4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01e6\u01d6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01e6\u01d8\u0001\u0000\u0000\u0000\u01e6"+
		"\u01d9\u0001\u0000\u0000\u0000\u01e6\u01da\u0001\u0000\u0000\u0000\u01e6"+
		"\u01db\u0001\u0000\u0000\u0000\u01e6\u01dc\u0001\u0000\u0000\u0000\u01e6"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e6\u01de\u0001\u0000\u0000\u0000\u01e6"+
		"\u01df\u0001\u0000\u0000\u0000\u01e6\u01e0\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e7+\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\u00ba\u0000\u0000\u01e9-\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005"+
		"\u00b6\u0000\u0000\u01eb\u01ec\u0003&\u0013\u0000\u01ec\u01ed\u0005\u00b7"+
		"\u0000\u0000\u01ed/\u0001\u0000\u0000\u0000\u01ee\u01ef\u00053\u0000\u0000"+
		"\u01ef\u01f0\u0003\u0086C\u0000\u01f0\u01f4\u0003*\u0015\u0000\u01f1\u01f3"+
		"\u00032\u0019\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f9\u00036\u001b\u0000\u01f8\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u020b\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u00053\u0000\u0000\u01fb\u01fc\u0003\u0086C\u0000"+
		"\u01fc\u01fd\u0005\u00b9\u0000\u0000\u01fd\u0201\u0003&\u0013\u0000\u01fe"+
		"\u0200\u00034\u001a\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0203"+
		"\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0204\u0206\u00038\u001c\u0000\u0205\u0204\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0005%\u0000\u0000\u0208\u0209\u0005\u00ba"+
		"\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u01ee\u0001\u0000"+
		"\u0000\u0000\u020a\u01fa\u0001\u0000\u0000\u0000\u020b1\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0005\u001f\u0000\u0000\u020d\u020e\u0003\u0086C\u0000"+
		"\u020e\u020f\u0003*\u0015\u0000\u020f3\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0005\u001f\u0000\u0000\u0211\u0212\u0003\u0086C\u0000\u0212\u0213\u0005"+
		"\u00b9\u0000\u0000\u0213\u0214\u0003&\u0013\u0000\u02145\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0005\u001e\u0000\u0000\u0216\u0217\u0003*\u0015\u0000"+
		"\u02177\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u001e\u0000\u0000\u0219"+
		"\u021a\u0005\u00b9\u0000\u0000\u021a\u021b\u0003&\u0013\u0000\u021b9\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0005`\u0000\u0000\u021d\u0224\u0003\u0086"+
		"C\u0000\u021e\u0225\u0003*\u0015\u0000\u021f\u0220\u0005\u00b9\u0000\u0000"+
		"\u0220\u0221\u0003&\u0013\u0000\u0221\u0222\u0005\'\u0000\u0000\u0222"+
		"\u0223\u0005\u00ba\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224"+
		"\u021e\u0001\u0000\u0000\u0000\u0224\u021f\u0001\u0000\u0000\u0000\u0225"+
		";\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u001a\u0000\u0000\u0227\u0228"+
		"\u0003*\u0015\u0000\u0228\u0229\u0005`\u0000\u0000\u0229\u022a\u0003\u0086"+
		"C\u0000\u022a\u022b\u0005\u00ba\u0000\u0000\u022b=\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0005.\u0000\u0000\u022d\u022f\u0005\u00b2\u0000\u0000\u022e"+
		"\u0230\u0003@ \u0000\u022f\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0005"+
		"\u00ba\u0000\u0000\u0232\u0234\u0003\u0084B\u0000\u0233\u0232\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0237\u0005\u00ba\u0000\u0000\u0236\u0238\u0003B!\u0000"+
		"\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u0240\u0005\u00b3\u0000\u0000"+
		"\u023a\u0241\u0003*\u0015\u0000\u023b\u023c\u0005\u00b9\u0000\u0000\u023c"+
		"\u023d\u0003&\u0013\u0000\u023d\u023e\u0005#\u0000\u0000\u023e\u023f\u0005"+
		"\u00ba\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023a\u0001"+
		"\u0000\u0000\u0000\u0240\u023b\u0001\u0000\u0000\u0000\u0241?\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0003\u0084B\u0000\u0243A\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0003\u0084B\u0000\u0245C\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0005V\u0000\u0000\u0247\u025f\u0003\u0086C\u0000\u0248\u024a\u0005\u00b6"+
		"\u0000\u0000\u0249\u024b\u0005\u00ba\u0000\u0000\u024a\u0249\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024f\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0003F#\u0000\u024d\u024c\u0001\u0000\u0000\u0000"+
		"\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000"+
		"\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0260\u0005\u00b7\u0000\u0000"+
		"\u0253\u0255\u0005\u00b9\u0000\u0000\u0254\u0256\u0005\u00ba\u0000\u0000"+
		"\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000"+
		"\u0256\u025a\u0001\u0000\u0000\u0000\u0257\u0259\u0003F#\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025d"+
		"\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d\u025e"+
		"\u0005&\u0000\u0000\u025e\u0260\u0005\u00ba\u0000\u0000\u025f\u0248\u0001"+
		"\u0000\u0000\u0000\u025f\u0253\u0001\u0000\u0000\u0000\u0260E\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0005\u0012\u0000\u0000\u0262\u0263\u0003\u0088"+
		"D\u0000\u0263\u0264\u0007\u0003\u0000\u0000\u0264\u0265\u0003H$\u0000"+
		"\u0265\u026a\u0001\u0000\u0000\u0000\u0266\u0267\u0005\u0019\u0000\u0000"+
		"\u0267\u0268\u0007\u0003\u0000\u0000\u0268\u026a\u0003H$\u0000\u0269\u0261"+
		"\u0001\u0000\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u026aG\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0003&\u0013\u0000\u026cI\u0001\u0000\u0000"+
		"\u0000\u026d\u026f\u0005\u0010\u0000\u0000\u026e\u0270\u0003\u0088D\u0000"+
		"\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u00ba\u0000\u0000"+
		"\u0272K\u0001\u0000\u0000\u0000\u0273\u0275\u0005\u0017\u0000\u0000\u0274"+
		"\u0276\u0003\u0088D\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0005\u00ba\u0000\u0000\u0278M\u0001\u0000\u0000\u0000\u0279\u027b\u0005"+
		"S\u0000\u0000\u027a\u027c\u0003\u0088D\u0000\u027b\u027a\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027d\u027e\u0005\u00ba\u0000\u0000\u027eO\u0001\u0000\u0000\u0000"+
		"\u027f\u0280\u0003\u0088D\u0000\u0280\u0281\u0005\u00ba\u0000\u0000\u0281"+
		"Q\u0001\u0000\u0000\u0000\u0282\u02a6\u0005/\u0000\u0000\u0283\u0284\u0005"+
		"\u00b2\u0000\u0000\u0284\u0285\u0003\u0088D\u0000\u0285\u0286\u0005\f"+
		"\u0000\u0000\u0286\u0287\u0003\u008eG\u0000\u0287\u0288\u0005\u00b3\u0000"+
		"\u0000\u0288\u02a7\u0001\u0000\u0000\u0000\u0289\u028a\u0005\u00b2\u0000"+
		"\u0000\u028a\u028b\u0003\u00ccf\u0000\u028b\u028c\u0005\f\u0000\u0000"+
		"\u028c\u028f\u0003\u008aE\u0000\u028d\u028e\u0005\u0082\u0000\u0000\u028e"+
		"\u0290\u0003\u00ccf\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0005\u00b3\u0000\u0000\u0292\u02a7\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0005\u00b2\u0000\u0000\u0294\u0295\u0003\u0088D\u0000\u0295\u0296\u0005"+
		"\f\u0000\u0000\u0296\u0299\u0003\u008aE\u0000\u0297\u0298\u0005\u0082"+
		"\u0000\u0000\u0298\u029a\u0003\u00ccf\u0000\u0299\u0297\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0005\u00b3\u0000\u0000\u029c\u02a7\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0005\u00b2\u0000\u0000\u029e\u029f\u0003\u00ccf\u0000"+
		"\u029f\u02a0\u0005\f\u0000\u0000\u02a0\u02a1\u0005@\u0000\u0000\u02a1"+
		"\u02a2\u0005\u00b2\u0000\u0000\u02a2\u02a3\u0003\u00e2q\u0000\u02a3\u02a4"+
		"\u0005\u00b3\u0000\u0000\u02a4\u02a5\u0005\u00b3\u0000\u0000\u02a5\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a6\u0283\u0001\u0000\u0000\u0000\u02a6\u0289"+
		"\u0001\u0000\u0000\u0000\u02a6\u0293\u0001\u0000\u0000\u0000\u02a6\u029d"+
		"\u0001\u0000\u0000\u0000\u02a7\u02ae\u0001\u0000\u0000\u0000\u02a8\u02af"+
		"\u0003*\u0015\u0000\u02a9\u02aa\u0005\u00b9\u0000\u0000\u02aa\u02ab\u0003"+
		"&\u0013\u0000\u02ab\u02ac\u0005$\u0000\u0000\u02ac\u02ad\u0005\u00ba\u0000"+
		"\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02a8\u0001\u0000\u0000"+
		"\u0000\u02ae\u02a9\u0001\u0000\u0000\u0000\u02afS\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005Y\u0000\u0000\u02b1\u02c1\u0003.\u0017\u0000\u02b2\u02b4"+
		"\u0003V+\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b9\u0003X,\u0000"+
		"\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000"+
		"\u02b9\u02c2\u0001\u0000\u0000\u0000\u02ba\u02bc\u0003V+\u0000\u02bb\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0"+
		"\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0\u02c2"+
		"\u0003X,\u0000\u02c1\u02b3\u0001\u0000\u0000\u0000\u02c1\u02bd\u0001\u0000"+
		"\u0000\u0000\u02c2U\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005\u0013\u0000"+
		"\u0000\u02c4\u02c5\u0005\u00b2\u0000\u0000\u02c5\u02ca\u0003\u00a2Q\u0000"+
		"\u02c6\u02c7\u0005\u00a5\u0000\u0000\u02c7\u02c9\u0003\u00a2Q\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cd\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ce\u0005\u00be\u0000\u0000\u02ce\u02cf\u0005\u00b3\u0000\u0000\u02cf"+
		"\u02d0\u0003.\u0017\u0000\u02d0W\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005"+
		",\u0000\u0000\u02d2\u02d3\u0003.\u0017\u0000\u02d3Y\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0005W\u0000\u0000\u02d5\u02d6\u0003\u0088D\u0000\u02d6"+
		"\u02d7\u0005\u00ba\u0000\u0000\u02d7[\u0001\u0000\u0000\u0000\u02d8\u02da"+
		"\u0003^/\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02df\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u00b8"+
		"\u0000\u0000\u02dc\u02de\u0003^/\u0000\u02dd\u02db\u0001\u0000\u0000\u0000"+
		"\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000"+
		"\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e4\u0005\u00b8\u0000\u0000"+
		"\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4]\u0001\u0000\u0000\u0000\u02e5\u02e7\u0003 \u0010\u0000\u02e6\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02eb"+
		"\u0001\u0000\u0000\u0000\u02e8\u02ea\u0003\u00eau\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f0\u0005"+
		"\u00b1\u0000\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0003"+
		"`0\u0000\u02f2\u02f4\u0005\u00a1\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0003|>\u0000\u02f6_\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f8\u00060\uffff\uffff\u0000\u02f8\u02fc\u0003\u00eew\u0000\u02f9\u02fc"+
		"\u0003\u00a2Q\u0000\u02fa\u02fc\u0005\u0011\u0000\u0000\u02fb\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fc\u0302\u0001\u0000\u0000\u0000\u02fd\u02fe\n\u0001"+
		"\u0000\u0000\u02fe\u02ff\u0005\u00a5\u0000\u0000\u02ff\u0301\u0003`0\u0002"+
		"\u0300\u02fd\u0001\u0000\u0000\u0000\u0301\u0304\u0001\u0000\u0000\u0000"+
		"\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000"+
		"\u0303a\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305"+
		"\u0306\u0005\u001d\u0000\u0000\u0306\u0307\u0003\u0084B\u0000\u0307\u0308"+
		"\u0005\u00ba\u0000\u0000\u0308c\u0001\u0000\u0000\u0000\u0309\u030a\u0005"+
		"T\u0000\u0000\u030a\u030f\u0003|>\u0000\u030b\u030c\u0005\u00b8\u0000"+
		"\u0000\u030c\u030e\u0003|>\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e"+
		"\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0001\u0000\u0000\u0000\u0310\u0312\u0001\u0000\u0000\u0000\u0311"+
		"\u030f\u0001\u0000\u0000\u0000\u0312\u0313\u0005\u00ba\u0000\u0000\u0313"+
		"e\u0001\u0000\u0000\u0000\u0314\u0316\u0003 \u0010\u0000\u0315\u0314\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0344\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0003x<\u0000\u0318\u0319\u0003`0\u0000"+
		"\u0319\u031e\u0003|>\u0000\u031a\u031b\u0005\u00b8\u0000\u0000\u031b\u031d"+
		"\u0003|>\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u0320\u0001\u0000"+
		"\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000"+
		"\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0005\u00ba\u0000\u0000\u0322\u0345\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0003z=\u0000\u0324\u0323\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0342\u0001\u0000\u0000\u0000"+
		"\u0326\u0328\u0005\u0016\u0000\u0000\u0327\u0329\u0003`0\u0000\u0328\u0327"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u032f\u0003~?\u0000\u032b\u032c\u0005\u00b8"+
		"\u0000\u0000\u032c\u032e\u0003~?\u0000\u032d\u032b\u0001\u0000\u0000\u0000"+
		"\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000"+
		"\u0331\u032f\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u00ba\u0000\u0000"+
		"\u0333\u0343\u0001\u0000\u0000\u0000\u0334\u0335\u00050\u0000\u0000\u0335"+
		"\u0337\u0003\u00e8t\u0000\u0336\u0338\u0003\u0014\n\u0000\u0337\u0336"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0001\u0000\u0000\u0000\u0339\u033a\u0005\u00b2\u0000\u0000\u033a\u033b"+
		"\u0003\\.\u0000\u033b\u033e\u0005\u00b3\u0000\u0000\u033c\u033f\u0003"+
		"r9\u0000\u033d\u033f\u0003t:\u0000\u033e\u033c\u0001\u0000\u0000\u0000"+
		"\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341\u0003v;\u0000\u0341\u0343"+
		"\u0001\u0000\u0000\u0000\u0342\u0326\u0001\u0000\u0000\u0000\u0342\u0334"+
		"\u0001\u0000\u0000\u0000\u0343\u0345\u0001\u0000\u0000\u0000\u0344\u0317"+
		"\u0001\u0000\u0000\u0000\u0344\u0324\u0001\u0000\u0000\u0000\u0345\u034b"+
		"\u0001\u0000\u0000\u0000\u0346\u0347\u0005^\u0000\u0000\u0347\u0348\u0003"+
		"\u00b0X\u0000\u0348\u0349\u0003h4\u0000\u0349\u034b\u0001\u0000\u0000"+
		"\u0000\u034a\u0315\u0001\u0000\u0000\u0000\u034a\u0346\u0001\u0000\u0000"+
		"\u0000\u034bg\u0001\u0000\u0000\u0000\u034c\u0356\u0005\u00ba\u0000\u0000"+
		"\u034d\u0351\u0005\u00b6\u0000\u0000\u034e\u0350\u0003j5\u0000\u034f\u034e"+
		"\u0001\u0000\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0356"+
		"\u0005\u00b7\u0000\u0000\u0355\u034c\u0001\u0000\u0000\u0000\u0355\u034d"+
		"\u0001\u0000\u0000\u0000\u0356i\u0001\u0000\u0000\u0000\u0357\u035a\u0003"+
		"l6\u0000\u0358\u035a\u0003n7\u0000\u0359\u0357\u0001\u0000\u0000\u0000"+
		"\u0359\u0358\u0001\u0000\u0000\u0000\u035ak\u0001\u0000\u0000\u0000\u035b"+
		"\u035c\u0003\u00aaU\u0000\u035c\u035d\u0005\u009e\u0000\u0000\u035d\u035e"+
		"\u0003\u00e8t\u0000\u035e\u035f\u00059\u0000\u0000\u035f\u0360\u0003\u00b0"+
		"X\u0000\u0360\u0361\u0005\u00ba\u0000\u0000\u0361m\u0001\u0000\u0000\u0000"+
		"\u0362\u0363\u0003p8\u0000\u0363\u0369\u0005\f\u0000\u0000\u0364\u036a"+
		"\u0003\u00eau\u0000\u0365\u0367\u0003\u00eau\u0000\u0366\u0365\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000"+
		"\u0000\u0000\u0368\u036a\u0003\u00e8t\u0000\u0369\u0364\u0001\u0000\u0000"+
		"\u0000\u0369\u0366\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u036c\u0005\u00ba\u0000\u0000\u036co\u0001\u0000\u0000\u0000"+
		"\u036d\u036e\u0003\u00aaU\u0000\u036e\u036f\u0005\u009e\u0000\u0000\u036f"+
		"\u0371\u0001\u0000\u0000\u0000\u0370\u036d\u0001\u0000\u0000\u0000\u0370"+
		"\u0371\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000\u0372"+
		"\u0373\u0003\u00e8t\u0000\u0373q\u0001\u0000\u0000\u0000\u0374\u0375\u0005"+
		"\u00b9\u0000\u0000\u0375\u0377\u0003\u00e8t\u0000\u0376\u0378\u0003\u00b2"+
		"Y\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000"+
		"\u0000\u0378s\u0001\u0000\u0000\u0000\u0379\u037b\u0005\u00b9\u0000\u0000"+
		"\u037a\u037c\u0005\u00b1\u0000\u0000\u037b\u037a\u0001\u0000\u0000\u0000"+
		"\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000"+
		"\u037d\u037e\u0003`0\u0000\u037eu\u0001\u0000\u0000\u0000\u037f\u0382"+
		"\u0005\u00ba\u0000\u0000\u0380\u0382\u0003.\u0017\u0000\u0381\u037f\u0001"+
		"\u0000\u0000\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0382w\u0001\u0000"+
		"\u0000\u0000\u0383\u0384\u0003z=\u0000\u0384y\u0001\u0000\u0000\u0000"+
		"\u0385\u0387\u0003\u00eau\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387"+
		"\u0388\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0001\u0000\u0000\u0000\u0389{\u0001\u0000\u0000\u0000\u038a\u038d"+
		"\u0005\u00be\u0000\u0000\u038b\u038c\u0005\u00bb\u0000\u0000\u038c\u038e"+
		"\u0003\u00ba]\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038e\u0001"+
		"\u0000\u0000\u0000\u038e}\u0001\u0000\u0000\u0000\u038f\u0390\u0003\u00e8"+
		"t\u0000\u0390\u0391\u0005\u00bb\u0000\u0000\u0391\u0392\u0003\u00ba]\u0000"+
		"\u0392\u007f\u0001\u0000\u0000\u0000\u0393\u0395\u0003 \u0010\u0000\u0394"+
		"\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0005!\u0000\u0000\u0397\u03a1"+
		"\u0003\u00e8t\u0000\u0398\u0399\u0005\u00b9\u0000\u0000\u0399\u039e\u0003"+
		"`0\u0000\u039a\u039b\u0005\u00b8\u0000\u0000\u039b\u039d\u0003`0\u0000"+
		"\u039c\u039a\u0001\u0000\u0000\u0000\u039d\u03a0\u0001\u0000\u0000\u0000"+
		"\u039e\u039c\u0001\u0000\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000"+
		"\u039f\u03a2\u0001\u0000\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000"+
		"\u03a1\u0398\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a2\u03ae\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005\u00b2\u0000\u0000"+
		"\u03a4\u03a9\u0003\u00e8t\u0000\u03a5\u03a6\u0005\u00b8\u0000\u0000\u03a6"+
		"\u03a8\u0003\u00e8t\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a8\u03ab"+
		"\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ac\u0001\u0000\u0000\u0000\u03ab\u03a9"+
		"\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005\u00b3\u0000\u0000\u03ad\u03af"+
		"\u0001\u0000\u0000\u0000\u03ae\u03a3\u0001\u0000\u0000\u0000\u03ae\u03af"+
		"\u0001\u0000\u0000\u0000\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u00054\u0000\u0000\u03b1\u03b3\u0003\u0012\t\u0000\u03b2\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b8\u0005\u00b6\u0000\u0000\u03b5\u03b7\u0003"+
		"\u0082A\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u03ba\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000"+
		"\u0000\u0000\u03b9\u03bb\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000"+
		"\u0000\u0000\u03bb\u03bc\u0005\u00b7\u0000\u0000\u03bc\u0081\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0005\u0012\u0000\u0000\u03be\u03cb\u0003\u00e8"+
		"t\u0000\u03bf\u03c0\u0005\u00bb\u0000\u0000\u03c0\u03c1\u0005\u00b2\u0000"+
		"\u0000\u03c1\u03c6\u0003\u0088D\u0000\u03c2\u03c3\u0005\u00b8\u0000\u0000"+
		"\u03c3\u03c5\u0003\u0088D\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c8\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c9\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c9\u03ca\u0005\u00b3\u0000\u0000\u03ca"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cb\u03bf\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd"+
		"\u03ce\u0005\u00ba\u0000\u0000\u03ce\u03d4\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d1\u0003z=\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001"+
		"\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d4\u0003"+
		"\f\u0006\u0000\u03d3\u03bd\u0001\u0000\u0000\u0000\u03d3\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d4\u0083\u0001\u0000\u0000\u0000\u03d5\u03da\u0003\u0088"+
		"D\u0000\u03d6\u03d7\u0005\u00b8\u0000\u0000\u03d7\u03d9\u0003\u0088D\u0000"+
		"\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000"+
		"\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000"+
		"\u03db\u0085\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000\u0000"+
		"\u03dd\u03de\u0005\u00b2\u0000\u0000\u03de\u03df\u0003\u0088D\u0000\u03df"+
		"\u03e0\u0005\u00b3\u0000\u0000\u03e0\u0087\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e2\u0006D\uffff\uffff\u0000\u03e2\u03e3\u0005\u0015\u0000\u0000\u03e3"+
		"\u040e\u0003\u0088D%\u03e4\u040e\u0003\u009aM\u0000\u03e5\u03e6\u0003"+
		"\u00c4b\u0000\u03e6\u03e7\u0005\u00b4\u0000\u0000\u03e7\u03e8\u0003\u0088"+
		"D\u0000\u03e8\u03e9\u0005\u00b5\u0000\u0000\u03e9\u040e\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u0005\u00b2\u0000\u0000\u03eb\u03ec\u0003\u00f0x\u0000"+
		"\u03ec\u03ed\u0005\u00b3\u0000\u0000\u03ed\u03ee\u0003\u0088D\"\u03ee"+
		"\u040e\u0001\u0000\u0000\u0000\u03ef\u03f0\u0007\u0004\u0000\u0000\u03f0"+
		"\u040e\u0003\u0088D!\u03f1\u03f2\u0007\u0005\u0000\u0000\u03f2\u040e\u0003"+
		"\u0088D \u03f3\u03f4\u0007\u0006\u0000\u0000\u03f4\u040e\u0003\u00ccf"+
		"\u0000\u03f5\u03f6\u0003\u00ccf\u0000\u03f6\u03f7\u0007\u0006\u0000\u0000"+
		"\u03f7\u040e\u0001\u0000\u0000\u0000\u03f8\u03f9\u0005K\u0000\u0000\u03f9"+
		"\u040e\u0003\u0088D\u001d\u03fa\u040e\u0003\u008cF\u0000\u03fb\u040e\u0003"+
		"\u00ccf\u0000\u03fc\u040e\u0003\u00bc^\u0000\u03fd\u040e\u0003\u00c6c"+
		"\u0000\u03fe\u040e\u0005\u00bf\u0000\u0000\u03ff\u040e\u0003\u0086C\u0000"+
		"\u0400\u040e\u0003\u0094J\u0000\u0401\u040e\u0003\u0096K\u0000\u0402\u0403"+
		"\u0003\u008eG\u0000\u0403\u0404\u0005\u00bb\u0000\u0000\u0404\u0405\u0003"+
		"\u0088D\u0005\u0405\u040e\u0001\u0000\u0000\u0000\u0406\u0407\u0003\u008a"+
		"E\u0000\u0407\u0409\u0003\u009cN\u0000\u0408\u040a\u0003 \u0010\u0000"+
		"\u0409\u0408\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000"+
		"\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c\u0003\u0088D\u0004\u040c"+
		"\u040e\u0001\u0000\u0000\u0000\u040d\u03e1\u0001\u0000\u0000\u0000\u040d"+
		"\u03e4\u0001\u0000\u0000\u0000\u040d\u03e5\u0001\u0000\u0000\u0000\u040d"+
		"\u03ea\u0001\u0000\u0000\u0000\u040d\u03ef\u0001\u0000\u0000\u0000\u040d"+
		"\u03f1\u0001\u0000\u0000\u0000\u040d\u03f3\u0001\u0000\u0000\u0000\u040d"+
		"\u03f5\u0001\u0000\u0000\u0000\u040d\u03f8\u0001\u0000\u0000\u0000\u040d"+
		"\u03fa\u0001\u0000\u0000\u0000\u040d\u03fb\u0001\u0000\u0000\u0000\u040d"+
		"\u03fc\u0001\u0000\u0000\u0000\u040d\u03fd\u0001\u0000\u0000\u0000\u040d"+
		"\u03fe\u0001\u0000\u0000\u0000\u040d\u03ff\u0001\u0000\u0000\u0000\u040d"+
		"\u0400\u0001\u0000\u0000\u0000\u040d\u0401\u0001\u0000\u0000\u0000\u040d"+
		"\u0402\u0001\u0000\u0000\u0000\u040d\u0406\u0001\u0000\u0000\u0000\u040e"+
		"\u044b\u0001\u0000\u0000\u0000\u040f\u0410\n\u0014\u0000\u0000\u0410\u0411"+
		"\u0005\u008e\u0000\u0000\u0411\u044a\u0003\u0088D\u0014\u0412\u0413\n"+
		"\u0012\u0000\u0000\u0413\u0414\u0007\u0007\u0000\u0000\u0414\u044a\u0003"+
		"\u0088D\u0013\u0415\u0416\n\u0011\u0000\u0000\u0416\u0417\u0007\b\u0000"+
		"\u0000\u0417\u044a\u0003\u0088D\u0012\u0418\u0419\n\u0010\u0000\u0000"+
		"\u0419\u041a\u0007\t\u0000\u0000\u041a\u044a\u0003\u0088D\u0011\u041b"+
		"\u041c\n\u000f\u0000\u0000\u041c\u041d\u0007\n\u0000\u0000\u041d\u044a"+
		"\u0003\u0088D\u0010\u041e\u041f\n\u000e\u0000\u0000\u041f\u0420\u0007"+
		"\u000b\u0000\u0000\u0420\u044a\u0003\u0088D\u000f\u0421\u0422\n\r\u0000"+
		"\u0000\u0422\u0423\u0005\u00a4\u0000\u0000\u0423\u044a\u0003\u0088D\u000e"+
		"\u0424\u0425\n\f\u0000\u0000\u0425\u0426\u0005\u00a7\u0000\u0000\u0426"+
		"\u044a\u0003\u0088D\r\u0427\u0428\n\u000b\u0000\u0000\u0428\u0429\u0005"+
		"\u00a5\u0000\u0000\u0429\u044a\u0003\u0088D\f\u042a\u042b\n\n\u0000\u0000"+
		"\u042b\u042c\u0005\u0099\u0000\u0000\u042c\u044a\u0003\u0088D\u000b\u042d"+
		"\u042e\n\t\u0000\u0000\u042e\u042f\u0005\u0098\u0000\u0000\u042f\u044a"+
		"\u0003\u0088D\n\u0430\u0431\n\b\u0000\u0000\u0431\u0433\u0005\u00b1\u0000"+
		"\u0000\u0432\u0434\u0003\u0088D\u0000\u0433\u0432\u0001\u0000\u0000\u0000"+
		"\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000\u0000\u0000"+
		"\u0435\u0436\u0005\u00b9\u0000\u0000\u0436\u044a\u0003\u0088D\t\u0437"+
		"\u0438\n\u0007\u0000\u0000\u0438\u0439\u0005\u009a\u0000\u0000\u0439\u044a"+
		"\u0003\u0088D\b\u043a\u043b\n\u0006\u0000\u0000\u043b\u043c\u0005\u007f"+
		"\u0000\u0000\u043c\u044a\u0003\u0088D\u0007\u043d\u043e\n\u0003\u0000"+
		"\u0000\u043e\u043f\u0005A\u0000\u0000\u043f\u044a\u0003\u0088D\u0004\u0440"+
		"\u0441\n\u0002\u0000\u0000\u0441\u0442\u0005C\u0000\u0000\u0442\u044a"+
		"\u0003\u0088D\u0003\u0443\u0444\n\u0001\u0000\u0000\u0444\u0445\u0005"+
		"B\u0000\u0000\u0445\u044a\u0003\u0088D\u0002\u0446\u0447\n\u0013\u0000"+
		"\u0000\u0447\u0448\u00058\u0000\u0000\u0448\u044a\u0003\u00a4R\u0000\u0449"+
		"\u040f\u0001\u0000\u0000\u0000\u0449\u0412\u0001\u0000\u0000\u0000\u0449"+
		"\u0415\u0001\u0000\u0000\u0000\u0449\u0418\u0001\u0000\u0000\u0000\u0449"+
		"\u041b\u0001\u0000\u0000\u0000\u0449\u041e\u0001\u0000\u0000\u0000\u0449"+
		"\u0421\u0001\u0000\u0000\u0000\u0449\u0424\u0001\u0000\u0000\u0000\u0449"+
		"\u0427\u0001\u0000\u0000\u0000\u0449\u042a\u0001\u0000\u0000\u0000\u0449"+
		"\u042d\u0001\u0000\u0000\u0000\u0449\u0430\u0001\u0000\u0000\u0000\u0449"+
		"\u0437\u0001\u0000\u0000\u0000\u0449\u043a\u0001\u0000\u0000\u0000\u0449"+
		"\u043d\u0001\u0000\u0000\u0000\u0449\u0440\u0001\u0000\u0000\u0000\u0449"+
		"\u0443\u0001\u0000\u0000\u0000\u0449\u0446\u0001\u0000\u0000\u0000\u044a"+
		"\u044d\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b"+
		"\u044c\u0001\u0000\u0000\u0000\u044c\u0089\u0001\u0000\u0000\u0000\u044d"+
		"\u044b\u0001\u0000\u0000\u0000\u044e\u0451\u0003\u00ccf\u0000\u044f\u0451"+
		"\u0003\u008cF\u0000\u0450\u044e\u0001\u0000\u0000\u0000\u0450\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u008b\u0001\u0000\u0000\u0000\u0452\u0453\u0005"+
		"\u000b\u0000\u0000\u0453\u0455\u0005\u00b2\u0000\u0000\u0454\u0456\u0003"+
		"\u009eO\u0000\u0455\u0454\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000"+
		"\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u045e\u0005\u00b3"+
		"\u0000\u0000\u0458\u045a\u0005\u00b4\u0000\u0000\u0459\u045b\u0003\u009e"+
		"O\u0000\u045a\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045e\u0005\u00b5\u0000"+
		"\u0000\u045d\u0452\u0001\u0000\u0000\u0000\u045d\u0458\u0001\u0000\u0000"+
		"\u0000\u045e\u0463\u0001\u0000\u0000\u0000\u045f\u0460\u0005\u00b4\u0000"+
		"\u0000\u0460\u0461\u0003\u0088D\u0000\u0461\u0462\u0005\u00b5\u0000\u0000"+
		"\u0462\u0464\u0001\u0000\u0000\u0000\u0463\u045f\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u008d\u0001\u0000\u0000\u0000"+
		"\u0465\u0469\u0005\u00b4\u0000\u0000\u0466\u0468\u0005\u00b8\u0000\u0000"+
		"\u0467\u0466\u0001\u0000\u0000\u0000\u0468\u046b\u0001\u0000\u0000\u0000"+
		"\u0469\u0467\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000\u0000"+
		"\u046a\u046c\u0001\u0000\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000"+
		"\u046c\u0475\u0003\u0090H\u0000\u046d\u046f\u0005\u00b8\u0000\u0000\u046e"+
		"\u046d\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470"+
		"\u046e\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471"+
		"\u0472\u0001\u0000\u0000\u0000\u0472\u0474\u0003\u0090H\u0000\u0473\u046e"+
		"\u0001\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000\u0000\u0475\u0473"+
		"\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u047b"+
		"\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u047a"+
		"\u0005\u00b8\u0000\u0000\u0479\u0478\u0001\u0000\u0000\u0000\u047a\u047d"+
		"\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0001\u0000\u0000\u0000\u047c\u047e\u0001\u0000\u0000\u0000\u047d\u047b"+
		"\u0001\u0000\u0000\u0000\u047e\u047f\u0005\u00b5\u0000\u0000\u047f\u0493"+
		"\u0001\u0000\u0000\u0000\u0480\u0481\u0005\u00b4\u0000\u0000\u0481\u048a"+
		"\u0003\u0092I\u0000\u0482\u0484\u0005\u00b8\u0000\u0000\u0483\u0482\u0001"+
		"\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0483\u0001"+
		"\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0487\u0001"+
		"\u0000\u0000\u0000\u0487\u0489\u0003\u0092I\u0000\u0488\u0483\u0001\u0000"+
		"\u0000\u0000\u0489\u048c\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048e\u0001\u0000"+
		"\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048d\u048f\u0005\u00b8"+
		"\u0000\u0000\u048e\u048d\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000"+
		"\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0005\u00b5"+
		"\u0000\u0000\u0491\u0493\u0001\u0000\u0000\u0000\u0492\u0465\u0001\u0000"+
		"\u0000\u0000\u0492\u0480\u0001\u0000\u0000\u0000\u0493\u008f\u0001\u0000"+
		"\u0000\u0000\u0494\u0495\u0003\u00ccf\u0000\u0495\u0091\u0001\u0000\u0000"+
		"\u0000\u0496\u0497\u0003\u0088D\u0000\u0497\u0498\u0005\u0082\u0000\u0000"+
		"\u0498\u049a\u0001\u0000\u0000\u0000\u0499\u0496\u0001\u0000\u0000\u0000"+
		"\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000"+
		"\u049b\u049c\u0003\u00ccf\u0000\u049c\u0093\u0001\u0000\u0000\u0000\u049d"+
		"\u049e\u00050\u0000\u0000\u049e\u049f\u0005\u00b2\u0000\u0000\u049f\u04a0"+
		"\u0003\\.\u0000\u04a0\u04a3\u0005\u00b3\u0000\u0000\u04a1\u04a2\u0005"+
		"\u00b9\u0000\u0000\u04a2\u04a4\u0003`0\u0000\u04a3\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a6\u0003.\u0017\u0000\u04a6\u04af\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a8\u0005c\u0000\u0000\u04a8\u04a9\u0005\u00b2\u0000\u0000\u04a9"+
		"\u04aa\u0003\\.\u0000\u04aa\u04ab\u0005\u00b3\u0000\u0000\u04ab\u04ac"+
		"\u0005\u0082\u0000\u0000\u04ac\u04ad\u0003\u0088D\u0000\u04ad\u04af\u0001"+
		"\u0000\u0000\u0000\u04ae\u049d\u0001\u0000\u0000\u0000\u04ae\u04a7\u0001"+
		"\u0000\u0000\u0000\u04af\u0095\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005"+
		"D\u0000\u0000\u04b1\u04b2\u0005\u00b2\u0000\u0000\u04b2\u04b3\u0003\u0088"+
		"D\u0000\u04b3\u04b4\u0005\u00b3\u0000\u0000\u04b4\u04b5\u0005\u00b6\u0000"+
		"\u0000\u04b5\u04ba\u0003\u0098L\u0000\u04b6\u04b7\u0005\u00b8\u0000\u0000"+
		"\u04b7\u04b9\u0003\u0098L\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000\u04b9"+
		"\u04bc\u0001\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba"+
		"\u04bb\u0001\u0000\u0000\u0000\u04bb\u04be\u0001\u0000\u0000\u0000\u04bc"+
		"\u04ba\u0001\u0000\u0000\u0000\u04bd\u04bf\u0005\u00b8\u0000\u0000\u04be"+
		"\u04bd\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf"+
		"\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005\u00b7\u0000\u0000\u04c1"+
		"\u0097\u0001\u0000\u0000\u0000\u04c2\u04c7\u0003\u0088D\u0000\u04c3\u04c4"+
		"\u0005\u00b8\u0000\u0000\u04c4\u04c6\u0003\u0088D\u0000\u04c5\u04c3\u0001"+
		"\u0000\u0000\u0000\u04c6\u04c9\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000\u0000\u0000\u04c8\u04ca\u0001"+
		"\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04ca\u04cb\u0005"+
		"\u0082\u0000\u0000\u04cb\u04cc\u0003\u0088D\u0000\u04cc\u0099\u0001\u0000"+
		"\u0000\u0000\u04cd\u04ce\u0005F\u0000\u0000\u04ce\u04d0\u0003\u00a4R\u0000"+
		"\u04cf\u04d1\u0003\u00b2Y\u0000\u04d0\u04cf\u0001\u0000\u0000\u0000\u04d0"+
		"\u04d1\u0001\u0000\u0000\u0000\u04d1\u009b\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d3\u0007\f\u0000\u0000\u04d3\u009d\u0001\u0000\u0000\u0000\u04d4\u04d9"+
		"\u0003\u00a0P\u0000\u04d5\u04d6\u0005\u00b8\u0000\u0000\u04d6\u04d8\u0003"+
		"\u00a0P\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d8\u04db\u0001\u0000"+
		"\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000"+
		"\u0000\u0000\u04da\u04dd\u0001\u0000\u0000\u0000\u04db\u04d9\u0001\u0000"+
		"\u0000\u0000\u04dc\u04de\u0005\u00b8\u0000\u0000\u04dd\u04dc\u0001\u0000"+
		"\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u009f\u0001\u0000"+
		"\u0000\u0000\u04df\u04e2\u0003\u0088D\u0000\u04e0\u04e1\u0005\u0082\u0000"+
		"\u0000\u04e1\u04e3\u0003\u0088D\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u00a1\u0001\u0000\u0000\u0000"+
		"\u04e4\u04e6\u0003\u00aaU\u0000\u04e5\u04e7\u0003\u001e\u000f\u0000\u04e6"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7"+
		"\u04ea\u0001\u0000\u0000\u0000\u04e8\u04ea\u0005T\u0000\u0000\u04e9\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e9\u04e8\u0001\u0000\u0000\u0000\u04ea\u00a3"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ee\u0003\u00aaU\u0000\u04ec\u04ee\u0003"+
		"\u00a8T\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ec\u0001\u0000"+
		"\u0000\u0000\u04ee\u04f0\u0001\u0000\u0000\u0000\u04ef\u04f1\u0003\u001e"+
		"\u000f\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f1\u04f6\u0001\u0000\u0000\u0000\u04f2\u04f6\u0003\u00ee"+
		"w\u0000\u04f3\u04f6\u0005T\u0000\u0000\u04f4\u04f6\u0003\u00a6S\u0000"+
		"\u04f5\u04ed\u0001\u0000\u0000\u0000\u04f5\u04f2\u0001\u0000\u0000\u0000"+
		"\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f6\u00a5\u0001\u0000\u0000\u0000\u04f7\u04f9\u0003 \u0010\u0000\u04f8"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fb\u0001\u0000\u0000\u0000\u04fa\u04fc\u0005L\u0000\u0000\u04fb\u04fa"+
		"\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fe"+
		"\u0001\u0000\u0000\u0000\u04fd\u04ff\u0003\u00e6s\u0000\u04fe\u04fd\u0001"+
		"\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0501\u0001"+
		"\u0000\u0000\u0000\u0500\u0502\u0005J\u0000\u0000\u0501\u0500\u0001\u0000"+
		"\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0518\u0001\u0000"+
		"\u0000\u0000\u0503\u0505\u0003\u0010\b\u0000\u0504\u0506\u0003\u0014\n"+
		"\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0505\u0506\u0001\u0000\u0000"+
		"\u0000\u0506\u0509\u0001\u0000\u0000\u0000\u0507\u0508\u0005*\u0000\u0000"+
		"\u0508\u050a\u0003\u00a2Q\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u0509"+
		"\u050a\u0001\u0000\u0000\u0000\u050a\u050d\u0001\u0000\u0000\u0000\u050b"+
		"\u050c\u00054\u0000\u0000\u050c\u050e\u0003\u0012\t\u0000\u050d\u050b"+
		"\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u0519"+
		"\u0001\u0000\u0000\u0000\u050f\u0510\u0005>\u0000\u0000\u0510\u0512\u0003"+
		"\u00e8t\u0000\u0511\u0513\u0003\u0014\n\u0000\u0512\u0511\u0001\u0000"+
		"\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513\u0516\u0001\u0000"+
		"\u0000\u0000\u0514\u0515\u0005*\u0000\u0000\u0515\u0517\u0003\u0012\t"+
		"\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000"+
		"\u0000\u0517\u0519\u0001\u0000\u0000\u0000\u0518\u0503\u0001\u0000\u0000"+
		"\u0000\u0518\u050f\u0001\u0000\u0000\u0000\u0519\u051a\u0001\u0000\u0000"+
		"\u0000\u051a\u051e\u0005\u00b6\u0000\u0000\u051b\u051d\u0003f3\u0000\u051c"+
		"\u051b\u0001\u0000\u0000\u0000\u051d\u0520\u0001\u0000\u0000\u0000\u051e"+
		"\u051c\u0001\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f"+
		"\u0521\u0001\u0000\u0000\u0000\u0520\u051e\u0001\u0000\u0000\u0000\u0521"+
		"\u0522\u0005\u00b7\u0000\u0000\u0522\u00a7\u0001\u0000\u0000\u0000\u0523"+
		"\u0528\u0003\u00d8l\u0000\u0524\u0525\u0005\u009f\u0000\u0000\u0525\u0527"+
		"\u0003\u00dam\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0527\u052a\u0001"+
		"\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000\u0000\u0528\u0529\u0001"+
		"\u0000\u0000\u0000\u0529\u00a9\u0001\u0000\u0000\u0000\u052a\u0528\u0001"+
		"\u0000\u0000\u0000\u052b\u052d\u0005\u00a0\u0000\u0000\u052c\u052b\u0001"+
		"\u0000\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u052e\u0001"+
		"\u0000\u0000\u0000\u052e\u052f\u0003\u00acV\u0000\u052f\u00ab\u0001\u0000"+
		"\u0000\u0000\u0530\u053e\u0003\u00e8t\u0000\u0531\u0536\u0003\u00e8t\u0000"+
		"\u0532\u0533\u0005\u00a0\u0000\u0000\u0533\u0535\u0003\u00e8t\u0000\u0534"+
		"\u0532\u0001\u0000\u0000\u0000\u0535\u0538\u0001\u0000\u0000\u0000\u0536"+
		"\u0534\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537"+
		"\u053b\u0001\u0000\u0000\u0000\u0538\u0536\u0001\u0000\u0000\u0000\u0539"+
		"\u053a\u0005\u00a0\u0000\u0000\u053a\u053c\u0003\u00aeW\u0000\u053b\u0539"+
		"\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053e"+
		"\u0001\u0000\u0000\u0000\u053d\u0530\u0001\u0000\u0000\u0000\u053d\u0531"+
		"\u0001\u0000\u0000\u0000\u053e\u00ad\u0001\u0000\u0000\u0000\u053f\u0542"+
		"\u0003\u00e8t\u0000\u0540\u0541\u0005\f\u0000\u0000\u0541\u0543\u0003"+
		"\u00e8t\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0542\u0543\u0001\u0000"+
		"\u0000\u0000\u0543\u0553\u0001\u0000\u0000\u0000\u0544\u0545\u0005\u00b6"+
		"\u0000\u0000\u0545\u054a\u0003\u00aeW\u0000\u0546\u0547\u0005\u00b8\u0000"+
		"\u0000\u0547\u0549\u0003\u00aeW\u0000\u0548\u0546\u0001\u0000\u0000\u0000"+
		"\u0549\u054c\u0001\u0000\u0000\u0000\u054a\u0548\u0001\u0000\u0000\u0000"+
		"\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u054e\u0001\u0000\u0000\u0000"+
		"\u054c\u054a\u0001\u0000\u0000\u0000\u054d\u054f\u0005\u00b8\u0000\u0000"+
		"\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000"+
		"\u054f\u0550\u0001\u0000\u0000\u0000\u0550\u0551\u0005\u00b7\u0000\u0000"+
		"\u0551\u0553\u0001\u0000\u0000\u0000\u0552\u053f\u0001\u0000\u0000\u0000"+
		"\u0552\u0544\u0001\u0000\u0000\u0000\u0553\u00af\u0001\u0000\u0000\u0000"+
		"\u0554\u0559\u0003\u00aaU\u0000\u0555\u0556\u0005\u00b8\u0000\u0000\u0556"+
		"\u0558\u0003\u00aaU\u0000\u0557\u0555\u0001\u0000\u0000\u0000\u0558\u055b"+
		"\u0001\u0000\u0000\u0000\u0559\u0557\u0001\u0000\u0000\u0000\u0559\u055a"+
		"\u0001\u0000\u0000\u0000\u055a\u00b1\u0001\u0000\u0000\u0000\u055b\u0559"+
		"\u0001\u0000\u0000\u0000\u055c\u0565\u0005\u00b2\u0000\u0000\u055d\u0562"+
		"\u0003\u00b4Z\u0000\u055e\u055f\u0005\u00b8\u0000\u0000\u055f\u0561\u0003"+
		"\u00b4Z\u0000\u0560\u055e\u0001\u0000\u0000\u0000\u0561\u0564\u0001\u0000"+
		"\u0000\u0000\u0562\u0560\u0001\u0000\u0000\u0000\u0562\u0563\u0001\u0000"+
		"\u0000\u0000\u0563\u0566\u0001\u0000\u0000\u0000\u0564\u0562\u0001\u0000"+
		"\u0000\u0000\u0565\u055d\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000"+
		"\u0000\u0000\u0566\u0568\u0001\u0000\u0000\u0000\u0567\u0569\u0005\u00b8"+
		"\u0000\u0000\u0568\u0567\u0001\u0000\u0000\u0000\u0568\u0569\u0001\u0000"+
		"\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u056b\u0005\u00b3"+
		"\u0000\u0000\u056b\u00b3\u0001\u0000\u0000\u0000\u056c\u056e\u0003\u00b8"+
		"\\\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000"+
		"\u0000\u056e\u0570\u0001\u0000\u0000\u0000\u056f\u0571\u0005\u00a1\u0000"+
		"\u0000\u0570\u056f\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000\u0000"+
		"\u0000\u0571\u0574\u0001\u0000\u0000\u0000\u0572\u0575\u0003\u00b6[\u0000"+
		"\u0573\u0575\u0003\u0088D\u0000\u0574\u0572\u0001\u0000\u0000\u0000\u0574"+
		"\u0573\u0001\u0000\u0000\u0000\u0575\u00b5\u0001\u0000\u0000\u0000\u0576"+
		"\u0577\u0003\u00aaU\u0000\u0577\u0578\u0003\u001e\u000f\u0000\u0578\u00b7"+
		"\u0001\u0000\u0000\u0000\u0579\u057a\u0003\u00e8t\u0000\u057a\u057b\u0007"+
		"\r\u0000\u0000\u057b\u00b9\u0001\u0000\u0000\u0000\u057c\u05a0\u0003\u00bc"+
		"^\u0000\u057d\u05a0\u0003\u00c6c\u0000\u057e\u057f\u0005\u000b\u0000\u0000"+
		"\u057f\u0584\u0005\u00b2\u0000\u0000\u0580\u0582\u0003\u009eO\u0000\u0581"+
		"\u0583\u0005\u00b8\u0000\u0000\u0582\u0581\u0001\u0000\u0000\u0000\u0582"+
		"\u0583\u0001\u0000\u0000\u0000\u0583\u0585\u0001\u0000\u0000\u0000\u0584"+
		"\u0580\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000\u0000\u0585"+
		"\u0586\u0001\u0000\u0000\u0000\u0586\u05a0\u0005\u00b3\u0000\u0000\u0587"+
		"\u058c\u0005\u00b4\u0000\u0000\u0588\u058a\u0003\u009eO\u0000\u0589\u058b"+
		"\u0005\u00b8\u0000\u0000\u058a\u0589\u0001\u0000\u0000\u0000\u058a\u058b"+
		"\u0001\u0000\u0000\u0000\u058b\u058d\u0001\u0000\u0000\u0000\u058c\u0588"+
		"\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u058e"+
		"\u0001\u0000\u0000\u0000\u058e\u05a0\u0005\u00b5\u0000\u0000\u058f\u0590"+
		"\u0007\u000e\u0000\u0000\u0590\u05a0\u0003\u00ba]\u0000\u0591\u0594\u0003"+
		"\u00c6c\u0000\u0592\u0594\u0003\u00bc^\u0000\u0593\u0591\u0001\u0000\u0000"+
		"\u0000\u0593\u0592\u0001\u0000\u0000\u0000\u0594\u059c\u0001\u0000\u0000"+
		"\u0000\u0595\u0598\u0005\u00b0\u0000\u0000\u0596\u0599\u0003\u00c6c\u0000"+
		"\u0597\u0599\u0003\u00bc^\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598"+
		"\u0597\u0001\u0000\u0000\u0000\u0599\u059b\u0001\u0000\u0000\u0000\u059a"+
		"\u0595\u0001\u0000\u0000\u0000\u059b\u059e\u0001\u0000\u0000\u0000\u059c"+
		"\u059a\u0001\u0000\u0000\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d"+
		"\u05a0\u0001\u0000\u0000\u0000\u059e\u059c\u0001\u0000\u0000\u0000\u059f"+
		"\u057c\u0001\u0000\u0000\u0000\u059f\u057d\u0001\u0000\u0000\u0000\u059f"+
		"\u057e\u0001\u0000\u0000\u0000\u059f\u0587\u0001\u0000\u0000\u0000\u059f"+
		"\u058f\u0001\u0000\u0000\u0000\u059f\u0593\u0001\u0000\u0000\u0000\u05a0"+
		"\u00bb\u0001\u0000\u0000\u0000\u05a1\u05a7\u0005G\u0000\u0000\u05a2\u05a7"+
		"\u0003\u00be_\u0000\u05a3\u05a7\u0003\u00ecv\u0000\u05a4\u05a7\u0003\u00c2"+
		"a\u0000\u05a5\u05a7\u0003\u00aaU\u0000\u05a6\u05a1\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a2\u0001\u0000\u0000\u0000\u05a6\u05a3\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a5\u0001\u0000\u0000\u0000"+
		"\u05a7\u00bd\u0001\u0000\u0000\u0000\u05a8\u05ad\u0005\u00c2\u0000\u0000"+
		"\u05a9\u05ad\u0005\u000f\u0000\u0000\u05aa\u05ad\u0003\u00c0`\u0000\u05ab"+
		"\u05ad\u0003\u00c4b\u0000\u05ac\u05a8\u0001\u0000\u0000\u0000\u05ac\u05a9"+
		"\u0001\u0000\u0000\u0000\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ac\u05ab"+
		"\u0001\u0000\u0000\u0000\u05ad\u00bf\u0001\u0000\u0000\u0000\u05ae\u05af"+
		"\u0007\u000f\u0000\u0000\u05af\u00c1\u0001\u0000\u0000\u0000\u05b0\u05b1"+
		"\u0007\u0010\u0000\u0000\u05b1\u05b6\u0005\u009e\u0000\u0000\u05b2\u05b7"+
		"\u0003\u00e8t\u0000\u05b3\u05b7\u0005k\u0000\u0000\u05b4\u05b7\u0005g"+
		"\u0000\u0000\u05b5\u05b7\u0005h\u0000\u0000\u05b6\u05b2\u0001\u0000\u0000"+
		"\u0000\u05b6\u05b3\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000"+
		"\u0000\u05b6\u05b5\u0001\u0000\u0000\u0000\u05b7\u05c3\u0001\u0000\u0000"+
		"\u0000\u05b8\u05bc\u0003\u00a2Q\u0000\u05b9\u05bc\u0003\u00deo\u0000\u05ba"+
		"\u05bc\u0003\u00c6c\u0000\u05bb\u05b8\u0001\u0000\u0000\u0000\u05bb\u05b9"+
		"\u0001\u0000\u0000\u0000\u05bb\u05ba\u0001\u0000\u0000\u0000\u05bc\u05bd"+
		"\u0001\u0000\u0000\u0000\u05bd\u05c0\u0005\u009e\u0000\u0000\u05be\u05c1"+
		"\u0003\u00e8t\u0000\u05bf\u05c1\u0003\u00deo\u0000\u05c0\u05be\u0001\u0000"+
		"\u0000\u0000\u05c0\u05bf\u0001\u0000\u0000\u0000\u05c1\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c2\u05b0\u0001\u0000\u0000\u0000\u05c2\u05bb\u0001\u0000"+
		"\u0000\u0000\u05c3\u00c3\u0001\u0000\u0000\u0000\u05c4\u05c5\u0005\u00bf"+
		"\u0000\u0000\u05c5\u00c5\u0001\u0000\u0000\u0000\u05c6\u05c8\u0005\u00c9"+
		"\u0000\u0000\u05c7\u05c9\u0005\u00d3\u0000\u0000\u05c8\u05c7\u0001\u0000"+
		"\u0000\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05c8\u0001\u0000"+
		"\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000\u05cb\u05cc\u0001\u0000"+
		"\u0000\u0000\u05cc\u05de\u0005\u00d1\u0000\u0000\u05cd\u05cf\u0005\u00c8"+
		"\u0000\u0000\u05ce\u05d0\u0005\u00d3\u0000\u0000\u05cf\u05ce\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d3\u05de\u0005\u00d2\u0000\u0000\u05d4\u05de\u0005\u00c6"+
		"\u0000\u0000\u05d5\u05d9\u0005\u00c7\u0000\u0000\u05d6\u05d8\u0003\u00c8"+
		"d\u0000\u05d7\u05d6\u0001\u0000\u0000\u0000\u05d8\u05db\u0001\u0000\u0000"+
		"\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05d9\u05da\u0001\u0000\u0000"+
		"\u0000\u05da\u05dc\u0001\u0000\u0000\u0000\u05db\u05d9\u0001\u0000\u0000"+
		"\u0000\u05dc\u05de\u0005\u00c7\u0000\u0000\u05dd\u05c6\u0001\u0000\u0000"+
		"\u0000\u05dd\u05cd\u0001\u0000\u0000\u0000\u05dd\u05d4\u0001\u0000\u0000"+
		"\u0000\u05dd\u05d5\u0001\u0000\u0000\u0000\u05de\u00c7\u0001\u0000\u0000"+
		"\u0000\u05df\u05e3\u0005\u00cd\u0000\u0000\u05e0\u05e3\u0005\u00cc\u0000"+
		"\u0000\u05e1\u05e3\u0003\u00ccf\u0000\u05e2\u05df\u0001\u0000\u0000\u0000"+
		"\u05e2\u05e0\u0001\u0000\u0000\u0000\u05e2\u05e1\u0001\u0000\u0000\u0000"+
		"\u05e3\u00c9\u0001\u0000\u0000\u0000\u05e4\u05e9\u0003\u00ccf\u0000\u05e5"+
		"\u05e6\u0005\u00b8\u0000\u0000\u05e6\u05e8\u0003\u00ccf\u0000\u05e7\u05e5"+
		"\u0001\u0000\u0000\u0000\u05e8\u05eb\u0001\u0000\u0000\u0000\u05e9\u05e7"+
		"\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001\u0000\u0000\u0000\u05ea\u00cb"+
		"\u0001\u0000\u0000\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05ec\u05f0"+
		"\u0003\u00ceg\u0000\u05ed\u05ef\u0003\u00d0h\u0000\u05ee\u05ed\u0001\u0000"+
		"\u0000\u0000\u05ef\u05f2\u0001\u0000\u0000\u0000\u05f0\u05ee\u0001\u0000"+
		"\u0000\u0000\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1\u00cd\u0001\u0000"+
		"\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000\u0000\u05f3\u05fa\u0003\u00d8"+
		"l\u0000\u05f4\u05fa\u0003\u00d2i\u0000\u05f5\u05f6\u0005\u00b2\u0000\u0000"+
		"\u05f6\u05f7\u0003\u009aM\u0000\u05f7\u05f8\u0005\u00b3\u0000\u0000\u05f8"+
		"\u05fa\u0001\u0000\u0000\u0000\u05f9\u05f3\u0001\u0000\u0000\u0000\u05f9"+
		"\u05f4\u0001\u0000\u0000\u0000\u05f9\u05f5\u0001\u0000\u0000\u0000\u05fa"+
		"\u00cf\u0001\u0000\u0000\u0000\u05fb\u05fc\u0005\u009f\u0000\u0000\u05fc"+
		"\u05fe\u0003\u00dam\u0000\u05fd\u05ff\u0003\u00d6k\u0000\u05fe\u05fd\u0001"+
		"\u0000\u0000\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u00d1\u0001"+
		"\u0000\u0000\u0000\u0600\u0601\u0003\u00d4j\u0000\u0601\u0602\u0003\u00d6"+
		"k\u0000\u0602\u00d3\u0001\u0000\u0000\u0000\u0603\u0608\u0003\u00aaU\u0000"+
		"\u0604\u0608\u0003\u00c2a\u0000\u0605\u0608\u0003\u00d8l\u0000\u0606\u0608"+
		"\u0003\u0086C\u0000\u0607\u0603\u0001\u0000\u0000\u0000\u0607\u0604\u0001"+
		"\u0000\u0000\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0607\u0606\u0001"+
		"\u0000\u0000\u0000\u0608\u00d5\u0001\u0000\u0000\u0000\u0609\u060b\u0003"+
		"\u001e\u000f\u0000\u060a\u0609\u0001\u0000\u0000\u0000\u060a\u060b\u0001"+
		"\u0000\u0000\u0000\u060b\u060d\u0001\u0000\u0000\u0000\u060c\u060e\u0003"+
		"\u00b2Y\u0000\u060d\u060c\u0001\u0000\u0000\u0000\u060e\u060f\u0001\u0000"+
		"\u0000\u0000\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000"+
		"\u0000\u0000\u0610\u0614\u0001\u0000\u0000\u0000\u0611\u0613\u0003\u00e0"+
		"p\u0000\u0612\u0611\u0001\u0000\u0000\u0000\u0613\u0616\u0001\u0000\u0000"+
		"\u0000\u0614\u0612\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000"+
		"\u0000\u0615\u00d7\u0001\u0000\u0000\u0000\u0616\u0614\u0001\u0000\u0000"+
		"\u0000\u0617\u061a\u0003\u00deo\u0000\u0618\u0619\u0005\u009e\u0000\u0000"+
		"\u0619\u061b\u0003\u00deo\u0000\u061a\u0618\u0001\u0000\u0000\u0000\u061a"+
		"\u061b\u0001\u0000\u0000\u0000\u061b\u0621\u0001\u0000\u0000\u0000\u061c"+
		"\u061d\u0003\u00a2Q\u0000\u061d\u061e\u0005\u009e\u0000\u0000\u061e\u061f"+
		"\u0003\u00deo\u0000\u061f\u0621\u0001\u0000\u0000\u0000\u0620\u0617\u0001"+
		"\u0000\u0000\u0000\u0620\u061c\u0001\u0000\u0000\u0000\u0621\u00d9\u0001"+
		"\u0000\u0000\u0000\u0622\u0625\u0003\u00dcn\u0000\u0623\u0625\u0003\u00de"+
		"o\u0000\u0624\u0622\u0001\u0000\u0000\u0000\u0624\u0623\u0001\u0000\u0000"+
		"\u0000\u0625\u00db\u0001\u0000\u0000\u0000\u0626\u062c\u0003\u00e8t\u0000"+
		"\u0627\u0628\u0005\u00b6\u0000\u0000\u0628\u0629\u0003\u0088D\u0000\u0629"+
		"\u062a\u0005\u00b7\u0000\u0000\u062a\u062c\u0001\u0000\u0000\u0000\u062b"+
		"\u0626\u0001\u0000\u0000\u0000\u062b\u0627\u0001\u0000\u0000\u0000\u062c"+
		"\u0630\u0001\u0000\u0000\u0000\u062d\u062f\u0003\u00e0p\u0000\u062e\u062d"+
		"\u0001\u0000\u0000\u0000\u062f\u0632\u0001\u0000\u0000\u0000\u0630\u062e"+
		"\u0001\u0000\u0000\u0000\u0630\u0631\u0001\u0000\u0000\u0000\u0631\u00dd"+
		"\u0001\u0000\u0000\u0000\u0632\u0630\u0001\u0000\u0000\u0000\u0633\u0635"+
		"\u0005\u00af\u0000\u0000\u0634\u0633\u0001\u0000\u0000\u0000\u0635\u0638"+
		"\u0001\u0000\u0000\u0000\u0636\u0634\u0001\u0000\u0000\u0000\u0636\u0637"+
		"\u0001\u0000\u0000\u0000\u0637\u063f\u0001\u0000\u0000\u0000\u0638\u0636"+
		"\u0001\u0000\u0000\u0000\u0639\u0640\u0005\u00be\u0000\u0000\u063a\u063b"+
		"\u0005\u00af\u0000\u0000\u063b\u063c\u0005\u00b6\u0000\u0000\u063c\u063d"+
		"\u0003\u0088D\u0000\u063d\u063e\u0005\u00b7\u0000\u0000\u063e\u0640\u0001"+
		"\u0000\u0000\u0000\u063f\u0639\u0001\u0000\u0000\u0000\u063f\u063a\u0001"+
		"\u0000\u0000\u0000\u0640\u0644\u0001\u0000\u0000\u0000\u0641\u0643\u0003"+
		"\u00e0p\u0000\u0642\u0641\u0001\u0000\u0000\u0000\u0643\u0646\u0001\u0000"+
		"\u0000\u0000\u0644\u0642\u0001\u0000\u0000\u0000\u0644\u0645\u0001\u0000"+
		"\u0000\u0000\u0645\u00df\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000"+
		"\u0000\u0000\u0647\u0649\u0005\u00b4\u0000\u0000\u0648\u064a\u0003\u0088"+
		"D\u0000\u0649\u0648\u0001\u0000\u0000\u0000\u0649\u064a\u0001\u0000\u0000"+
		"\u0000\u064a\u064b\u0001\u0000\u0000\u0000\u064b\u0651\u0005\u00b5\u0000"+
		"\u0000\u064c\u064d\u0005\u00b6\u0000\u0000\u064d\u064e\u0003\u0088D\u0000"+
		"\u064e\u064f\u0005\u00b7\u0000\u0000\u064f\u0651\u0001\u0000\u0000\u0000"+
		"\u0650\u0647\u0001\u0000\u0000\u0000\u0650\u064c\u0001\u0000\u0000\u0000"+
		"\u0651\u00e1\u0001\u0000\u0000\u0000\u0652\u0654\u0003\u00e4r\u0000\u0653"+
		"\u0652\u0001\u0000\u0000\u0000\u0653\u0654\u0001\u0000\u0000\u0000\u0654"+
		"\u065b\u0001\u0000\u0000\u0000\u0655\u0657\u0005\u00b8\u0000\u0000\u0656"+
		"\u0658\u0003\u00e4r\u0000\u0657\u0656\u0001\u0000\u0000\u0000\u0657\u0658"+
		"\u0001\u0000\u0000\u0000\u0658\u065a\u0001\u0000\u0000\u0000\u0659\u0655"+
		"\u0001\u0000\u0000\u0000\u065a\u065d\u0001\u0000\u0000\u0000\u065b\u0659"+
		"\u0001\u0000\u0000\u0000\u065b\u065c\u0001\u0000\u0000\u0000\u065c\u00e3"+
		"\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000\u0000\u065e\u0666"+
		"\u0003\u00ccf\u0000\u065f\u0660\u0005@\u0000\u0000\u0660\u0661\u0005\u00b2"+
		"\u0000\u0000\u0661\u0662\u0003\u00e2q\u0000\u0662\u0663\u0005\u00b3\u0000"+
		"\u0000\u0663\u0666\u0001\u0000\u0000\u0000\u0664\u0666\u0003\u00a0P\u0000"+
		"\u0665\u065e\u0001\u0000\u0000\u0000\u0665\u065f\u0001\u0000\u0000\u0000"+
		"\u0665\u0664\u0001\u0000\u0000\u0000\u0666\u00e5\u0001\u0000\u0000\u0000"+
		"\u0667\u0668\u0007\u0011\u0000\u0000\u0668\u00e7\u0001\u0000\u0000\u0000"+
		"\u0669\u066a\u0007\u0012\u0000\u0000\u066a\u00e9\u0001\u0000\u0000\u0000"+
		"\u066b\u066c\u0007\u0013\u0000\u0000\u066c\u00eb\u0001\u0000\u0000\u0000"+
		"\u066d\u066e\u0007\u0014\u0000\u0000\u066e\u00ed\u0001\u0000\u0000\u0000"+
		"\u066f\u0670\u0007\u0015\u0000\u0000\u0670\u00ef\u0001\u0000\u0000\u0000"+
		"\u0671\u0682\u0005\u000e\u0000\u0000\u0672\u0682\u0005:\u0000\u0000\u0673"+
		"\u0682\u0005;\u0000\u0000\u0674\u0682\u0005=\u0000\u0000\u0675\u0682\u0005"+
		"<\u0000\u0000\u0676\u0682\u0005[\u0000\u0000\u0677\u0682\u0005\u001b\u0000"+
		"\u0000\u0678\u0682\u0005\u001c\u0000\u0000\u0679\u0682\u0005-\u0000\u0000"+
		"\u067a\u0682\u0005U\u0000\u0000\u067b\u0682\u0005\r\u0000\u0000\u067c"+
		"\u0682\u0005\\\u0000\u0000\u067d\u0682\u0005\u000b\u0000\u0000\u067e\u0682"+
		"\u0005H\u0000\u0000\u067f\u0682\u0005R\u0000\u0000\u0680\u0682\u0003\u00a2"+
		"Q\u0000\u0681\u0671\u0001\u0000\u0000\u0000\u0681\u0672\u0001\u0000\u0000"+
		"\u0000\u0681\u0673\u0001\u0000\u0000\u0000\u0681\u0674\u0001\u0000\u0000"+
		"\u0000\u0681\u0675\u0001\u0000\u0000\u0000\u0681\u0676\u0001\u0000\u0000"+
		"\u0000\u0681\u0677\u0001\u0000\u0000\u0000\u0681\u0678\u0001\u0000\u0000"+
		"\u0000\u0681\u0679\u0001\u0000\u0000\u0000\u0681\u067a\u0001\u0000\u0000"+
		"\u0000\u0681\u067b\u0001\u0000\u0000\u0000\u0681\u067c\u0001\u0000\u0000"+
		"\u0000\u0681\u067d\u0001\u0000\u0000\u0000\u0681\u067e\u0001\u0000\u0000"+
		"\u0000\u0681\u067f\u0001\u0000\u0000\u0000\u0681\u0680\u0001\u0000\u0000"+
		"\u0000\u0682\u00f1\u0001\u0000\u0000\u0000\u00d4\u00f3\u00f6\u00fb\u0101"+
		"\u0109\u010f\u011a\u011f\u0126\u012d\u0132\u0139\u013c\u0141\u0144\u0147"+
		"\u014a\u014f\u0153\u0157\u015c\u0160\u0162\u0168\u0174\u0185\u018c\u0194"+
		"\u0198\u019d\u01a3\u01ab\u01b3\u01b9\u01c0\u01c7\u01cc\u01d2\u01e6\u01f4"+
		"\u01f8\u0201\u0205\u020a\u0224\u022f\u0233\u0237\u0240\u024a\u024f\u0255"+
		"\u025a\u025f\u0269\u026f\u0275\u027b\u028f\u0299\u02a6\u02ae\u02b5\u02b8"+
		"\u02bd\u02c1\u02ca\u02d9\u02df\u02e3\u02e6\u02eb\u02ef\u02f3\u02fb\u0302"+
		"\u030f\u0315\u031e\u0324\u0328\u032f\u0337\u033e\u0342\u0344\u034a\u0351"+
		"\u0355\u0359\u0366\u0369\u0370\u0377\u037b\u0381\u0388\u038d\u0394\u039e"+
		"\u03a1\u03a9\u03ae\u03b2\u03b8\u03c6\u03cb\u03d0\u03d3\u03da\u0409\u040d"+
		"\u0433\u0449\u044b\u0450\u0455\u045a\u045d\u0463\u0469\u0470\u0475\u047b"+
		"\u0485\u048a\u048e\u0492\u0499\u04a3\u04ae\u04ba\u04be\u04c7\u04d0\u04d9"+
		"\u04dd\u04e2\u04e6\u04e9\u04ed\u04f0\u04f5\u04f8\u04fb\u04fe\u0501\u0505"+
		"\u0509\u050d\u0512\u0516\u0518\u051e\u0528\u052c\u0536\u053b\u053d\u0542"+
		"\u054a\u054e\u0552\u0559\u0562\u0565\u0568\u056d\u0570\u0574\u0582\u0584"+
		"\u058a\u058c\u0593\u0598\u059c\u059f\u05a6\u05ac\u05b6\u05bb\u05c0\u05c2"+
		"\u05ca\u05d1\u05d9\u05dd\u05e2\u05e9\u05f0\u05f9\u05fe\u0607\u060a\u060f"+
		"\u0614\u061a\u0620\u0624\u062b\u0630\u0636\u063f\u0644\u0649\u0650\u0653"+
		"\u0657\u065b\u0665\u0681";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}