package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Lucro;

public class Exercicio14 {
    public static void executar(){
        Lucro produto = new Lucro();
        int total = 40;
        int totalPrecoCusto = 0;
        int totalPrecoVenda = 0;

        for (int i = 1; i < total; i ++){
            produto.setPrecoCusto(Prompt.lerDecimal("Digite o preço de custo do Produto " + i + ":"));
            produto.setPrecoVenda(Prompt.lerDecimal("Digite o preço de venda do Produto " + i + ":"));

            totalPrecoCusto += produto.getPrecoCusto();
            totalPrecoVenda += produto.getPrecoVenda();

            Prompt.imprimir("" + (i) + ": " + produto.calcularLucroPrejuizoEmpate());
        }
        Prompt.imprimir("Média do preço de custo: " + totalPrecoCusto / total);
        Prompt.imprimir("Média do preço de venda: " + totalPrecoVenda / total);
    }
}

