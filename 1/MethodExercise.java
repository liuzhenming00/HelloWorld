public class MethodExercise{
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isodd(1)) {
			System.out.println("是奇数");
		}
		else {
			System.out.println("是偶数");
		}
		a.print(4, 4, '#');
		int c = 10;
		int b = 20;
		a.swap(c,b);
		System.out.println("main的值" + "c=" + c + "b=" + b);
}
}
class AA{
	public boolean isodd(int num) {
		return num % 2 !=0;
	}
	public void print(int row, int col, char c) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public void swap(int c,int b) {
		System.out.print("交换前的值" + "c=" + c + "b=" + b);
		int temp = c;
		c = b;
		b = temp;
		System.out.print("交换后的值" + "c=" + c + "b=" + b);
	}
}