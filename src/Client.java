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
