package samuel.math;

import org.junit.jupiter.api.*;
import samuel.SimpleMath;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    SimpleMath math;
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }


    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!")
    @DisplayName("Test Division by Zero")
    void testDivision_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo){
        // given
        System.out.println("Repetition Nº " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
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
}
