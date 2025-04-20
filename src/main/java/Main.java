import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        main.compute();
        // call the compute() method on that new object
    }

    public void compute() {
        // Get input string of name from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scan.nextLine();
        // Create conditional to check name against Alice and Bob
        if (name.equals("Alice") || name.equals("Bob")) {
            // Print greeting to screen if Alice or Bob are true
            System.out.println("Hello " + name + "!");
        } else {
            // Print "You are neither Alice nor Bob." otherwise
            System.out.println("You are neither Alice nor Bob.");
        }

    }
}
