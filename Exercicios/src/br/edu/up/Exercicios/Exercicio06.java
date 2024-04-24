package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Produto;

public class Exercicio06 {
    public static void executar(){
        Produto vlrProduto = new Produto();

        vlrProduto.setValor(Prompt.lerDecimal("Digite o valor da venda:"));
        vlrProduto.setValorPorcentagem(Prompt.lerDecimal("Digite o acrecimo porcentual:"));

        double valorFinal = vlrProduto.Calcularacrescimo(vlrProduto.getValor(), vlrProduto.getValorPorcentagem());
        Prompt.imprimir("O valor final com o acrescimo do porcentual:" + valorFinal);
    }
}
