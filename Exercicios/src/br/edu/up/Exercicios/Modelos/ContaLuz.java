package br.edu.up.Exercicios.Modelos;

public class ContaLuz {
    private int tipoCliente;
    private double consumoLuz;
    public double valorKWh;
    
    public int getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public double getConsumoLuz() {
        return consumoLuz;
    }
    public void setConsumoLuz(double consumoLuz) {
        this.consumoLuz = consumoLuz;
    }

    public double calularTotalContaLuz(){
        switch (getTipoCliente()) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
            default:
                break;
        }
        return getConsumoLuz() * valorKWh;
    }
}
