package Lista4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Questao6 {
    static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoa.add(new Pessoa("Diego", 22, "444.444.444-44"));
        pessoa.add(new Pessoa("Ana", 28, "111.111.111-11"));
        pessoa.add(new Pessoa("Carla", 35, "333.333.333-33"));
        Comparator.comparingInt(Pessoa::getIdade);
        System.out.println("Por Idade: ");
        pessoa.forEach(pessoa1 -> System.out.println(pessoa1));
        pessoa.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println();
        System.out.println("Por Nome: ");
        pessoa.forEach(pessoa1 -> System.out.println(pessoa1));
    }
}
