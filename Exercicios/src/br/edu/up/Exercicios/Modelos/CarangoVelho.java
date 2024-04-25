package br.edu.up.Exercicios.Modelos;

public class CarangoVelho {

    Double valorVeiculo;
    String combustivel;

    public Double getDesconto() {

        if(combustivel.equals("álcool") ||combustivel.equals("alcool") || combustivel.equals("a") ){
            return  valorVeiculo * 0.25;
        }
        if(combustivel.equals("gasolina") || combustivel.equals("g")){
            return valorVeiculo * 0.21;
        }
        if(combustivel.equals("diesel") || combustivel.equals("d")){
            return valorVeiculo * 0.14;
        }

        return 0.1;

    }

    public Double getTotalPago() {

        if(combustivel.equals("álcool") ||combustivel.equals("alcool") || combustivel.equals("a") ){
            return valorVeiculo - valorVeiculo * 0.25;
        }
        if(combustivel.equals("gasolina") || combustivel.equals("g")){
            return valorVeiculo - valorVeiculo * 0.21;
        }
        if(combustivel.equals("diesel") || combustivel.equals("d")){
            return valorVeiculo - valorVeiculo * 0.14;
        }

        return 0.1;


    }

    public Double getValorVeiculo() {
        return valorVeiculo;
    }
    public void setValorVeiculo(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    

}
