// Generated from JhpParser.g4 by ANTLR 4.13.1
package jhp.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JhpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JhpParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JhpParser#phpFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhpFile(JhpParser.PhpFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#phpBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhpBlock(JhpParser.PhpBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(JhpParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#topStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopStatement(JhpParser.TopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDeclaration(JhpParser.NamespaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#namespaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceStatement(JhpParser.NamespaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JhpParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JhpParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#classEntryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEntryType(JhpParser.ClassEntryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#interfaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceList(JhpParser.InterfaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeParameterListInBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterListInBrackets(JhpParser.TypeParameterListInBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(JhpParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeParameterWithDefaultsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterWithDefaultsList(JhpParser.TypeParameterWithDefaultsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeParameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterDecl(JhpParser.TypeParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeParameterWithDefaultDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterWithDefaultDecl(JhpParser.TypeParameterWithDefaultDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#genericDynamicArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDynamicArgs(JhpParser.GenericDynamicArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(JhpParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#attributeGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeGroup(JhpParser.AttributeGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JhpParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#innerStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerStatementList(JhpParser.InnerStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#innerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerStatement(JhpParser.InnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JhpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#emptyStatement_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement_(JhpParser.EmptyStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JhpParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JhpParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(JhpParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#elseIfColonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfColonStatement(JhpParser.ElseIfColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JhpParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#elseColonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseColonStatement(JhpParser.ElseColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JhpParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(JhpParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JhpParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JhpParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JhpParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JhpParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(JhpParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#switchBlockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockBody(JhpParser.SwitchBlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JhpParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JhpParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JhpParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JhpParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(JhpParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#tryCatchFinally}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchFinally(JhpParser.TryCatchFinallyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JhpParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(JhpParser.FinallyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JhpParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JhpParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JhpParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHint(JhpParser.TypeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#echoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEchoStatement(JhpParser.EchoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#staticVariableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticVariableStatement(JhpParser.StaticVariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(JhpParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#traitAdaptations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitAdaptations(JhpParser.TraitAdaptationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#traitAdaptationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitAdaptationStatement(JhpParser.TraitAdaptationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#traitPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitPrecedence(JhpParser.TraitPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#traitAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitAlias(JhpParser.TraitAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#traitMethodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraitMethodReference(JhpParser.TraitMethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#baseCtorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseCtorCall(JhpParser.BaseCtorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#returnTypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnTypeDecl(JhpParser.ReturnTypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JhpParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#propertyModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifiers(JhpParser.PropertyModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#memberModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifiers(JhpParser.MemberModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JhpParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#identifierInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierInitializer(JhpParser.IdentifierInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JhpParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#enumItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumItem(JhpParser.EnumItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JhpParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(JhpParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainExpression(JhpParser.ChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(JhpParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentiationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(JhpParser.ExponentiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCreationExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(JhpParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(JhpParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(JhpParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JhpParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncDecExpression(JhpParser.PostfixIncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExcOrExpression(JhpParser.BitwiseExcOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JhpParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JhpParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloneExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneExpression(JhpParser.CloneExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JhpParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JhpParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOperatorExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperatorExpression(JhpParser.UnaryOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(JhpParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(JhpParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalIncOrExpression(JhpParser.LogicalIncOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpaceshipExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceshipExpression(JhpParser.SpaceshipExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JhpParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(JhpParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexerExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexerExpression(JhpParser.IndexerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScalarExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarExpression(JhpParser.ScalarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixIncDecExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixIncDecExpression(JhpParser.PrefixIncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(JhpParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExcOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExcOrExpression(JhpParser.LogicalExcOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseIncOrExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseIncOrExpression(JhpParser.BitwiseIncOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(JhpParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceOfExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(JhpParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDestructExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDestructExpression(JhpParser.ArrayDestructExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JhpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalesceExpression(JhpParser.CoalesceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(JhpParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#arrayCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreation(JhpParser.ArrayCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#arrayDestructuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDestructuring(JhpParser.ArrayDestructuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#indexedDestructItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedDestructItem(JhpParser.IndexedDestructItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#keyedDestructItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedDestructItem(JhpParser.KeyedDestructItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#matchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpr(JhpParser.MatchExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#matchItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchItem(JhpParser.MatchItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(JhpParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JhpParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#arrayItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayItemList(JhpParser.ArrayItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#arrayItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayItem(JhpParser.ArrayItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#qualifiedStaticTypeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedStaticTypeRef(JhpParser.QualifiedStaticTypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRef(JhpParser.TypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#anonymousClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousClass(JhpParser.AnonymousClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#indirectTypeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectTypeRef(JhpParser.IndirectTypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#qualifiedNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNamespaceName(JhpParser.QualifiedNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#namespaceNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceNameList(JhpParser.NamespaceNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#namespaceNameTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceNameTail(JhpParser.NamespaceNameTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#qualifiedNamespaceNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNamespaceNameList(JhpParser.QualifiedNamespaceNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JhpParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#actualArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualArgument(JhpParser.ActualArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#argumentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentName(JhpParser.ArgumentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#constantInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantInitializer(JhpParser.ConstantInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(JhpParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(JhpParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(JhpParser.NumericConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#classConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstant(JhpParser.ClassConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(JhpParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JhpParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#interpolatedStringPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolatedStringPart(JhpParser.InterpolatedStringPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#chainList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainList(JhpParser.ChainListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChain(JhpParser.ChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#chainOrigin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainOrigin(JhpParser.ChainOriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(JhpParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JhpParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#functionCallName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallName(JhpParser.FunctionCallNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#actualArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualArguments(JhpParser.ActualArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#chainBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainBase(JhpParser.ChainBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#keyedFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedFieldName(JhpParser.KeyedFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#keyedSimpleFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedSimpleFieldName(JhpParser.KeyedSimpleFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#keyedVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedVariable(JhpParser.KeyedVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#squareCurlyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareCurlyExpression(JhpParser.SquareCurlyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(JhpParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#assignmentListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentListElement(JhpParser.AssignmentListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JhpParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JhpParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(JhpParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#magicConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagicConstant(JhpParser.MagicConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JhpParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JhpParser#castOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastOperation(JhpParser.CastOperationContext ctx);
}