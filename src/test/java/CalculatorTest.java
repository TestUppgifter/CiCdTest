import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testCalc(){
        int result = calculator.calc(3,5);
        assertEquals("test calc", 8, result);
    }

    @Test
    void testSub(){
        int result = calculator.sub(5,3);
        assertEquals("test sub", 2, result);
    }

    @Test
    void testDiv(){
        double result = calculator.div(6, 3);
        assertEquals("test div", 2.0, result);
    }

    @Test
    void testMulti(){
        double result = calculator.multi(5, 3);
        assertEquals("test multi", 15.0, result);
    }

}
