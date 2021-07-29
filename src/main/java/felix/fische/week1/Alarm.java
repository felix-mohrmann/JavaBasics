package felix.fische.week1;

public class Alarm {

    public static String checkPeople(AlarmLevel threadLevel, int amount) {
        return threadLevel.getMessage(amount);
    }
}
