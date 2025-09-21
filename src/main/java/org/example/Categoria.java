package org.example;

public class Categoria {
    private String nome;
    private String secao;

    public Categoria(String nome, String secao) {
        if ("Livro Terror".equalsIgnoreCase(nome)) {
            throw new IllegalArgumentException("Não aceitamos Livro Terror");
        }
        this.nome = nome;
        this.secao = secao;
    }


    public String getNome() { return nome; }
    public String getSecao() { return secao; }

    @Override
    public String toString() {
        return nome + " | Seção: " + secao;
    }
}