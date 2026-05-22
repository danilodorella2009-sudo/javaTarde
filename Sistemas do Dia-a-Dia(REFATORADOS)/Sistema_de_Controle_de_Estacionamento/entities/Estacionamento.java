package Sistema_de_Controle_de_Estacionamento.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    private final int TOTAL_VAGAS = 5;

    public void entradaVeiculo(Scanner sc) {

        if (veiculos.size() >= TOTAL_VAGAS) {

            System.out.println("Estacionamento lotado.");
            return;
        }

        System.out.print("Digite a placa: ");
        String placa = sc.nextLine();

        System.out.print("Digite o tipo do veículo (carro/moto): ");
        String tipo = sc.nextLine();

        System.out.print("Digite a hora de entrada: ");
        int horaEntrada = sc.nextInt();
        sc.nextLine();

        Veiculo veiculo = new Veiculo(placa, tipo, horaEntrada);

        veiculos.add(veiculo);

        System.out.println("Veículo estacionado com sucesso.");
    }

    public void saidaVeiculo(Scanner sc) {

        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo v = veiculos.get(i);

            if (v.getPlaca().equalsIgnoreCase(placa)) {

                encontrado = true;

                System.out.print("Digite a hora de saída: ");
                int horaSaida = sc.nextInt();
                sc.nextLine();

                int tempo = horaSaida - v.getHoraEntrada();

                double valor;

                if (tempo <= 1) {

                    valor = 10;

                } else {

                    valor = 10 + ((tempo - 1) * 5);
                }

                System.out.println("Tempo estacionado: " + tempo + " hora(s)");
                System.out.println("Valor total: R$ " + valor);

                System.out.print("Pagamento aprovado? (s/n): ");
                String pagamento = sc.nextLine();

                if (pagamento.equalsIgnoreCase("s")) {

                    System.out.println("Saída liberada.");

                    veiculos.remove(i);

                } else {

                    System.out.println("Pagamento não autorizado.");
                }

                break;
            }
        }

        if (!encontrado) {

            System.out.println("Veículo não encontrado.");
        }
    }

    public void listarVeiculos() {

        System.out.println("VEÍCULOS ESTACIONADOS ");

        if (veiculos.isEmpty()) {

            System.out.println("Nenhum veículo estacionado.");

        } else {

            for (int i = 0; i < veiculos.size(); i++) {

                Veiculo v = veiculos.get(i);

                System.out.println(
                        (i + 1)
                                + " | Placa: " + v.getPlaca()
                                + " | Tipo: " + v.getTipo()
                                + " | Hora Entrada: " + v.getHoraEntrada()
                );
            }
        }
    }
}