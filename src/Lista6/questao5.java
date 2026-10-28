package Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class questao5 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Pedro", "Ana", "José", "Maria", "Antonia", "Augusto", "Carlos", "Francisco"));
        List<String> nomesFiltrados = nomes.stream().filter(n -> n.startsWith("A")).sorted().toList();
        System.out.println(nomesFiltrados);
    }
}
