package org.example;

public sealed abstract class Livro permits LivroFisico, LivroDigital {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título obrigatório.");
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public static boolean getLivro() {
        return false;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }

    public abstract String exibirDetalhes();


    public class Biblioteca {

        public static void Emprestar() {
            System.out.println("Emprestar");
        }

        public static void main(String[] args) {
            Emprestar();
        }
    }

        public static void Devolver() {
            System.out.println("Devolver");
        }

        public static void main(String[] args) {
            Devolver();
        }
    }

public class Livro {
    private static String livro = "Crepusculo";

    public static String getLivro() {
        return livro;
    }
}



