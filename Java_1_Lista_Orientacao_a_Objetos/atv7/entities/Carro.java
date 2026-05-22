package Java_1_Lista_Orientacao_a_Objetos.atv7.entities;

public class Carro {
    public String modelo;
    public String marca;
    public double velocidadeAtual;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.println("Velocidade: " + this.velocidadeAtual + " km/h");
    }

    public void frear() {
        if (this.velocidadeAtual >= 10) {
            this.velocidadeAtual -= 10;
        } else {
            this.velocidadeAtual = 0;
        }
        System.out.println("Velocidade: " + this.velocidadeAtual + " km/h");
    }
}

