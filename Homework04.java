public class Homework04{
	//编写一个main（）方法
	public static void main(String[] args) {
		A02 a02 = new A02();
		String[]strs = {"frg","ttht","tht"};
		int res = a02.find("ttht", strs);
		if(res != -1) {
		System.out.println("坐标为=" + res);
		}
		else {
			System.out.println("没有找到");
		}
	}
}
class A02{
	public int find(String findStr,String[] strs) {
	for (int i = 0; i < strs.length; i++) {		
		if(findStr.equals(strs[i])) {
			return i;
		}
			
	}
				return -1;
			
	
	}
}