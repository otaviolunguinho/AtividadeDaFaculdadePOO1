package Lista6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questao7 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("banana", "dodge", "ford", "ferrari", "pegani", "audi", "rolls royce", "programação"));

        long quantidade = palavras.stream()
                .filter(p -> p.length() > 5)
                .count();

        System.out.println("Palavras com mais de 5 letras: " + quantidade);
    }
}
