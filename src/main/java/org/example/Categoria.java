package org.example;

public record Categoria(String nome, String secao) {
    public Categoria {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Categoria não pode ser vazia");
        }
    }

    public String getNome() { return nome; }
}
