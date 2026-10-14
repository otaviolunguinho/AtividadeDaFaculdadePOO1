package Lista5.questao08TratamentoErros;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1 - Continuar
                0 - Sair""";
        try {
        while (true){
            System.out.print("Digite número inteiro: ");
            int num = sc.nextInt();
            System.out.println(menu);

            System.out.print("Digite uma opção: ");
            int escolha = sc.nextInt();

            if(escolha == 0){
                break;
            }

            if(escolha == 1){
                continue;
            }
        }

        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage()) ;
        }
    }
}
