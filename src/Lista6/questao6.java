package Lista6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questao6 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(4, 25, 32, 78, 45, 13, 10, 77, 58, 61, 52));

        int maior = numeros.stream()
                .max(Integer::compare)
                .get();

        System.out.println("Maior número: " + maior);
    }
}
