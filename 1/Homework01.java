public class Homework01{
	//编写一个main（）方法
	public static void main(String[] args) {
		A01 a = new A01();
		int[]arr = null;
		Double res = a.max(arr);
		if(res != null) {
		System.out.println("最大值：" + res);
		}else {
			System.out.println("输入有误" );
		}
	}
}
class A01{
	public Double max(int[]arr) {
		if( arr != null && arr.length > 0   )  {
		double nummax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(nummax < arr[i]) {
				nummax = arr[i];
			}
		}
		return nummax;
		}else {
			return null;
		}
	}
}