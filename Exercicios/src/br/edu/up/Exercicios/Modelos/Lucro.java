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
        double lucro = precoCusto - precoVenda;
        if(lucro > precoCusto){
            return "Produto Lucrou";
        } else if (lucro < precoCusto){
            return "Produto causou prejuizo";
        } else if (lucro == precoCusto){
            return "Houve um empate";
        } else{
            return null;
        }
    }
}
