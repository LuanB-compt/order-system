public class product{
  /*DECLARING ATTRIBUTES*/
  private String product_name;
  private String description;
  private float price;
  private provider provider;

  /*CONSTRUCTOR METHOD*/
  public product(String product_name, String description, float price, Provider provider){
    this.product_name = product_name;
    this.description = description;
    this.price = price;
    this.provider = provider;
  }

  /*GETTERS*/
  public String get_product_name(){
    return product_name;
  }
  public String get_description(){
    return description;
  }
  public float get_price(){
    return price;
  }
  public Provider get_provider(){
    return provider;
  }
  
  /*SETTERS*/
  public void set_product_name(String product_name){
    this.product_name = product_name;
  }
  public void set_description(String description){
    this.description = description;
  }
  public void set_price(float price){
    this.price = price;
  }
  public void set_provider(Provider provider){
    this.provider = provider;
  }
}
