package felix.fische.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void arrayFillsCorrect(){
        //given
        int arrayLength = 5;
        String[] expected = {"Students 1", "Students 2", "Students 3", "Students 4", "Students 5"};
        //when
        String[] actual = Array.fillArray(arrayLength);
        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}
