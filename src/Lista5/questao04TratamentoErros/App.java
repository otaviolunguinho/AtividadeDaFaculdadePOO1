package Lista5.questao04TratamentoErros;

import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String algo = sc.nextLine();


        if (algo == null) {
            System.out.println("Null detectado. Analisando o tamanho..");
        }


        try {
            int tamanho = algo.length();
            System.out.println("Tamanho da palavra: " + tamanho);
        }catch (NullPointerException e){
            System.out.println("Não é possível analisar o tamanho sendo null.");
        }
    }
}
