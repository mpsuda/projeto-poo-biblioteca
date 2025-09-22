package org.example;

public record Categoria(String nome, String secao) {
    public Categoria {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da categoria e obrigatorio.");
        }
        if (nome.equalsIgnoreCase("Livro Terror")) {
            throw new IllegalArgumentException("Livro Terror nao e aceito.");
        }
        if (secao == null || secao.isBlank()) {
            secao = "sem secao";
        }
    }

    public String getNome() { return nome(); }
}



