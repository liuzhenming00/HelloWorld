public class Object01{
	public static void main(String[] args) {
		//创建第一只猫赋值给cat1
		//cat1就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 4;
		cat1.color = "红色";
		cat1.weight = 34;
		//创建第二只猫
		//赋值给cat2
		Cat cat2 = new Cat();
		cat2.name = "小黑";
		cat2.age = 34;
		cat2.color = "紫色";
		cat2.weight = 33;
		System.out.println("第一只猫的姓名为" + cat1.name + "年龄" + cat1.age + "颜色" + 
		cat1.color + "体重" + cat1.weight +"\n" + "第二只猫的姓名为" + cat2.name + 
		"年龄" + cat2.age + "颜色" + cat2.color + "体重" + cat2.weight);
	}
}
class Cat{
	//属性
	String name;//名字
	int age;//年龄
	String color;//颜色
	double weight;//体重
}