package br.edu.up.Exercicios.Modelos;

public class Empresa {
    private double salario;
    public double salarioMinimo = 1412;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste(){
        double porcentagemReajuste;
        double reajuste;
       
        if (salario < salarioMinimo * 3){
            porcentagemReajuste = 0.50;
            reajuste = salario * porcentagemReajuste;

            return salario + reajuste;
        } else if (salario > salarioMinimo * 3 && salario < salarioMinimo * 10){
            porcentagemReajuste = 0.20;
            reajuste = salario * porcentagemReajuste;

            return salario + reajuste;
        } else if (salario > salarioMinimo * 10 && salario < salarioMinimo * 20){
            porcentagemReajuste = 0.15;
            reajuste = salario * porcentagemReajuste;

            return salario + reajuste;
        } else {
            porcentagemReajuste = 0.10;
            reajuste = salario * porcentagemReajuste;

            return salario + reajuste;
        }
    }
    
}
