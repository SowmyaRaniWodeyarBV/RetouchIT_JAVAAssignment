package ExceptionHandling;

public class Question04 {
    public static void main(String[] args) {

        //Write a program to demonstrate how the finally block
        // always executes, whether an exception occurs or not.

                // Case 1: Exception occurs
                try {
                    int a = 10;
                    int b = 0;
                    int result = a / b;  // ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Catch Block: Division by zero is not allowed.");
                } finally {
                    System.out.println("Finally Block: Always executes (Case 1).");
                }

                System.out.println("--------------------------------");

                // Case 2: No exception
                try {
                    int x = 20;
                    int y = 5;
                    int result = x / y;  // No exception
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Catch Block: Division by zero is not allowed.");
                } finally {
                    System.out.println("Finally Block: Always executes (Case 2).");
                }

                System.out.println("Program continues after try-catch-finally.");
            }
        }

