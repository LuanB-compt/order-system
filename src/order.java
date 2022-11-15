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
