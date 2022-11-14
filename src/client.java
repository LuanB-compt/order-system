public class client{
  /*DECLARING THE ATTRIBUTES*/
  private String name;
  private String email;
  private boolean company;
  private String doc;



  /*CONSTRUCTOR METHOD*/
  public client(String name, String email, boolean company, String doc){
    this.name = name;
    this.email = email;
    this.company = company;
    this.doc = doc;
  }
  public client(){
    this.name = "";
    this.email = "";
    this.company = false;
    this.doc = "";
  }

  

  /*GETTERS*/
  public String get_name(){
    return this.name;
  }
  public String get_email(){
    return this.email;
  }
  public boolean get_company(){
    return this.company;
  }
  public String get_doc(){
    return this.doc;
  }
  
  /*SETTERS*/
  public void set_name(String name){
    this.name = name;
  }
  public void set_email(String email){
    this.email = email;
  }
  public void set_company(boolean company){
    this.company = company;
  }
  public void set_doc(String doc){
    this.doc = doc;
  }

  
}
