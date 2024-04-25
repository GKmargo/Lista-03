package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Pessoa;


public class Exercicio13 {

    public static void executar(){

        Pessoa pessoa = new Pessoa();

        int qtdPessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");

        for(int i = 0; i <= qtdPessoas; i++){
            pessoa.setNome(Prompt.lerLinha("Digite o nome da pessoa"));
            pessoa.setSexo(Prompt.lerLinha("Digite o sexo da pessoa (masculino) ou (feminino)"));
            pessoa.setIdade(Prompt.lerInteiro("Digite a idade da pessoa: "));
            pessoa.setSaude(Prompt.lerLinha("Digite o estado de saude da pessoa (boa) ou (ruim)"));




        }

        Prompt.imprimir("Total de pessoas: " +  qtdPessoas);

    }

}
