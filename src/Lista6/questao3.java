package Lista6;

import java.util.ArrayList;
import java.util.List;

public class questao3 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(4,25,32,78,45,13,10,77,58,61,52));

        numeros.forEach(n -> System.out.println(n * 2));

    }
}
