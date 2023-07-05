public class ForExercise02{
	//编写一个main（）方法
	public static void main(String[] args) {
		int sum = 0;
	    int n = 5;
		for( int i = 0, j = n; i <= n; i++, j--) {
			sum =i + j;
			System.out.println(i + "+" + j + "=" + sum);
		}
		
	
	}
}