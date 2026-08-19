package AtividadeLista1;

import java.util.Locale;
import java.util.Scanner;

public class questao6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("""
                Tipo de Combustível
                (G) Gasolina
                (A) Alcool""");
        System.out.print("Digite a letra do combustível desejado: ");
        String escolha = sc.next();
        System.out.print("Qual é a quantidade de litros que deseja? : ");
        double litros = sc.nextInt();
        if (escolha.equals("G") || escolha.equals("g")) {
           double preco = litros * 5.50;
            System.out.println("Litros: R$ " + preco);
        }else if (escolha.equals("A") || escolha.equals("a")) {
            double preco = litros * 4;
            System.out.println("Litros: R$ " + preco);
        }else {
            System.out.println("Combustível Inválido");
        }
    }
}
