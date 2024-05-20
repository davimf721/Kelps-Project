package com.project.service;

import com.project.dao.AmigoDAO;
import com.project.model.Amigo;

import java.sql.SQLException;
import java.util.List;


/**
 * Classe de serviço para gerenciar operações relacionadas aos amigos.
 */

public class AmigoService {
    private final AmigoDAO amigoDAO;

    public AmigoService(AmigoDAO amigoDAO) {
        this.amigoDAO = amigoDAO;
    }
    public void inserirAmigo(Amigo amigo) throws SQLException {
        amigoDAO.inserir(amigo);
    }
    public List<Amigo> listar() throws SQLException {
        return amigoDAO.listar();
    }

    public Amigo buscar(int id) throws SQLException {
        return amigoDAO.buscar(id);
    }

    public void atualizarAmigo(Amigo amigo) throws SQLException {
        amigoDAO.atualizar(amigo);
    }

    public void deletarAmigo(int id) throws SQLException {
        amigoDAO.deletar(id);
    }
}
