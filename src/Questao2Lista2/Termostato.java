package Questao2Lista2;

import java.sql.SQLOutput;

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaDesejada;
    private String modo;

    public Termostato() {
    }

    public Termostato(int temperaturaAtual, int temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void definirTemperaturaDesejada(int temperaturaDesejada) {
        if (temperaturaDesejada >= 16 && temperaturaDesejada <= 30) {
            System.out.println("Temperatura Desejada não modificada");
            return;
        }else  {
            System.out.println("Temperatura Desejada modificada: " + temperaturaDesejada);
            return;
        }
    }

    public void alterarModo(String modo) {
        this.modo = modo;
        return;
    }

    public void executarCiclo() {
        if(this.temperaturaAtual < this.temperaturaDesejada) {
            System.out.println("O compressor irá Esquentar.");
            return;
        }else  if(this.temperaturaAtual > this.temperaturaDesejada){
            System.out.println("O compressor irá Esfriar.");
            return;
        }
    }

    @Override
    public String toString() {
        return "------Termostato------" +
                '\n' + "Temperatura Atual: " + temperaturaAtual +
                '\n' + "Temperatura Desejada: " + temperaturaDesejada +
                '\n' + "Modo: " + modo;
    }
}