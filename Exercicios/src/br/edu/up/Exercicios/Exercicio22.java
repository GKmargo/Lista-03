package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.ContaLuz;

public class Exercicio22 {
    public static void executar(){
        ContaLuz conta = new ContaLuz();

        conta.setTipoCliente(Prompt.lerInteiro("Digite 1 para uma conta Residencial, 2 para Comercial ou 3 para Índustrial"));
        conta.setConsumoLuz(Prompt.lerDecimal("Digite seu consumo de KW/h: "));

        Prompt.imprimir("O total a se pagar: " + conta.calularTotalContaLuz());
    }
}
