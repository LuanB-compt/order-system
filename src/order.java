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



public class order{
  /*DECLARING ATTRIBUTES*/
  private Product item;
  private int item_amount;
  private float total_price;
  private int id;
  private String date;

  /*CONSTRUCTOR METHOD*/
  public order(Product item, int item_amount, float total_price, int id, String date){
    this.item = item;
    this.item_amount = item_amount;
    this.total_price = total_price;
    this.id = id;
    this.date = date;
  }
}
