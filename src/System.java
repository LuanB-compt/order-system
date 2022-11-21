/*IMPORT LIBRARYS*/
import java.util.*;

  

/*MAIN FUNCTION*/
public class System{
  public static void main(String[] args) throws Exception {
    Scanner enter = new Scanner(System.in);
    Scanner enterStr = new Scanner(System.in);
    int informationClient, op=0, n;
    String name, email, number, description;
    Double price;
    char opInternal;
    ArrayList <Person> privatePerson = new ArrayList<Person>();
    ArrayList <Company> legalOrganization = new ArrayList<Company>();
    ArrayList <Provider> provider = new ArrayList<Provider>();
    ArrayList <Product> product = new ArrayList<Product>();

    //teste
    provider.add(new Provider("15456461", "Empresa"));

    //Menu

    do{
      System.out.println("-------Menu-------");
      System.out.println("[1] - Cadastro de Clientes" );
      System.out.println("[2] - Cadastro de Fornecedores" );
      System.out.println("[3] - Cadastro de Produtos" );
      System.out.println("[4] - Efetuação de um pedido" );
      System.out.println("[5] - Baixa de pagamento de um pedido" );
      System.out.println("[6] - Relatórios" );
      System.out.println("[7] - Sair" );
      op = enter.nextInt();


      switch (op){
        case 1: //Client Registration
                System.out.println("-----Cadastro de Clientes----");
                System.out.print("Digite 1 para Pessoa Física ou 2 para Pessoa Jurídica: ");
                n=enter.nextInt();
            
                
                System.out.print("Nome: ");
                name=enterStr.nextLine();
                System.out.print("Email: ");
                email=enterStr.nextLine();

                if(n==1){
                    System.out.print("CPF: ");
                    number=enterStr.nextLine();
                    System.out.print("Quantidade máxima de parcelamento do pedido: ");
                    informationClient=enter.nextInt();
                    privatePerson.add(new Person(name, email, number, informationClient));
                }
                else if(n==2){
                    System.out.print("CNPJ: ");
                    number=enterStr.nextLine();
                    System.out.print("Prazo máximo para faturamento do pedido: ");
                    informationClient=enter.nextInt();
                    legalOrganization.add(new Company(name, email, number, informationClient));
                }
                break;

        case 2:  //Provider Registration
                System.out.println("-----Cadastro de Fornecedores----");
                System.out.print("Nome: ");
                name=enterStr.nextLine();
                System.out.print("CNPJ: ");
                number=enterStr.nextLine();
                provider.add(new Provider(number, name));
                break;

        case 3:  //Products Registration
                System.out.println("-----Cadastro de Produtos----");
                System.out.print("Nome: ");
                name=enterStr.nextLine();
                System.out.print("Descrição: ");
                description=enterStr.nextLine();
                System.out.print("Preço: ");
                price=enter.nextDouble();
                System.out.print("Deseja ver os fornecedores cadastrados (S/N): ");
                opInternal = enterStr.nextLine().charAt(0);
                if(opInternal!='N'){
                    for(int i=0; i<provider.size(); i++){
                        System.out.print(i + " - ");
                        provider.get(i).print();
                    }
                }
                System.out.print("Número do fornecedor do produto " + name + ": " );
                n=enter.nextInt(); 
                product.add(new Product(name, description, price, provider.get(n)));
                break;
                
    }

    }while(op!=7);

    enterStr.close();
    enter.close();
  }
}
