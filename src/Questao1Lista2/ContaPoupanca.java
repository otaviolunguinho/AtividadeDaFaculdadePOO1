package Questao1Lista2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String cliente, String conta, String agencia, double saldo, double taxaRendimento) {
        super(cliente, conta, agencia, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$" + String.format("%.2f", rendimento) + " aplicado com sucesso.");
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "------------ContaPoupanca---------------" +
                '\n' + "Taxa de Rendimento: " + taxaRendimento;
    }
}
