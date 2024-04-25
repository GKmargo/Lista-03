package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.ConcessionariaCarangoVelho;


public class Exercicio12 {

    public static void executar(){
        int ate2000 = 0;
        int total = 0;
        char continuar;

        while (true) {
            
        ConcessionariaCarangoVelho concessionaria = new ConcessionariaCarangoVelho();

        concessionaria.setAno(Prompt.lerInteiro("Digite o ano do carro: "));
        concessionaria.setPreco(Prompt.lerDecimal("Digite o valor do carro: "));
        

        if(concessionaria.getAno() <= 2000){
            ate2000++;
        }
            
        total ++;

        Prompt.imprimir("Valor do desconto: " +  concessionaria.valorDesconto());
        Prompt.imprimir("Valor do Carro com o desconto: " + concessionaria.valorCarro());

        continuar = Prompt.lerCaractere("Deseja continuar sim(S), não(N)? ");
        if (continuar == 'N' || continuar == 'n'){
            break;
        }
        }

        Prompt.imprimir("Carros até o Ano 2000: " + ate2000);
        Prompt.imprimir("Total de Carros: "+ total);

    }

}
