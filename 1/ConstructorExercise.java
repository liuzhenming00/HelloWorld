public class ConstructorExercise{
	//编写一个main（）方法
	public static void main(String[] args) {
		Personn p = new Personn();
		System.out.println("name=" + p.name + " age="  + p.age);
		Personn p2 = new Personn("jad",24);
		System.out.println("name=" + p2.name + " age="  + p2.age);
	}
}
class Personn{
	String name;
	int age;
	public Personn() {
		age = 18;
		
	}
	public Personn(String Nname, int Aage) {
		name = Nname;
		age = Aage;
	}
}