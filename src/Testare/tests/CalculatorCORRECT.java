package Testare.tests;
import Testare.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class CalculatorCORRECT {
    // C - Conformance: media este corect calculată;
    @Test
    @Category(ImportantCategory.class) //pt includerea intr-o categorie
    public void conformanceTest() {
        Calculator calc = new Calculator();
        int[] valori = new int[]{5, 5};
        double medie = calc.medie(valori);
        assertEquals(5.0, medie, 0.001);
    }

    // O - Ordering: ordinea valorilor nu afectează media
    @Test
    public void orderingTest() {
        Calculator calc = new Calculator();
        int[] valori1 = new int[]{2, 4, 6};
        int[] valori2 = new int[]{6, 2, 4};
        double medie1 = calc.medie(valori1);
        double medie2 = calc.medie(valori2);
        assertEquals(medie1, medie2, 0.001);
    }

    // R - Range Min: valori minime (inclusiv negative):
    //assertEquals(Integer.MIN_VALUE, calc.medie(new int[]{Integer.MIN_VALUE}), 0.001);
    @Test
    public void rangeMinTest() {
        //min1, max 10
        Calculator calc = new Calculator();
        int[] note = new int[]{1, 1, 1}; // note minime valide
        double average = calc.medie(note);
        assertEquals("The average is not correct for minimum allowed grades",
                1.0, average, 0.001);
    }

    // R - Range Max: valori maxime:
    //assertEquals(Integer.MAX_VALUE, calc.medie(new int[]{Integer.MAX_VALUE}), 0.001);
    @Test
    public void rangeMaxTest() {
        Calculator calc = new Calculator();
        int[] note = new int[]{10, 10, 11}; // note maxime valide
        double average = calc.medie(note);
        assertEquals("The average is not correct for maximum allowed grades",
                10.333, average, 0.001);
    }

    // R - Reference: array null => excepție
    @Test(expected = IllegalArgumentException.class)
    public void referenceTest() {
        Calculator calc = new Calculator();
        calc.medie(null);
    }

    // E - Existence:Testează comportamentul metodei atunci când lipsesc date esențiale.
    // array gol => media 0 (sau poți trata cu excepție, după alegere)
    @Test
    public void existenceTest() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.medie(new int[]{}), 0.001);
    }

    // C - Cardinality One: un singur element => media = acel element
    @Test
    public void cardinalityOneTest() {
        Calculator calc = new Calculator();
        assertEquals(8.0, calc.medie(new int[]{8}), 0.001);
    }

    // C - Cardinality N: test cu multe elemente
    @Test
    public void cardinalityNTest() {
        Calculator calc = new Calculator();
        int[] valori = new int[100];
        for (int i = 0; i < 100; i++) {
            valori[i] = 10;
        }
        assertEquals(10.0, calc.medie(valori), 0.001);
    }

    // T - Time: execută rapid chiar și cu date mari
    @Test(timeout = 50)
    public void timeTest() {
        Calculator calc = new Calculator();
        int[] valori = new int[1_000_000];
        for (int i = 0; i < valori.length; i++) {
            valori[i] = 1;
        }
        calc.medie(valori);
    }

}
