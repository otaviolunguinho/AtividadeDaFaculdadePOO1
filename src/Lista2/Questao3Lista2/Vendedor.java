package Lista2.Questao3Lista2;

public class Vendedor extends Funcionario {

    private double totaldeVendasIndividual;

    public Vendedor(String nome, String cpf, double salarioBase, double aliquotaBonus, double totaldeVendasIndividual) {
        super(nome, cpf, salarioBase, aliquotaBonus, totaldeVendasIndividual);
        this.totaldeVendasIndividual = totaldeVendasIndividual;
    }

    public double calcularSalario() {
        double bonus = getAliquotaBonus() * totaldeVendasIndividual;
        return getSalarioBase() + bonus;
    }
}
