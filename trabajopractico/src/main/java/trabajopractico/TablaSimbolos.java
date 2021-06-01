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
  public boolean buscarIdLocal ( MiId id, int indexContexto ){
      
    return contextos.get(indexContexto - 1).containsKey(id.getToken());
  };

  public MiId obtenerId (int indexContexto, String token) {
    return contextos.get(indexContexto - 1).get(token);
  }

  public void modificarIdUsado(MiId id, int indexContexto ){
    contextos.get(indexContexto - 1).get(id.getToken()).setUsada(true);
  }
  public void addContexto (){
    contextos.add(new HashMap<String,MiId>());
  };

  public boolean addId (MiId id, int indexContexto) {
    //System.out.println(buscarIdLocal(id));
    if (buscarIdLocal(id,indexContexto)){
      System.out.println("El token: "+ id.getToken() + " ya se encuentra declarado, (redeclaration error!)" );
      return false;
    }
    else {
      //System.out.println("insertando "+ id.Token+ " " + id.Inicializada + id.tipoDato); 
      contextos.get(indexContexto-1).put(id.getToken(), id);
      return true;
    }
   
  }
  public void getTabla() {
    for (int i = 0 ; i <contextos.size() ; i++){
      List<MiId> idLista = new ArrayList<MiId>(contextos.get(i).values());
      System.out.println("CONTEXTO " + i);
      for(int j = 0 ; j < idLista.size(); j++){
        System.out.println(" TOKEN:" + idLista.get(j).getToken() + " Inicializada: " + idLista.get(j).getInicializada() + " Tipo: " + idLista.get(j).getTipoDato() + " Usada: " + idLista.get(j).getUsada());
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
