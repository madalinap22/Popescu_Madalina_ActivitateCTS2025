package Testare.tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(ImportantCategory.class)
@Suite.SuiteClasses({
        CalculatorCORRECT.class,
        CalculatorRightBICEP.class
})
public class ImportantTests {
}
