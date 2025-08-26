package ExceptionHandling;

public class Question01 {
    public static void main(String[] args) {

        //Write a program to handle division by zero using try-catch.

                try {
                    int a = 10;
                    int b = 0;  // divisor is zero
                    int result = a / b; // this will throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                }

                System.out.println("Program continues after exception handling.");
    }
}
