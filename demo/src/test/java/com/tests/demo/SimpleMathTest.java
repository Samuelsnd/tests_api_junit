package com.tests.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum_WhenSixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        // Given / Arrange
        SimpleMath math = new SimpleMath();

        //When / Act
        Double actual = math.sum(6.2D, 2D);

        // Then / Assert
        assertEquals(8.2D, actual, () -> "6.2 + 2 did not produce 8.2!");
    }

}