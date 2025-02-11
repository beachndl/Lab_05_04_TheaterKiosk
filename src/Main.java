import java.util.Scanner;

public class Main {
    // Declaring constants
    private static final int LEGAL_AGE = 21;

    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        int age = 0;

        // Get user input
        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            // Safe to read in an integer
            age = in.nextInt();
            in.nextLine(); // Clear the buffer

            // Process and output
            if (age >= LEGAL_AGE) {
                System.out.println("You get a wrist band.");
            }
        }
    }
}