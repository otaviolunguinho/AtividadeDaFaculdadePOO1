package Lista3.Questao2Lista3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q2 {
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
            String[] nomes = new String[]{"Otávio", "José", "joão", "Victor", "Iago"};
            System.out.print("Digite o indice do nome desejado: ");
            int indice = ler.nextInt();
            System.out.println(nomes[indice]);

            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição Inválida! O vetor só possui 5 posições (0 à 4)");
            }
        }
    }
}
