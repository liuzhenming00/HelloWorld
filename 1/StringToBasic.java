public class StringToBasic{
	//编写一个main（）方法
	public static void main(String[] args) {
		int n1 = 100;
		double d1 = 4.5;
		boolean b1 = true;
		float f1 = 1.1f;
		String s1 = n1 + "";
		String s2 = d1 + "";
		String s3 = b1 + "";
		String s4 = f1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
		//String对应的基本数据类型
		String s5 = "123";
		int n2 = Integer.parseInt(s5);
		double d2 = Double.parseDouble(s5);
		float f2 = Float.parseFloat(s5);
		long l1 = Long.parseLong(s5);
		byte b3 = Byte.parseByte(s5);
		boolean b2 = Boolean.parseBoolean("true");
		short h = Short.parseShort(s5);
		
		System.out.println("=======");
		System.out.println(n2);
		System.out.println(d2);
		System.out.println(f2);
		System.out.println(l1);
		System.out.println(b3);
		System.out.println(b2);
		System.out.println(h);
		System.out.println(s5.charAt(1));
		
	}
	}