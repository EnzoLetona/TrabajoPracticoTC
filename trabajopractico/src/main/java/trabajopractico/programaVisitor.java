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
	 * Visit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(programaParser.BloqueContext ctx);
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
	 * Visit a parse tree produced by {@link programaParser#declaracionIndice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionIndice(programaParser.DeclaracionIndiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(programaParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(programaParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores(programaParser.OperadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#operacionesaritlogicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(programaParser.OperadorLogicoContext ctx);
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
	 * Visit a parse tree produced by {@link programaParser#declararConDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararConDef(programaParser.DeclararConDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declararSinDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararSinDef(programaParser.DeclararSinDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declaracionChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionChar(programaParser.DeclaracionCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declararChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararChar(programaParser.DeclararCharContext ctx);
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
	 * Visit a parse tree produced by {@link programaParser#nombreFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreFuncion(programaParser.NombreFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(programaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#nombreParametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreParametro(programaParser.NombreParametroContext ctx);
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
	 * Visit a parse tree produced by {@link programaParser#typeFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctions(programaParser.TypeFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(programaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#returnss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnss(programaParser.ReturnssContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(programaParser.VariableContext ctx);
}