package Lista2.Questao7Lista2;

public class App {
    public static void main(String[] args) {
        LampadaInteligente li = new LampadaInteligente(false, 50, "branca");
        li.ligar();
        li.ajustarIntencidade(li.getIntencidade());
        li.mudarCor(li.getCor());
        li.ajustarIntencidade(75);
        li.mudarCor("vermelho");
        li.desligar();
    }
}
