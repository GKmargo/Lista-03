package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Empresa;

public class Exercicio16 {
    public static void executar(){
        Empresa funcionario = new Empresa();

        for (int i = 1; i < 584; i ++){
            funcionario.setSalario(Prompt.lerDecimal("Digite o valor do salario do funcionario " + i + ":"));

            Prompt.imprimir("Salario com o reajuste: " + funcionario.calcularReajuste());
        }
    }
}
