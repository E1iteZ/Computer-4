public class DivisibilityChecker {
    public static void main(String[] args) {
        Integer num1 = new Integer(20);
        Integer num2 = new Integer(2);
        int number1 = num1.intValue();
        int number2 = num2.intValue();
        if (number1 % number2 == 0){
            System.out.println(number1 + " is divisible by " + number2);
        }
        else{
            System.out.println(number1 + " is not divisible by " + number2);
        }
    }
}
