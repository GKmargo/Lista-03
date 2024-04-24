package br.edu.up.Exercicios.Modelos;

public class Sexo {
    private String nome;
    private String sexo;
    private int f;
    private int m;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getTudo(double nome, double sexo){

        int f = 0 ;

        if(sexo == 'F' || sexo == 'f'){ 
            f++;
        } else {
            m++;
        }
        return ("Nome: " + nome + "Sexo: " + sexo);
    }

}
