package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Aurélio");

        try {
            Categoria c = new Categoria("romance", "verde");
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar categoria: " + e.getMessage());
        }

        /*

        Biblioteca biblioteca = new Biblioteca();

        System.out.print("Digite o título do livro: ");
        String livro = sc.nextLine();

        System.out.print("Digite o nome do autor: ");
        String nomeAutor = sc.nextLine();

        System.out.print("Digite o nome da categoria: ");
        String categoria = sc.nextLine();





        var livro2 = "Crepusculo";
        livro2 = 1;
        System.out.println();
        System.out.println(Livro.getLivro());

        sc.close();
        */
    }
}