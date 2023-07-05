public class TestSwitchCase{
	public static void main(String[] args) {
		char grade='d';
		switch(grade) {
		case'a':
				System.out.println("优秀");
		break;
		case'b':
		case'c':
		System.out.println("良好");
		break;
		case'd':
		System.out.println("及格");
		break;
		default:
		System.out.println("未知等级");
		
		}
		System.out.println("等级是" +grade);
		
	}
	
}