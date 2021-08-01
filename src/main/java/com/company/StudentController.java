package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentController {

    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    // method to get a user by id.
    public static Student getStudentById() {
        // Add a prompt to ask the user what id they want to check for.
        System.out.print("Enter the ID of the student: ");
        int studentId = scanner.nextInt();

        // Create a new student object to hold the value of the student.
        Student student = new Student();

        // Execute the commands in a try/catch block.
        try {
            ps = connection
                    .prepareStatement("SELECT * FROM students WHERE id = '" + studentId + "'");
            rs = ps.executeQuery();

            // Loop through the result set.
            while (rs.next()) {
                int id, age;
                String firstName, lastName;

                // set the variables above to the columns in the result set.
                id = rs.getInt("id");
                age = rs.getInt("age");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");

                // set the fields of the student to the respective
                // data got from the columns.
                student.setAge(age);
                student.setId(id);
                student.setFirstName(firstName);
                student.setLastName(lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    // method to add a new student.
    public static boolean signUpNewStudent() {
        // Add prompts to tell the user to add the values you need.
        System.out.print("Enter the student's firstName: ");
        String firstName = scanner.next();

        System.out.print("Enter the student's lastName: ");
        String lastName = scanner.next();

        System.out.print("Enter the student's age: ");
        int age = scanner.nextInt();

        try {
            ps = connection
                    .prepareStatement("INSERT INTO students(firstName, lastName, age) " +
                            "VALUES('" + firstName.trim() + "', '" + lastName.trim() + "', '" + age + "')");

            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
