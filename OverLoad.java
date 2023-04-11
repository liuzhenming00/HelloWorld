public class OverLoad{
	//编写一个main（）方法
	public static void main(String[] args) {
		MyCalculator00 mc = new MyCalculator00();
		
		System.out.println(mc.calr(1, 10.0));
		
	}
}
class MyCalculator00{
	public int calr(int n1, int n2) {
		System.out.println(" calculator(int n1, int n2)被调用");
		return n1 + n2;
	}
	public double calr(int n1, double n2) {
		System.out.println(" calculator(int n1, double n2)被调用");
		return n1 + n2;
	}
	public double calr(double n1, int n2) {
		System.out.println(" calculator(double n1, int n2)被调用");
		return n1 + n2;
	}
	public double calr(double n1, double n2) {
		System.out.println(" calculator(double n1, double n2)被调用");
		return n1 + n2;
	}
}
