package Testare.tests;

import Testare.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdunaPozitiv() {
        // Arrange
        Calculator calc = new Calculator();
        // Act
        int rezultat = calc.aduna(2, 3);
        // Assert
        assertEquals(5, rezultat);
    }

    @Test
   public void testScade() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.scade(4, 3));
    }

    @Test
    public void testInmulteste() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.inmulteste(3, 4));
    }

    @Test
    public void testImparteValid() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.imparte(10, 5));
    }

    @Test
    public void testImparteLaZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.imparte(10, 0));
    }
}
