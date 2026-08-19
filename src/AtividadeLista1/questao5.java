package AtividadeLista1;

import java.util.Locale;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Digite seu nome de usuário: ");
        String nomeusu = sc.next();
        System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();
        if (nomeusu.equals("admin") && senha == 1234 ) {
            System.out.println("Login bem sucedido");
        } else {
            System.out.println("Login inválido");
        }
    }
}
