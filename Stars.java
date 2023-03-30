
public class Stars{
	//编写一个main（）方法
	public static void main(String[] args) {
		
		int w = 5;
		for(int i = 1; i <= w; i++) {
			for(int t = 1; t <= w-i; t++) {
				
				System.out.print(" ");
			}
			
			
			for(int j = 1; j <= 2*i-1; j++) {
				if( j== 1 || j == 2*i-1 || i == w) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			}
	
	}
}