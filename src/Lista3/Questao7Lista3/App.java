package Lista3.Questao7Lista3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
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
                System.out.print("Digite sua idade: ");
                int idade = ler.nextInt();
                c.cadastrarIdade(idade);
            } catch(IdadeInvalidaException e){
                System.out.println(e.getMessage());
            }
        }

    }
}