public class OverLoadExercise{
	//编写一个main（）方法
	public static void main(String[] args) {
		Methods me = new Methods();
		me.m(3);
		me.m(2, 3);
		me.m("jak");
		System.out.println(me.max(3.2, 45, 3.5));
		System.out.println(me.max(3, 2));
		System.out.println(me.max(3.2,  3.5));
	}
}
class Methods{
	public void m(int n) {
		System.out.println("平方=" + n * n);
	}
	public void m(int n,int b) {
		System.out.println("相乘=" + n * b);
	}
	public void m(String name) {
		System.out.println("姓名" + name);
	}
	public int max(int n1,int n2) {
		return n1 > n2? n1 : n2;
	}
	public double max(double n1,double n2) {
		return n1 > n2? n1 : n2;
	}
	public double max(double n1,double n2,double n3) {
		return (n1 > n2? n1 : n2) > n3? (n1 > n2? n1 : n2):n3;
	}
}