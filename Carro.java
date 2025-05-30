/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private int velocidadeAtual;

    // Métodos
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar(int velocidade) {
        velocidadeAtual += velocidade;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear(int reducao) {
        velocidadeAtual = Math.max(0, velocidadeAtual - reducao);
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void trocarMarcha(String marcha) {
        System.out.println("Trocou para a marcha " + marcha);
    }

    // Getters e Setters (opcional)
}