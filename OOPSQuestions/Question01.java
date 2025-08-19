package OOPSQuestions;

//01.Write a java prg to create class Student with data members name, rollnumber, and marks.
//Create objects of the class and display the details of two students.


class Student{
    //Fields
    String name;
    int rollnumber;
    int marks;

    //Methods
    void display(){
        System.out.println("Name of the Student is : " + name);
        System.out.println("Rollnumber is : "  + rollnumber);
        System.out.println("Marks is : " + marks);
        System.out.println("----------------");
    }
        }
public class Question01 {
    public static void main(String[] args) {
        //Create First Student Object --- S1
        Student s1 = new Student();
        s1.name = "Tanu";
        s1.rollnumber = 105;
        s1.marks = 95;

        //Create Second Student Object -- S2
        Student s2 = new Student();
        s2.name = "Vijay";
        s2.rollnumber = 110;
        s2.marks = 100;

        //Display their Details
        System.out.println("------ Student Details ------ ");
        s1.display();
        s2.display();

    }
}
