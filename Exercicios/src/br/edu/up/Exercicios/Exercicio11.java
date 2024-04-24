package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Sexo;

public class Exercicio11 {
    public static void executar(){
        Sexo pessoa = new Sexo();

        for(int i = 0; i < 56 ; i++){
            pessoa.setNome(Prompt.lerLinha("Digite o nome da pessoa: ")); 
            pessoa.setSexo(Prompt.lerLinha("Se for homem digite h, se for mulher m"));
        }

    }
}
