/*IMPORT LIBRARYS*/
import java.util.*;

  

/*MAIN FUNCTION*/
public class system{
  public static void main(String[] args){
    int chosenMenu;
    int subMenu;

    Scanner in = new Scanner(System.in);

    do{


    }while (chosenMenu != 7);


  }

  //Main menu method
  public static int chosenMenu(){
    Scanner in = new Scanner(System.in);
    int option;

    System.out.println("....::: Sistema de Pedidos :::....");
    System.err.println("[1] - Cadastros de Clientes");
    System.err.println("[2] - Cadastro de Fornecedores");
    System.err.println("[3] - Cadastro de Produtos");
    System.err.println("[4] - Efetuação de um pedido");
    System.err.println("[5] - Baixa de pagamento de um pedido");
    System.err.println("[6] - Relatórios");
    System.err.println("[7] - Sair (termina o sistema)");

    do{
      System.out.println("Escolha umas das opções: ");
      option = in.nextInt();
    } while (option < 1 || option > 6);

    return option;
  }

  //Submenu of "Relatórios"
  public static int subMenu(){
    Scanner in = new Scanner(System.in);
    int option;

    System.out.println("Sub-menu da opção - [6] - Relatórios");
    System.out.println("[6.1] - Listagem de todos os Clientes");
    System.out.println("[6.2] - Listagem de todos os Fornecedores");
    System.out.println("[6.3] - Listagem de todos os Produtos");
    System.out.println("[6.4] - Listagem de todos os Pedidos");
    System.out.println("[6.5] - Listagem de todos os pedidos feitos em um determinado intervalo de datas");
    System.out.println("[6.6] - Busca de um pedido pelo número");
    System.out.println("[6.7] - Listagem de todos os pedidos pagos");
    System.out.println("[6.8] - Busca de um produto pelo nome deste");
    System.out.println("[6.9] - Cálculo do total dos pedidos em aberto (não pagos)");

  }
}
