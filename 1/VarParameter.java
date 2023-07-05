public class VarParameter{
	//编写一个main（）方法
	public static void main(String[] args) {
		HspMethod hsp = new HspMethod();
		System.out.println(hsp.sum(1,3,4,2,5));
		System.out.println(hsp.sum(1,2,5));
	}
}
class HspMethod {
	public int sum (int...ns) {
		System.out.println("接收参数的个数" + ns.length);
		int res = 0;
		for(int i = 0; i < ns.length; i++) {
			res += ns[i];
		}
		return res;
	}
	//可变参数必须在最后
	//可变参数实参可以是数组
	public void f1(int i, double...js) {
		
	}
}