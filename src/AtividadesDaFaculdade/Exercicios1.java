package AtividadesDaFaculdade;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("""
                ESCOLHA A OPERÇÃO DEJESADA
                1- SOMA(+)
                2- SUBTRAÇÃO (-)
                3- MULTIPLICACAO (*)
                4- DIVISÃO (/)
                """);
        System.out.print("Escolha a opção: ");
        int escolha = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        switch (escolha){
            case 1:
                int resultado = num1 + num2;
                System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é " + resultado);
                break;
            case 2:
                int resultado2 = num1 - num2;
                System.out.println("O resultado da soma de " + num1 + " - " + num2 + " é " + resultado2);
                break;
            case 3:
                int resultado3 = num1 * num2;
                System.out.println("O resultado da soma de " + num1 + " * " + num2 + " é " + resultado3);
                break;
            case 4:
                double resultado4 = num1 / num2;
                System.out.println("O resultado da soma de " + num1 + " / " + num2 + " é " + resultado4);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
