package br.edu.up.modelos;

public class Automovel {
    private double km;
    private double litros;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double calcularConsumoMedio (double km, double litros){
        return km/litros;
    } 

}
