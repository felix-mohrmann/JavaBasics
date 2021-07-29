package felix.fische.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class AlarmTest {
    @Test
    @DisplayName("Thread Level Red doesn't allow anyone")
    public void checkRed0() {
        //given
        AlarmLevel level = AlarmLevel.RED;
        int amountOfPeople = 1;
        //when
        String actual = Alarm.checkPeople(level, amountOfPeople);
        //then
        Assertions.assertEquals(actual, "no one allowed");
    }

    @Test
    @DisplayName("Thread Level Yellow allows up to 30 people")
    public void checkYellow29() {
        //given
        AlarmLevel level = AlarmLevel.YELLOW;
        int amountOfPeople = 30;
        //when
        String actual = Alarm.checkPeople(level, amountOfPeople);
        //then
        Assertions.assertEquals(actual, "come in please");
    }

    @Test
    @DisplayName("Thread Level Yellow forbids 31 people")
    public void checkYellow31() {
        //given
        AlarmLevel level = AlarmLevel.YELLOW;
        int amount = 31;
        //when
        String actual = Alarm.checkPeople(level, amount);
        //then
        Assertions.assertEquals(actual, "max people reached");
    }

    @Test
    @DisplayName("Thread Level Green allows up to 60 people")
    public void checkGreen29() {
        //given
        AlarmLevel level = AlarmLevel.GREEN;
        int amountOfPeople = 60;
        //when
        String actual = Alarm.checkPeople(level, amountOfPeople);
        //then
        Assertions.assertEquals(actual, "come in please");
    }

    @Test
    @DisplayName("Thread Level Green forbids 61 people")
    public void checkGreen31() {
        //given
        AlarmLevel level = AlarmLevel.GREEN;
        int amount = 61;
        //when
        String actual = Alarm.checkPeople(level, amount);
        //then
        Assertions.assertEquals(actual, "max people reached");
    }
}