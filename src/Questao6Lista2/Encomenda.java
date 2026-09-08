package Questao6Lista2;

public class Encomenda {
    private double pesoKg;
    private double distanciaKm;
    private double valorDeclarado;

    public Encomenda(double pesoKg, double distanciaKm, double valorDeclarado) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorDeclarado = valorDeclarado;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public void calcularFretePadrao(){
        double frete = 5 * pesoKg + (distanciaKm * 0.5);
        System.out.println("Frete: " + frete);
    }

    public void calcularFreteExpresso(){
        double freteExpresso = (5 * pesoKg + (distanciaKm * 0.5)) + 30 + (0.01 * valorDeclarado);
        System.out.println("Frete Expresso: " + freteExpresso);
    }

}
