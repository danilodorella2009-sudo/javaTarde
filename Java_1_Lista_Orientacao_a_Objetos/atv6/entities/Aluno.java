package Java_1_Lista_Orientacao_a_Objetos.atv6.entities;

public class Aluno {
    public String nome;
    public int matricula;
    public double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public String verificarSituacao() {
        return (this.calcularMedia() >= 7) ? "Aprovado" : "Reprovado";
    }

    public void exibirRelatorio() {
        System.out.println("Aluno: " + nome + "(Matrícula: " + matricula + ")");
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
    }
}
