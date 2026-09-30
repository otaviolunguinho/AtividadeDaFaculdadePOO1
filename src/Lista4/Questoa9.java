package Lista4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Questoa9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        if (numeros.contains(num)){
            System.out.println(num + " Está no conjunto.");
        }else {
            System.out.println(num + " Não está no conjunto.");
        }

    }
}
