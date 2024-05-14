package main.java.com.cadastroferramentas.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class DatabaseConfig {
    public static Properties loadProperties() throws IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("src/main/resources/jdbc.properties");
        props.load(in);
        in.close();
        return props;
    }
}