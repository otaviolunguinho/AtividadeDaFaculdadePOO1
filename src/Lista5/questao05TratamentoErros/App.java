package Lista5.questao05TratamentoErros;

public class App {
    static void main(String[] args) {
        String [] nomes = {"Otavio", "Nikoly",null, "Joao Vitor"};

        try {
        for (String n:nomes){
            System.out.println("Nomes em maiúsculo: " + n.toUpperCase());
        }

        } catch (NullPointerException e) {
            System.out.println("NULL NÃO PODE DEIXAR EM MAIUSCULO. ERRO: " + e.getMessage());;
        }
    }
}
