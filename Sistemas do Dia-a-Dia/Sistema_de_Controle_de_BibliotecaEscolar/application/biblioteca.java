package Sistema_de_Controle_de_BibliotecaEscolar.application;

import Sistema_de_Controle_de_BibliotecaEscolar.entities.emprestimo;

import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        emprestimo emp = new emprestimo();
        emprestimo.aluno aluno1 = emp.new aluno(
                "Guilherme",
                1234,
                false,
                1,
                "Java POO",
                100,
                true
        );

        System.out.println("Sistema Biblioteca");

        System.out.print("Digite sua matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Digite o código do livro: ");
        int codigo = sc.nextInt();
        aluno1.realizarEmprestimo(matricula, codigo);
    }
}