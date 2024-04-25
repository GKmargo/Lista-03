package br.edu.up.Exercicios.Modelos;

public class ConcessionariaCarangoVelho {
    private int ano;
    private double preco;
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorDesconto(){
        if (ano <= 2000){
            return preco * 0.12;
        } else {
            return preco * 0.07;
        }
    }

    public double valorCarro(){
        return preco - valorDesconto();
    }
}
