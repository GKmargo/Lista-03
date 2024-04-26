package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.FuncionarioAbono;


public class Exercicio17 {

    public static void executar(){
        FuncionarioAbono funcionario = new FuncionarioAbono();

        funcionario.setNome(Prompt.lerLinha("Digite o nome do funcionário: "));
        funcionario.setIdade(Prompt.lerInteiro("Digite a idade do funcionário: "));

    }


    
    
}
