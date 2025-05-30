/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private String editora;
    private int numeroDePaginas;

    // Métodos
    public void abrir() {
        System.out.println("O livro \"" + titulo + "\" foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro \"" + titulo + "\" foi fechado.");
    }

    public void virarPagina() {
        System.out.println("Virando página...");
    }

    public void lerCapitulo(int numero) {
        System.out.println("Lendo o capítulo " + numero + " de \"" + titulo + "\".");
    }

    // Getters e Setters (opcional)
}