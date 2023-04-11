public class ArrayCopy{
	//编写一个main（）方法
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		
		}
		arr2[0] = 40;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
	
	}
}