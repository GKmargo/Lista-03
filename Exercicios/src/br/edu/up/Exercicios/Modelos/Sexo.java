package br.edu.up.Exercicios.Modelos;

public class Sexo {
    private String nome;
    private Character sexo;
    public int qtdmasc = 0;
    public int qtdfemin = 0;

    public String getNome() {
        return nome;
    }

    public Character getSexoForCounter(){
        return sexo;
    }

    public String getSexo(){

        if(sexo == 'F' || sexo == 'f'){
            return "feminino";
        }else if(sexo == 'M' || sexo == 'm'){
            return "masculino";
        }
        return "erro";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    
    public int contador(Character sexo){
        if(sexo == 'F' || sexo == 'f'){
            qtdfemin ++;
            return qtdfemin;
        } else if (sexo == 'M' || sexo == 'm'){
            qtdmasc ++;
            return qtdmasc;
        } else {
            return 0;
        }

    }

}
