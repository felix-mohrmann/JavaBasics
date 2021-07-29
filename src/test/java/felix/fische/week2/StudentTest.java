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
    @DisplayName("get & set from accepted")
    public void checkAccepted() {
        //given
        Student student = new Student();
        student.setAccepted(true);
        //when
        boolean actual = student.isAccepted();
        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("returns full student info")
    public void checkInfo(){
        //given
        Student student = new Student("Max", 20, true);
        //when
        String fullInfo = student.toString();
        //then
        assertEquals("Max 20 true", fullInfo);
    }

    @Test
    @DisplayName("student1 should be equal to student2")
    public void checkIfObjectsEqual(){
        //given
        Student student1 = new Student("Max", 21, true);
        Student student2 = new Student("Max", 20, true);
        //when
        boolean expected = student1.equals(student2);
        //then
        assertTrue(expected);
    }
    @Test
    @DisplayName("student1 should not be equal to student2")
    public void checkIfObjectsNotEqual(){
        //given
        Student student1 = new Student("Florian", 21, true);
        Student student2 = new Student("Max", 20, true);
        //when
        boolean expected = student1.equals(student2);
        //then
        assertFalse(expected);
    }
}