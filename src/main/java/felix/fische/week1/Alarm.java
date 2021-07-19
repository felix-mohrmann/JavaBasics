package felix.fische.week1;

public class Alarm {

    public static String checkPeople(String threadLevel, int amount) {
        int limit;

        switch(threadLevel){
            case "green":
                limit = 60;
                break;
            case "yellow":
                limit = 30;
                break;
            default:
                limit = 0;
                break;
        }

        if (amount > limit){
            return "max people reached";
        }else {
            return "come in please";
        }
    }
}
