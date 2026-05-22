package Java_1_Lista_Orientacao_a_Objetos.atv10.entities;

public class termometro {
    public double celsius;

    public termometro(double celsius){
        this.celsius = celsius;
    }

    public double fahrenheit(){
        return celsius * 1.8 + 32;
    }

    public double kelvin(){
        return celsius + 273.15;
    }
}