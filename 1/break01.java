public class break01{
	//编写main（）方法
	public static void main(String[] args) {
		//测试代码
		label1:
		for( int j = 1; j <= 10; j++) {
			label2:
			for( int i = 1; i <= 4; i++) {
			if(i == 3) {
				break label1 ;
			}
			System.out.println("i=" + i);
			}
			
		}
	}
}