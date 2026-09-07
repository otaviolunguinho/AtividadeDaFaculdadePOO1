package Questao3Lista2;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private double aliquotaBonus;
    private double totaldeVendas;


    public double calcularSalario() {
        double salario = salarioBase + (totaldeVendas * aliquotaBonus);
        return salario;
    }



    public Funcionario(){

    }


    public Funcionario(String nome, String cpf, double salarioBase, double aliquotaBonus, double totaldeVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.aliquotaBonus = aliquotaBonus;
        this.totaldeVendas = totaldeVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAliquotaBonus() {
        return aliquotaBonus;
    }

    public void setAliquotaBonus(double aliquotaBonus) {
        this.aliquotaBonus = aliquotaBonus;
    }

    public double getTotaldeVendas() {
        return totaldeVendas;
    }

    public void setTotaldeVendas(double totaldeVendas) {
        this.totaldeVendas = totaldeVendas;
    }

    @Override
    public String toString() {
        return "--------Funcionario--------" +
               '\n' + "Nome: " + nome +
                '\n' + "Cpf: " + cpf +
                '\n' + "Salario Base: " + salarioBase +
                '\n' + "A liquota Bonus: " + aliquotaBonus +
                '\n' + "Total de Vendas: " + totaldeVendas +
                '\n' + "------------------";
    }
}
