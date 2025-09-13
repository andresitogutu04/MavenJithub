package MainMenu;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GFactoriales gfact = new GFactoriales();
        Suma suma = new Suma();

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para factorial: ");
                    int n = sc.nextInt();
                    try {
                        int resultadoFact = gfact.factorial(n);
                        System.out.println("El factorial de " + n + " es: " + resultadoFact);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado de la suma: " + suma.sumar(a, b));
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Resultado de la multiplicación: " + gfact.multiplicar(x, y));
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }

}
