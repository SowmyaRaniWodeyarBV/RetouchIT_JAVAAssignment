package ArraylistandLinkedlist;
import java.util.LinkedList;

public class Question02 {
    public static void main(String[] args) {

        //Create a LinkedList of strings, add 5 names, and retrieve the 3rd element.
        // Create LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // Add 5 names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Retrieve the 3rd element (index starts from 0)
        String thirdName = names.get(2);

        // Print the LinkedList and the 3rd element
        System.out.println("Names in LinkedList: " + names);
        System.out.println("3rd Element: " + thirdName);
    }
}
