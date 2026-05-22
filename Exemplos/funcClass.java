package Exemplos;

public class funcClass {
    public int a;
    public int b;
    public int c;

    public int max() {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
}
