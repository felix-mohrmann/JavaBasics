package felix.fische.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationsTest {

    @Test
    public void shouldCalculateProperly() {
        //given
        int x = 5;
        int y = 4;
        //when
        int result = Calculations.add(x, y);
        //then
        Assertions.assertEquals(result, 9);
    }

    @Test
    public void shouldBeGreaterThan100 () {
        //given
        int x = 110;
        //when
        boolean isGreater = Calculations.isGreaterThan100(x);
        //then
        Assertions.assertEquals(isGreater, true);
    }
}