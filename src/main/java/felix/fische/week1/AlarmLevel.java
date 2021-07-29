package felix.fische.week1;

public enum AlarmLevel {

    RED(0), YELLOW(30), GREEN(60);

    private final int maxPeople;

    AlarmLevel(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getMessage(int amount) {

        switch (this) {
            case RED:
                return "no one allowed";

            default:
                if (amount > maxPeople) {
                    return "max people reached";
                }
                return "come in please";
        }
    }
}
