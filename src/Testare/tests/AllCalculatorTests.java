package Testare.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorCORRECT.class,
        CalculatorRightBICEP.class
})
////SUITA DE TESTE Junit5
//@Suite
//@SelectClasses({
//        CalculatorCorrectTests.class,
//        CalculatorRightBicepTests.class
//})
public class AllCalculatorTests {
}

