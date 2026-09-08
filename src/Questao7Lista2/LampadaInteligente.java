package Questao7Lista2;

public class LampadaInteligente {
    private boolean ligado;
    private int intencidade;
    private String cor;

    public LampadaInteligente(boolean ligado, int intencidade, String cor) {
        this.ligado = ligado;
        this.intencidade = intencidade;
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getIntencidade() {
        return intencidade;
    }

    public void setIntencidade(int intencidade) {
        this.intencidade = intencidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void ligar(){
        this.ligado = true;
        System.out.println("Lâmpada Ligada.");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Lampada Desligada.");
    }

    public void ajustarIntencidade(int intencidade){
        if(this.ligado){
            this.intencidade = intencidade;
            System.out.println("Lampada Ajustada para: " + this.intencidade + "%");
        }
    }

    public void mudarCor(String cor){
        if(this.ligado){
            this.cor = cor;
            System.out.println("Lampada Mudada para: " + this.cor);
        }
    }
}

