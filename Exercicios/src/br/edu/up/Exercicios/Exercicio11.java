package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Sexo;

public class Exercicio11 {
    public static void executar(){
        Sexo pessoa = new Sexo();

        for(int i = 0; i < 3 ; i++){
            pessoa.setNome(Prompt.lerLinha("Digite o nome da pessoa: ")); 
            pessoa.setSexo(Prompt.lerCaractere("Se seu sexo for masculino digite m ou se for feminino f"));
            pessoa.contador(pessoa.getSexo());
        }

        Prompt.imprimir("Quantidade mulheres: " + pessoa.qtdfemin);
        Prompt.imprimir("Quantidade homens: " + pessoa.qtdmasc);


    }
}
