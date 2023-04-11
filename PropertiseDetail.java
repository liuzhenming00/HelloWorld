public class PropertiseDetail{
	//编写一个main（）方法
	public static void main(String[] args) {
	//创建一个Person对象
	//p1是对象名
	//new Person（）是创建对象的数据空间
		Perso p1 = new Perso();
		//对象的属性默认值，遵守数组原则
		System.out.println("输出这个人的信息");
		System.out.println("age = " + p1.agel + " name =" + p1.name + " sal = " + p1.sal
			+ " isPass=" + p1.isPass	);
	}
}
class Perso{
	//四个属性
	int agel;
	String name;
	double sal;
	boolean isPass;
}