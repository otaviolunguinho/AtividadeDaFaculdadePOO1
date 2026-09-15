package Lista2.Questao3Lista2;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, String cpf, double salarioBase, double aliquotaBonus, double totalDeVendas){
        super(nome, cpf, salarioBase, aliquotaBonus, totalDeVendas);
    }

    public double calcularSalario(){
        return super.calcularSalario();
    }

    @Override
    public String toString(){
        return super.toString() +
                '\n' + "Tipo: " + "Vendedor";
    }
}
