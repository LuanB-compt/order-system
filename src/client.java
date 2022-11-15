public class client{
  /*DECLARING THE ATTRIBUTES*/
  private String name;
  private String email;

  /*CONSTRUCTOR METHOD*/
  public client(String name, String email){
    this.name = name;
    this.email = email;
  }
  public client(){
    this.name = "";
    this.email = "";
  }

  /*GETTERS*/
  public String get_name(){
    return this.name;
  }
  public String get_email(){
    return this.email;
  }
  
  /*SETTERS*/
  public void set_name(String name){
    this.name = name;
  }
  public void set_email(String email){
    this.email = email;
  }
}



public class PrivatePerson extends client{
  /*DECLARING THE ATTRIBUTES*/
  private String cpf;

  /*CONSTRUCTOR METHOD*/
  public PrivatePerson(String name, String email, String cpf){
    super(name, email);
    this.cpf = cpf;
  }

  /*GETTERS*/
  public String get_cpf(){
    return this.cpf;
  }

  /*SETTERS*/
  public void set_cpf(String cpf){
    this.cpf = cpf;
  }
}



public class LegalOrganization extends client{
  /*DECLARING THE ATTRIBUTES*/
  private String cnpj;

  /*CONSTRUCTOR METHOD*/
  public LegalOrganization(String name, String email, String cnpj){
    super(name, email);
    this.cnpj = cnpj;
  }

  /*GETTERS*/
  public String get_cnpj(){
    return this.cnpj;
  }

  /*SETTERS*/
  public void set_cnpj(String cnpj){
    this.cnpj = cnpj;
  }
}
