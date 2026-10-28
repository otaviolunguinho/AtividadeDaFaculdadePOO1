package Lista6;

import java.util.ArrayList;
import java.util.List;

public class questao2 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Otávio", "Iago", "joão"));
        List<String> nomesAlterados = nomes.stream().map(String::toUpperCase).toList();

        System.out.println(nomesAlterados);
    }
}
