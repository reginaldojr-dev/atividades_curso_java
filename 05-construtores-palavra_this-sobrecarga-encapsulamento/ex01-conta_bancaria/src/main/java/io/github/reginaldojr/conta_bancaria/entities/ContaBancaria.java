package io.github.reginaldojr.conta_bancaria.entities;

public class ContaBancaria {
    private String titular;
    private final int conta;
    private double saldo;

    private static final double taxa = 5.0;


    public ContaBancaria(String titular, int conta, double depositoInicial) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = 0.0;

        if (depositoInicial >0) {
            depositar(depositoInicial);
        }
    }

    public ContaBancaria(String titular, double depositoInicial, int conta) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = 0.0;

        if (depositoInicial >0) {
            depositar(depositoInicial);
        }
    }

    public String getTitular() {
        return titular;
    }

    public int getConta() {
        return conta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setTitular(String titular) {
        this.titular = this.titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 ) {
            saldo -= valor + taxa;
        }
    }
}
