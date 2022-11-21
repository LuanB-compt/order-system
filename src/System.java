/*IMPORT LIBRARYS*/
import java.util.Scanner;
import static java.lang.*;


/*MAIN FUNCTION*/
public class System{
  public static void main(String[] args) throws Exception {
    Scanner enter = new Scanner(System.in);
    int opcao;

    //Menu
    do{
      opcao = main_menu(enter);
      System.out.println(opcao);

    } while(opcao!=7);
    enter.close();
  }

  public static int main_menu(Scanner enter){
    System.out.println("--- Menu ---");
    System.out.println("[1] - Cadastro de Clientes" );
    System.out.println("[2] - Cadastro de Fornecedores" );
    System.out.println("[3] - Cadastro de Produtos" );
    System.out.println("[4] - Efetuação de um pedido" );
    System.out.println("[5] - Baixa de pagamento de um pedido" );
    System.out.println("[6] - Relatórios" );
    System.out.println("[7] - Sair" );
    return enter.nextInt();
  }
}
