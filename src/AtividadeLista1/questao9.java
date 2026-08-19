package AtividadeLista1;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de animais que vc deseja registrar: ");
        int qtdAnimais = sc.nextInt();
        int[] animais = new int[qtdAnimais];
        int contador = 0;

        while(true){
            System.out.println("""
                MENU
                1- Cadastrar Peso
                2- Finalizar
                """);
            int opcao = sc.nextInt();
            if (opcao == 1) {
                if (contador < qtdAnimais) {
                    System.out.print("Digite o peso do animal que deseja registrar: ");
                    int peso = sc.nextInt();
                    animais[contador] = peso;
                    contador++;
                }else {
                    System.out.println("Voce nao pode registrar. Valor maximo atingido!");
                    break;
                }
            }
            if (opcao == 2) {
                break;

            }
        }
        double maior = animais[0];
        double menor = animais[0];
        for (int i = 1; i < qtdAnimais; i++) {
            if (animais[i] > maior) {
                maior = animais[i];
            }
            if (animais[i] < menor) {
                menor = animais[i];
            }
        }
        System.out.println("A quantidade de animais: " + animais.length);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }

}
