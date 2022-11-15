public class Client{
  /*DECLARING THE ATTRIBUTES*/
  private String name;
  private String email;

  /*CONSTRUCTOR METHOD*/
  public Client(String name, String email){
    this.name = name;
    this.email = email;
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



public class PrivatePerson extends Client{
  /*DECLARING THE ATTRIBUTES*/
  private String cpf;

  /*CONSTRUCTOR METHOD*/
  public PrivatePerson(String name, String email, String cpf){
    super(name, email);
    this.cpf = cpf;
  }

  /*GETTERS*/
  public String get_cpf(){
    return cpf;
  }

  /*SETTERS*/
  public void set_cpf(String cpf){
    this.cpf = cpf;
  }
}



public class LegalOrganization extends Client{
  /*DECLARING THE ATTRIBUTES*/
  private String cnpj;

  /*CONSTRUCTOR METHOD*/
  public LegalOrganization(String name, String email, String cnpj){
    super(name, email);
    this.cnpj = cnpj;
  }

  /*GETTERS*/
  public String get_cnpj(){
    return cnpj;
  }

  /*SETTERS*/
  public void set_cnpj(String cnpj){
    this.cnpj = cnpj;
  }
}
