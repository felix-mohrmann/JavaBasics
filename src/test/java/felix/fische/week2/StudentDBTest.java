package felix.fische.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void testSetupDB() {
        //given
        Student[] students = {new Student("Klaus", 20), new Student("Lena", 10)};
        StudentDB studentDB = new StudentDB(students);
        //when
        Student[] actual = studentDB.list();
        //then
        assertArrayEquals(students, actual);
    }

    @Test
    public void testToString() {
        //given
        Student[] students = {new Student("Klaus", 20), new Student("Lena", 10)};
        StudentDB studentDB = new StudentDB(students);
        //when
        String actual = studentDB.toString();
        //then
        assertEquals("Klaus - 20, Lena - 10, ", actual);
    }
}