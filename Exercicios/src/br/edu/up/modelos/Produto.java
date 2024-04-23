package br.edu.up.modelos;

public class Produto {
    private double valor;
    private double valorPorcentagem;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValorPorcentagem() {
        return valorPorcentagem;
    }
    public void setValorPorcentagem(double valorPorcentagem) {
        this.valorPorcentagem = valorPorcentagem;
    }
    
    public double Calcularacrescimo(double valor, double valorPorcentagem){
        double porcentagem = (valor * valorPorcentagem) /100;
        return valor + porcentagem;
    }
}
