import java.util.Scanner;

public class Break02{
	//编写main（）方法
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			sum +=i;
			if(sum > 20) {
				
				System.out.println(i);
				break;
			}
			
			
		}
		Scanner myScanner =new Scanner(System.in);
		int count = 3;
		
		for (int j =3; j >0; j--) {
			System.out.println("请输入账户");
			String zhanghu = myScanner.next();
			System.out.println("请输入密码：");
			int passward = myScanner.nextInt();
			count--;
			
			if( "丁真".equals(zhanghu  ) && passward == 6666) {
				System.out.println("登陆成功");
				break;
			}
			else {
				System.out.println("你输入的账户或密码有误，还有" + count + "次机会");
			}
			
		}
	}
}