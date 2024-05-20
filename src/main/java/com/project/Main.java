package com.project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.project.dao.AmigoDAO;
import com.project.model.Amigo;

import com.project.visual.CadastroAmigo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
//    public static void main(String[] args) {

//        try (Connection conexao = MySQLConnection.getConnection()) {
//            AmigoDAO amigoDAO = new AmigoDAO(conexao);
//
//            // Criando um novo amigo
//            Amigo novoAmigo = new Amigo("João", "123456789");
//
//            // Inserindo o novo amigo no banco de dados
//            amigoDAO.inserir(novoAmigo);
//            System.out.println("Amigo adicionado com sucesso!");
//
//        } catch (SQLException e) {
//            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
//        }

    public static void main(String[] args) {
        // Cria um novo JFrame Menu Principal
        JFrame frame = new JFrame("Kelps Ferramentas");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel
        JPanel panelMain = new JPanel();
        frame.add(panelMain);

        // Chama o método que adicionará os componentes ao painel
        placeComponents(panelMain);

        // Define a janela como visível
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panelMain) {
        panelMain.setLayout(null);

        // Cria e configura um título
        JLabel label = new JLabel("Bem-vindo ao Kelps Ferramentas");
        label.setBounds(190, 50, 300, 25); // Define a posição e tamanho do rótulo
        panelMain.add(label); // Adiciona o rótulo ao painel

//        // Cria e configura um campo de texto
//        JTextField userText = new JTextField(20);
//        userText.setBounds(10,20,165,25);
//        panelMain.add(userText);

        // Cria e configura um botão
        JButton BtnCadastroA = new JButton("Cadastro Amigo");
        BtnCadastroA.setBounds(90, 350, 155, 25);
        panelMain.add(BtnCadastroA);

        // Cria e configura um botão
        JButton BtnCadastroF = new JButton("Cadastro Ferramenta");
        BtnCadastroF.setBounds(310, 350, 155, 25);
        panelMain.add(BtnCadastroF);

        // Adiciona um ouvinte de ação ao botão
        BtnCadastroA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria uma nova instância de CadastroAmigo e chama o método criarInterface()
                CadastroAmigo cadastroAmigo = new CadastroAmigo() {
                    @Override
                    public void criarInterface() {
                        CadastroAmigo.super.criarInterface(); // Chama o método criarInterface() da interface
                    }
                };
                cadastroAmigo.criarInterface(); // Chama o método criarInterface() da instância de CadastroAmigo
            }
        });
    }
    }
