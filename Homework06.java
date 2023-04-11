
public class Homework06{
	//编写一个main（）方法
	public static void main(String[] args) {
		A03 a03 = new A03();
		int[]oldArr = {2,4,35,6,4};
		int[]newArr = a03.copyArr(oldArr);
		System.out.print("返回的 newArr元素情况 \n");
		for (int i = 0;i < newArr.length; i++) {
		System.out.print(newArr[i]);
		}
		}
	}
class A03{
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
		
	}
}