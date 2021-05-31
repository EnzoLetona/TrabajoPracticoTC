package trabajopractico;


//import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

public class MiListener extends programaBaseListener{
  public String tipoVariable;
  public boolean isDeclaration = false;
  public MiId miid = new MiId(); 
  public List<String> lista = new ArrayList<String>();
  public int contador;

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
    System.out.println(ctx.getStart().getTokenIndex());
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
    if(tipoVariable.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariable.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);

    //idLocal.Token = ctx.getStart().getText();
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(true);
  
    TablaSimbolos.getInstance().addId(idLocal); 
  }

  @Override public void enterDeclararSinDef(programaParser.DeclararSinDefContext ctx) { 

    MiId idLocal = new MiId();
    if(tipoVariable.equals("int")) idLocal.setTipoDato(TipoDato.INT); 
    if(tipoVariable.equals("double")) idLocal.setTipoDato(TipoDato.DOUBLE);

    //idLocal.Token = ctx.getStart().getText();
    idLocal.setToken( ctx.getStart().getText());
    idLocal.setInicializada(false);
  
    TablaSimbolos.getInstance().addId(idLocal); 
  }
  


  @Override public void exitPrograma(programaParser.ProgramaContext ctx) {
    TablaSimbolos.getInstance().getTabla();
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
  }

  @Override public void enterBloque(programaParser.BloqueContext ctx) { 
    TablaSimbolos.getInstance().addContexto();
  }
  


}