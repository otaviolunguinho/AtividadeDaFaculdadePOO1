package Lista3.Questao9Lista3;

import Lista3.Questao8Lista3.Banco;
import Lista3.Questao8Lista3.SaldoInsuficienteException;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
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
                System.out.print("Digite o nome do item: ");
                String n = ler.next();
                System.out.print("Digite a quantidade do item: ");
                int q = ler.nextInt();
                System.out.print("Digite o preço do item: ");
                int p = ler.nextInt();
                Carrinho c = new Carrinho(n, q, p);
                c.adicionarItem();
            } catch(QuantidadeInvalidaException e){
                System.out.println(e.getMessage());
            } catch(PrecoInvalidoexception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
