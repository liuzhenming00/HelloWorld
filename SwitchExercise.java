import java.util.Scanner;
public class SwitchExercise{
	//编写main（）方法
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = scanner.nextDouble();
		if(score > 1 && score <= 100) {
			switch((int)(score/60)) {
			case 0:
				System.out.println("成绩不合格");
				break;
			case 1:
				System.out.println("成绩合格");
				break;
			}
		}
		else {
			System.out.println("你输入的成绩有误");
		}
	}
}