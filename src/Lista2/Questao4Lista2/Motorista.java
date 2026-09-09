package Lista2.Questao4Lista2;

public class Motorista {
    private String nome;
    private String numeroCNH;

    public Motorista(String nome, String numeroCNH) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    @Override
    public String toString() {
        return '\n' + "-----Motorista------" +
                '\n' + "Nome: " + nome +
                '\n' + "Número da CNH: '" + numeroCNH ;
    }
}
