package samuel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum_Sucessfully(){
        // Given/Dado
        SimpleMath math = new SimpleMath();

        Double result = math.sum(6.2D,2D);
        Double expected = 8.2D;
        assertEquals(expected, result, "The TestSum() did not produce expected result");
    }

}