package Lista2.Questao8Lista2;

public class App {
    public static void main(String[] args) {
        BombaCombustivel bc = new BombaCombustivel("Gasolina", 5.50, 1500);
        bc.abastecerPorQuantidade(200);
        bc.abastecerPorValor(250);
    }
}
