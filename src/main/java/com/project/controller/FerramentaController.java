package com.project.controller;

import com.project.dao.FerramentaDAO;
import com.project.model.Ferramenta;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FerramentaController {
    private final FerramentaDAO ferramentaDAO;
    private static final Logger LOGGER = Logger.getLogger(FerramentaController.class.getName());

    /**
     * Construtor da classe FerramentaController.
     * @param conexao Objeto de conexão com o banco de dados.
     */
    public FerramentaController(Connection conexao) {
        this.ferramentaDAO = new FerramentaDAO(conexao);
    }

    /**
     * Lista todas as ferramentas cadastradas no banco de dados.
     */
    public void listarFerramentas() {
        try {
            List<Ferramenta> ferramentas = ferramentaDAO.listar();
            for (Ferramenta ferramenta : ferramentas) {
                System.out.println(ferramenta);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar as ferramentas", e);
        }
    }

    /**
     * Busca uma ferramenta pelo seu ID no banco de dados.
     * @param id ID da ferramenta a ser buscada.
     */
    public void buscarFerramenta(int id) {
        try {
            Ferramenta ferramenta = ferramentaDAO.buscar(id);
            if (ferramenta != null) {
                System.out.println("Ferramenta encontrada: " + ferramenta);
            } else {
                System.out.println("Ferramenta com ID " + id + " não encontrada.");
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar a ferramenta", e);
        }
    }

    /**
     * Insere uma nova ferramenta no banco de dados.
     * @param ferramenta Ferramenta a ser inserida.
     */
    public void inserirFerramenta(Ferramenta ferramenta) {
        try {
            ferramentaDAO.inserir(ferramenta);
            System.out.println("Ferramenta inserida com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao inserir a ferramenta", e);
        }
    }

    /**
     * Atualiza os dados de uma ferramenta no banco de dados.
     * @param ferramenta Ferramenta a ser atualizada.
     */
    public void atualizarFerramenta(Ferramenta ferramenta) {
        try {
            ferramentaDAO.atualizar(ferramenta);
            System.out.println("Ferramenta atualizada com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao atualizar a ferramenta", e);
        }
    }

    /**
     * Deleta uma ferramenta do banco de dados pelo seu ID.
     * @param id ID da ferramenta a ser deletada.
     */
    public void deletarFerramenta(int id) {
        try { ferramentaDAO.deletar(id);
            System.out.println("Ferramenta deletada com sucesso.");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao deletar a ferramenta", e);
        }
    }

    /**
     * Verifica se uma ferramenta com o ID especificado já existe no banco de dados.
     * @param id ID da ferramenta a ser verificada.
     * @return True se a ferramenta existe, False caso contrário.
     */
    public boolean verificarExistenciaFerramenta(int id) {
        try {
            Ferramenta ferramenta = ferramentaDAO.buscar(id);
            return ferramenta != null;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao verificar a existência da ferramenta", e);
            return false;
        }
    }
}