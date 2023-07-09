package LearnJava_;
import java.util.Scanner;
public class introduction02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = input.next();
        System.out.printf("Hello %s! It's nice to meet you.", userName);
    }
}
