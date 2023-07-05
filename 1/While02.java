public class While02{
	//编写一个main（）方法
	public static void main(String[] args) {
		int i = 40;//变量初始化
		int endNum = 200;
		while (i <= endNum) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;//循环变量的迭代
		}
	
	}
}