public class TwoArray05{
	public static void main(String[] args) {
		int arr[] = {10,12,45,90};
		int insertNumb = 23;
		int inDex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (insertNumb <= arr[i]) {
				inDex = i;
				break;
			}
		}
		if( inDex == -1) {
			inDex = arr.length;
		}
		int arr2[] = new int [arr.length + 1];
 		for (int i = 0,j = 0; i <arr2.length; i++ ) {
 			if (i != inDex) {
 				arr2[i] = arr[j];
 				j++;
 			}
 			else {
 				arr2[inDex ] = insertNumb;
 			}
 		}
 		arr = arr2;
 		for (int i = 0,j = 0; i <arr.length; i++ ) {
 			System.out.print(arr[i] + " ");
 		}
	}
}