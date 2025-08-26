package ExceptionHandling;

public class Question03 {
    public static void main(String[] args) {

        //Show how a nested try block works with two different exceptions.
                try {
                    // Outer try block
                    int arr[] = {10, 20, 30};

                    System.out.println("Outer try block starts...");

                    try {
                        // Inner try block
                        int result = arr[1] / 0;  // ArithmeticException
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Inner Catch: Division by zero is not allowed.");
                    }

                    // This will cause ArrayIndexOutOfBoundsException
                    System.out.println(arr[5]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Outer Catch: Array index is out of bounds.");
                }

                System.out.println("Program continues after handling exceptions.");
            }
        }
