package main.java.com.cadastroferramentas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.java.com.cadastroferramentas.dao.AmigoDAO;
import main.java.com.cadastroferramentas.dao.MySQLConnection;
import main.java.com.cadastroferramentas.model.Amigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {

        try (Connection conexao = MySQLConnection.getConnection()) {
            AmigoDAO amigoDAO = new AmigoDAO(conexao);

            // Criando um novo amigo
            Amigo novoAmigo = new Amigo("João", "123456789");

            // Inserindo o novo amigo no banco de dados
            amigoDAO.inserir(novoAmigo);
            System.out.println("Amigo adicionado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
//    public static void main(String[] args) {
//        // Cria um novo JFrame
//        JFrame frame = new JFrame("Simple GUI");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Cria um painel
//        JPanel panel = new JPanel();
//        frame.add(panel);
//
//        // Chama o método que adicionará os componentes ao painel
//        placeComponents(panel);
//
//        // Define a janela como visível
//        frame.setVisible(true);
//    }
//
//    private static void placeComponents(JPanel panel) {
//        panel.setLayout(null);
//
//        // Cria e configura um campo de texto
//        JTextField userText = new JTextField(20);
//        userText.setBounds(10,20,165,25);
//        panel.add(userText);
//
//        // Cria e configura um botão
//        JButton loginButton = new JButton("Click me");
//        loginButton.setBounds(10, 80, 80, 25);
//        panel.add(loginButton);
//
//        // Adiciona um ouvinte de ação ao botão
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Imprime o texto do campo de texto quando o botão é pressionado
//                System.out.println(userText.getText());
//            }
//        });
//    }
    }
}