public class HomeWk{
	//编写main（）方法
	public static void main(String[] args) {
		double money = 100000;
		double sum = 0;
		while (money >1000) {
			if(money > 50000) {
				money -=money *0.05;
				sum++;
			}
			else  {
				money -=1000;
				sum++;
			}
		}
		System.out.println("可以经过" + sum + "次路口"+ "还剩" + money);
	}
}