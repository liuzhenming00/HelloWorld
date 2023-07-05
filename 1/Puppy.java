public class Puppy{
	int puppyAge;
	public Puppy (String name) {
		System.out.println("小狗的名字" +name);
	}
	public void setAge(int age) {
		puppyAge=age;
	}
	public int getAge() {
		System.out.println("小狗的年龄是" +puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		Puppy youPuppy= new Puppy("tomm");
		youPuppy.setAge(3);
		youPuppy.getAge();
		System.out.println("变量为"+youPuppy.puppyAge);
	}
	
}