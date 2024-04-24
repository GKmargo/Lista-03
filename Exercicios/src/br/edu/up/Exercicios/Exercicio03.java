package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Vendedor;

public class Exercicio03 {
    public static void executar(){
    Vendedor vendedor = new Vendedor();

    vendedor.setNome(Prompt.lerLinha("Digite o nome do vendedor:"));
    vendedor.setSalario(Prompt.lerDecimal("Digite o salario do vendedor em reais:"));
    vendedor.setVenda(Prompt.lerDecimal("Digite a quantidade de dinheiro em reais que esse vendedor gerou com as vendas:"));

    double salarioFinal = vendedor.calcularComissao(vendedor.getSalario(), vendedor.getVenda());

    Prompt.imprimir("Salario final do vendedor + comissao de 15% das vendas efetuadas por ele: " + salarioFinal);
}
}