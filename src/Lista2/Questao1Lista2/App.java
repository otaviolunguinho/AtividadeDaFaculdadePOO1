package Lista2.Questao1Lista2;

public class App {
    static void main(String[] args) {
        ContaPoupanca cnp = new ContaPoupanca("otavio", "123-X", "Bradesco", 33220.0, 2.0);
        ContaCorrente cnc = new ContaCorrente("Iago", "321-x", "Bradesco", 1220.0, 10);

        cnp.sacar(500);
        System.out.println(cnp);
        System.out.println(" ");
        cnc.depositar(500);
        cnc.sacar(1720);
        System.out.println(cnc);










    }
}
