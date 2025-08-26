package ArraylistandLinkedlist;
import java.util.ArrayList;

public class Question04 {
    public static void main(String[] args) {

        //Write a program to check if an element exists in an ArrayList using contains().
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        // Element to check
        String searchItem = "Mango";
        // Check using contains()
        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " exists in the ArrayList.");
        } else {
            System.out.println(searchItem + " does not exist in the ArrayList.");
        }

        // Try searching for a non-existing element
        String anotherItem = "Grapes";
        if (fruits.contains(anotherItem)) {
            System.out.println(anotherItem + " exists in the ArrayList.");
        } else {
            System.out.println(anotherItem + " does not exist in the ArrayList.");
        }
    }
}
