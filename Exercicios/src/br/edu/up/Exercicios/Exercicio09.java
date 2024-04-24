package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Numero;

public class Exercicio09 {
    public static void executar(){
        Numero numeros = new Numero();
        
        for (int i = 0; i < 80; i ++){
            numeros.getNum()[i] = Prompt.lerDecimal("Digite o número " + (i+1) + ":");
            if(numeros.getNum()[i]>=10 && numeros.getNum()[i] <=150){
                numeros.setContador(numeros.getContador()+1);
            }
        }

        Prompt.imprimir("Quantidade de números no intervalo de 10 e 150: " + numeros.getContador());
    }
}
