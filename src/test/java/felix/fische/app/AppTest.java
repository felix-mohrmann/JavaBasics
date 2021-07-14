package felix.fische.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldCalculateProperly() {
        //given
        int x = 5;
        int y = 4;
        //when
        int result = App.add(5, 4);
        //then
        Assert.assertEquals(result, 9);
    }

    @Test
    public void shouldBeGreaterThan100() {
        //given
        int x = 110;
        //when
        boolean isGreater = (App.isGreaterThan100(x));
        //then
        Assert.assertTrue(isGreater);
    }
}
