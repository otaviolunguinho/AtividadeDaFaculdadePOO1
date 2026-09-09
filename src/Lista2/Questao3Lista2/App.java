package Lista2.Questao3Lista2;

public class App {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana Silva", "111.111.111-11", 5000.0, 0.005, 1000);
        System.out.println("Salário Gerente: " + g1.calcularSalario());
        System.out.println(g1);

        Vendedor v1 = new Vendedor("Carlos Souza", "222.222.222-22", 2000.0, 0.1,1000);
        System.out.println("Salário Vendedor: " + v1.calcularSalario());
        System.out.println(v1);
    }
}
