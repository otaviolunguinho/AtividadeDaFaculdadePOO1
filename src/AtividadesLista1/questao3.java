package AtividadeLista1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O número maior é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O número maior é " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O número maior é " + num3);
        }
    }
}
