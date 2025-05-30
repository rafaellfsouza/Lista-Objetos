/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celular;

public class Celular {
    // Atributos
    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private int bateria;
    private String cor;

    // Métodos
    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void desligar() {
        System.out.println("Celular desligado.");
    }

    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void enviarMensagem(String numero, String texto) {
        System.out.println("Enviando para " + numero + ": " + texto);
    }

    public void abrirApp(String nomeApp) {
        System.out.println("Abrindo o app " + nomeApp + "...");
    }

    // Getters e Setters (opcional)
}