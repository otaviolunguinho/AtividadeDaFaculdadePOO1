package Questao1Lista2;

import javax.print.DocFlavor;

public class ContaBancaria {
    private String cliente;
    private String conta;
    private String agencia;
    private double saldo;


    public ContaBancaria() {

    }

    public ContaBancaria(String cliente, String conta, String agencia, double saldo) {
        this.cliente = cliente;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor<=0){
            System.out.println("Valor invalido");
            return;
        }
        this.saldo += valor;
    }


    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente. Saque inválido.");
            return;
        }
        saldo -= valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "-------ContaBancaria--------" +
                '\n' + "Cliente: " + cliente +
                '\n' + "Conta: " + conta +
                '\n' + "Agencia: " + agencia  +
                '\n' + "Saldo: " + saldo;
    }
}
