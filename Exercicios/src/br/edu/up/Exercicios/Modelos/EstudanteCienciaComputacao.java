package br.edu.up.Exercicios.Modelos;

public class EstudanteCienciaComputacao {
    private double[] nota = new double[3];

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
    
    public double calcularMediaPonderada(){
        return ((getNota()[0] * 2) + (getNota()[1] * 3) + (getNota()[2] * 5)) / (2 + 3 + 5);
    }
}
