public class Method01{
	//编写一个main（）方法
	public static void main(String[] args) {
	Per p1 = new Per();
	p1.speak();
	p1.cal();
	p1.cal01(5);
	System.out.println("结果为" + p1.getNum(7,3));
	}
}
class Per {
	public void speak() {
		System.out.println("我是一首歌");
	}
	public void cal(){
		int res = 0;
		for(int i = 1; i <=1000; i++ ) {
			res += i;
			
		}
		System.out.println("输出的结果" + res);
	}
	public void cal01(int n){
		int res = 0;
		for(int i = 1; i <= n; i++ ) {
			res += i;
			
		}
		System.out.println("输出的结果" + res);
		
		
	}
	public int getNum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}
