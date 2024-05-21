package com.project.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Esta classe fornece métodos para carregar as configurações do banco de dados a partir de um arquivo de propriedades.
 */
public class DatabaseConfig {

    /**
     * Carrega as propriedades do arquivo de configuração do banco de dados.
     *
     * @return Um objeto Properties contendo as configurações do banco de dados
     * @throws IOException Se ocorrer um erro de I/O ao ler o arquivo de configuração
     */
    public static Properties loadProperties() throws IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("src/main/java/com/project/resources/jdbc.properties");
        props.load(in);
        in.close();
        return props;
    }
}
