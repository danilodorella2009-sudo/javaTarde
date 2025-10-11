package Exemplos;

import java.util.Arrays;

public class execiciosFixacao {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("products: %s which price is %s%n", product1, price1);
        System.out.printf ("%s which price is %s%n", product2, price2);


        System.out.printf ("record: %d years old %s gender %c%n", age, code, gender);


        System.out.printf("measue with eigth decemal places: %.8f%n", measure);
        System.out.printf("rouded(three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point %.3f%n", measure);

    }
}