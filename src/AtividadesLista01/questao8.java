package AtividadeLista1;

import java.util.Locale;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quanto vc ganha por hora: ");
        double ganhoPorHora = sc.nextDouble();
        System.out.print("Quantas horas vc trabalha no mês: ");
        double horasTrabalhadasMes = sc.nextDouble();
        double salarioBruto = ganhoPorHora * horasTrabalhadasMes;
        double inss = (salarioBruto * 11 / 100);
        double ir = (salarioBruto * 8 / 100);
        double sindicato = (salarioBruto * 5 / 100);
        double salarioLiquido = (salarioBruto - ir - inss - sindicato);

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto de Renda: R$ " + ir);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
