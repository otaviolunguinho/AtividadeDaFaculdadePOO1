package Lista4;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.forEach(n -> System.out.println(n) );
    }
}
