package Lista3.Questao9Lista3;

public class Carrinho {
        private String nome;
        private int quantidade;
        private  double preco;

    public Carrinho(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarItem(){
        if(quantidade <= 0){
            throw new QuantidadeInvalidaException("Quantidade invalida! Apenas quantidades positivas são válidas");

        }

        if(preco <= 0){
            throw new PrecoInvalidoexception("O preço não pode ser 0 ou negativo!!!");
        }
        System.out.println("Sua compra foi Concluida!!!");
    }
}
