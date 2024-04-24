package br.edu.up.Exercicios.Modelos;

public class CarroNovo {
    private double valorFabrica;
    
    public double getValorFabrica() {
        return valorFabrica;
    }

    public void setValorFabrica(double valorFabrica) {
        this.valorFabrica = valorFabrica;
    }

    public double calcularValorTotalDoCarro(double valorFabrica){
        double distribuidor = 0.28;
        double imposto = 0.45;

        double valorImposto = valorFabrica * imposto;
        double valorCarro = valorImposto + valorFabrica;
        double valorDistribuidor = valorCarro * distribuidor;
        double valorFinal = valorCarro + valorDistribuidor;

        return valorFinal;
}
}
