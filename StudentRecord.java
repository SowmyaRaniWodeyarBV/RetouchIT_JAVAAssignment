package JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentRecord {
    

    private static final String URL = "jdbc:mysql://localhost:3306/studentrecordsystem";//schema name
    private static final String USER = "root";
    private static final String PASSWORD = "Sowmya14";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ✅ Only one Scanner
        try {
            while (true) {
                System.out.println("\n===== Student Database Management =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Search Student");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        addStudent(sc);
                        break;
                    case 2:
                        viewStudents();
                        break;
                    case 3:
                        updateStudent(sc);
                        break;
                    case 4:
                        deleteStudent(sc);
                        break;
                    case 5:
                        searchStudent(sc);
                        break;
                    case 6:
                        System.out.println("Exiting... Goodbye!");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            System.out.println("Please check error: " + e);
        }
    }

    // 1. Add Student
    private static void addStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            //Connects to the database using DriverManager.getConnection.

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            String query = "INSERT INTO student_record (id, name, age, course, email, contactnumber) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            //PreparedStatement is used to insert data safely
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, course);
            ps.setString(5, email);
            ps.setString(6, contact);

            int rows = ps.executeUpdate();
            System.out.println(rows + " student record added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. View All Students
    private static void viewStudents() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM student_record";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            //Uses a ResultSet to loop through records.
            //Prints all student details row by row.

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course") +
                        ", Email: " + rs.getString("email") +
                        ", Contact: " + rs.getString("contactnumber"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3. Update Student
    private static void updateStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new Course: ");
            String course = sc.nextLine();

            System.out.print("Enter new Contact Number: ");
            String contact = sc.nextLine();

            String query = "UPDATE student_record SET course = ?, contactnumber = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, course);
            ps.setString(2, contact);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student record updated successfully!");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4. Delete Student
    private static void deleteStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();

            String query = "DELETE FROM student_record WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student record deleted successfully!");
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 5. Search Student
    private static void searchStudent(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.print("Enter Student ID to search: ");
            int id = sc.nextInt();
            sc.nextLine();

            String query = "SELECT * FROM student_record WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course") +
                        ", Email: " + rs.getString("email") +
                        ", Contact: " + rs.getString("contactnumber"));
            } else {
                System.out.println("No student found with ID " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}