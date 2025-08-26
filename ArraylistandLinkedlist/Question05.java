package ArraylistandLinkedlist;
import java.util.LinkedList;

public class Question05 {
    public static void main(String[] args) {

        //Add elements to a LinkedList, then remove the first and last element.

        // Create a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Add elements
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        // Print original LinkedList
        System.out.println("Original LinkedList: " + cities);
        // Remove first and last elements
        cities.removeFirst(); // removes "New York"
        cities.removeLast();  // removes "Sydney"

        // Print after removal
        System.out.println("After removing first and last: " + cities);

    }
}
