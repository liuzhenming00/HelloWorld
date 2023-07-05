import java.util.Scanner;
public class Input{
	//编写一个main（）方法
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//用户输入了
		System.out.println("请输入姓名：");
		String name = scanner.next();
		System.out.println("请输入年龄：");
		int age = scanner.nextInt();
		System.out.println("请输入薪水：");
		double sal = scanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("姓名" + name    + "  年龄" +age +    "  薪水" +sal);
		
		
	}
	
}