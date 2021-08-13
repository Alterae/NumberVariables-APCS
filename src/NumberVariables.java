import java.util.Scanner;

public class NumberVariables {

    /**
     * Main method.  Accepts two floating-point numbers from the user, and outputs their sum, difference, and product.
     * Prompts again on invalid input.
     */
    public static void main(String[] args) {
        try {
            // Okay so java is FUCKING USELESS and the System.console().readLine() method *doesn't fucking work* if you
            // use an IDE.  What the fuck.  What the actual fuck.
            // Instead, we must use this bullshit.
            // I should not have to instantiate a class instance just to do *basic I/O* what the heck.
            var scanner = new Scanner(System.in);

            // Get input from the user
            System.out.println("(i) Enter two numbers.");
            System.out.print("(?) First number: ");
            var num1 = Float.parseFloat(scanner.nextLine());
            System.out.print("(?) Second number: ");
            var num2 = Float.parseFloat(scanner.nextLine());

            // Print outputs
            // Java is bad and has no string interpolation
            System.out.printf("(i) Sum: %s%n", num1 + num2);
            System.out.printf("(i) Difference: %s%n", num1 - num2);
            System.out.printf("(i) Product: %s%n", num1 * num2);

        } catch (NumberFormatException _e) {
            // Yell at the user if we can't parse their input
            System.out.println("(!) Invalid input.  Please try again.\n");
            main(args);
        }
    }
}
