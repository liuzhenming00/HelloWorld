public class LogicOperator01{
	//编写一个main（）方法
	public static void main(String[] args) {
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("OK100");
		}
		if(age > 20 & age < 90) {
			System.out.println("OK200");
		}
		int a = 4;
		int b = 9;
		if(a > 3 || ++b < 90) {
			System.out.println("OK400");
		}
		System.out.println("a=" + a + "b=" + b);
		if(a > 3 | ++b < 90) {
			System.out.println("OK300");
		}
		System.out.println("a=" + a + "b=" + b);
	
		

	}
	}