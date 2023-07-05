public class Store4 {
  // instance fields
  String productType;
  
  // constructor method
  public Store4(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store4 cookieShop = new Store4(cookie);
    
    cookieShop.advertise();
    
  }
}