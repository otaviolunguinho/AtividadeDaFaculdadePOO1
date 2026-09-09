package AtividadeLista1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        for (int x = 0; x <= 10; x++) {
            System.out.println(num + " x " + x + " = " + (num * x));
        }
    }
}
