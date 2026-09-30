package Lista4;

import java.util.Map;
import java.util.TreeMap;

public class Questao13 {
    static void main(String[] args) {
        TreeMap<String, Integer> pessoa = new TreeMap<>();
        pessoa.put("Rafael", 33);
        pessoa.put("Beatriz", 27);
        pessoa.put("Lucas", 19);
        pessoa.put("Amanda", 45);
        pessoa.put("Gustavo", 22);
        for (Map.Entry<String, Integer> entry : pessoa.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Primeira: " + pessoa.firstKey() + " | Ùltima: " + pessoa.lastKey());
    }
}
