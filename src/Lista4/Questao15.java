package Lista4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class Questao15 {
    static void main(String[] args) {
        HashMap<Integer, String> dias = new HashMap<>();
        dias.put(1, "Segunda-feira");
        dias.put(2, "Terça-feira");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta-feira");
        dias.put(5, "Sexta-feira");
        System.out.println(dias);
        dias.replace(3, "Quarta-feira");
        System.out.println(dias);
        dias.replace(6,"Sábado");
        System.out.println(dias);
        System.out.println("A chave 6 não passou a existir.");
    }
}
