package MIniProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* ----------------- Abstraction ----------------- */
// Interface with only void methods
interface DatabaseOperations {
    void addStudent(Student s);
    void updateStudent(int id, String newName, String newCourse, int newMarks);
    void deleteStudent(int id);
    void viewStudents();
}

/* ----------------- Inheritance + Encapsulation ----------------- */
abstract class Person { // base class/superclass
    private int id;
    private String name;

    public Person(int id, String name) { //constructor
        this.id = id;
        this.name = name;
    }

    // Encapsulation: Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Abstract method (Polymorphism when overridden)
    public abstract void displayInfo(boolean detailed);
}

// Student class extending Person
class Student extends Person {
    private String course;
    private int marks;

    public Student(int id, String name, String course, int marks) {
        super(id, name); // call Person constructor
        this.course = course; //initialize fields specific to Student.
        this.marks = marks;
    }

    public String getCourse() { return course; }
    public int getMarks() { return marks; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(int marks) { this.marks = marks; }

    // Overriding displayInfo()
    @Override //“This method replaces the abstract method from Person
    public void displayInfo(boolean detailed) { //takes true or false
        if (detailed) {
            System.out.println("ID: " + getId() + " | Name: " + getName() +
                    " | Course: " + course + " | Marks: " + marks); //it prints full info: id, name, course, marks.
        } else {
            System.out.println("Student: " + getName());//it prints only the student’s name.
        }
    }
}

// Teacher class extending Person (optional)
class Teacher extends Person {
    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name); //  call Person constructor
        this.subject = subject;//initialize fields specific to teacher
    }

    @Override //“This method replaces the abstract method from Person
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Teacher ID: " + getId() +
                    " | Name: " + getName() +
                    " | Subject: " + subject);
        } else {
            System.out.println("Teacher: " + getName());
        }
    }
}

/* ----------------- Implementation ----------------- */
class StudentManager implements DatabaseOperations { // class of studentmanger implemts of dataoperation(interface)
    //    actual code (implementation) for all the methods
    private List<Student> students = new ArrayList<>();
    //list<stud>:list can only hold Student objects.
    //new ArrayList<>() → makes an empty list at the start.
    //students is our “mini-database” where we store all the Student objects.

    @Override
    public void addStudent(Student s) { // do  implemntation
        students.add(s);// type of array list
        //When addStudent(Student s) is called, it simply puts that student into the list and shows a success message.
        System.out.println(" Student added successfully.");
    }

    @Override
    public void updateStudent(int id, String newName, String newCourse, int newMarks) {
        for (Student s : students) {
            if (s.getId() == id) { // 1==1
                s.setName(newName);
                s.setCourse(newCourse);
                s.setMarks(newMarks);
                System.out.println(" Student record updated.");
                return;
            }
        }
        System.out.println(" Student not found.");
    }

    @Override
    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println(" Student deleted successfully.");
        } else {
            System.out.println(" Student not found.");
        }
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println(" Student Records:");
            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i); // get student by index
                s.displayInfo(true);
                System.out.println("-------------------------");
            }
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        /* ----------------- Main Class ----------------- */
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Database Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); // 101
                    sc.nextLine();// To read input from the user (entire line as a string).
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    manager.addStudent(new Student(id, name, course, marks));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    int newMarks = sc.nextInt();
                    manager.updateStudent(uid, newName, newCourse, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    manager.deleteStudent(did);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}