package main.java.com.cadastroferramentas.dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {
    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("src/main/resources/jdbc.properties");
        props.load(in);
        in.close();

        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String password = props.getProperty("password");

        return DriverManager.getConnection(url, user, password);
    }
}

