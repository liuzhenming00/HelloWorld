
public class Home02{
	//编写main（）方法
	public static void main(String[] args) {
		int count = 0;
		
			for(int i = 1; i <= 100; i++) {
				if(i % 5 != 0) {
					System.out.print(i + "\t");
					
					count++;
				
				if(count % 5 == 0) {
					System.out.println();
				}
				}
			}
			for(char c1 = 'a'; c1 <= 'z'; c1++) {
				System.out.print(c1);
			}
			System.out.println("==========");
			for(char c1 = 'Z'; c1 >= 'A'; c1--) {
				System.out.print(c1);
			}
	}
}