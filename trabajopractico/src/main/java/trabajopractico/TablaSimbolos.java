package trabajopractico;

import java.util.*;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;
  
  private List<HashMap<String,MiId>> contextos;
 
  public boolean buscarId ( MiId id ){
    for(int i = 0; i < contextos.size() ; i++ ){
       if (contextos.get(i).containsKey(id.getToken())) return true; 
    }
    return false ;
  }
  public boolean buscarIdLocal ( MiId id ){
      
    return contextos.get(contextos.size() - 1).containsKey(id.getToken());
  };


  public void addContexto (){
    contextos.add(new HashMap<String,MiId>());
  };

  public void addId (MiId id) {
    System.out.println(buscarIdLocal(id));
    if (buscarIdLocal(id)){
      System.out.println("El token: "+ id.getToken() + " ya se encuentra declarado, (redeclaration error!)" );
    }
    else {
      //System.out.println("insertando "+ id.Token+ " " + id.Inicializada + id.tipoDato); 
      System.out.println("entro al else");
      contextos.get(contextos.size() - 1).put(id.getToken(), id);
      
    }
   
  }
  public void getTabla() {
    for (int i = 0 ; i <contextos.size() ; i++){
      List<MiId> idLista = new ArrayList<MiId>(contextos.get(i).values());
      System.out.println("CONTEXTO " + i);
      for(int j = 0 ; j < idLista.size(); j++){
        System.out.println(" TOKEN:" + idLista.get(j).getToken() + " Inicializada: " + idLista.get(j).getInicializada() + " Tipo: " + idLista.get(j).getTipoDato());
      }
    }
  }
  private TablaSimbolos(){
    contextos = new ArrayList<HashMap<String,MiId>>();
  }

  public static TablaSimbolos getInstance()
  {
      if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

      return tabla_instance;
  }
}
