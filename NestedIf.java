import java.util.Scanner;
public class NestedIf{
	//编写main（）方法
	public static void main(String[] args) {
		//定义一个Scanner对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = scanner.nextDouble();
		
		if (score > 80) {
			System.out.println("进入决赛");
			System.out.println("请输入性别：");
			char gander = scanner.next().charAt(0);
			if(gander == '男'){
				System.out.println("进入男子组");
				
			}
			else if(gander == '女') {
				System.out.println("进入女子组");
			}
			else {
				System.out.println("性别有误");
			}
		}else {
			System.out.println("成绩不合格");
		}
		
		
		
		
	}
}