package Lista5.questao03TratamentoErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] numeros = {1, 2, 3, 4};

            System.out.print("Digite um índice: ");

            int indice = sc.nextInt();

            System.out.println("Numero encontrado: " + numeros[indice]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("ÍNDICE INVÁLIDO");
        }finally {
            System.out.println("Fechando programa...");
        }
    }
}