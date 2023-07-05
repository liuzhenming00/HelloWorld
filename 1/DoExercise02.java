import java.util.Scanner;
public class DoExercise02{
	//编写一个main（）方法
	public static void main(String[] args) {
		char answer;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("五连鞭");
			System.out.println("还不还钱   y/n");
			 answer = scanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
			
		}while(answer != 'y');
	
	}
}