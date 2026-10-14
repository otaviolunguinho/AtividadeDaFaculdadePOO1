package Lista5.questao13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class arrai {
    static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("""
                        1- Adicionar Numeros
                        2- Remover Numeros
                        3- Ver A lista de Numeros""");
                System.out.print("Digite a opção: ");
                int opcao = sc.nextInt();
                if (opcao == 1){
                    System.out.print("Digite um numero: ");
                    double numero = sc.nextDouble();
                    numeros.add(numero);
                    System.out.println("Numero Adicionado.");
                }else if (opcao == 2){
                    System.out.print("Digite o indice do numero que deseja remover: ");
                    int indice = sc.nextInt();
                    numeros.remove(indice);
                    System.out.println("Numeros removido.");
                }else if (opcao == 3){
                    System.out.println("Lista de Numero: " + numeros);
                }else{
                    System.out.println("Opção Invalida.");
                }

            }catch(IndexOutOfBoundsException e){
                System.out.println("Adicione mais numeros ou utilize indices corretos...");
            }catch (InputMismatchException e){
                System.out.println("Adicione Apenas numeros...");
            }
        }
    }
}
