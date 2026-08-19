package AtividadeLista1;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        boolean temNumero = false;
        boolean temMaiusculas = false;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite uma senha: ");
            String senha = sc.next();
            if (senha.length() < 8) {
                System.out.println("Senha invalida. A senha deve ter no minimo 8 caracteres");
                continue;
            } else {
                for (int i = 0; i < senha.length(); i++) {
                    char c = senha.charAt(i);

                    if (Character.isUpperCase(c)) {
                        temMaiusculas = true;
                    }
                    if (Character.isDigit(c)) {
                        temNumero = true;
                    }
                }
                if (!temNumero) {
                    System.out.println("A Senha deve conter no minimo um numero!");
                } else {
                    if (!temMaiusculas) {
                        System.out.println("A senha deve conter no minimo uma letra maiscula!");
                    }else{
                        System.out.println("Senha Cadastrada! Com sucesso!");
                        break;
                    }
                }
            }


        }
    }
}
