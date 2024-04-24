package br.edu.up.Exercicios.Modelos;

public class IdadePessoa {
    private int idade;
    
    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade(int idade){
        if (idade>=18){
            return "Maior de Idade";
        } else{
            return "Menor de idade";
        }
    }
}
