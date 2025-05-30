/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private double altura;
    private double peso;

    // Métodos
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void comer(String comida) {
        System.out.println(nome + " está comendo " + comida + ".");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void falar(String mensagem) {
        System.out.println(nome + " disse: \"" + mensagem + "\"");
    }

    public void correr(double velocidade) {
        System.out.println(nome + " está correndo a " + velocidade + " km/h.");
    }

    // Getters e Setters (opcional)
}