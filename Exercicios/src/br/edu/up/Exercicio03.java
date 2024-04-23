package br.edu.up;

import br.edu.up.modelos.Vendedor;

public class Exercicio03 {
    Vendedor vendedor = new Vendedor();
    Venda vendas = new Venda();

    vendedor.nome = Prompt.lerLinha("Digite o nome do vendedor:");

    vendedor.salario = Prompt.lerDecimal("Digite o salario do vendedor em reais:");
    vendedor.vendas = Prompt.lerDecimal("Digite a quantidade de dinheiro em reais que esse vendedor gerou com as vendas:");

    double salarioFinal = vendedor.comissao(vendedor.salario, vendedor.vendas);

    Prompt.imprimir("Salario final do vendedor + comissao de 15% das vendas efetuadas por ele:" + salarioFinal);
}
