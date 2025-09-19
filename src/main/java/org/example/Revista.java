package org.example;

public abstract class Revista implements Emprestavel {
    private String titulo;
    private int numero;
    private Categoria categoria;

    public Revista(String titulo, int numero, Categoria categoria) {
        this.titulo = titulo;
        this.numero = numero;
        this.categoria = categoria;
    }
}