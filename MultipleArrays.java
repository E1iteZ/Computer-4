import java.util.Arrays;
public class MultipleArrays {
    public static void main(String[] args) {
        // create arrays for different types of data
        String[] toysList = {"duck", "bell", "drum", "abacus", "playbook"};
        double[] pricelist = {2.8, 4.9, 7.0, 12.3, 5.5};
        boolean[] availabilityList = {true, false, true, false, true};
        int[] countList = {10, 0, 6, 0, 8};
        // print the values of the arrays
        System.out.println("Toys: " + Arrays.toString(toysList));
        System.out.println("Prices: " + Arrays.toString(pricelist));
        System.out.println("Count: " + Arrays.toString(countList));
    }
}
