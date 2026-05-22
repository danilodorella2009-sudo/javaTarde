package Java_1_Lista_Orientacao_a_Objetos.atv8.application;
import Java_1_Lista_Orientacao_a_Objetos.atv8.entities.Funcionario;
public class Objetivo {
    public static void main(String[] args){
        Funcionario func = new Funcionario("Gustavo", "Barbara", 2000);

        func.darAumento(10);

        System.out.println("Novo salario mensal: R$ " + func.getSalarioMensal());
        System.out.println("Novo salario anual: R$ " + func.calcularSalarioAnual());
    }
}
