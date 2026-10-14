package Lista5.questao01TratamentoErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {

    try {
    Scanner sc = new Scanner(System.in);


    System.out.print("Digite o primeiro número inteiro: ");
    int num1 = sc.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int num2 = sc.nextInt();


    System.out.println("Divisão: " + num1 / num2);

    }catch (ArithmeticException e){
        System.out.println("Erro ao dividir. Erro: " + e.getMessage());
    }catch (InputMismatchException e){
        System.out.println("Não pode letras na divisão. Erro: " + e.getMessage());
    }finally {
        System.out.println("Saindo do programa...");
    }
    }
}
