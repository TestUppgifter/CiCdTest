import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CalculatorTest {

    @Test
    void testCalc(){

        final Calculator calculator = new Calculator();

        int result = calculator.calc(3,5);

        assertEquals("test calc", 8, result);

    }

}
