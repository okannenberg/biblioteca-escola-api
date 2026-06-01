package com.project.biblioteca_escola_api.dto.emprestimoDTO;

import com.project.biblioteca_escola_api.dto.livroDTO.LivroResponseDTO;

import java.time.LocalDate;

public record EmprestimoResponseDTO(
        Long id,
        String nomeAluno,
        LocalDate dataEmprestimo,
        LivroResponseDTO livro
) {
}
