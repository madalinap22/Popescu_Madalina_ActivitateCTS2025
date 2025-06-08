import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testare {


        @BeforeClass
        public static void setUpClass() {
            System.out.print("A");
        }

        @Before
        public void setUp() {
            System.out.print("B");
        }

        @After
        public void tearDown() {
            System.out.print("C");
        }

        @Test
        public void test1() {}

        @Test
        public void test2() {}


}
