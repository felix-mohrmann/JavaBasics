package felix.fische.week2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    @DisplayName("get & set from name")
    public void checkName() {
        //given
        Student student = new Student();
        student.setName("Klaus");
        //when
        String actual = student.getName();
        //then
        assertEquals("Klaus", actual);
    }

    @Test
    @DisplayName("get & set from age")
    public void checkAge() {
        //given
        Student student = new Student();
        student.setAge(10);
        //when
        int actual = student.getAge();
        //then
        assertEquals(10, actual);
    }
    @Test
    @DisplayName("get & set from Accepted")
    public void checkAccepted() {
        //given
        Student student = new Student();
        student.setAccepted(true);
        //when
        boolean actual = student.isAccepted();
        //then
        assertEquals(true, actual);
    }
}