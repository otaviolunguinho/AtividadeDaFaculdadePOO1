package Lista3.Questao5Lista3;

import java.util.Scanner;

public class q5 {
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
            System.out.println("Abrindo Arquivo..");
            System.out.println("Abrindo Arquivo....");
            System.out.println("Abrindo Arquivo......");
            System.out.print("Digite um texto: ");
            String texto = ler.next();
            Integer.parseInt(texto);
            System.out.println("Dado do Arquivo Encontrado: " + texto);

            } catch(NumberFormatException e) {
                System.out.println("Erro!!! Digite um valor inteiro para o texto!");
            }finally {
                System.out.println("Arquivo finalizado!");
            }
        }
    }
}
