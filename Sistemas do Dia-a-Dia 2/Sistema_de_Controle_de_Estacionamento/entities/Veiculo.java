package Sistema_de_Controle_de_Estacionamento.entities;

public class Veiculo {

    private String placa;
    private String tipo;
    private int horaEntrada;

    public Veiculo(String placa, String tipo, int horaEntrada) {

        this.placa = placa;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}

