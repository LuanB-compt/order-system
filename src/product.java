public class Product{
  /*DECLARING ATTRIBUTES*/
  private String product_name;
  private String description;
  private float price;
  private Provider provider;

  /*CONSTRUCTOR METHOD*/
  public Product(String product_name, String description, float price, Provider provider){
    this.product_name = product_name;
    this.description = description;
    this.price = price;
    this.provider = provider;
  }
}
