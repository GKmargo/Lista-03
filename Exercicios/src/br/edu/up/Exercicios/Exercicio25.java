package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.MediaPonderada;


public class Exercicio25 {

    public static void executar(){

        MediaPonderada MediaPonderada = new MediaPonderada();

        MediaPonderada.setNome(Prompt.lerLinha("Digite o nome: "));

        String nome = MediaPonderada.getNome();

        MediaPonderada.setMatricula(Prompt.lerInteiro("Digite o número de matricula do aluno " + nome));

        int matricula = MediaPonderada.getMatricula();

        MediaPonderada.setNota1(Prompt.lerDecimal("Digite a nota do Laboratorio: "));
        MediaPonderada.setNota2(Prompt.lerDecimal("Digite a nota da avaliação semsteral:"));
        MediaPonderada.setNota3(Prompt.lerDecimal("Digite a nota do Exame final:"));


        Prompt.imprimir("\nNome: " + nome);
        Prompt.imprimir("Matricula: " + matricula);
        Prompt.imprimir("Nota final: " + MediaPonderada.mediaFinal());
        Prompt.imprimir(MediaPonderada.classificacaoFinal());







    }

}
