package trabajopractico;


//import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;
import org.antlr.v4.runtime.tree.ErrorNode;
public class MiListener extends programaBaseListener{
  public String tipoVariable;
  public Boolean comeParameters = false;
  public boolean isDeclaration = false;
  public boolean isDeclarationFunction = false;
  public boolean isAFor = false;
  public String tipoVariableParametros;
  public String tipoFuncion;
  public int indexContextoActual = 1;
  public boolean isAsignation = false;
  public boolean error = false;
  public boolean isOperacionAritmeticaLogica = false;
  public String nombreFuncion;
  public boolean inFunction = false;

  public boolean isInt(String s){
    try{ 
      int i = Integer.parseInt(s); 
      return true; 
    }
    catch(NumberFormatException er){ 
      return false; 
    }
  }

  public void searchingLogic(String ctx, int line){ 
    MiId idLocal = new MiId();
    MiId idLocalAux = new MiId();
    Boolean encontrado=false;
    idLocal.setToken(ctx);
    for(int i =indexContextoActual ; i >= 1 ; i-- ){
      if (TablaSimbolos.getInstance().buscarIdLocal(idLocal,i)){
       idLocalAux = TablaSimbolos.getInstance().obtenerId(i,ctx);
       i = 0;
       encontrado = true;
      }
    }
    if(encontrado) {
      if(idLocalAux.getInicializada() == false){
        error = true;
        System.out.println("Semantic error - variable '"+ctx+"' declared but not initialize - line "+ line);
      }
      idLocalAux.setUsada(true);
    }else{
     error = true;
     System.out.println("Semantic error - variable '"+ctx+"' not declared - in the line " + line);
    }
  }

  public void sintacticControlPyC(String PyC, int line){
    if(!PyC.equals(";")){
      System.out.println("Sintactic error - missing ';' in the line "+line);
      error = true;
    }
  }
  @Override public void enterAsignacion(programaParser.AsignacionContext ctx) {
    isAsignation = true; 
    MiId idLocal = new MiId();
    MiId idLocalAux = new MiId();
    Boolean encontrado=false;
    idLocal.setToken(ctx.getStart().getText());
    for(int i =indexContextoActual ; i >= 1 ; i-- ){
      if (TablaSimbolos.getInstance().buscarIdLocal(idLocal,i)){
       idLocalAux = TablaSimbolos.getInstance().obtenerId(i,ctx.getStart().getText());
       i = 0;
       encontrado = true;
      }
    }
    if(encontrado) {
     idLocalAux.setUsada(true);
     idLocalAux.setInicializada(true);
    }else{
     error = true;
     System.out.println("Semantic error (asignation) - variable '"+ctx.getStart().getText()+"' is not declared - in the line " + ctx.getStart().getLine());
    }
  }

  @Override public void exitAsignacion(programaParser.AsignacionContext ctx) { 
    isAsignation = false;
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }

  @Override public void enterDeclaracion(programaParser.DeclaracionContext ctx) { 
    isDeclaration = true;
    tipoVariable = ctx.getStart().getText();
  }

  @Override public void exitDeclaracion(programaParser.DeclaracionContext ctx) { 
    isDeclaration = false;
  }

  @Override public void enterDeclararConDef(programaParser.DeclararConDefContext ctx) { 

    MiId idLocal = new MiId();
    boolean addIDStatus;
    if(tipoVariable.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariable.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);
    if(tipoVariable.equals("float")) idLocal.setTipoDato(TipoDato.FLOAT);
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(true);
    addIDStatus = TablaSimbolos.getInstance().addId(idLocal,indexContextoActual);
    if(!addIDStatus) error = true; 
  }
  
  @Override public void exitDeclararConDef(programaParser.DeclararConDefContext ctx) { 
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }

  @Override public void enterDeclararSinDef(programaParser.DeclararSinDefContext ctx) { 
    MiId idLocal = new MiId();
    boolean addIDStatus;
    if(tipoVariable.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariable.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);
    if(tipoVariable.equals("float")) idLocal.setTipoDato(TipoDato.FLOAT);
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(false);
    addIDStatus = TablaSimbolos.getInstance().addId(idLocal,indexContextoActual); 
    if(!addIDStatus) error = true; 
  }
  
