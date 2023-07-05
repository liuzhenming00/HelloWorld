public class Store2{
	int inventrycount;
	String productType;
	double inventryPrice;
	public Store2(int count,String product,double price) {
	inventrycount = count;
	productType = product;
	inventryPrice = price;
	}
	public static void main(String[] args) {
		Store2 cookies = new Store2(12,"cookie",12.5);
		System.out.println(cookies.inventrycount);
	}
}