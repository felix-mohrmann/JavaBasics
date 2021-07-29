package felix.fische.week2;

public class Fish extends Animals {

    public Fish() {
        setLegAmount(0);
    }

    public void swim() {
        System.out.println("blub blab I'm swimming");
    }

    @Override
    public void printLegs() {
        super.printLegs();
    }
}
