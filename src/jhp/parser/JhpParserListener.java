// Generated from JhpParser.g4 by ANTLR 4.13.1
package jhp.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JhpParser}.
 */
public interface JhpParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JhpParser#phpFile}.
	 * @param ctx the parse tree
	 */
	void enterPhpFile(JhpParser.PhpFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#phpFile}.
	 * @param ctx the parse tree
	 */
	void exitPhpFile(JhpParser.PhpFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void enterPhpBlock(JhpParser.PhpBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#phpBlock}.
	 * @param ctx the parse tree
	 */
	void exitPhpBlock(JhpParser.PhpBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JhpParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JhpParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(JhpParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(JhpParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopStatement(JhpParser.TopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#topStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopStatement(JhpParser.TopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(JhpParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(JhpParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JhpParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JhpParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JhpParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JhpParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#classEntryType}.
	 * @param ctx the parse tree
	 */
	void enterClassEntryType(JhpParser.ClassEntryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#classEntryType}.
	 * @param ctx the parse tree
	 */
	void exitClassEntryType(JhpParser.ClassEntryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceList(JhpParser.InterfaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceList(JhpParser.InterfaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeParameterListInBrackets}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterListInBrackets(JhpParser.TypeParameterListInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeParameterListInBrackets}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterListInBrackets(JhpParser.TypeParameterListInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JhpParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JhpParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeParameterWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterWithDefaultsList(JhpParser.TypeParameterWithDefaultsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeParameterWithDefaultsList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterWithDefaultsList(JhpParser.TypeParameterWithDefaultsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterDecl(JhpParser.TypeParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterDecl(JhpParser.TypeParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeParameterWithDefaultDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterWithDefaultDecl(JhpParser.TypeParameterWithDefaultDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeParameterWithDefaultDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterWithDefaultDecl(JhpParser.TypeParameterWithDefaultDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#genericDynamicArgs}.
	 * @param ctx the parse tree
	 */
	void enterGenericDynamicArgs(JhpParser.GenericDynamicArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#genericDynamicArgs}.
	 * @param ctx the parse tree
	 */
	void exitGenericDynamicArgs(JhpParser.GenericDynamicArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(JhpParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(JhpParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#attributeGroup}.
	 * @param ctx the parse tree
	 */
	void enterAttributeGroup(JhpParser.AttributeGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#attributeGroup}.
	 * @param ctx the parse tree
	 */
	void exitAttributeGroup(JhpParser.AttributeGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JhpParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JhpParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#innerStatementList}.
	 * @param ctx the parse tree
	 */
	void enterInnerStatementList(JhpParser.InnerStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#innerStatementList}.
	 * @param ctx the parse tree
	 */
	void exitInnerStatementList(JhpParser.InnerStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#innerStatement}.
	 * @param ctx the parse tree
	 */
	void enterInnerStatement(JhpParser.InnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#innerStatement}.
	 * @param ctx the parse tree
	 */
	void exitInnerStatement(JhpParser.InnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JhpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JhpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(JhpParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(JhpParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JhpParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JhpParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JhpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JhpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(JhpParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(JhpParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#elseIfColonStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfColonStatement(JhpParser.ElseIfColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#elseIfColonStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfColonStatement(JhpParser.ElseIfColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JhpParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JhpParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#elseColonStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseColonStatement(JhpParser.ElseColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#elseColonStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseColonStatement(JhpParser.ElseColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JhpParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JhpParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JhpParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JhpParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JhpParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JhpParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JhpParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JhpParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JhpParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JhpParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JhpParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JhpParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JhpParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JhpParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#switchBlockBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockBody(JhpParser.SwitchBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#switchBlockBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockBody(JhpParser.SwitchBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JhpParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JhpParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JhpParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JhpParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JhpParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JhpParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JhpParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JhpParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(JhpParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(JhpParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchFinally(JhpParser.TryCatchFinallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchFinally(JhpParser.TryCatchFinallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JhpParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JhpParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void enterFinallyStatement(JhpParser.FinallyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void exitFinallyStatement(JhpParser.FinallyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JhpParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JhpParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JhpParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JhpParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JhpParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JhpParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(JhpParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(JhpParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#echoStatement}.
	 * @param ctx the parse tree
	 */
	void enterEchoStatement(JhpParser.EchoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#echoStatement}.
	 * @param ctx the parse tree
	 */
	void exitEchoStatement(JhpParser.EchoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#staticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void enterStaticVariableStatement(JhpParser.StaticVariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#staticVariableStatement}.
	 * @param ctx the parse tree
	 */
	void exitStaticVariableStatement(JhpParser.StaticVariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(JhpParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(JhpParser.ClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#traitAdaptations}.
	 * @param ctx the parse tree
	 */
	void enterTraitAdaptations(JhpParser.TraitAdaptationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#traitAdaptations}.
	 * @param ctx the parse tree
	 */
	void exitTraitAdaptations(JhpParser.TraitAdaptationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#traitAdaptationStatement}.
	 * @param ctx the parse tree
	 */
	void enterTraitAdaptationStatement(JhpParser.TraitAdaptationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#traitAdaptationStatement}.
	 * @param ctx the parse tree
	 */
	void exitTraitAdaptationStatement(JhpParser.TraitAdaptationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#traitPrecedence}.
	 * @param ctx the parse tree
	 */
	void enterTraitPrecedence(JhpParser.TraitPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#traitPrecedence}.
	 * @param ctx the parse tree
	 */
	void exitTraitPrecedence(JhpParser.TraitPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#traitAlias}.
	 * @param ctx the parse tree
	 */
	void enterTraitAlias(JhpParser.TraitAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#traitAlias}.
	 * @param ctx the parse tree
	 */
	void exitTraitAlias(JhpParser.TraitAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#traitMethodReference}.
	 * @param ctx the parse tree
	 */
	void enterTraitMethodReference(JhpParser.TraitMethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#traitMethodReference}.
	 * @param ctx the parse tree
	 */
	void exitTraitMethodReference(JhpParser.TraitMethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#baseCtorCall}.
	 * @param ctx the parse tree
	 */
	void enterBaseCtorCall(JhpParser.BaseCtorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#baseCtorCall}.
	 * @param ctx the parse tree
	 */
	void exitBaseCtorCall(JhpParser.BaseCtorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#returnTypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeDecl(JhpParser.ReturnTypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#returnTypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeDecl(JhpParser.ReturnTypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JhpParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JhpParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#propertyModifiers}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifiers(JhpParser.PropertyModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#propertyModifiers}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifiers(JhpParser.PropertyModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#memberModifiers}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifiers(JhpParser.MemberModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#memberModifiers}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifiers(JhpParser.MemberModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JhpParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JhpParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#identifierInitializer}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierInitializer(JhpParser.IdentifierInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#identifierInitializer}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierInitializer(JhpParser.IdentifierInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JhpParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JhpParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void enterEnumItem(JhpParser.EnumItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void exitEnumItem(JhpParser.EnumItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JhpParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JhpParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(JhpParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(JhpParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChainExpression(JhpParser.ChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChainExpression(JhpParser.ChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JhpParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JhpParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentiationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(JhpParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentiationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(JhpParser.ExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCreationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JhpParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCreationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JhpParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(JhpParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(JhpParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(JhpParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(JhpParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JhpParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JhpParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixIncDecExpression(JhpParser.PostfixIncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixIncDecExpression(JhpParser.PostfixIncDecExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExcOrExpression(JhpParser.BitwiseExcOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExcOrExpression(JhpParser.BitwiseExcOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JhpParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JhpParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JhpParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JhpParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloneExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCloneExpression(JhpParser.CloneExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloneExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCloneExpression(JhpParser.CloneExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JhpParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JhpParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JhpParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JhpParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOperatorExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperatorExpression(JhpParser.UnaryOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOperatorExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperatorExpression(JhpParser.UnaryOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JhpParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JhpParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(JhpParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(JhpParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalIncOrExpression(JhpParser.LogicalIncOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalIncOrExpression(JhpParser.LogicalIncOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpaceshipExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSpaceshipExpression(JhpParser.SpaceshipExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpaceshipExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSpaceshipExpression(JhpParser.SpaceshipExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JhpParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JhpParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JhpParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JhpParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexerExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexerExpression(JhpParser.IndexerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexerExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexerExpression(JhpParser.IndexerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScalarExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterScalarExpression(JhpParser.ScalarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScalarExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitScalarExpression(JhpParser.ScalarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixIncDecExpression(JhpParser.PrefixIncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixIncDecExpression(JhpParser.PrefixIncDecExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(JhpParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(JhpParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExcOrExpression(JhpParser.LogicalExcOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExcOrExpression(JhpParser.LogicalExcOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseIncOrExpression(JhpParser.BitwiseIncOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseIncOrExpression(JhpParser.BitwiseIncOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JhpParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JhpParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceOfExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(JhpParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceOfExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(JhpParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDestructExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayDestructExpression(JhpParser.ArrayDestructExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDestructExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayDestructExpression(JhpParser.ArrayDestructExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaFunctionExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunctionExpression(JhpParser.LambdaFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaFunctionExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunctionExpression(JhpParser.LambdaFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(JhpParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(JhpParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(JhpParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(JhpParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreation(JhpParser.ArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreation(JhpParser.ArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#arrayDestructuring}.
	 * @param ctx the parse tree
	 */
	void enterArrayDestructuring(JhpParser.ArrayDestructuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#arrayDestructuring}.
	 * @param ctx the parse tree
	 */
	void exitArrayDestructuring(JhpParser.ArrayDestructuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#indexedDestructItem}.
	 * @param ctx the parse tree
	 */
	void enterIndexedDestructItem(JhpParser.IndexedDestructItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#indexedDestructItem}.
	 * @param ctx the parse tree
	 */
	void exitIndexedDestructItem(JhpParser.IndexedDestructItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#keyedDestructItem}.
	 * @param ctx the parse tree
	 */
	void enterKeyedDestructItem(JhpParser.KeyedDestructItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#keyedDestructItem}.
	 * @param ctx the parse tree
	 */
	void exitKeyedDestructItem(JhpParser.KeyedDestructItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#lambdaFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunctionExpr(JhpParser.LambdaFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#lambdaFunctionExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunctionExpr(JhpParser.LambdaFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#matchExpr}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpr(JhpParser.MatchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#matchExpr}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpr(JhpParser.MatchExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#matchItem}.
	 * @param ctx the parse tree
	 */
	void enterMatchItem(JhpParser.MatchItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#matchItem}.
	 * @param ctx the parse tree
	 */
	void exitMatchItem(JhpParser.MatchItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(JhpParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(JhpParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JhpParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JhpParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#arrayItemList}.
	 * @param ctx the parse tree
	 */
	void enterArrayItemList(JhpParser.ArrayItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#arrayItemList}.
	 * @param ctx the parse tree
	 */
	void exitArrayItemList(JhpParser.ArrayItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayItem(JhpParser.ArrayItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayItem(JhpParser.ArrayItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#qualifiedStaticTypeRef}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedStaticTypeRef(JhpParser.QualifiedStaticTypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#qualifiedStaticTypeRef}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedStaticTypeRef(JhpParser.QualifiedStaticTypeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterTypeRef(JhpParser.TypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitTypeRef(JhpParser.TypeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#anonymousClass}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousClass(JhpParser.AnonymousClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#anonymousClass}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousClass(JhpParser.AnonymousClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#indirectTypeRef}.
	 * @param ctx the parse tree
	 */
	void enterIndirectTypeRef(JhpParser.IndirectTypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#indirectTypeRef}.
	 * @param ctx the parse tree
	 */
	void exitIndirectTypeRef(JhpParser.IndirectTypeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#qualifiedNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNamespaceName(JhpParser.QualifiedNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#qualifiedNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNamespaceName(JhpParser.QualifiedNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#namespaceNameList}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceNameList(JhpParser.NamespaceNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#namespaceNameList}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceNameList(JhpParser.NamespaceNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#namespaceNameTail}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceNameTail(JhpParser.NamespaceNameTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#namespaceNameTail}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceNameTail(JhpParser.NamespaceNameTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#qualifiedNamespaceNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNamespaceNameList(JhpParser.QualifiedNamespaceNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#qualifiedNamespaceNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNamespaceNameList(JhpParser.QualifiedNamespaceNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JhpParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JhpParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#actualArgument}.
	 * @param ctx the parse tree
	 */
	void enterActualArgument(JhpParser.ActualArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#actualArgument}.
	 * @param ctx the parse tree
	 */
	void exitActualArgument(JhpParser.ActualArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(JhpParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(JhpParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#constantInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstantInitializer(JhpParser.ConstantInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#constantInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstantInitializer(JhpParser.ConstantInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(JhpParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(JhpParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(JhpParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(JhpParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(JhpParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(JhpParser.NumericConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#classConstant}.
	 * @param ctx the parse tree
	 */
	void enterClassConstant(JhpParser.ClassConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#classConstant}.
	 * @param ctx the parse tree
	 */
	void exitClassConstant(JhpParser.ClassConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(JhpParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(JhpParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JhpParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JhpParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#interpolatedStringPart}.
	 * @param ctx the parse tree
	 */
	void enterInterpolatedStringPart(JhpParser.InterpolatedStringPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#interpolatedStringPart}.
	 * @param ctx the parse tree
	 */
	void exitInterpolatedStringPart(JhpParser.InterpolatedStringPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#chainList}.
	 * @param ctx the parse tree
	 */
	void enterChainList(JhpParser.ChainListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#chainList}.
	 * @param ctx the parse tree
	 */
	void exitChainList(JhpParser.ChainListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChain(JhpParser.ChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChain(JhpParser.ChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#chainOrigin}.
	 * @param ctx the parse tree
	 */
	void enterChainOrigin(JhpParser.ChainOriginContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#chainOrigin}.
	 * @param ctx the parse tree
	 */
	void exitChainOrigin(JhpParser.ChainOriginContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(JhpParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(JhpParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JhpParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JhpParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#functionCallName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallName(JhpParser.FunctionCallNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#functionCallName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallName(JhpParser.FunctionCallNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#actualArguments}.
	 * @param ctx the parse tree
	 */
	void enterActualArguments(JhpParser.ActualArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#actualArguments}.
	 * @param ctx the parse tree
	 */
	void exitActualArguments(JhpParser.ActualArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#chainBase}.
	 * @param ctx the parse tree
	 */
	void enterChainBase(JhpParser.ChainBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#chainBase}.
	 * @param ctx the parse tree
	 */
	void exitChainBase(JhpParser.ChainBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#keyedFieldName}.
	 * @param ctx the parse tree
	 */
	void enterKeyedFieldName(JhpParser.KeyedFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#keyedFieldName}.
	 * @param ctx the parse tree
	 */
	void exitKeyedFieldName(JhpParser.KeyedFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#keyedSimpleFieldName}.
	 * @param ctx the parse tree
	 */
	void enterKeyedSimpleFieldName(JhpParser.KeyedSimpleFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#keyedSimpleFieldName}.
	 * @param ctx the parse tree
	 */
	void exitKeyedSimpleFieldName(JhpParser.KeyedSimpleFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#keyedVariable}.
	 * @param ctx the parse tree
	 */
	void enterKeyedVariable(JhpParser.KeyedVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#keyedVariable}.
	 * @param ctx the parse tree
	 */
	void exitKeyedVariable(JhpParser.KeyedVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#squareCurlyExpression}.
	 * @param ctx the parse tree
	 */
	void enterSquareCurlyExpression(JhpParser.SquareCurlyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#squareCurlyExpression}.
	 * @param ctx the parse tree
	 */
	void exitSquareCurlyExpression(JhpParser.SquareCurlyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(JhpParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(JhpParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#assignmentListElement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentListElement(JhpParser.AssignmentListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#assignmentListElement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentListElement(JhpParser.AssignmentListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JhpParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JhpParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JhpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JhpParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(JhpParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(JhpParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#magicConstant}.
	 * @param ctx the parse tree
	 */
	void enterMagicConstant(JhpParser.MagicConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#magicConstant}.
	 * @param ctx the parse tree
	 */
	void exitMagicConstant(JhpParser.MagicConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JhpParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JhpParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JhpParser#castOperation}.
	 * @param ctx the parse tree
	 */
	void enterCastOperation(JhpParser.CastOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JhpParser#castOperation}.
	 * @param ctx the parse tree
	 */
	void exitCastOperation(JhpParser.CastOperationContext ctx);
}