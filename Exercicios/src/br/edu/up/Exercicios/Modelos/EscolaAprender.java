package br.edu.up.Exercicios.Modelos;

public class EscolaAprender {
    private int nivel;
    private double horaAula;
    public double valor;

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public double getHoraAula() {
        return horaAula;
    }
    public void setHoraAula(double horaAula) {
        this.horaAula = horaAula;
    }
    
    public double calcularSalarioProfessor(){
        switch (getNivel()) {
            case 1:
                valor = 12;
                break;
            case 2:
                valor = 17;
                break;
            case 3:
                valor = 25;
                break;
            default:
                break;
        }
        return getHoraAula() * valor;
    }
}
