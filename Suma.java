package MainMenu;

public class Suma {
    // Suma recursiva con control de positivos y negativos
    public int sumar(int a, int b) {
        if (b == 0) {
            return a; // caso base
        } else if (b > 0) {
            return sumar(a + 1, b - 1); // acercamos b a 0
        } else {
            return sumar(a - 1, b + 1); // caso b negativo
        }
    }
}