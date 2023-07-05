public class RecursionExercise01{
	//编写一个main（）方法
	public static void main(String[] args) {
		TT tt = new TT();
		int res = tt.fibonaqi(-1);
		if(res >= 0) {
		System.out.println(res);
		}
		int sum = tt.peach(1);
		if (sum != -1) {
			System.out.println(sum);
		}
		
		
	}
}
class TT{
	public int fibonaqi (int n) {
		if(n >= 1) {
		if(n == 1 || n == 2){
			return 1;
		}
		else {
			return fibonaqi(n - 1) + fibonaqi(n - 2);
		}	
		}
		else {
			System.out.println("输入有误");
			return -1;
		}
	}
	public int peach(int day) {
		if (day == 10) {
			return 1;
		}
		else if(day < 10 && day >= 1){
			return (peach(day + 1) + 1) * 2;
		}
		else {
			System.out.println("输入1-9");
			return -1;
		}
	}
	
}