package ExceptionHandling;

public class Question02 {
    public static void main(String[] args) {

        //Demonstrate the use of multiple
        // catch blocks (ArithmeticException, NullPointerException, Exception).
                try {
                    String str = null; // This will cause NullPointerException
                    int a = 10;
                    int b = 0;

                    // Uncomment one at a time to see different exceptions
                    //int result = a / b;   // ArithmeticException
                    int length = str.length(); // NullPointerException

                    System.out.println("Operation successful!");
                }
                catch (ArithmeticException e) {
                    System.out.println("Error: Cannot divide by zero.");
                }
                catch (NullPointerException e) {
                    System.out.println("Error: Null value encountered.");
                }
                catch (Exception e) {
                    System.out.println("General Exception: " + e.getMessage());
                }

                System.out.println("Program continues after handling exception.");
            }
        }
