package br.edu.up.Exercicios.Modelos;

public class Lucro {
    private double precoCusto;
    private double precoVenda;
    
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String calcularLucroPrejuizoEmpate(){
        if(precoVenda > precoCusto){
            return "Produto Lucrou";
        } else if (precoVenda < precoCusto){
            return "Produto causou prejuizo";
        } else {
            return "Houve um empate";
        } 
    }
}
