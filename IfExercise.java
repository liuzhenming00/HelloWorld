
public class IfExercise{
	//编写main（）方法
	public static void main(String[] args) {
	double b1 = 34.5;
	double b2 = 2.6;
	if(b1 > 10.0 && b2 < 20.0) {
		System.out.println("b1 + b2的值" + (b1 + b2));
	}
	int num1 = 10;
	int num2 = 5;
	int sum = num1 + num2;
	if(num1 % 3 == 0 && num2 % 5 == 0) {
		System.out.println("和既能被3整除又能被5整除");
	}else {
		System.out.println("和不能被3和5整除");
	}
	int year = 2020;
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		System.out.println(year + "是闰年");
	}
	else {
		System.out.println(year + "不是闰年");
	}
		
	}
}