package Lista5.questao12;

import java.util.Scanner;

public class Cpf {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Use o Formato 123.456.789-10 ou 12345678910");
        System.out.print("Digite um cpf: ");
        String cpf = sc.next().trim();

        String numeros = cpf.replace(".","").replace("-","");
        boolean soNumeros = true;
        for(char c: numeros.toCharArray()){
            if (!Character.isDigit(c)){
                soNumeros = false;
            }
        }
        if(soNumeros == false){
            System.out.println("Erro: Existe não numericos");
        } else if (numeros.length() != 11) {
            System.out.println("O cpf deve ter 11 digitos");
        }else {
            System.out.println("Seu Cpf é : " + cpf);
        }
    }
}
