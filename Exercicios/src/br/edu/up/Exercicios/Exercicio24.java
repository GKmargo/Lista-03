package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.EstudanteCienciaComputacao;

public class Exercicio24 {
    public static void executar(){
        EstudanteCienciaComputacao nota = new EstudanteCienciaComputacao();

        Prompt.imprimir("Digite a nota do Trabalho de Laboratório, da Avaliação Semestral e a do Exame final:");
        for(int i = 0; i < 3; i ++ ){
            nota.getNota()[i] = Prompt.lerDecimal("Nota " + (i+1) + ":");
        }

        Prompt.imprimir("Media ponderada do aluno: " + nota.calcularMediaPonderada());
    }
}
