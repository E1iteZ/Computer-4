import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int difference = Math.abs(number1 - number2);
        System.out.println("Difference: " + difference);
        scanner.close();
    }
}
