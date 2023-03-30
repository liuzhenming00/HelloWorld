public class FloatDetail{
	//编写一个main()方法
	public static void main(String[] args) {
	float num2 = 1.1F;
	double num3 = 1.1;
	double num4 = 1.1F;
	double num5 = .123;
	System.out.println(num5);
	System.out.println(5.12e2);
	System.out.println(5.12e-2);
	double num9 = 2.235245252;
	float num10 = 2.235245252f;
	System.out.println(num9);
	System.out.println(num10);
	double num11 = 2.7;
	double num12 = 8.1 / 3;
	System.out.println(num11);
	System.out.println(num12);
	if(num11==num12) {
		System.out.println("相等");
		
	}
	if(Math.abs(num11-num12)<0.001) {
		System.out.println("差值非常小，到达我规定的精度，认为相等...");
	}
	System.out.println(Math.abs(num11-num12));
}

}