package trabajopractico;


enum TipoDato {
  VOID, 
  INT,
  DOUBLE,
  UNDEFINED
}


public class MiId {
  private String Token;

 

  private Boolean Inicializada;
  private TipoDato tipoDato;
  private Boolean Usada;

  



  public MiId(){ 
     this.Token = "";
     this.tipoDato= TipoDato.UNDEFINED ;
     this.Usada= false;
     this.Inicializada=false;
  }
  
  public String getToken() {
    return this.Token;
  }

  public void setToken(String Token) {
    this.Token = Token;
  }

  public Boolean getInicializada() {
    return this.Inicializada;
  }

  public void setInicializada(Boolean Inicializada) {
    this.Inicializada = Inicializada;
  }

 
  public TipoDato getTipoDato() {
    return this.tipoDato;
  }

  public void setTipoDato(TipoDato tipoDato) {
    this.tipoDato = tipoDato;
  } 
  
  public Boolean getUsada() {
    return this.Usada;
  }

  public void setUsada(Boolean Usada) {
    this.Usada = Usada;
  }  
  public void clearId(){ 
     this.Token = "";
     this.tipoDato= TipoDato.UNDEFINED ;
     this.Usada= false;
     this.Inicializada=false;
  }
}
