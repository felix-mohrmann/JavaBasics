package felix.fische.week1;

public class Calculations {
    public static void main(String[] args) {
        int x = 10;
        int y = 90;
        System.out.println(isGreaterThan100(add(duplicate(x), y)));

        String fancy = "Ich bin ein fancy string";
        System.out.println(isLongerThan20(fancy) && hasFancy(fancy));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int duplicate(int value) {
        return value * 2;
    }

    public static boolean isGreaterThan100(int x) {
        return x > 100;
    }

    public static boolean isLongerThan20(String text) {
        return text.length() > 20;
    }

    public static boolean hasFancy(String text) {
        return text.contains("fancy");
    }
}
