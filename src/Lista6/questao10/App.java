package Lista6.questao10;

import java.util.List;

public class App {
    static void main(String[] args) {
        double somaPedidos = pedidos.stream().mapToDouble(Pedido::getValor).sum();
        System.out.println("Valor total dos pedidos: R$ " + somaPedidos);
    }






    public static List<Pedido> pedidos = List.of(
            new Pedido("1", 10.50),
            new Pedido("2", 20.50),
            new Pedido("3", 30.0),
            new Pedido("4", 40.50),
            new Pedido("5", 50.50)
    );
}
