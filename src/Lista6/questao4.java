package Lista6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questao4 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(4, 25, 32, 5, 45, 13, 8, 77, 58, 2, 52));

        long quantidade = numeros.stream()
                .filter(n -> n > 10)
                .count();

        System.out.println("Números maiores que 10: " + quantidade);
    }
}
