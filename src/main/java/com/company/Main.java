package com.company;

import com.company.login.Login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test out connection to the database.
        System.out.println("Connecting to the database...");
        Connection connection = Database.DbConn();

//        try {
//            Statement stmt = connection.createStatement();
//            // add the table definition the create table statment.
//            stmt.execute("CREATE TABLE students(" +
//                    "id SERIAL PRIMARY KEY," +
//                    "firstName VARCHAR(50) NOT NULL," +
//                    "lastName VARCHAR(50) NOT NULL," +
//                    "age INT NOT NULL)");
//            System.out.println("Table created successfully.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // Create a list of students to be added to the database.
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Richard", "Bourdillion", 13));
//        studentList.add(new Student("Diana", "Jerry", 16));
//        studentList.add(new Student("Trisha", "Green", 15));
//        studentList.add(new Student("George", "Washington", 17));
//        studentList.add(new Student("Tony", "Stark", 20));
//        studentList.add(new Student("Greg", "Daffodil", 19));
//        studentList.add(new Student("Richard", "Branson", 18));
//        studentList.add(new Student("Henry", "Ford", 21));

        // Loop through the list and add each one to the database.
//        for (Student student : studentList) {
//            // CTRL + ALT + T : Surround with try/catch
//
//            try {
//                Statement stmt = connection.createStatement();
//                // INSERT INTO students(firstName, lastName, age) VALUES('richard', 'branson', '19');
//                stmt.execute("INSERT INTO students(firstName, lastName, age) VALUES(" +
//                      "'"  + student.getFirstName() + "', '"
//                        + student.getLastName() + "', '"
//                        + student.getAge() + "')");
//                System.out.println("Student created Successfully.");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("All students successfully created.");
/*
        // Retrieve data from the database.
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> students = new ArrayList<>();
        try {
             ps = connection.prepareStatement("SELECT * FROM students");
             rs = ps.executeQuery(); // This is going to allow the prepared statement execute and return
            // our results as a ResultSet object.


            System.out.println("ID\t FirstName\t\t LastName\t\t Age\t\t");
            while (rs.next()) {
                int id, age;
                String firstName, lastName;
                id = rs.getInt("id");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");
                age = rs.getInt("age");

                Student student = new Student();
                student.setId(id);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);

                students.add(student);
            }
//            System.out.println(students);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("The average age of the students is: " + getAverageAge(students));*/


        // Actual login app..............................................
//        Login login = new Login();

//        System.out.println(login.SignUpNewStudent() ? "New Student added!" : "Didn't work");

//        Student studentValue = StudentController.getStudentById();
//        System.out.println("The student is: " + studentValue.getFirstName() + " " + studentValue.getLastName());

        // create our user table.
//        System.out.println(Login.createUserTable() ? "Table created" : "Table Creation failed");
//        Login.createUserTable();
//        System.out.println("Table Created");

        // Sign Up a new user.
//        System.out.println(Login.signUpNewUser() ? "New user created successfully" : "Couldn't create new user");
        // Login user
        System.out.println(Login.loginUser() ? "Logged In successfully" : "Couldn't Log in user");












    }

//    public static float getAverageAge(List<Student> students) {
//        // initalize a variable for the sum of the values.
//        float sum = 0;
//
//        for (int i = 0; i < students.size(); i++) {
//            sum += students.get(i).getAge();
//        }
//
//        return sum / students.size();
//
//    }

}
