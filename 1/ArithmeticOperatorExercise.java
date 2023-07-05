public class ArithmeticOperatorExercise{
	//编写一个main（）方法
	public static void main(String[] args) {
		//加入还有59天，问：合xx星期零xx天
		int days = 59;
		int week = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "天, 合" + week + "星期" + "零" + leftDays + "天");

		double huashi = 234.6;
		double sheshi = 5 / 9 * (huashi - 100);
		System.out.println("华氏温度" + huashi + "\n" + "摄氏温度" + "sheshi");

	}
	}