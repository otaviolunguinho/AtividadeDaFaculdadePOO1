package Questao2Lista2;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma temperatura atual: ");
        int tempA = sc.nextInt();
        System.out.print("Digite uma temperatura Desejada: ");
        int tempD = sc.nextInt();
        System.out.print("Digite o Modo: ");
        String m = sc.next();




        Termostato t = new Termostato(tempA, tempD);

        t.definirTemperaturaDesejada(tempD);
        t.alterarModo("esfriar");
        t.executarCiclo();
        System.out.println(t);
    }
}
