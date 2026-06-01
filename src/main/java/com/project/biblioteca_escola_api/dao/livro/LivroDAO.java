package com.project.biblioteca_escola_api.dao.livro;

import com.project.biblioteca_escola_api.model.Livro;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface LivroDAO {
    Livro saveLivro(Livro livro) throws SQLException;
    List<Livro> findAllLivros() throws SQLException;
    Optional<Livro> findLivroPorId(Long id) throws SQLException;
    boolean existsLivroPorId(Long id) throws SQLException;
    void atualizarLivro(Livro livro) throws SQLException;
    void deletarLivroPorId(Long id) throws SQLException;
}