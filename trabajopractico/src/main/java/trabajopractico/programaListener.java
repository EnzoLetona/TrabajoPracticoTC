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