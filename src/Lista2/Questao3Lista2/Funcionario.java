package Lista2.Questao3Lista2;

import org.w3c.dom.ls.LSOutput;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private double aliquotaBonus;
    private double totalDeVendas;


    public Funcionario(String nome, String cpf, double salarioBase, double aliquotaBonus, double totalDeVendas){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.aliquotaBonus = aliquotaBonus;
        this.totalDeVendas = totalDeVendas;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public double getAliquotaBonus(){
        return aliquotaBonus;
    }
    public void setAliquotaBonus(double aliquotaBonus){
        this.aliquotaBonus = aliquotaBonus;
    }
    public double getTotalDeVendas(){
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }


    @Override
    public String toString(){
        return "-------Funcionário-------" +
                '\n' + "Nome: " + nome +
                '\n' + "Cpf: " + cpf +
                '\n' + "Salario Base: " + salarioBase +
                '\n' + "Aliquota Bonus: " + aliquotaBonus +
                '\n' + "Total de Vendas: " + totalDeVendas;
    }

    public double calcularSalario(){
        double salarioTotal = (aliquotaBonus * totalDeVendas) + salarioBase;
        return salarioTotal;
    }
}
