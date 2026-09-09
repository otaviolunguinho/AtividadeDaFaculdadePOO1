package Lista2.Questao9Lista2;

public class App {
    public static void main(String[] args) {
        Pedido pedido = new Pedido( new Cliente("Otavio", "otavio122@gmail.com"), new Produto("Placa de vídeo NVIDIA 5090", 12550.99), 1, false );

        pedido.processarPedido();
        System.out.println(pedido);
    }
}
