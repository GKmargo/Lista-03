package br.edu.up.Exercicios.Modelos;

public class LojaMamaoComAcucar {
    private double vlrCompra;
    
    public double getVlrCompra() {
        return vlrCompra;
    }

    public void setVlrCompra(double vlrCompra) {
        this.vlrCompra = vlrCompra;
    }

    public double CalcularValorPrestacoes (double vlrCompra){
        double vrlPrestacao = vlrCompra / 5;
        return vrlPrestacao;
    }
}
