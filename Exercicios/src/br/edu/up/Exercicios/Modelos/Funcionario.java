package br.edu.up.Exercicios.Modelos;

public class Funcionario {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double CalcularAbono(){
        if (sexo == 'M' || sexo == 'm'){
            if (idade >= 30){
                return getSalarioFixo() + 100;
            } else {
                return getSalarioFixo() + 50;
            } 
        } else if (sexo == 'F' || sexo == 'f' ){
            if (idade >= 30){
                return getSalarioFixo() + 200;
            } else {
                return getSalarioFixo() + 80;
            }
        } else {
            return 0;
        }
    }
}
