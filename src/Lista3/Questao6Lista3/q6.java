package Lista3.Questao6Lista3;

import java.util.Scanner;

public class q6 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true) {
            try {
            System.out.println("""
                    0- Continuar
                    1- Fechar""");
            System.out.print("Digite sua escolha: ");
            int escolha = ler.nextInt();
            if(escolha == 1) {
                break;
            }
            String variavel = null;
            System.out.println(variavel.length());

            }catch (NullPointerException e){
                System.out.println("Erro!!! Uma variavel em seu código está vazia!");
            }
        }
    }
}
