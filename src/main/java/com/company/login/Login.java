package com.company.login;

import com.company.Database;
import com.company.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class Login {

    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    // This method signs a new user up as a regular person.
    public static boolean signUpNewUser() {
        // Set a prompt to tell the user to enter their username, and  password
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        try {
            // INSERT INTO users(username, password, role) VALUES('afdae', 'afafa', 'teacher');
            ps = connection
                    .prepareStatement("INSERT INTO users(username, password, role)" +
                            "VALUES('" +
                            username.trim() + "', '" +
                            password.trim() + "', '" +
                            "teacher')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean loginUser() {
        // Prompt the user to enter their login details.
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        try {
            ps = connection
                    .prepareStatement("SELECT * FROM users " +
                            "WHERE username='" + username.trim() + "' AND " +
                            "password='" + password.trim() + "'");
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }












    /*public static void createUserTable() {
        try {
            ps = connection.prepareStatement("CREATE TABLE users(" +
                    "id SERIAL PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "password VARCHAR(50) NOT NULL," +
                    "role VARCHAR(30) NOT NULL)");
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/



}
