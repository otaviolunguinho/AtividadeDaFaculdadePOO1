package Lista4;

import java.util.ArrayList;
import java.util.List;

public class Questao3 {
    static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");
        int contador = 0;
        int indicebanana = frutas.indexOf("banana");
        int indiceuva = frutas.indexOf("uva");

        for(int i = 0; i< frutas.size(); i++){
            if(indicebanana == i){
                System.out.println("Banana encontada no indice " + i);
            }

        }

        for(int i = 0; i< frutas.size(); i++){
            if(indiceuva == i){
                System.out.println("Uva encontada no indice " + i);
            }
            else{
                System.out.println("Uva n está na lista.");
            }
        }

    }
}
