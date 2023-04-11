public class Recursion{
	//编写一个main（）方法
	public static void main(String[] args) {
		T t = new T();
		t.test(5);
		int res = t.factorial(5);
		System.out.println(res);
	}
}
class T{
	public void test(int n) {
		if (n > 2) {
			test (n - 1);
			System.out.println("n = " + n);
		}
		else {
			System.out.println("n = " + n);
		}
		
	}
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return factorial (n - 1) * n;
		}
	}
}