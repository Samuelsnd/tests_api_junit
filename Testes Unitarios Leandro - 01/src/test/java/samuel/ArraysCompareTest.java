package samuel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class ArraysCompareTest {

    @Test
    void test(){
        int[] numbers = {25,9,21,32,3};
        int[] expectedArray = {3,9,21,25,32};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedArray);
    }
}
