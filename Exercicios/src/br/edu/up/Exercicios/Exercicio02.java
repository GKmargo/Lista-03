package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Automovel;

public class Exercicio02 {
    public static void executar(){
        Automovel carro = new Automovel();

        carro.setKm(Prompt.lerDecimal("Digite a distancia percorrida pelo seu carro:"));
        carro.setLitros(Prompt.lerDecimal("Digite a quantidade de litros de gasolina gastos com a viagem"));

        Prompt.imprimir("O consumo médio do seu veículo: " + carro.calcularConsumoMedio(carro.getKm() , carro.getLitros()) + "km/l");
    }
}
