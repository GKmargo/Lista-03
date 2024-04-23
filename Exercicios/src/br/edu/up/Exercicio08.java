package br.edu.up;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Media;

public class Exercicio08 {
    public static void executar(){
        Aluno aluno = new Aluno();
        Media media = new Media();

        aluno.setNome(Prompt.lerLinha("Digite o nome do aluno:")) ;

        for (int i = 0; i < 3; i++) {
            media.getNota()[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + " do Aluno " + aluno.getNome() + " :");
        }

        double notaMedia = media.calcularNotaMedia(media.getNota());

        if(notaMedia >= 7){
            Prompt.imprimir("o aluno " + aluno.getNome() + " aprovado com a média: " + notaMedia);
        } else if (notaMedia <=5 ){
            Prompt.imprimir("o aluno " + aluno.getNome() + " reprovado com a média: " + notaMedia);
        } else if (notaMedia >= 5.1 && notaMedia <=6.9){
            Prompt.imprimir("o aluno " + aluno.getNome() + " está de recuperação com a média: " + notaMedia);
        }
    }
}
