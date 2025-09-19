package org.example;

record Categoria(String categoria, String secao) {
    public Categoria {
        if ("romance".equals(categoria)) {
            throw new IllegalArgumentException("Não aceitamos romance");
        }
    }

    public String getNome() {
        return categoria();
    }
}