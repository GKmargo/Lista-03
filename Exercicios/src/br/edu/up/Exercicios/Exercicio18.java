package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Funcionario;

public class Exercicio18 {
    public static void executar(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(Prompt.lerLinha("Digite o seu nome: "));
        funcionario.setSexo(Prompt.lerCaractere("Digite a letra correspondente ao seu sexo (M para masculino ou F para feminino): "));
        funcionario.setIdade(Prompt.lerInteiro("Digite a sua idade: "));
        funcionario.setSalarioFixo(Prompt.lerDecimal("Digite seu salario fixo: "));

        Prompt.imprimir("Nome do funcionario: " + funcionario.getNome());
        Prompt.imprimir("Salario liquido com acrescimo do abono: " + funcionario.CalcularAbono());
    }
}
