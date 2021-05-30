package trabajopractico;

import java.util.*;

public class TablaSimbolos {
  private static TablaSimbolos tabla_instance = null;
  
  private List<HashMap<String,MiId>> contextos;
 
  public boolean buscarId ( MiId id ){
    for(int i = 0; i < contextos.size() ; i++ ){
       if (contextos.get(i).containsKey(id.token)) return true; 
    }
    return false ;
  }
  public boolean buscarIdLocal ( MiId id ){
      
    return contextos.get(contextos.size() - 1).containsKey(id.token);
  };


  public void addContexto (){
    contextos.add(new HashMap<String,MiId>());
  };
  public void addId (MiId id) {
    if (buscarIdLocal(id)){
      System.out.println("ya esta");
    }
    else {
      contextos.get(contextos.size() - 1).put(id.token, id); 
    }
   
  }
  public void getTabla() { 
    System.out.println(contextos.get(contextos.size() - 1));
  }
  private TablaSimbolos(){
    contextos = new ArrayList<HashMap<String,MiId>>();
  }
  // static method to create instance of Singleton class
  public static TablaSimbolos getInstance()
  {
      if (tabla_instance == null)
      tabla_instance = new TablaSimbolos();

      return tabla_instance;
  }
}
