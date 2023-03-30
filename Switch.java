import java.util.Scanner;
public class Switch{
	//编写main（）方法
	public static void main(String[] args) {
		//定义Scanner对象
	    Scanner myScanner = new Scanner(System.in);
	    System.out.println("请输入字符：");
	    char c1 = myScanner.next().charAt(0);
	    switch (c1) {
	    case 'a' :
	    	 System.out.println("今天星期一");
	    	 break;
	    case 'b' :
	    	 System.out.println("今天星期二");
	    	 break;
	    case 'c' :
	    	 System.out.println("今天星期三");
	    	 break;
	    
	    default:

	    	 System.out.println("输入字符有误");
	    }
	}
}