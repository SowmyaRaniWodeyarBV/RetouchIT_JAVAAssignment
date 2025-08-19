package OOPSQuestions;

//02.Create a class Student with a public variable name. in the main method, create an object
//of Student and prints the name.

class Students{
    //Variable
    public String name;

}
public class Question02 {
    public static void main(String[] args) {
        //Create a object
        Students s1 = new Students();

        //Assign value to the public variable
        s1.name = "Sowmya";

        //print name
        System.out.println("Student Name : " + s1.name);
    }
}
