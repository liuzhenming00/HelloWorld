public class Homework07{
	//编写一个main（）方法
	public static void main(String[] args) {
		Cricle c = new Cricle(3);
		c.area();
		c.len();
		System.out.println("周长" + c.len());
		System.out.println("面积" + c.area());
	}
}
class Cricle{
	double radius;
	public Cricle (double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	public double len() {
		return Math.PI * radius * 2;
	}
}