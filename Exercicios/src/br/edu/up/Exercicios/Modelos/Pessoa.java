package br.edu.up.Exercicios.Modelos;

import br.edu.up.Exercicios.Prompt;

public class Pessoa {

    String nome ;
    String sexo;
    String saude;
    int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSaude() {
        return saude;
    }
    public void setSaude(String saude) {
        this.saude = saude;
    }

    public String getApto(){

        Prompt.imprimir(sexo );
        Prompt.imprimir(idade );
        Prompt.imprimir(saude );

        if((sexo.equals("masculino" ) || sexo.equals("Masculino") || sexo.equals("m")) && (idade >= 18) && (saude.equals("boa") || saude.equals("b"))){
            return " apto para o serviço militar";
        } else {
            return " não está apto paar o serviço militar";
        }

    }

    

}
