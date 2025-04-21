import java.lang.Math;
public class RandomInteger {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);
        System.out.println("The random number is: " + randomNumber);
        double cube = Math.pow(randomNumber, 3);
        System.out.println("the result of the number to the power of 3: " + cube);
        double root = Math.sqrt(randomNumber);
        System.out.println("the Square roots is: " + root);
        System.out.println("Rawan Abu Habib 12A");
    }
}
