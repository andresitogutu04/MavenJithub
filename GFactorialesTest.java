package MainMenu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GFactorialesTest {

    @Test
    public void testFactorialBasico() {
        GFactoriales gfact = new GFactoriales();
        assertEquals(1, gfact.factorial(0), "0! debe ser 1");
        assertEquals(1, gfact.factorial(1), "1! debe ser 1");
        assertEquals(2, gfact.factorial(2), "2! debe ser 2");
        assertEquals(6, gfact.factorial(3), "3! debe ser 6");
        assertEquals(24, gfact.factorial(4), "4! debe ser 24");
    }

    @Test
    public void testFactorialMayor() {
        GFactoriales gfact = new GFactoriales();
        assertEquals(120, gfact.factorial(5), "5! debe ser 120");
        assertEquals(720, gfact.factorial(6), "6! debe ser 720");
    }

    @Test
    public void testFactorialNegativo() {
        GFactoriales gfact = new GFactoriales();
        assertThrows(IllegalArgumentException.class, () -> gfact.factorial(-1),
                "Factorial de negativo debe lanzar IllegalArgumentException");
    }

    @Test
    public void testMultiplicarBasico() {
        GFactoriales gfact = new GFactoriales();
        assertEquals(0, gfact.multiplicar(0, 5), "0*5 debe ser 0");
        assertEquals(0, gfact.multiplicar(7, 0), "7*0 debe ser 0");
        assertEquals(15, gfact.multiplicar(3, 5), "3*5 debe ser 15");
        assertEquals(-15, gfact.multiplicar(-3, 5), "-3*5 debe ser -15");
        assertEquals(-15, gfact.multiplicar(3, -5), "3*-5 debe ser -15");
        assertEquals(15, gfact.multiplicar(-3, -5), "-3*-5 debe ser 15");
    }

    @Test
    public void testMultiplicarGrandes() {
        GFactoriales gfact = new GFactoriales();
        assertEquals(1000000, gfact.multiplicar(1000, 1000), "1000*1000 debe ser 1000000");
    }
}
