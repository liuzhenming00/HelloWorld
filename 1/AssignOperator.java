public class AssignOperator{
	//编写main（）方法
	public static void main(String[] args) {
		int  n1 = 10;
		n1 += 4;
		System.out.println(n1);
		n1 /= 3;
		System.out.println(n1);
		byte b = 3;
		b +=3;//等价b = (byte) (b + 3)
		System.out.println(b);
		b++;//等价 b = (byte)(b + 1)
		System.out.println(b);
	}
}