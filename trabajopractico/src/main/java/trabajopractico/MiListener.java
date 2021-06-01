package trabajopractico;


//import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

public class MiListener extends programaBaseListener{
  public String tipoVariable;
  public boolean isDeclaration = false;
  public MiId miid = new MiId(); 
  public List<String> lista = new ArrayList<String>();
  public int indexContextoActual = 1;
  public boolean error = false;
  public boolean isOperacionAritmeticaLogica = false;
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
   MiId idLocal = new MiId();
   MiId idLocalAux = new MiId();
   Boolean encontrado=false;
   idLocal.setToken(ctx.getStart().getText());
   //System.out.println("token encontrado " + TablaSimbolos.getInstance().buscarIdLocal(idLocal,indexContextoActual));
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

    //idLocal.Token = ctx.getStart().getText();
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
  }

  @Override public void enterBloque(programaParser.BloqueContext ctx) { 
    TablaSimbolos.getInstance().addContexto();
    indexContextoActual += 1; 
  }
  @Override public void exitBloque(programaParser.BloqueContext ctx) { 
    indexContextoActual -= 1; 
  }
 
  @Override public void enterOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx) { 
    isOperacionAritmeticaLogica = true;
  }

  @Override public void exitOperacionesaritlogicas(programaParser.OperacionesaritlogicasContext ctx) { 
    isOperacionAritmeticaLogica = false;
  }


  


}