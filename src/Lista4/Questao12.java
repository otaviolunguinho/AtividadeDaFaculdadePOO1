package Lista4;

import java.util.HashMap;
import java.util.Map;

public class Questao12 {
    static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        Integer idadeJoao = pessoas.get("João");
        System.out.println("João tem " + idadeJoao + " anos");

        String nomeBusca = "Ana";
        if (pessoas.containsKey(nomeBusca)) {
            System.out.println(nomeBusca + " tem " + pessoas.get(nomeBusca) + " anos");
        } else {
            System.out.println(nomeBusca + " não está cadastrada");
        }
    }
}
