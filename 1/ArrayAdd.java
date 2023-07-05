import java.util.Scanner;
public class ArrayAdd{
	//编写一个main（）方法
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = {1,2,3,};
		do {
		int[] arr2 = new int[arr1.length + 1];
		for(int i =0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("请输入要添加的元素");
		int addNum = scanner.nextInt();
		arr2[arr2.length - 1] = addNum;
		arr1 = arr2;
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.println("是否继续添加元素？ y/n");
		char t = scanner.next().charAt(0);
		if(t == 'n') {
			break;
		}
		}while(true);
		
	
	}
}