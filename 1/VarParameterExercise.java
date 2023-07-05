public class VarParameterExercise{
	//编写一个main（）方法
	public static void main(String[] args) {
		FF f = new FF();
		System.out.println(f.showShare("jgds", 23,54));
		System.out.println(f.showShare("js", 23,54,34,54,53));
		System.out.println(f.showShare("jgd", 23,54,34,65,23,56,34));
	}
}
class FF {
	public String showShare(String name, double...scores) {
	int totalScores = 0;
	
	for(int i = 0; i < scores.length; i++) {
		totalScores += scores[i]; 
	}
	return name +"的成绩总分为" + totalScores;
}
	
}