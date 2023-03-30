import java.util.Scanner;
public class If03{
	//编写main（）方法
	public static void main(String[] args) {
		//定义一个scanner对象
		//接受用户输入
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分：");
		//把得分保存到变量grade
		int grade = myScanner.nextInt();
		if(grade > 0 && grade <= 100) {
		if(grade == 100) {
			System.out.println("信用极好");
		}
		else if (grade > 80 && grade <= 99) {
			System.out.println("信用良好");
		}
		else if (grade >60 && grade <=80) {
			System.out.println("信用一般");
		}
		else {
			System.out.println("信用不及格");
		}
		}
		else {
			System.out.println("请输入1-100的数");
		}
	}
}