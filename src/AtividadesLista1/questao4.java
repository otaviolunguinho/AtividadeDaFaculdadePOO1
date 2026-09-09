package AtividadeLista1;

import java.util.Locale;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        System.out.print("Digite seu peso: ");
        double peso = s.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }
    }
}
