package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.FuncionarioAbono;


public class Exercicio17 {

    public static void executar(){
        FuncionarioAbono funcionario = new FuncionarioAbono();

        funcionario.setNome(Prompt.lerLinha("Digite o nome do funcionário: "));
        funcionario.setSalario(Prompt.lerDecimal("Digite o salario do funcionario: "));
        funcionario.setSalarioMinimo(Prompt.lerDecimal("Qual o salario minimo: "));

        String nome = funcionario.getNome();

        double salario = funcionario.getSalario();

        double salarioMinimo = funcionario.getSalarioMinimo();


        double percentualReajuste = ((salarioMinimo - salario) / salario) * 100;

        // Cálculo do novo salário
        double novoSalario = salario + (percentualReajuste / 100) * salario;

        if(salario >= salarioMinimo){

            Prompt.imprimir("O funcionário " + nome + " não sofrera do reajuste, pois ganha mais que um salario minimo");

        } else{


        Prompt.imprimir("O funcionário " + nome + " teve um reajuste de " + percentualReajuste + "%");

        Prompt.imprimir("Novo salário: R$" + novoSalario);

        double aumentoFolha = novoSalario - salario;


        Prompt.imprimir("A empresa terá um aumento de R$" + aumentoFolha + " na folha de pagamento.");
        }



    }


    
    
}
