public class Store8 {
	int balance;
	public Store8(int balance1) {
		balance = balance1;
	}
	public void chaxun() {
		System.out.println("你的积蓄为 " + balance);
	}
	public int cunqian(int cunru) {
		balance = balance + cunru;
		System.out.println("存入 "+ cunru);
		return cunru;
		
	}
	public int quchu(int quqian) {
		balance = balance - quqian;
		System.out.println("取出 "+ quqian);
		return quqian;

	}
	public String toString() {
		return "你的积蓄还有 " + balance +".";
		
	}
	public static void main(String[] args) {
		Store8 stes = new Store8(100);
		stes.chaxun();
		stes.quchu(10);
		stes.chaxun();
		stes.cunqian(30);
		stes.chaxun();
		System.out.println(stes);
		
		
	}
}
