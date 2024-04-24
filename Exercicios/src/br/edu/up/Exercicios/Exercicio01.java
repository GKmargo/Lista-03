package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Aluno;
import br.edu.up.Exercicios.Modelos.Media;

public class Exercicio01 {
    public static void executar(){
    Aluno aluno = new Aluno();
    Media media = new Media();

    aluno.setNome(Prompt.lerLinha("Digite o nome do aluno:"));

    for (int i = 0; i < 3; i++) {
        media.getNota()[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + " do Aluno " + aluno.getNome() + " :");
    }

    double notaMedia = media.calcularNotaMedia(media.getNota());

    Prompt.imprimir("A média do Aluno " + aluno.getNome() + " é: " + notaMedia);
}
}