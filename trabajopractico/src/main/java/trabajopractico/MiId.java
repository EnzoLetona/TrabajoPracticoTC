package trabajopractico;


enum TipoDato {
  VOID, 
  INT,
  DOUBLE
}


public class MiId {
  public MiId(){ 
     this.token = "";
     this.tipoDato= TipoDato.VOID ;
     this.Usada= false;
     this.Inicializada=false;
  }
  public String token;
  public TipoDato tipoDato;
  public Boolean Usada;
  public Boolean Inicializada;
}
