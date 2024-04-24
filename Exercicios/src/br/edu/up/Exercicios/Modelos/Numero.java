package br.edu.up.Exercicios.Modelos;

public class Numero {
    private double[] num = new double[80];
    private int contador = 0;
    
    public double[] getNum() {
        return num;
    }
    public void setNum(double[] num) {
        this.num = num;
    }
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
