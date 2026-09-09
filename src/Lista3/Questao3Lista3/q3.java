package Lista3.Questao3Lista3;

import java.util.Scanner;

public class q3 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true){
            try {
            System.out.println("""
                        0- Continuar
                        1- Fechar""");
            System.out.print("Digite sua escolha: ");
            int escolha = ler.nextInt();
            if(escolha == 1){
                break;
            }
            System.out.print("Digite sua idade: ");
            String idade = ler.next();
            Integer.parseInt(idade);
            System.out.println("Idade: " + idade);

            }catch (NumberFormatException e){
                System.out.println("Erro!!! Digite um valor inteiro!");
            }
        }
    }
}
