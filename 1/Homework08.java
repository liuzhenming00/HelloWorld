public class Homework08{
	//编写一个main（）方法
	public static void main(String[] args) {
		Cale c = new Cale(4,0);
		System.out.println("和" + c.sum());
		System.out.println("减" + c.minus());
		System.out.println("乘" + c.mul());
		Double dives = c.div();
		if(dives != null) {
		System.out.println("除" + c.div());
		}
		
	}
}
class Cale{
	double num1;
	double num2;
	public Cale (double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double sum() {
		return num1 + num2;
	}
	public double minus() {
		return num1 - num2;
	}
	public double mul() {
		return num1 * num2;
	}
	public Double div() {
		if(num2 == 0) {
			System.out.println("num2不能为0");
			return null;
		}else {
		return num1 / num2;
		}
	}
		
}