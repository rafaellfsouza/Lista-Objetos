/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

public class ContaBancaria {
    // Atributos
    private String numeroDaConta;
    private String titular;
    private double saldo;
    private String tipo; // corrente ou poupança

    // Métodos
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Getters e Setters (opcional)
}