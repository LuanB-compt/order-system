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

  /*GETTERS*/
  public Product get_item(){
    return item;
  }
  public int get_item_amount(){
    return item_amount;
  }
  public float get_total_price(){
    return total_price;
  }
  public int get_id(){
    return id;
  }
  public String get_date(){
    return date;
  }
  
  /*SETTERS*/
  public void set_item(Product item){
    this.item = item;
  }
  public void set_item_amount(int item_amount){
    this.item_amount = item_amount;
  }
  public void set_total_price(float total_price){
    this.total_price = total_price;
  }
  public void set_id(int id){
    this.id = id;
  }
  public void set_date(String date){
    this.date = date;
  }

  /*OTHER METHODS*/
}
