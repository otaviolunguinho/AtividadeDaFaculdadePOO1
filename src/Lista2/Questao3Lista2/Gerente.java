package Lista2.Questao3Lista2;

public class Gerente extends Funcionario{
    private double totaldeVendasLoja;

    public Gerente(double totaldeVendasLoja) {
        this.totaldeVendasLoja = totaldeVendasLoja;
    }

    public Gerente(String nome, String cpf, double salarioBase, double aliquotaBonus, double totaldeVendasLoja) {
        super(nome, cpf, salarioBase, aliquotaBonus, totaldeVendasLoja);
        this.totaldeVendasLoja = totaldeVendasLoja;
    }

    @Override
    public double calcularSalario() {
        double bonus = getAliquotaBonus() * totaldeVendasLoja;
        return getSalarioBase() + bonus;
    }

}
