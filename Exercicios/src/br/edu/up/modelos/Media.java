package br.edu.up.modelos;

public class Media extends Aluno {
    private double [] nota = new double[3];

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public double calcularNotaMedia(double[] nota) {
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += nota[i] / 3;
        }
        return media;
    }
}
