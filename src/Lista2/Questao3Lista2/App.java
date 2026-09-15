package Lista2.Questao3Lista2;

public class App {
    public static void main(String[] args){

        Gerente g = new Gerente("Otávio", "23133232323", 4000, 0.005, 200);
        Vendedor v = new Vendedor("Iago", "121212122", 2000, 0.01, 400);

        System.out.println(g);
        System.out.println("Salário Total: " + g.calcularSalario());
        System.out.println("");
        System.out.println(v);
        System.out.println("Salário Total: " + v.calcularSalario());
    }
}
