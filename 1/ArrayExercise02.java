public class ArrayExercise02{
	//编写一个main（）方法
	public static void main(String[] args) {
		int[] a = {2,-1,9,10,24,26};
		int max = a[0];//假定第一个元素为最大值
		int maxIndex = 0;
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}
		System.out.println("最大值为" + max + "当前元素下标为" + maxIndex);
		
	}
}