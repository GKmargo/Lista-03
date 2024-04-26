package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.PesoIdeal;

public class Exercicio23 {

    public static void executar(){

        PesoIdeal peso = new PesoIdeal();

        peso.setNome(Prompt.lerLinha("Digite o seu nome: "));
        peso.setAltura(Prompt.lerDecimal("Digite a sua altura: "));
        peso.setIdade(Prompt.lerInteiro("Digite a sua idade"));
        peso.setSexo(Prompt.lerCaractere("Digite o seu sexo, (M) (F)"));

        String nome = peso.getNome();

        Prompt.imprimir("O peso ideal de "+nome + " é " +  peso.calculo());



    }

}
