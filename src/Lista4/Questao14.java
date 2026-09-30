package Lista4;

import java.util.HashMap;

public class Questao14 {
    static void main(String[] args) {
        HashMap<String, Pessoa> pessoas = new HashMap<>();
        pessoas.put("222.222.222-22", new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.put("111.111.111-11", new Pessoa("Ana", 19, "111.111.111-11"));
        pessoas.put("333.333.333-33", new Pessoa("Carla", 19, "333.333.333-33"));
        String cpfBusca = "222.222.222-22";
        Pessoa pessoaBuscada = pessoas.get(cpfBusca);
        System.out.println("Busca: " + pessoaBuscada + " (CPF " + cpfBusca + ")");

        System.out.println("Tamanho do mapa: " + pessoas.size());

        System.out.println("Tamanho do mapa: " + pessoas.size());

    }
}
