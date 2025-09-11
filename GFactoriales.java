package MainMenu;

public class GFactoriales {
    
    private Suma suma = new Suma();

    // Factorial recursivo
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos");
        }
        if (n == 0 || n == 1) {
            return 1; // casos base
        } else {
            return multiplicar(n, factorial(n - 1));
        }
    }

    // Multiplicación recursiva usando suma
    public int multiplicar(int a, int b) {
        if (b == 0) {
            return 0; // caso base
        }
        if (b > 0) {
            return suma.sumar(a, multiplicar(a, b - 1));
        } else { 
            return -multiplicar(a, -b); // si b es negativo
        }
    }
}