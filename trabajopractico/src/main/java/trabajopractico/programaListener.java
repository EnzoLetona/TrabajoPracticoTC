// Generated from c:\Users\Usuario\Documents\TrabajoPracticoTC\trabajopractico\src\main\java\trabajopractico\programa.g4 by ANTLR 4.8

    package trabajopractico;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programaParser}.
 */
public interface programaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(programaParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(programaParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(programaParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(programaParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(programaParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(programaParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracionIndice}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionIndice(programaParser.DeclaracionIndiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracionIndice}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionIndice(programaParser.DeclaracionIndiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#indice}.
	 * @param ctx the parse tree
	 */
	void enterIndice(programaParser.IndiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#indice}.
	 * @param ctx the parse tree
	 */
	void exitIndice(programaParser.IndiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(programaParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(programaParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(programaParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(programaParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(programaParser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(programaParser.OperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#operacionesaritlogicas}.
	 * @param ctx the parse tree
	 */
	void enterOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#operacionesaritlogicas}.
	 * @param ctx the parse tree
	 */
	void exitOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(programaParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(programaParser.OperadorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(programaParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(programaParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracionChar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionChar(programaParser.DeclaracionCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracionChar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionChar(programaParser.DeclaracionCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declararChar}.
	 * @param ctx the parse tree
	 */
	void enterDeclararChar(programaParser.DeclararCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declararChar}.
	 * @param ctx the parse tree
	 */
	void exitDeclararChar(programaParser.DeclararCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#numerochar}.
	 * @param ctx the parse tree
	 */
	void enterNumerochar(programaParser.NumerocharContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#numerochar}.
	 * @param ctx the parse tree
	 */
	void exitNumerochar(programaParser.NumerocharContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(programaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(programaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadoFuncion(programaParser.LlamadoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadoFuncion(programaParser.LlamadoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#concatenacionPalabras}.
	 * @param ctx the parse tree
	 */
	void enterConcatenacionPalabras(programaParser.ConcatenacionPalabrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#concatenacionPalabras}.
	 * @param ctx the parse tree
	 */
	void exitConcatenacionPalabras(programaParser.ConcatenacionPalabrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#definicionFunciones}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#definicionFunciones}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#typeFunctions}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctions(programaParser.TypeFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#typeFunctions}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctions(programaParser.TypeFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(programaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(programaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#returnss}.
	 * @param ctx the parse tree
	 */
	void enterReturnss(programaParser.ReturnssContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#returnss}.
	 * @param ctx the parse tree
	 */
	void exitReturnss(programaParser.ReturnssContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(programaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(programaParser.VariableContext ctx);
}