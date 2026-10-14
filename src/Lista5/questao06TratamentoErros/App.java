package Lista5.questao06TratamentoErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String menu = """
                1 - Somar
                2 - Diminuir
                3 - Multiplicar
                4 - Divisão
                """;
        try {
        while (true){
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();

            System.out.print("Digite o primeiro número: ");
            int num = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();


            if(escolha == 1){
                System.out.println("Soma: " + (num + num2));
            }

            if(escolha == 2){
                System.out.println("Subtração: " + (num - num2));
            }

            if(escolha == 3){
                System.out.println("Multiplicação: " + (num * num2));
            }

            if(escolha == 4){
                System.out.println("Divisão: " + (num / num2));
            }
        }

        }catch (InputMismatchException e){
            System.out.println("Não digite algo do tipo String");
        }catch (ArithmeticException e){
            System.out.println("Não se pode fazer divisão por zero");
        }finally {
            System.out.println("Fechando a operação...");
        }
        }
    }

