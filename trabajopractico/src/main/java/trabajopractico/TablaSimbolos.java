package trabajopractico;

import java.util.*;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;
  
  private List<HashMap<String,MiId>> contextosLogicos;
  private List<HashMap<String,MiId>> contextosFisicos;

  public void addContextoFisico(){ 
    contextosFisicos.add(new HashMap<String,MiId>());
  }

  public void showContextoFisico(){ 
    System.out.println(contextosFisicos);
  }
  
  public void addIdContextoFisico(MiId id,int indexContexto){ 
    contextosLogicos.get(indexContexto-1).put(id.getToken(), id);
  }

  public boolean buscarId ( MiId id ){
    for(int i = 0; i < contextosLogicos.size() ; i++ ){
       if (contextosLogicos.get(i).containsKey(id.getToken())) return true; 
    }
    return false ;
  }
  public boolean buscarIdLocal ( MiId id, int indexContexto ){
      
    return contextosLogicos.get(indexContexto - 1).containsKey(id.getToken());
  };

  public MiId obtenerId (int indexContexto, String token) {
    return contextosLogicos.get(indexContexto - 1).get(token);
  }

  public void modificarIdUsado(MiId id, int indexContexto ){
    contextosLogicos.get(indexContexto - 1).get(id.getToken()).setUsada(true);
  }
  public void addContexto (){
    contextosLogicos.add(new HashMap<String,MiId>());
  };

  public void removeLastContexto(){
    int tam = contextosLogicos.size() -1;
    contextosLogicos.remove(tam);
  }

  public boolean addId (MiId id, int indexContexto) {
    if (buscarIdLocal(id,indexContexto)){
      System.out.println("El token: "+ id.getToken() + " ya se encuentra declarado, (redeclaration error!)" );
      return false;
    }
    else {
      contextosLogicos.get(indexContexto-1).put(id.getToken(), id);
      return true;
    }
   
  }
  public void getTabla() {
    for (int i = 0 ; i <contextosLogicos.size() ; i++){
      List<MiId> idLista = new ArrayList<MiId>(contextosLogicos.get(i).values());
      System.out.println("CONTEXTO " + i);
      for(int j = 0 ; j < idLista.size(); j++){
        System.out.println(" TOKEN:" + idLista.get(j).getToken() + " Inicializada: " + idLista.get(j).getInicializada() + " Tipo: " + idLista.get(j).getTipoDato() + " Usada: " + idLista.get(j).getUsada()+ " Funcion: " +idLista.get(j).getFuncion());
      }
    }
  }
  private TablaSimbolos(){
    contextosLogicos = new ArrayList<HashMap<String,MiId>>();
    contextosFisicos = new ArrayList <HashMap<String,MiId>>();
  }

  public static TablaSimbolos getInstance()
  {
      if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

      return tabla_instance;
  }
}
