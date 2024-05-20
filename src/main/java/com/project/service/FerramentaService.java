package com.project.service;

import com.google.protobuf.ServiceException;
import com.project.dao.FerramentaDAO;
import com.project.model.Ferramenta;

import java.sql.SQLException;
import java.util.List;

public class FerramentaService {
    private final FerramentaDAO ferramentaDAO;

    /**
     * Construtor que recebe uma instância de FerramentaDAO.
     *
     * @param ferramentaDAO Data Access Object para a entidade Ferramenta.
     */
    public FerramentaService(FerramentaDAO ferramentaDAO) {
        this.ferramentaDAO = ferramentaDAO;
    }

    /**
     * Lista todas as ferramentas disponíveis.
     *
     * @return Uma lista de objetos Ferramenta.
     * @throws ServiceException Se ocorrer um erro ao acessar o banco de dados.
     */
    public List<Ferramenta> listar() throws ServiceException {
        try {
            return ferramentaDAO.listar();
        } catch (SQLException e) {
            System.err.println("Erro ao listar ferramentas: " + e.getMessage());
            throw new ServiceException("Erro ao listar ferramentas", e);
        }
    }

    /**
     * Busca uma ferramenta específica pelo seu ID.
     *
     * @param id O ID da ferramenta a ser buscada.
     * @return O objeto Ferramenta correspondente ao ID fornecido.
     * @throws ServiceException Se ocorrer um erro ao acessar o banco de dados.
     */
    public Ferramenta buscarFerramenta(int id) throws ServiceException {
        try {
            return ferramentaDAO.buscar(id);
        } catch (SQLException e) {
            System.err.println("Erro ao buscar a ferramenta com ID: " + id + " - " + e.getMessage());
            throw new ServiceException("Erro ao buscar a ferramenta", e);
        }
    }

    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param ferramenta O objeto Ferramenta a ser inserido.
     * @throws ServiceException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void inserirFerramenta(Ferramenta ferramenta) throws ServiceException {
        try {
            ferramentaDAO.inserir(ferramenta);
        } catch (SQLException e) {
            System.err.println("Erro ao inserir a ferramenta: " + ferramenta + " - " + e.getMessage());
            throw new ServiceException("Erro ao inserir a ferramenta", e);
        }
    }

    /**
     * Atualiza uma ferramenta existente no banco de dados.
     *
     * @param ferramenta O objeto Ferramenta com os dados atualizados.
     * @throws ServiceException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void atualizarFerramenta(Ferramenta ferramenta) throws ServiceException {
        try {
            ferramentaDAO.atualizar(ferramenta);
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar a ferramenta: " + ferramenta + " - " + e.getMessage());
            throw new ServiceException("Erro ao atualizar a ferramenta", e);
        }
    }

    /**
     * Deleta uma ferramenta específica do banco de dados pelo seu ID.
     *
     * @param id O ID da ferramenta a ser deletada.
     * @throws ServiceException Se ocorrer um erro ao acessar o banco de dados.
     */
    public void deletarFerramenta(int id) throws ServiceException {
        try {
            ferramentaDAO.deletar(id);
        } catch (SQLException e) {
            System.err.println("Erro ao deletar a ferramenta com ID: " + id + " - " + e.getMessage());
            throw new ServiceException("Erro ao deletar a ferramenta", e);
        }
    }
}