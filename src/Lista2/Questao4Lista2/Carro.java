package Lista2.Questao4Lista2;

public class Carro {
    private String modelo;
    private String placa;
    private boolean ligado;
    Motorista motorista;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.ligado = false;
        this.motorista = null;
    }

    public void atribuirMotorista(Motorista motorista) {
        this.motorista = motorista;
        System.out.println("Motorista " + motorista.getNome() + " vinculado ao carro e sua Cnh é " + motorista.getNumeroCNH());
        return;
    }

    public boolean ligar(Motorista motorista) {
        System.out.println("Motorista " + motorista.getNome() + " ligou o carro ");
        return true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "------Carro------" +
                '\n' + "Modelo: " + modelo +
                '\n' + "Placa: " + placa +
                '\n' + "Ligado: " + ligado +
                '\n' + "Motorista: " + motorista;
    }
}
