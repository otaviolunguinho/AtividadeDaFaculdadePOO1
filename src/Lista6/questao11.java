package Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class questao11 {
    static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("banana", "dodge", "ford", "ferrari", "pegani", "audi", "rolls royce", "programação"));
        Map<Integer, List<String>> agrupadas = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupadas);
    }
}
