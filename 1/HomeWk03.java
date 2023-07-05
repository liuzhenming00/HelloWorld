public class HomeWk03{
	//编写main（）方法
	public static void main(String[] args) {
		double z = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				z =-1;
			}
			else {
				z = 1;
			}
			sum += (z / i);
			
		}
		System.out.print(sum);
		
	}
}