package br.edu.up.modelos;

public class Vendedor {
    private String nome;
    private double venda;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularComissao (Double salario, Double vendas){
        Double porcentual = (vendas * 15) / 100;
        return salario + porcentual;
    }
}
