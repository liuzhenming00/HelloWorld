public class Store3{
	String productType;
	public Store3(String product) {
		productType = product;
	}
	public void advise() {
		System.out.println("Sell " + productType + "!");
		System.out.println("Come spend some money!");
	}
	public static void main(String[] args) {
		Store3 lemonadestand = new Store3("Lemonade");
		lemonadestand.advise();
		lemonadestand.advise();
		lemonadestand.advise();
		
	}
}