package MainMenu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    @Test
    public void testSumarCeroCero() {
        Suma suma = new Suma();
        assertEquals(0, suma.sumar(0, 0), "0 + 0 debe ser 0");
    }

    @Test
    public void testSumarPositivos() {
        Suma suma = new Suma();
        assertEquals(8, suma.sumar(3, 5), "3 + 5 debe ser 8");
        assertEquals(1000, suma.sumar(500, 500), "500 + 500 debe ser 1000");
    }

    @Test
    public void testSumarNegativos() {
        Suma suma = new Suma();
        assertEquals(-10, suma.sumar(-4, -6), "-4 + -6 debe ser -10");
        assertEquals(-100, suma.sumar(-40, -60), "-40 + -60 debe ser -100");
    }

    @Test
    public void testSumarPositivoNegativo() {
        Suma suma = new Suma();
        assertEquals(4, suma.sumar(7, -3), "7 + -3 debe ser 4");
        assertEquals(-2, suma.sumar(3, -5), "3 + -5 debe ser -2");
    }

    @Test
    public void testSumarNegativoPositivo() {
        Suma suma = new Suma();
        assertEquals(3, suma.sumar(-2, 5), "-2 + 5 debe ser 3");
        assertEquals(-1, suma.sumar(-6, 5), "-6 + 5 debe ser -1");
    }

    @Test
    public void testSumarCeroConNumero() {
        Suma suma = new Suma();
        assertEquals(7, suma.sumar(0, 7), "0 + 7 debe ser 7");
        assertEquals(-3, suma.sumar(-3, 0), "-3 + 0 debe ser -3");
    }

    @Test
    public void testSumarGrandes() {
        Suma suma = new Suma();
        assertEquals(1000000, suma.sumar(999999, 1), "999999 + 1 debe ser 1000000");
        assertEquals(-1000000, suma.sumar(-999999, -1), "-999999 + -1 debe ser -1000000");
    }
}