package Lista4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Questoa8 {
    static void main(String[] args) {
        Set<String> cidades = new HashSet<>();

        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("São Luís");
        cidades.forEach(c -> System.out.println(c));

        Iterator<String> iterator = cidades.iterator();
        while (iterator.hasNext()){
            String cidade = iterator.next();
            if (cidade.startsWith("S") || cidade.startsWith("s")){
                iterator.remove();
            }
        }
        System.out.println("Restantes: " + cidades);
    }
}
