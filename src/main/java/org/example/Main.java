package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Marcos");

        try {
            Categoria c = new Categoria("Livro Terror", "D");
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar categoria: " + e.getMessage());
        }


        Biblioteca biblioteca = new Biblioteca();
        Livro LivroDigital = null;
        biblioteca.adicionarLivro(LivroDigital);
        Livro LivroFisico = null;
        biblioteca.adicionarLivro(null);
        biblioteca.listarLivros();


        void mostrarDetalhes;(Livro) {
                switch (Livro) {
                    case LivroFisico fisico -> System.out.println("FÍSICO → " + fisico.exibirDetalhes());
                    case LivroDigital digital -> System.out.println("DIGITAL → " + digital.exibirDetalhes());
                }
        }

        var livro2 = "Crepusculo";
        System.out.println();
        System.out.println(Livro.getLivro());

        sc.close();
    }
}