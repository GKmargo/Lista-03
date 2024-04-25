package br.edu.up.Exercicios;

import br.edu.up.Exercicios.Modelos.Seguradora;

public class Exercicio26 {
    public static void executar(){
        Seguradora seguro = new Seguradora();
        
        seguro.setNome(Prompt.lerLinha("Digite seu nome: ")); 
        seguro.setIdade(Prompt.lerInteiro("Digite a sua idade:"));
        seguro.setGrupo(Prompt.lerInteiro("Digite 1 se seu grupo de risico é Baixo, 2 se seu grupo de risico é Médio, 3 se seu grupo de risico é Alto:"));

        Prompt.imprimir("Nome: " + seguro.getNome() + ";");
        Prompt.imprimir("Idade: " + seguro.getIdade() + ";");
        Prompt.imprimir("Grupo de Risco: " + seguro.definirGrupoDeRisco() + ".");
    }
}
