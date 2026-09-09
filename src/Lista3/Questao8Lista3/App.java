package Lista3.Questao8Lista3;

import Lista3.Questao7Lista3.IdadeInvalidaException;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Banco b = new Banco(35560);
        while (true) {
            try {
                System.out.println("""
                        0- Continuar
                        1- Fechar""");
                System.out.print("Digite sua escolha: ");
                int escolha = ler.nextInt();
                if (escolha == 1) {
                    break;
                }
                System.out.print("Digite o valor do saque: ");
                int valor = ler.nextInt();
                b.sacar(valor);
            } catch(SaldoInsuficienteException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
