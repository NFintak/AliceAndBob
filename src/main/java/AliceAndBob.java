import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String person1 = "Alice";
	String person2 = "Bob";

	System.out.println("Your name: ");
	
	String name = scan.nextLine();

	if (person1.equals(name) || person2.equals(name)) {
	    System.out.println("Hello " + name);
	} else {
	    System.out.println("You are neither Alice nor Bob");
	}
	
    }
}
