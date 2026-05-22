package Sistema_de_agendamento_medico.application;

import Sistema_de_agendamento_medico.entities.Consulta;
import Sistema_de_agendamento_medico.entities.Paciente;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Paciente[] pacientes = new Paciente[3];

        pacientes[0] = new Paciente(
                "12345678901",
                "Gustavo"
        );

        pacientes[1] = new Paciente(
                "24680156081",
                "Bárbara"
        );

        pacientes[2] = new Paciente(
                "01364835030",
                "Arthur"
        );

        String[] horarios = {
                "08:00",
                "09:00",
                "10:00"
        };

        System.out.println(" SISTEMA DE AGENDAMENTO MÉDICO ");

        System.out.print("Digite seu CPF: ");
        String CPF = sc.nextLine();

        if (CPF.length() != 11
                || !CPF.matches("\\d+")) {

            System.out.println("Paciente não cadastrado.");
            return;
        }

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua especialidade: ");
        String especialidade = sc.nextLine();

        boolean pacienteExiste = false;

        for (int i = 0; i < pacientes.length; i++) {

            if (pacientes[i] != null
                    && pacientes[i].getCPF().equals(CPF)
                    && pacientes[i].getNomePaciente().equalsIgnoreCase(nome)) {

                pacienteExiste = true;
            }
        }

        if (!pacienteExiste) {

            System.out.println("Paciente não cadastrado.");
            return;
        }

        if (horarios.length == 0) {

            System.out.println("Não há horários disponíveis.");
            return;
        }

        System.out.println("Horários disponíveis:");

        for (int i = 0; i < horarios.length; i++) {

            System.out.println(
                    (i + 1) + " - " + horarios[i]
            );
        }

        System.out.print("Escolha um horário: ");
        int escolha = sc.nextInt();

        if (escolha < 1
                || escolha > horarios.length) {

            System.out.println("Horário indisponível.");
            return;
        }

        String horarioEscolhido =
                horarios[escolha - 1];

        Consulta consulta = new Consulta(
                especialidade,
                horarioEscolhido
        );

        System.out.println(
                "Consulta agendada com sucesso."
        );

        System.out.println(
                "Especialidade: "
                        + consulta.getEspecialidade()
        );

        System.out.println(
                "Horário: "
                        + consulta.getHorario()
        );

        sc.close();
    }
}