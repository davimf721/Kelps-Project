package com.project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.project.dao.AmigoDAO;
import com.project.model.Amigo;



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

    private void JBCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {
        // Instancia a tela de cadastro de aluno
        FrmCadastroAmigo objeto = new FrmCadastroAmigo();
        objeto.setVisible(true);
    }

    public static void main(String[] args) {


    }
    }
