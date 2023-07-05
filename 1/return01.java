public class return01{
	//编写main（）方法
	public static void main(String[] args) {
		for( int i = 1; i <= 5; i ++) {
			if( i == 3) {
			System.out.println("韩顺平教育");
			continue;//当return用在方法时，表示跳出方法，如果用在main，表示退出程序
		}
			System.out.println("Hello World");
		}
		System.out.println("go  on.....");
		
	}
	
	
}