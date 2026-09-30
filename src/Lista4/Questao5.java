package Lista4;

import java.util.LinkedList;
import java.util.List;

public class Questao5 {
    static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.addFirst(0);
        numeros.addLast(6);
        System.out.println(numeros);
        System.out.println("Primeiro: " + numeros.getFirst() + " | " + "Último: " + numeros.getLast() );
    }
}
