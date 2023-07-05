public class TestPerson{
	//编写一个main（）方法
	public static void main(String[] args) {
		Personed p1 = new Personed("gfe", 75 );
		Personed p2 = new Personed("gfe", 75);
		System.out.println(p1.compare(p2));
	}
}
class Personed{
	String name;
	int age;
	//构造器
	public Personed(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compare(Personed p) {
		return this.name.equals (p.name) && this.age == p.age;
	}
}