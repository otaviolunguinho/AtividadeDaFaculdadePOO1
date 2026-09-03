package Questao1Lista2;

public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial;

    public ContaCorrente(String cliente, String conta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, conta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }


    @Override
    public String toString() {
        return super.toString() + '\n' +  "-----ContaCorrente-----" +
               '\n' + "Cheque Especial: " + chequeEspecial;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return;
        }
        double limiteDisponivel = getSaldo() + chequeEspecial;

        if (valor > limiteDisponivel) {
            System.out.println("Saque não permitido: valor excede o saldo + cheque especial disponível.");
            return;
        }
        setSaldo(limiteDisponivel - valor);
    }

}
