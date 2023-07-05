public class ArrayReverse{
	//编写一个main（）方法
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};
		int temp = 0;
		for(int i = 0; i < arr.length / 2; i++ ) {
			temp = arr[arr.length - 1 - i];
			 arr[arr.length - 1 - i] = arr[i];
			 arr[i] = temp;
			
		}
		for(int i = 0; i < arr.length ; i++ ) {
		 System.out.print(arr[i] + "\t");
		}
//		//逆序法
//		int[] arr1 = new int[arr.length];
//		for(int i = arr.length - 1 , j = 0; i >= 0; i--,j++ ) {
//			arr1[j] = arr[i];
//		}
//		arr = arr1;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}