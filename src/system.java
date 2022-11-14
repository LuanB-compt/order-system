/*IMPORT LIBRARYS*/
import java.util.*;



/*MAIN FUNCTION*/
public class system{
  public static void main(String[] args){
    client[] clientes = new client[3];
    String[] nomes = {"Luan", "Helena", "Gaigue"};
    String[] emails = {"ab", "cd", "ef"};
    boolean[] companys = {false, false, true};
    String[] docs = {"1.2", "3.4", "5.6"};

    for(int i=0; i<clientes.length; i++){
      clientes[i] = new client(nomes[i], emails[i], companys[i], docs[i]);
    }

    for(client i:clientes){
      System.out.println(i.get_name());
    }
  }
}
