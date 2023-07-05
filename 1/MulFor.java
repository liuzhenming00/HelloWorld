import java.util.Scanner;
public class MulFor{
	//编写一个main（）方法
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b = 3;
		int s = 5;
		int chengji;
		int sum1 = 0;
		double avg1;
		int count = 0;
		for(int i = 1; i <= b; i++) {
			double avg = 0;
			int sum = 0;
			for(int j = 1; j <= s; j++) {
				System.out.println("请输入第" + i + "个班级第" + j + "个的成绩:");
				chengji = scanner.nextInt();
				
				sum += chengji;
				if(chengji > 60) {
					count++;
				}
					
				avg = sum / s;
			
			}
			sum1 += sum;
			System.out.println("第" + i + "个班级的总成绩:" + sum + "平均成绩" + avg);
			
		}
		avg1 = sum1 /b;
		System.out.println( b + "个班级的总成绩:" + sum1 + "平均成绩" + avg1 + 
				"及格人数" + count);
	
	}
}