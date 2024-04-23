package br.edu.up;

import br.edu.up.modelos.Automovel;

public class Exercicio02 {
    public static void executar(){
        Automovel carro = new Automovel();

        carro.setKm(Prompt.lerDecimal("Digite a distancia percorrida pelo seu carro:"));
        carro.setLitros(Prompt.lerDecimal("Digite a quantidade de litros de gasolina gastos com a viagem"));

        Prompt.imprimir("O consumo médio do seu veículo: " + carro.consumoMedio(carro.getKm() , carro.getLitros()) + "km/l");
    }
}
