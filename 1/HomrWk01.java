import java.util.Scanner;
public class HomrWk01{
	//编写main（）方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = myScanner.nextInt();
		if(i < 0) {
			System.out.println("小于零");
		}
		else if(i > 0) {
			System.out.println("大于零");
		}
		else {
			System.out.println("等于零");
		}
		//判断是否是水仙花数
		int j = 154;
		int q = j / 100;
		int w = j /10 % 10;
		int e = j % 10;
		if(q * q * q + w * w * w + e * e * e == j) {
			System.out.println("是水仙花数");
		}
		else {
			System.out.println("不是");
		}
			
			
	}
}