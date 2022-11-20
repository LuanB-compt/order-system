public class Person extends client{
  /*DECLARING THE ATTRIBUTES*/
  private String cpf;
  private int storageAmount;

  /*CONSTRUCTOR METHOD*/
  public Person(String name, String email, String cpf, int storageAmount){
    super(name, email);
    this.cpf = cpf;
    this.storageAmount = storageAmount;
  }

  /*GETTERS*/
  public String get_cpf(){
    return cpf;
  }
  public int get_storageAmount(){
    return storageAmount;
  }

  /*SETTERS*/
  public void set_cpf(String cpf){
    this.cpf = cpf;
  }
  public void set_storageAmount(int storageAmount){
    this.storageAmount = storageAmount;
  }
}
