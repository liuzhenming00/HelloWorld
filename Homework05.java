import java.util.Scanner;
public class Homework05{
	//编写一个main（）方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入价格:");
		double price = myScanner.nextDouble();
		Book book = new Book();
		double res = book.dateprice(price);
		if(res != 0) {
		System.out.println(res);
		}
		else {
			System.out.println("输入有误");
		}
		}
	}
class Book{
	public double dateprice(double price) {
		if(price >= 150) {
			return 150;
		}else if(price > 100 && price < 150) {
			return 100;
		}
			else {
				return 0;
			}
		
	}
}