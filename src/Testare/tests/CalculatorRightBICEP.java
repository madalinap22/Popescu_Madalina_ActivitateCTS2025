package Testare.tests;

import Testare.Calculator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculatorRightBICEP {
    private final Calculator calc = new Calculator();

    // RIGHT result: media e calculată corect
    @Test
    public void rightTest() {
        assertEquals(5.0, calc.medie(new int[]{5, 5, 5}), 0.001);
    }

    // B – Boundaries: valori la limita inferioară (1) și superioară (10)
    @Test
    public void boundariesTest() {
        assertEquals(1.0, calc.medie(new int[]{1, 1, 1}), 0.001);
        assertEquals(10.0, calc.medie(new int[]{10, 10, 10}), 0.001);
    }

    // I – Information preserved: array-ul original nu e modificat
    @Test
    public void medieInverseRelationshipTest() {
        int[] valori = new int[]{9, 9, 10};
        double average = calc.medie(valori);
        double sum = Arrays.stream(valori).sum();

        assertEquals("The inverse relationship is not met",
                sum, average * valori.length, 0.01 );
    }

    // C – Cross-check: compari cu media calculată prin stream
    @Test
    public void medieCrosscheckTest() {
        int[] valori = new int[]{9, 9, 10, 6, 3, 4, 9, 10};
        double average = calc.medie(valori);

        double expectedAverage = Arrays.stream(valori).average().orElse(0);

        assertEquals( "The crosscheck didn't match",
                expectedAverage, average, 0.009);
    }

    // E – Error: verifici ce se întâmplă dacă trimiți null
    @Test(expected = IllegalArgumentException.class)
    public void errorTest() {
        calc.medie(null);
    }
}
