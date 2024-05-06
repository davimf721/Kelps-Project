package com.lojajogos.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MinhaController {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private void entrar() {
        // Implemente a lógica de autenticação do usuário aqui
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        System.out.println("Email: " + email + ", Senha: " + senha);
    }
}