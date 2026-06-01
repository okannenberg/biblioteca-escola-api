package com.project.biblioteca_escola_api.model;

import java.util.Date;

public class Emprestimo {
    private Long id;
    private String nome_aluno;
    private Date data_emprestimo;
    private Long livro_id;

    public Emprestimo(Long id, String nome_aluno, Date data_emprestimo, Long livro_id) {
        this.id = id;
        this.nome_aluno = nome_aluno;
        this.data_emprestimo = data_emprestimo;
        this.livro_id = livro_id;
    }

    public Emprestimo(String nome_aluno, Date data_emprestimo, Long livro_id) {
        this.nome_aluno = nome_aluno;
        this.data_emprestimo = data_emprestimo;
        this.livro_id = livro_id;
    }

    public Emprestimo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Long getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(Long livro_id) {
        this.livro_id = livro_id;
    }
}
