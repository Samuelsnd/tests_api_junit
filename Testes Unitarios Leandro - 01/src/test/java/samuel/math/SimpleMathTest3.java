package samuel.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import samuel.SimpleMath;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath class")
class SimpleMathTest3 {


    @ParameterizedTest
    @DisplayName("Test Division Sucessfully")
//    @MethodSource()
    @CsvSource({
            "6.2,2,3.1",
            "71,14,5.07",
            "18.3,3.1,5.90"})
    void testDivision(double  firstNumber ,double  secondNumber ,double  expected ){
        /* Given/Dado // Contexto Inicial do Scenario */
        SimpleMath math = new SimpleMath();

        //when --------------- //
        Double result = math.division(firstNumber,secondNumber);

        //Then ---------------//
        assertEquals(expected, result,2D, () -> firstNumber + " + " + secondNumber + " did not produce expected result " + expected);
        assertNotEquals(9.2,result);
        assertNotNull(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Pelé","Senna","Keith Moon"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }

//    private static Stream<Arguments> testDivision(){
//        return Stream.of(
//                Arguments.of(6.2D,2D, 3.1D),
//                Arguments.of(71D,14D, 5.07D),
//                Arguments.of(18.3D,3.1D, 5.90D));
//    }

}