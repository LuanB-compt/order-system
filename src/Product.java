public class Product{
  /*DECLARING ATTRIBUTES*/
  private String product_name;
  private String description;
  private double price;
  private Provider provider;

  /*CONSTRUCTOR METHOD*/
  public Product(String product_name, String description, double price, Provider provider){
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
  public double get_price(){
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
  public void set_price(double price){
    this.price = price;
  }
  public void set_provider(Provider provider){
    this.provider = provider;
  }

  /*OTHER METHODS*/
  public void show_me(){
    System.out.print("** PRODUCT INFO **"); 
    System.out.print("\n - Product name: " + product_name);
    System.out.print("\n - Description: " + description); 
    System.out.print("\n - Price: " + price); 
    System.out.print("\n - Provider: " + provider.get_name()); 
    System.out.print("\n   - Provider CNPJ: " + provider.get_cnpj()); 
  }
}
