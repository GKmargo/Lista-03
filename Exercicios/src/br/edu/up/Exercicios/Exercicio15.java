package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.CarangoVelho;


public class Exercicio15 {

    public static void executar(){

        CarangoVelho concessionaria = new CarangoVelho();

        concessionaria.setValorVeiculo(Prompt.lerDecimal("Digite o valor do veiculo"));
        concessionaria.setCombustivel(Prompt.lerLinha("Digite o combustivel do veiculo: (álcool) (gasolina) (diesel) "));

        Prompt.imprimir("Desconto: " + concessionaria.getDesconto() );
        Prompt.imprimir("Total pago: " + concessionaria.getTotalPago());



    }

}
