package Lista5.questao02TratamentoErros;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Digite algo: ");

        String palavra = sc.next();

        Character.isDigit(Integer.parseInt(palavra));


        System.out.println("Conversão para inteiro: " + palavra);

        }catch (NumberFormatException e){
            System.out.println("Não digite nomes. ERRO:  " + e.getMessage());
        }
    }
}
