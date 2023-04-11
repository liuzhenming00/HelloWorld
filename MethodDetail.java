public class MethodDetail{
	public static void main(String[] args) {
		Myoo myool = new Myoo();
		int Arr1[] = myool.getSumAndSub(5, 2);
		
		System.out.println("和为" + Arr1[0]);
		System.out.println("差为" + Arr1[1]);
		}
}
class Myoo{;
	public int[] getSumAndSub(int num1,int num2){
		int[]Arr = new int[2];
		Arr[0] = num1 - num2;
		Arr[1] = num1 + num2;
		return Arr;
	}
	
	
}