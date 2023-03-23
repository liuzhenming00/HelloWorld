public class roubot{
 int batteryLevel;
 String name;
 public roubot (String droidName){
  name = droidName;
  batteryLevel = 100;
 }

 public void performTask(String task){
   System.out.println(name + "is performing task:" + task);
   batteryLevel = batteryLevel - 10;
 }
 public String syd() {
	 return "sheng yu dian liang"+batteryLevel;
 }
 
  public  String toString(){
   return "Hello, I’m the droid: droidNameHere";
 }
  public static void main(String[] args){
	  roubot C = new roubot("Codey");
	  roubot B = new roubot("Cy");
    System.out.println(C);
    C.performTask("dancing");
    System.out.println(C.syd());
    System.out.println(B.syd());
  }
}