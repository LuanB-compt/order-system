public class Company extends client{
  /*DECLARING THE ATTRIBUTES*/
  private String cnpj;
  private int deadline;

  /*CONSTRUCTOR METHOD*/
  public Company(String name, String email, String cnpj, int deadline){
    super(name, email);
    this.cnpj = cnpj;
    this.deadline = deadline;
  }

  /*GETTERS*/
  public String get_cnpj(){
    return cnpj;
  }
  public int get_deadline(){
    return deadline;
  }

  /*SETTERS*/
  public void set_cnpj(String cnpj){
    this.cnpj = cnpj;
  }
  public void set_deadline(int deadline){
    this.deadline = deadline;
  }
}
