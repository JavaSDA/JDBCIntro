package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {

    public static Connection DbConn() {
        // Declare the connection outside of the try/catch block to
        // allow you return it after the commands have been executed.
        Connection connection = null;
        try {
            // Call on the driver manager's static get connection class to
            // set  up the connection via your jdbc, and using your
            // localhost url (database inclusive).
            // add your username and password as parameters.
             connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/studentproject",
                    User.USERNAME.getValue(),
                    User.PASSWORD.getValue()
            );
        } catch (SQLException e) {
            // A try/catch block in case of any errors that might
            // occur.
            System.out.println(e.getMessage());
        }

        return connection; // return the connection.
    }

}
