package com.project.service;

import com.project.dao.AmigoDAO;
import com.project.model.Amigo;

import java.sql.SQLException;
import java.util.List;

/**
 * Fornecer serviços relacionados à entidade Amigo.
 */
public class AmigoService {
    private final AmigoDAO amigoDAO;

    /**
     * Construtor da classe AmigoService.
     *
     * @param amigoDAO O objeto AmigoDAO responsável pela interação com o banco de dados.
     */
    public AmigoService(AmigoDAO amigoDAO) {
        this.amigoDAO = amigoDAO;
    }

    /**
     * Insere um novo amigo no banco de dados.
     *
     * @param amigo O objeto Amigo a ser inserido
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public void inserirAmigo(Amigo amigo) throws SQLException {
        amigoDAO.inserir(amigo);
    }

    /**
     * Retorna uma lista de todos os amigos cadastrados.
     *
     * @return Lista de amigos
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public List<Amigo> listar() throws SQLException {
        return amigoDAO.listar();
    }

    /**
     * Busca um amigo no banco de dados com base no ID.
     *
     * @param id O ID do amigo a ser buscado
     * @return O amigo encontrado, ou null se não encontrado
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public Amigo buscar(int id) throws SQLException {
        return amigoDAO.buscar(id);
    }

    /**
     * Atualiza as informações de um amigo no banco de dados.
     *
     * @param amigo O objeto Amigo com as informações atualizadas
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public void atualizarAmigo(Amigo amigo) throws SQLException {
        amigoDAO.atualizar(amigo);
    }

    /**
     * Deleta um amigo do banco de dados com base no ID.
     *
     * @param id O ID do amigo a ser deletado
     * @throws SQLException se ocorrer um erro ao acessar o banco de dados
     */
    public void deletarAmigo(int id) throws SQLException {
        amigoDAO.deletar(id);
    }
}
