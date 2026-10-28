package Lista6.questao8;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Pessoa> pessoas = nomes.stream().filter(n-> n.getIdade() > 18).toList();
        System.out.println(pessoas);

    }




    public static List<Pessoa> nomes = List.of(
       new Pessoa("Otavio", 12),
       new Pessoa("Iago", 22),
       new Pessoa("Joao", 13),
       new Pessoa("Lula", 33),
       new Pessoa("Flávio", 32)
   );
}
