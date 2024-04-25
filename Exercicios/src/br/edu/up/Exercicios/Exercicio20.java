package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.EscolaAprender;

public class Exercicio20 {
    public static void executar(){
        EscolaAprender professor = new EscolaAprender();

        professor.setNivel(Prompt.lerInteiro("Digite o nivel do Professor (1, 2 ou 3): "));
        professor.setHoraAula(Prompt.lerDecimal("Digite o número de hora/aula: "));

        Prompt.imprimir("O salario desse professor: " + professor.calcularSalarioProfessor());

    }
}
