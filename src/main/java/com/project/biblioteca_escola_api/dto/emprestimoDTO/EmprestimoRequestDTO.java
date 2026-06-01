package com.project.biblioteca_escola_api.dto.emprestimoDTO;

import java.time.LocalDate;

public record EmprestimoRequestDTO (
        String nomeAluno,
        LocalDate dataEmprestimo,
        Long livroId
){
}