  @Override public void exitDeclararSinDef(programaParser.DeclararSinDefContext ctx) { 
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }


  @Override public void exitPrograma(programaParser.ProgramaContext ctx) {
   Set<String> oneContext =  TablaSimbolos.getInstance().obtenerContexto(1).keySet();
   if(oneContext.size() != 0){
     MiId idAuxiliar = new MiId();
     String searchingToken;
     for(int i = 0 ; i < oneContext.size() ; i++){
      searchingToken = oneContext.toArray(new String[0])[i];
      idAuxiliar=TablaSimbolos.getInstance().obtenerId(1,searchingToken);
      if(idAuxiliar.getUsada()==false && !idAuxiliar.getToken().equals("main")){
        System.out.println("Semantic error - declared but not used '"+idAuxiliar.getToken()+"'");
        error=true;
      }
      if(idAuxiliar.getInicializada()==false && !idAuxiliar.getToken().equals("main")){
        System.out.println("Semantic error - declared but not initialize '"+idAuxiliar.getToken()+"'");
        error=true;
      }
     }
   }
    TablaSimbolos.getInstance().addContextoFisico( TablaSimbolos.getInstance().obtenerContexto(1));
    if (!error) TablaSimbolos.getInstance().getTabla();
    //System.out.println(indexContextoActual);
  }

  
  @Override public void enterVariable(programaParser.VariableContext ctx) {

    if (isDeclaration){
      if(tipoVariable.equals("int")){
        if (!isInt(ctx.getStart().getText())) System.out.println("wrong asignation - expected 'int'");
      }
    }

    if(isAFor){
      if(!isInt(ctx.getStart().getText())){
        searchingLogic(ctx.getStart().getText(),ctx.getStart().getLine());
      }
    }

    if(isOperacionAritmeticaLogica){
      if(!isInt(ctx.getStart().getText())){
        searchingLogic(ctx.getStart().getText(),ctx.getStart().getLine());
      }
    }
    if(isAsignation){
      if(!isInt(ctx.getStart().getText())){
        searchingLogic(ctx.getStart().getText(),ctx.getStart().getLine());
      }
    }
  }

  

  @Override public void enterBloque(programaParser.BloqueContext ctx) {
    if(comeParameters == false){
      indexContextoActual += 1; 
      TablaSimbolos.getInstance().addContexto();
    }
    else {
      comeParameters = false;
    }
    
    
  }
  @Override public void exitBloque(programaParser.BloqueContext ctx) {
    Set<String> oneContext =  TablaSimbolos.getInstance().obtenerContexto(indexContextoActual).keySet();
    if(oneContext.size() != 0){
      MiId idAuxiliar = new MiId();
      String searchingToken;
      for(int i = 0 ; i < oneContext.size() ; i++){
        searchingToken = oneContext.toArray(new String[0])[i];
        idAuxiliar=TablaSimbolos.getInstance().obtenerId(indexContextoActual,searchingToken);
        if(idAuxiliar.getUsada()==false){
          System.out.println("Semantic error - declared but not used '"+idAuxiliar.getToken()+"' - in the line "+ctx.getStart().getLine());
          error=true;
        }
      }
    }
    TablaSimbolos.getInstance().addContextoFisico(TablaSimbolos.getInstance().obtenerContexto(indexContextoActual));
    indexContextoActual -= 1; 
    TablaSimbolos.getInstance().removeLastContexto(); 
  }
 
