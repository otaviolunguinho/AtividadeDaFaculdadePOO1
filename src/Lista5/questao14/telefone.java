package Lista5.questao14;

import java.util.Scanner;

public class telefone {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Numero telefonico: ");
        String tf = sc.nextLine().trim();

//        String numeros = tf.replace("(","").replace(")", "").replace("-","").replace(" ","");
        String numeros = tf.replaceAll("[^0-9]", "");
        boolean soDigitos = true;
        for(int i = 0; i < numeros.length(); i++){
            if (!Character.isDigit(numeros.charAt(i))){
                soDigitos = false;
            }
        }
        if(!soDigitos){
            System.out.println("Erro: Existe não numericos");
        } else if (numeros.length() < 9) {
            System.out.println("O numero deve pelo menos 9 digitos");
        }else {
            System.out.println("Seu numero é : " + tf);
        }
    }
}
