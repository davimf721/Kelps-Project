package com.project.visual;
import javax.swing.*;
import java.awt.*;

public interface CadastroAmigo {
    default void criarInterface() {
        // Cria um novo JFrame
        JFrame frame = new JFrame("Cadastro Amigo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um JPanel para conter os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Cria e configura o rótulo "Cadastro Amigo"
        JLabel tituloLabel = new JLabel("Cadastro Amigo");
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Adiciona o rótulo ao painel no topo
        panel.add(tituloLabel, BorderLayout.NORTH);

        // Cria e configura o rótulo "Amigo"
        JLabel amigoLabel = new JLabel("Amigo");
        amigoLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // Cria e configura o campo de texto
        JTextField amigoTextField = new JTextField(20);

        // Cria um JPanel para conter o rótulo "Amigo" e o campo de texto
        JPanel amigoPanel = new JPanel();
        amigoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Adiciona o rótulo e o campo de texto ao JPanel amigoPanel
        amigoPanel.add(amigoLabel);
        amigoPanel.add(amigoTextField);

        // Adiciona o JPanel amigoPanel ao painel no centro
        panel.add(amigoPanel, BorderLayout.CENTER);

        // Adiciona o painel ao JFrame
        frame.add(panel);

        // Configura o tamanho da janela e a torna visível
        frame.setSize(900, 800);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }
}
