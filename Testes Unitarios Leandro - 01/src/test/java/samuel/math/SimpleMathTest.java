package samuel.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import samuel.SimpleMath;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath class")
class SimpleMathTest {

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

    @Test
    @DisplayName("Test Subtraction Sucessfully")
    void testSubtraction_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 6.2D;
        double secondNumber = 2D;
        //when --------------- //
        Double result = math.subtraction(firstNumber,secondNumber);
        Double expected = 4.2D;
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }


    @Test
    @DisplayName("Test Multiplication Sucessfully")
    void testMultiplication_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 6.2D;
        double secondNumber = 2D;
        //when --------------- //
        Double result = math.multiplication(firstNumber,secondNumber);
        Double expected = 12.4D;
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Test Division Sucessfully")
    void testDivision_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 6.2D;
        double secondNumber = 2D;
        //when --------------- //
        Double result = math.division(firstNumber,secondNumber);
        Double expected = 3.1D;
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Test Division by Zero")
    void testDivision_ShouldThrowArithmeticException(){
        // given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "impossible to divide by zero!";

        SimpleMath math = new SimpleMath();
        // when and then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, secondNumber);
        });

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }

    @Test
    @DisplayName("Test Mean Sucessfully")
    void testMean_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 6.2D;
        double secondNumber = 2D;
        //when --------------- //
        Double result = math.mean(firstNumber,secondNumber);
        Double expected = 4.1D;
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }

    @Test
    @DisplayName("Test Square Root Sucessfully")
    void testSquareRoot_Sucessfully(){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();
        double  firstNumber = 4D;
        //when --------------- //
        Double result = math.squareRoot(firstNumber);
        Double expected = 2D;
        //Then ---------------//
        assertEquals(expected, result, () -> firstNumber + " + "  + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }
}