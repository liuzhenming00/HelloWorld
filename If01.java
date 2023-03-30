import java.util.Scanner;
public class If01{
	//编写main（）方法
	public static void main(String[] args) {
		//定义一个Scanner对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到变量age
		int age = scanner.nextInt();
		//使用if - else 语句输入信息
		if(age > 18) {
			System.out.println("释放");
		}
			else {
				System.out.println("送进监狱");
			}
		System.out.println("程序继续。。。。");
		
		
	}
}