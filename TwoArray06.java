public class TwoArray06{
	public static void main(String[] args) {
		double sum = 0;
		int arr[] = new int[10];
		int max = arr[0];
		int biao = -1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int) (Math.random() * 100) ;
			
		}
		System.out.print("=======arr的元素情况=======\n");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("=======arr的元素情况倒叙=======\n");
		for (int i = arr.length - 1; i >= 0; i--) {
			
			
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
			biao = i;
		}
		System.out.println( "\n和为 " + sum + "最大值" + max + "最大值对标" + biao + "平均值" + sum/arr.length);
         int findName = 8;
         int index = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == findName) {
				index = i;
				System.out.print( "找到数 " + findName + "下标" + index);
			}
		 	
		}
		
		if (index == -1) {
			System.out.print( "没有找到 ");
		}
		
		
	}
}