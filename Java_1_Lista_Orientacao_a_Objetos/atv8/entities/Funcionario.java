package Java_1_Lista_Orientacao_a_Objetos.atv8.entities;

public class Funcionario {
    public String nome;
    public String sobrenome;
    public double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void darAumento(double porcentagem) {
        this.salarioMensal += this.salarioMensal * (porcentagem / 100);
    }

    public double calcularSalarioAnual() {
        return this.salarioMensal * 12;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
}
