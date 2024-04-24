package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.CarroNovo;

public class Exercicio07 {
    public static void executar(){
        CarroNovo carroFabrica = new CarroNovo();

        carroFabrica.setValorFabrica(Prompt.lerDecimal("Digite o valor de fábrica do carro:"));

        double precoCarro = carroFabrica.calcularValorTotalDoCarro(carroFabrica.getValorFabrica());

        Prompt.imprimir("Valor do carro com todos os impostos aplicados: " + precoCarro);
    }
}
