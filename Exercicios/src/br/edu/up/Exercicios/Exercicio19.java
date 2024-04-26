package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Triangulo;


public class Exercicio19 {
    public static void executar(){

        Triangulo triangulo = new Triangulo();

        triangulo.setLado1(Prompt.lerDecimal("Digite o valor do primeiro lado do triângulo"));
        triangulo.setLado2(Prompt.lerDecimal("Digite o valor do segundo lado do triângulo"));
        triangulo.setLado3(Prompt.lerDecimal("Digite o valor do terceiro lado do triângulo"));

        double lado1 = triangulo.getLado1();
        double lado2 = triangulo.getLado2();

        double lado3 = triangulo.getLado3();


        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){

            Prompt.imprimir("Podem ser lados de um triângulo");

            if (lado1 == lado2 && lado2 == lado3) {
                Prompt.imprimir("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                Prompt.imprimir("Isósceles");
            } else {
                Prompt.imprimir("Escaleno");
            }


        } else {
            Prompt.imprimir("Não podem ser lados de um triângulo");

        }


    }
}
