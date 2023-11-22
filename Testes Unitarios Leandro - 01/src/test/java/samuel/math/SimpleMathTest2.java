package samuel.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import samuel.SimpleMath;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath class")
public class SimpleMathTest2 {

    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll method!");

    }

    @AfterAll
    static void cleanup(){
        System.out.println("Running @AfterAll method!");
    }
    @Test
    @DisplayName("Test Sum Sucessfully")
    void testSum_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 6.2D;
        double secondNumber = 2D;
        Double expected = 8.2D;
        //when --------------- //
        Double result = math.sum(firstNumber,secondNumber);
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }
}
