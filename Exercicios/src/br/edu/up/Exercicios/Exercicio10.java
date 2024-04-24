package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.IdadePessoa;

public class Exercicio10 {
    public static void executar(){
        IdadePessoa idade = new IdadePessoa();
        int qtd = Prompt.lerInteiro("Digite a quantidade de pessoas:");

        for(int i = 0; i < qtd; i++){
            idade.setIdade(Prompt.lerInteiro("Digite a idade da pessoa " + (i+1) + " :")) ;
            Prompt.imprimir(idade.verificarIdade(idade.getIdade()));
        }

    }

    }

