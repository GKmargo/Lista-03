package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Conversao;

public class Exercicio04 {
    public static void executar(){
        Conversao dolarReal = new Conversao();

        dolarReal.setConotacaoDolar(Prompt.lerDecimal("Digite a conotação atual do dolar:"));
        dolarReal.setDolar(Prompt.lerDecimal("Digite a quantidade de dinheiro que voce possui em dolares:"));

        double valorReal = dolarReal.calcularDolarParaReal(dolarReal.getDolar(), dolarReal.getConotacaoDolar());

        Prompt.imprimir("Seu dinheiro em reais: "  + valorReal);
    }
}
