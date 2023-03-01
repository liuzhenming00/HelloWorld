//演示转义字符的使用
public class ChangeChar{
	//编写一个main()方法
	public static void main(String[] args) {
		// \t :一个制表符，实现对齐功能
		System.out.println("北京\t上海\t天津\t重庆");
		// \n :换行符
		System.out.println("临沂\n济南\n青岛");
		// \\ :一个\
		System.out.println("山东\\山西\\江苏");
		// \" :一个"
		System.out.println("老师说：\"好好学\"");
		// \' :一个'
		System.out.println("老师说：\'好好学习\'");
		// \r :一个回车
		System.out.println("韩顺平教育\r北京");
	}
}