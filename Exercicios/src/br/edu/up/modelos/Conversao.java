package br.edu.up.modelos;

public class Conversao {
    private double dolar;
    private double conotacaoDolar;

    public double getDolar() {
        return dolar;
    }
    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
    public double getConotacaoDolar() {
        return conotacaoDolar;
    }
    public void setConotacaoDolar(double conotacaoDolar) {
        this.conotacaoDolar = conotacaoDolar;
    }

    public double calcularDolarParaReal (double dolar, double conotacaoDolar){
        double real = dolar * conotacaoDolar;
        return real;
    }
}
