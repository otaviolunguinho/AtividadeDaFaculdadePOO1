package Lista2.Questao5Lista2;

public class App {
    static void main(String[] args) {
        Cachorro c = new Cachorro("Cleiton", 5);
        Gato g = new Gato("Vandesson", 6);

        c.emitirSom();
        g.emitirSom();
        c.mover();
        g.mover();
    }
}
