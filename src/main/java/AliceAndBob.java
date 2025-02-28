import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String person1 = "Alice";
	String person2 = "Bob";

	System.out.println("Your name: ");
	
	String name = String.parseString(scan.nextLine());

	if (name.isEqual(person1) || name.isEqual(person2)) {
	    System.out.println("Hello " + name);
	} else {
	    System.out.println("You are neither Alice nor Bob");
	}
	
    }
}
