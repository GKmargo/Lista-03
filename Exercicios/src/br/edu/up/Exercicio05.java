package br.edu.up;

import br.edu.up.modelos.LojaMamaoComAcucar;

public class Exercicio05 {
    public static void executar(){
        LojaMamaoComAcucar produtos = new LojaMamaoComAcucar();

        produtos.setVlrCompra(Prompt.lerDecimal("Digite o valor da sua compra:")); 

        double valorPrestacao = produtos.CalcularValorPrestacoes(produtos.getVlrCompra());

        Prompt.imprimir("O valor das Prestações em 5 vezes sem juros: " + valorPrestacao);
    }
}
