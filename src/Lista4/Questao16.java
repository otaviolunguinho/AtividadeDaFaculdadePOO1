package Lista4;

import java.util.*;

public class Questao16 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Carla");
        nomes.add("Bruno");
        nomes.add("Diego");

        Set<String> tirarDuplicatas = new LinkedHashSet<>(nomes);
        List<String> resultado = new ArrayList<>(tirarDuplicatas);

        System.out.println(resultado);
    }

}