  @Override public void enterOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx) { 
    isOperacionAritmeticaLogica = true;
  }

  @Override public void exitOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx) { 
    isOperacionAritmeticaLogica = false;
  }

  @Override public void enterNombreFuncion(programaParser.NombreFuncionContext ctx) {
    this.nombreFuncion = ctx.getStart().getText(); 
    MiId idLocal = new MiId();
    idLocal.setToken(this.nombreFuncion);
    idLocal.setFuncion(true);
    if(tipoFuncion.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoFuncion.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);
    if(tipoFuncion.equals("float")) idLocal.setTipoDato(TipoDato.FLOAT);
    if(tipoFuncion.equals("void")) idLocal.setTipoDato(TipoDato.VOID);
    if(isDeclarationFunction==false){
      if(!nombreFuncion.equals("main")){
        MiId idAuxiliar = new MiId();
        if(TablaSimbolos.getInstance().buscarIdLocal(idLocal,1)){
          idAuxiliar=TablaSimbolos.getInstance().obtenerId(1,nombreFuncion);
          idAuxiliar.setInicializada(true);
        }
        else{
          System.out.println("Semantic error - define prototype of the function '" + nombreFuncion  + "' - in the line " + ctx.getStart().getLine());
          error = true;
        }
      }
      else{
        idLocal.setInicializada(true);
        TablaSimbolos.getInstance().addId(idLocal,indexContextoActual);
      }
    }
    else{
      if(!TablaSimbolos.getInstance().addId(idLocal,1)){
        error = true;
      }                                             
    }
    
  }

  @Override public void enterDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx) { 
    this.inFunction = true;
  }
  @Override public void exitDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx) { 
    this.indexContextoActual = 1;
  }

  @Override public void enterParametros(programaParser.ParametrosContext ctx) { 
    if(!ctx.getStart().getText().equals(")") && comeParameters != true){
      comeParameters = true;
      indexContextoActual += 1; 
      TablaSimbolos.getInstance().addContexto();
    }
  }

  @Override public void enterNombreParametro(programaParser.NombreParametroContext ctx) { 
    MiId idLocal = new MiId();
    idLocal.setToken(ctx.getStart().getText());
    if(tipoVariableParametros.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariableParametros.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);
    if(tipoVariableParametros.equals("float")) idLocal.setTipoDato(TipoDato.FLOAT);

    idLocal.setInicializada(true);
    TablaSimbolos.getInstance().addId(idLocal, indexContextoActual);
  }
  
  @Override public void enterType(programaParser.TypeContext ctx) {
    tipoVariableParametros = ctx.getStart().getText();
  }

  @Override public void enterLlamadoFuncion(programaParser.LlamadoFuncionContext ctx) { 
    
    MiId idLocal = new MiId();
    MiId idLocalAux = new MiId();
    idLocal.setToken(ctx.getStart().getText());
    if (TablaSimbolos.getInstance().buscarIdLocal(idLocal,1)){
      idLocalAux = TablaSimbolos.getInstance().obtenerId(1,ctx.getStart().getText());
      idLocalAux.setUsada(true);
    }
    else{
      System.out.println("Semantic error - function undeclared '" + ctx.getStart().getText() + "' - in the line "+ ctx.getStart().getLine());
      error = true;
    }
  }
  
  @Override public void exitLlamadoFuncion(programaParser.LlamadoFuncionContext ctx) {
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }
  
  @Override public void enterDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx) { 
    isDeclarationFunction= true;
  }

  @Override public void exitDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx) {
    isDeclarationFunction= false;
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }

  @Override public void enterTypeFunctions(programaParser.TypeFunctionsContext ctx) { 
    tipoFuncion = ctx.getStart().getText();
  }
  
  @Override public void visitErrorNode(ErrorNode node) { 
    System.out.println("Sintactic error - missing ';'");
  }

  @Override public void exitReturnss(programaParser.ReturnssContext ctx) { 
    sintacticControlPyC(ctx.getStop().getText(),ctx.getStop().getLine());
  }

  @Override public void exitReglaParentesisA(programaParser.ReglaParentesisAContext ctx) { 
    if(!ctx.getStart().getText().equals("(")){
      System.out.println("Sintactic error - missing '(' in the line " + ctx.getStart().getLine());
    }
  }

  @Override public void exitReglaParentesisC(programaParser.ReglaParentesisCContext ctx) { 
    if(!ctx.getStart().getText().equals(")")){
      System.out.println("Sintactic error - missing ')' in the line " + ctx.getStart().getLine());
    }
  }

  @Override public void enterIfor(programaParser.IforContext ctx) { 
    isAFor = true;
  }
  @Override public void exitIfor(programaParser.IforContext ctx) { 
    isAFor = false;
  }
  
}