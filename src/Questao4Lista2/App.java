package Questao4Lista2;

public class App {
    static void main(String[] args) {
        Carro carro = new Carro("honda civic", "123a45cd");
        Motorista motorista = new Motorista("Otávio", "123a45cd");
        carro.atribuirMotorista(motorista);
        carro.ligar(motorista);
        System.out.println(carro);
    }
}
