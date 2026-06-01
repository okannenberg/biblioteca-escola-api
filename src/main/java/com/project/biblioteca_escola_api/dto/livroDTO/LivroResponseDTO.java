package com.project.biblioteca_escola_api.dto.livroDTO;

public record LivroResponseDTO(
        Long id,
        String titulo,
        String autor,
        boolean disponivel
) {
}
