package Lista6;

import java.util.ArrayList;
import java.util.List;

public class questao9 {
    public static void main(String[] args) {
        List<Integer> positivos = new ArrayList<>(List.of(3, 7, 12, 25, 40));
        List<Integer> comNegativo = new ArrayList<>(List.of(3, 7, -12, 25, 40));

        boolean todosPositivos1 = positivos.stream().allMatch(n -> n > 0);

        boolean todosPositivos2 = comNegativo.stream().allMatch(n -> n > 0);

        System.out.println("Lista 1: todos positivos? " + todosPositivos1);
        System.out.println("Lista 2: todos positivos? " + todosPositivos2);
    }
}
