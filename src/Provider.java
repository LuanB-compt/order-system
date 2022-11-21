public class Provider{
  /*DECLARING ATTRIBUTES*/
  private String cnpj
  private String name;

  /*CONSTRUCTOR METHOD*/
  public provider(String cnpj, String name){
    this.cnpj = cnpj;
    this.name = name;
  }

  /*GETTERS*/
  public String get_cnpj(){
    return cnpj;
  }
  public String get_name(){
    return name;
  }
  
  /*SETTERS*/
  public void set_cnpj(String cnpj){
    this.cnpj = cnpj;
  }
  public void set_name(String name){
    this.name = name;
  }

  /*OTHER METHODS*/
  public void show_me(){
    System.out.print("** PROVIDER INFO **");
    System.out.print("\n - Name: " + name); 
    System.out.print("\n - CNPJ: " + cnpj);
  }
}
