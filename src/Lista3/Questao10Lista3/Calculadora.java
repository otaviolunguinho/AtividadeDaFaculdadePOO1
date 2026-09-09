package Lista3.Questao10Lista3;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("""
                        0- Continuar
                        1- Fechar""");
                System.out.print("Digite a Opção: ");
                int opcao = ler.nextInt();
                if (opcao == 1) {
                    break;
                } else if (opcao != 0 && opcao != 1) {
                    System.out.println("Digite 1 ou 0 para continuar NADA ALÉM DISSO!!!");
                    continue;
                }
                System.out.println("------Bem vindo à Calculadora!------");
                System.out.println("");
                System.out.print("Digite o primeiro número: ");
                int num1 = ler.nextInt();
                System.out.print("Digite o segundo número: ");
                int num2 = ler.nextInt();
                System.out.println("""
                        Digite
                        1- Somar
                        2- Subtrair
                        3- Multiplicar
                        4- Dividir""");
                System.out.print("Digite a Operação que quer: ");
                int opcao2 = ler.nextInt();
                switch (opcao2) {
                    case 1:
                        System.out.println("Soma dos numeros: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("A Subtração dos numeros: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("A multiplicação dos numeros: " + (num1 * num2));
                        break;
                    case 4:
                        if(num2 == 0){
                            throw new DivisaoPorZeroException("Não é possível dividir por zero!");
                        }
                        double resultado = (double) num1 / num2;
                        System.out.println("A Divisão dos numeros: " + resultado);
                        break;
                    default:
                        System.out.println("Operação não existente!");


                }

            } catch (InputMismatchException e) {
                System.out.println("As opções e os números pedidos devem ser apenas Númericas!!!!");
                ler.next();
            } catch (DivisaoPorZeroException e){
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Operação Concluida com sucesso!");
            }

        }
    }
}