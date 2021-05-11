// Generated from c:\Users\Usuario\Documents\TrabajoPracticoTC\trabajopractico\src\main\java\trabajopractico\programa.g4 by ANTLR 4.8

    package trabajopractico;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link programaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface programaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(programaParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(programaParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(programaParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(programaParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#numerochar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerochar(programaParser.NumerocharContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(programaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#llamadoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadoFuncion(programaParser.LlamadoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#concatenacionPalabras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenacionPalabras(programaParser.ConcatenacionPalabrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#definicionFunciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(programaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(programaParser.VariableContext ctx);
}