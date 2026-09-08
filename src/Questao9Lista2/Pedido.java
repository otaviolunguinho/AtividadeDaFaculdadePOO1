package Questao9Lista2;

public class Pedido {
    Cliente cliente;
    Produto produto;
    private int quantidade;
    private boolean pago;

    public Pedido(Cliente cliente, Produto produto, int quantidade, boolean pago) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pago = pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void processarPedido(){
        double valor = (getQuantidade() * getProduto().getPreco());
        System.out.println("Pedido realizado com sucesso!");
        System.out.println("Valor: " + valor);
        pago = true;

    }

    @Override
    public String toString() {
        return "----Pedido-----" +
                '\n' + "Quantidade: " + quantidade +
                '\n' + "Pago: " + pago +
                '\n' + cliente +
                '\n' + produto;
    }
}
