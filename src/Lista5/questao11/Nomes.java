package Lista5.questao11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("""
                        1- Adicionar Nomes
                        2- Remover Nomes
                        3- Ver A lista de Nomes""");
                System.out.print("Digite a opção: ");
                int opcao = sc.nextInt();
                if (opcao == 1){
                    System.out.print("Digite um nome: ");
                    String nome = sc.next();
                    nomes.add(nome);
                    System.out.println("Nome Adicionado.");
                }else if (opcao == 2){
                    System.out.print("Digite o indice do nome que deseja remover: ");
                    int indice = sc.nextInt();
                    nomes.remove(indice);
                    System.out.println("Nome removido.");
                }else if (opcao == 3){
                    System.out.println("Lista de Nomes: " + nomes);
                }else{
                    System.out.println("Opção Invalida.");
                }

            }catch(IndexOutOfBoundsException e){
                System.out.println("Adicione mais nomes ou utilize indices corretos...");
            }
        }
    }
}
