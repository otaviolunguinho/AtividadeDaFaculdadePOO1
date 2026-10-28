package Lista6.questao10;

public class Pedido {
    private String id;
    private double valor;


    public Pedido(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return '\n' + "----Pedido-----" +
                '\n' + "Id: " + id +
                '\n' + "Valor: " + valor;
    }
}
