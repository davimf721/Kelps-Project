package com.project.dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MySQLConnection {
    public static Connection getConnection() {
        Connection connection = null;
        Properties props = new Properties();

        try (FileInputStream in = new FileInputStream("src/main/java/com.project.resources/jdbc.properties")) {
            props.load(in);

            String url = props.getProperty("url") + "/" + props.getProperty("database");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException e) {
            // handle exception here
            e.printStackTrace();
        }

        return connection;
    }
}
