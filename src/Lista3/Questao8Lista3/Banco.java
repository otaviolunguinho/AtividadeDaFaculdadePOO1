package Lista3.Questao8Lista3;

public class Banco {
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente!!!! Valor do saque: R$" + valor + " Valor do saldo: R$" + saldo);
        }
        System.out.println("Saque Aprovado!!!! Valor do saque: " + valor);
        saldo -= valor;
    }
}
