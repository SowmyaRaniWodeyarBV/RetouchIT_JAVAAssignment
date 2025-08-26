package ArraylistandLinkedlist;
import java.util.ArrayList;

public class Question01 {
    public static void main(String[] args) {

        //Create an ArrayList of integers, add 10 numbers, and print them using a for-each loop.

        // Create an ArrayList of Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 numbers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);  // Adds 10,20,...100
        }

        // Print using for-each loop
        System.out.println("Numbers in ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
