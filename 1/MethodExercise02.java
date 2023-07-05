public class MethodExercise02{
	//编写一个main（）方法
	public static void main(String[] args) {
		Peson p1 = new Peson();
		p1.name = "mila";
		p1.age = 23;
		MyTool myTool = new MyTool();
		Peson p2 = myTool.copyPeson(p1);
		System.out.println(p1.age + p1.name + p2.age + p2.name);
		System.out.println(p1 == p2);
	}
}
class Peson{
	String name;
	int age;
}
class MyTool{
	public Peson copyPeson(Peson p1) {
		Peson p2 = new Peson();
		p2.name = p1.name;
		p2.age = p1.age;
		return p2;
	}
}