package Lista3.Questao1Lista3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q1 {
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
                System.out.print("Digite o 1° número: ");
                int n1 = ler.nextInt();
                System.out.print("Digite o 2° número: ");
                int n2 = ler.nextInt();
                System.out.println("Resultado: " + (n1/n2));

            }catch(InputMismatchException e){
                System.out.println("Apenas números.....");
                ler.close();
            }catch(ArithmeticException e){
                System.out.println("Não digite 0 como denumerador...");
            }

        }

    }


}
