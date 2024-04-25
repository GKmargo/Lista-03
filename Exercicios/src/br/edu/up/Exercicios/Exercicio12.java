package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.ConcessionariaCarangoVelho;


public class Exercicio12 {

    public static void executar(){

        boolean resposta = true;
        int ate2000 = 0;
        int total = 0;

        while (resposta) {
            
        ConcessionariaCarangoVelho concessionaria = new ConcessionariaCarangoVelho();

        concessionaria.setAno(Prompt.lerInteiro("Digite o ano do carro: "));

        if(concessionaria.getAno() <= 2000){
            ate2000++;
        }
            
        total ++;

        concessionaria.setPreco(Prompt.lerDecimal("Setar preço"));

        


        }

    }

}
