package Entities;

import java.util.Scanner;

public class ContaBancaria {

    private final int numeroConta;
    private String nameTitular;
    private double saldo = 0.00;

    public ContaBancaria(int numeroConta, String nameTitular) {
        this.nameTitular = nameTitular;
        this.numeroConta = numeroConta;
    }
    public ContaBancaria(int numeroConta, String nameTitular, double initialDeposit) {
        this.nameTitular = nameTitular;
        this.numeroConta = numeroConta;
        deposito(initialDeposit);
    }

    public String getNameTitular() {
        return nameTitular;
    }

    public void setNameTitular(String nameTitular) {
        this.nameTitular = nameTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titular: "
                + nameTitular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
    public void saque(double valorSaque) {
        saldo -= valorSaque + 5.0;
        toString();
    }
    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
        toString();
    }
}


