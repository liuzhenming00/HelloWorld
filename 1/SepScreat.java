import java.util.Scanner;
public class SepScreat{
	//编写一个main（）方法
	public static void main(String[] args) {
		String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner scanner = new Scanner(System.in);
		int index = -1;
		System.out.println("请输入昵称：");
		String ning = scanner.next();
		
		for (int i = 0; i < names.length; i++) {
		
			if(ning.equals(names[i])) {
				System.out.println("已经找到");
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("抱歉没有找到");
		}

	}
	}