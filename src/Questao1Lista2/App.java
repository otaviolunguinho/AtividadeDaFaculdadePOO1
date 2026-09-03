package Questao1Lista2;

public class App {
    static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("otavio", "123-X", "Bradesco", 33220.0, 2.0);
        ContaCorrente cc = new ContaCorrente("Iago", "321-x", "Bradesco", 1220.0, 10);

        cp.sacar(500);
        System.out.println(cp);
        System.out.println(" ");
        cc.depositar(500);
        cc.sacar(1720);
        System.out.println(cc);










    }
}
