package Lista2.Questao5Lista2;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Miau!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + ": Andando no telhado!");
    }

}
