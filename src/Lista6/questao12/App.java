import Lista6.questao12.Autonomo;
import Lista6.questao12.Servicos;
import Lista6.questao12.Servicos;
import Lista6.questao12.TipoServico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Autonomo> autonomos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar autônomo");
            System.out.println("2 - Cadastrar serviço");
            System.out.println("3 - Consultar serviços");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();
                autonomos.add(new Autonomo(nome, cpf));

            } else if (opcao == 2) {
                System.out.print("Digite o cpf: ");
                String cpf = sc.nextLine();

                for (Autonomo a : autonomos) {
                    if (a.getCpf().equals(cpf)) {
                        System.out.print("Tipo (1-ELETRICO, 2-HIDRAULICO, 3-ALVENARIA): ");
                        int tipo = Integer.parseInt(sc.nextLine());
                        System.out.print("Valor: ");
                        double valor = Double.parseDouble(sc.nextLine());

                        a.adicionarServico(new Servicos(TipoServico.values()[tipo - 1], valor));
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o cpf: ");
                String cpf = sc.nextLine();

                for (Autonomo a : autonomos) {
                    if (a.getCpf().equals(cpf)) {
                        Map<TipoServico, Double> porTipo = a.getServicos().stream()
                                .collect(Collectors.groupingBy(Servicos::getTipo, TreeMap::new,
                                        Collectors.summingDouble(Servicos::getValor)));

                        double total = a.getServicos().stream()
                                .mapToDouble(Servicos::getValor)
                                .sum();

                        System.out.println("*************************");
                        System.out.println("Usuario: " + a.getNome() + " - CPF:" + a.getCpf());
                        porTipo.forEach((t, v) ->
                                System.out.println(" Serviço : " + t + "| Valor R$: " + v));
                        System.out.println("Total R$: " + total);
                        System.out.println("*********************");
                    }
                }
            }
        } while (opcao != 0);
    }
}