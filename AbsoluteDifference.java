import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        // calculate the absolute difference
        int difference = Math.abs(number1 - number2);
        // print the absolute difference
        System.out.println("Difference: " + difference);
        scanner.close();
    }
}
