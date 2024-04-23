package br.edu.up;

import br.edu.up.modelos.IdadePessoa;

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

