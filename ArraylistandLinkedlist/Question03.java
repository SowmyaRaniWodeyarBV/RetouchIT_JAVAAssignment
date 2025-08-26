package ArraylistandLinkedlist;
import java.util.ArrayList;

public class Question03 {
    public static void main(String[] args) {

        //Demonstrate the difference between size() and isEmpty() using an ArrayList.

        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Initially, list is empty
        System.out.println("Initial size: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());

        // Add some elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // After adding elements
        System.out.println("\nAfter adding elements:");
        System.out.println("Size: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());

        // Remove all elements
        fruits.clear();

        // After clearing the list
        System.out.println("\nAfter clearing the list:");
        System.out.println("Size: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());

    }
}
