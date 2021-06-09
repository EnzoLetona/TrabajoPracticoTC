package trabajopractico;


//import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

public class MiListener extends programaBaseListener{
  public String tipoVariable;
  public Boolean comeParameters = false;
  public boolean isDeclaration = false;
  public boolean isDeclarationFunction = false;
  public String tipoVariableParametros;
  public MiId miid = new MiId(); 
  public List<String> lista = new ArrayList<String>();
  public List<String> funcionesDeclaradas = new ArrayList<String>();
  public List<String> parametros = new ArrayList<String>();
  public ArrayList<Integer> cantParametros = new ArrayList<Integer>();
  public String tipoFuncion;
  public Integer cantidad = 0;
  public int indexContextoActual = 1;
  public boolean isAsignation = false;
  public boolean error = false;
  public boolean isOperacionAritmeticaLogica = false;
  public String nombreFuncion;
  public boolean inFunction = false;
  public List<Integer> indecesFunciones =  new ArrayList<Integer>(); // <- se almacenan los indices en donde estan las funciones
  public List<Integer> limiteInferior =  new ArrayList<Integer>(); // <- se almacenan los indices en donde estan las funciones
  public List<Integer> limiteSuperior =  new ArrayList<Integer>(); // <- se almacenan los indices en donde estan las funciones
  public int bandera = 1;
  public boolean isInt(String s){
    try{ 
      int i = Integer.parseInt(s); 
      return true; 
    }
    catch(NumberFormatException er){ 
      return false; 
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
   }else{
    error = true;
    System.out.println("La variable |"+ctx.getStart().getText()+"| no esta declarada");
   }
  
  }

  @Override public void exitAsignacion(programaParser.AsignacionContext ctx) { 
    isAsignation = false;
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

    //idLocal.Token = ctx.getStart().getText();
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(true);
  
    addIDStatus = TablaSimbolos.getInstance().addId(idLocal,indexContextoActual);
    if(!addIDStatus) error = true; 
  }

  @Override public void enterDeclararSinDef(programaParser.DeclararSinDefContext ctx) { 

    MiId idLocal = new MiId();
    boolean addIDStatus;
    if(tipoVariable.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariable.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(false);
    addIDStatus = TablaSimbolos.getInstance().addId(idLocal,indexContextoActual); 
    if(!addIDStatus) error = true; 
  }
  


  @Override public void exitPrograma(programaParser.ProgramaContext ctx) {
    if (!error) TablaSimbolos.getInstance().getTabla();
    //System.out.println(indexContextoActual);
  }

  
  @Override public void enterVariable(programaParser.VariableContext ctx) {

    if (isDeclaration){
      if(tipoVariable.equals("int")){
        if (!isInt(ctx.getStart().getText())) System.out.println("La variable es de tipo entero y chantaste cualquiera");
      }
      if(tipoVariable.equals("double")){
        if (!isInt(ctx.getStart().getText())) System.out.println("La variable es de tipo entero y chantaste cualquiera");
      }
    }

    if(isOperacionAritmeticaLogica){
      if(!isInt(ctx.getStart().getText())){
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
        }else{
         error = true;
         System.out.println("La variable |"+ctx.getStart().getText()+"| no esta declarada");
        }
      }
    }
    if(isAsignation){
      if(!isInt(ctx.getStart().getText())){
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
        }else{
         error = true;
         System.out.println("La variable |"+ctx.getStart().getText()+"| no esta declarada");
        }
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
        System.out.println("La variable |"+idAuxiliar.getToken()+"| esta declarada pero no usada");
        error=true;
      }
     }
   }
    //System.out.println (" |||"+ TablaSimbolos.getInstance().obtenerContexto(indexContextoActual).keySet().size());
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
          System.out.println("Defina el prototipado de la funcion |" + nombreFuncion  + "|");
          error = true;
        }
      }
      else{
        idLocal.setInicializada(true);
        TablaSimbolos.getInstance().addId(idLocal,indexContextoActual);
      }
    }
    else{
      funcionesDeclaradas.add(ctx.getStart().getText());
      TablaSimbolos.getInstance().addId(idLocal,indexContextoActual);
    }
    
  }

  @Override public void enterDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx) { 
    this.inFunction = true;
    limiteInferior.add(bandera+1);
    //System.out.println(" rarara "+ctx.getStart().getText());
    //isOperacionAritmeticaLogica = true;
  }
  @Override public void exitDefinicionFunciones(programaParser.DefinicionFuncionesContext ctx) { 
    this.indexContextoActual = 1;
    limiteSuperior.add(bandera);
    //System.out.println(" rarara "+ctx.getStart().getText());
    //isOperacionAritmeticaLogica = true;
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
      System.out.println("La funcion |" + ctx.getStart().getText() + "| no se encuentra definida ni declarada");
      error = true;
    }
  }
  
  @Override public void enterDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx) { 
    isDeclarationFunction= true;
  }

  @Override public void exitDeclaracionfuncion(programaParser.DeclaracionfuncionContext ctx) {
    isDeclarationFunction= false;
    
    System.out.println(funcionesDeclaradas);
  }

  @Override public void enterTypeFunctions(programaParser.TypeFunctionsContext ctx) { 
    tipoFuncion = ctx.getStart().getText();
  }
  
 
}