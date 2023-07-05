public class MethodParameter{
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		BB b = new BB();
		b.test100(arr);
		System.out.println("main()的数组");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
		C c = new C();
		c.name = "jack";
		c.age = 34;
		D d = new D();
		d.test200(c);
		System.out.print(c.age);
	}
}
class BB{
	public void test100(int[] arr) {
		arr[0] = 100;
		System.out.println("test的数组");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	}
}
class C{
	String name;
	int age;
}
class D{
	public void test200(C c){
		c.age = 10000;
	}
}