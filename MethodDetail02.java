public class MethodDetail02{
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		a.m();
		}
}
class A{
	public void print(int n) {
		System.out.println("println()方法被调用n=" + n);
	}
	public void sayOk() {
		print(10);
		System.out.println("继续执行sayOk" );
		
	}
	public void m(){
		B b = new B();
		b.hi();
	}
}
class B{
	public void hi(){
		System.out.println("B类被执行" );
	}
}