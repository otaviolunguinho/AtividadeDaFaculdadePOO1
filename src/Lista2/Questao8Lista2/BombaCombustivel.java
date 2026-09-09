package Lista2.Questao8Lista2;

public class BombaCombustivel {
    private String tipoDeCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoDeCombustivel, double valorPorLitro, double quantidadeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }


    public void abastecerPorValor(double valor){
        double valorParaPagar = valor;
        this.quantidadeCombustivel -= valor;
        System.out.println("O valor ser pago é: R$" + valorParaPagar);
        System.out.println("Quantidade Restante na bomba: " + quantidadeCombustivel + " Litros.");
    }

    public void abastecerPorQuantidade(double quantidade){
        this.quantidadeCombustivel -= quantidade;
        double valorParaPagar = quantidade * valorPorLitro;
        System.out.println("O valor ser pago é: R$" + valorParaPagar);
        System.out.println("Quantidade Restante na bomba: " + quantidadeCombustivel + " Litros.");
    }
}
