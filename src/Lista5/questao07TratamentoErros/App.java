package Lista5.questao07TratamentoErros;

public class App {
    static void main(String[] args) {
        String[] nomes = {"0.4" , "5.6" , "5.8", "7.9", "Otávio"};
        try {

        for (String p:nomes){
            Character.isDigit((char) Double.parseDouble(p));

            System.out.println("Strings convertidas: " + p);
        }
        }catch (NumberFormatException e){
            System.out.println("Erro tratado. Algumas strings não podem ser convertidas");
        }
    }
}
