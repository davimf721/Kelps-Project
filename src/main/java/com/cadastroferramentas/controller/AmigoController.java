package main.java.com.cadastroferramentas.controller;

import main.java.com.cadastroferramentas.dao.AmigoDAO;
import main.java.com.cadastroferramentas.model.Amigo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AmigoController {
    private final AmigoDAO amigoDAO;

    /**
     * Construtor da classe AmigoController.
     * @param conexao Objeto de conexão com o banco de dados.
     */
    public AmigoController(Connection conexao) {
        this.amigoDAO = new AmigoDAO(conexao);
    }

    /**
     * Lista todos os amigos cadastrados no banco de dados.
     */
    public void listarAmigos() {
        try {
            List<Amigo> amigos = amigoDAO.listar();
            for (Amigo amigo : amigos) {
                System.out.println(amigo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar os amigos: " + e.getMessage());
        }
    }

    /**
     * Busca um amigo pelo seu ID no banco de dados.
     * @param id ID do amigo a ser buscado.
     */
    public void buscarAmigo(int id) {
        try {
            Amigo amigo = amigoDAO.buscar(id);
            if (amigo != null) {
                System.out.println("Amigo encontrado: " + amigo);
            } else {
                System.out.println("Amigo com ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar o amigo: " + e.getMessage());
        }
    }

    /**
     * Insere um novo amigo no banco de dados.
     * @param amigo Amigo a ser inserido.
     */
    public void inserirAmigo(Amigo amigo) {
        try {
            amigoDAO.inserir(amigo);
            System.out.println("Amigo inserido com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir o amigo: " + e.getMessage());
        }
    }

    /**
     * Atualiza os dados de um amigo no banco de dados.
     * @param amigo Amigo a ser atualizado.
     */
    public void atualizarAmigo(Amigo amigo) {
        try {
            amigoDAO.atualizar(amigo);
            System.out.println("Amigo atualizado com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o amigo: " + e.getMessage());
        }
    }

    /**
     * Deleta um amigo do banco de dados pelo seu ID.
     * @param id ID do amigo a ser deletado.
     */
    public void deletarAmigo(int id) {
        try {
            amigoDAO.deletar(id);
            System.out.println("Amigo deletado com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao deletar o amigo: " + e.getMessage());
        }
    }
}
