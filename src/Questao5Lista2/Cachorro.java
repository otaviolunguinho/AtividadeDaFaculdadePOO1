package Questao5Lista2;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Au au!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + ": Correndo atrás da bola!");
    }
}
