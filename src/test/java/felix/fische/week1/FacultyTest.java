package felix.fische.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacultyTest {
    @Test
    public void facultyOf0ShouldBe1() {
        //given
        int x = 0;
        //when
        int actual = Faculty.faculty(x);
        //then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void facultyOf1ShouldBe1() {
        //given
        int x = 1;
        //when
        int actual = Faculty.faculty(x);
        //then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void facultyOf2ShouldBe2() {
        //given
        int x = 2;
        //when
        int actual = Faculty.faculty(x);
        //then
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void facultyOf3ShouldBe6() {
        //given
        int x = 3;
        //when
        int actual = Faculty.faculty(x);
        //then
        Assertions.assertEquals(6, actual);
    }
}
