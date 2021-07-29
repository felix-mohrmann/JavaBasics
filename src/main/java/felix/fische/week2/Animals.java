package felix.fische.week2;

public class Animals {
    private int legAmount;

    public void printLegs(){
        System.out.println(legAmount);
    }

    public int getLegAmount() {
        return legAmount;
    }

    public void setLegAmount(int legAmount) {
        this.legAmount = legAmount;
    }
}
