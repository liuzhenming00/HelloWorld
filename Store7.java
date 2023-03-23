public class Store7 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store7(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double  getPriceWithTax(double total){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    System.out.println("值为 " + totalPrice);
    return totalPrice;
    
  }

  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";

  }

  // main method
  public static void main(String[] args) {
    Store7 lemonadeStand = new Store7("Lemonade", 3.75);
    Store7 cookieShop = new Store7("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
    lemonadeStand.getPriceWithTax(5);
    
    

  }

}
