public class DoExercise{
	//编写一个main（）方法
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			
			System.out.println(sum += i);
			i++;
		}while(i <= 100);
		int j = 1;
		int count = 0;
		do {
			if(j % 5 == 0 && j % 3 !=0) {
				count++;
			}
			j++;
		}while(j <= 200);
		System.out.println("个数为" + count);
	}
}