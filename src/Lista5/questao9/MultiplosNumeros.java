package Lista5.questao9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MultiplosNumeros {
    static void main(String[] args){
        List<Double> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double denominador = 0;
        while (true){
            try{
                System.out.print("Digite o número que vai ser adicionado na Lista: ");
                double n = sc.nextDouble();
                numeros.add(n);
                denominador += n;
                contador++;
                System.out.print("Deseja continuar S/n: ");
                String opcao = sc.next();
                if (opcao.equals("N") || opcao.equals("n")){
                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("Adicione apenas Numeros à lista...");
                sc.next();
            }
        }
        double media = denominador / contador;
        System.out.println("A media é " + media);
    }
}
