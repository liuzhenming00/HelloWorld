/**
 * 演示算术运算符的使用
 *
 */
public class ArithmeticOperator{
	//编写一个main（）方法
	public static void main(String[] args) {
		System.out.println(10.0 / 4);
		System.out.println(10 / 4);
		double d = 10 / 4;
		System.out.println(d);
		//%的本质 是a%b = a - a / b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		//++的使用
		//
		int i = 10;
		i++;
		++i;
		System.out.println("i=" +i);
		int j = 8;
		 j = ++j;
		System.out.println( "j=" + j);
		

	}
	}