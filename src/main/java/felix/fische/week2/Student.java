package felix.fische.week2;

public class Student {

    private String name;
    private int age;
    private boolean accepted;

    public Student() {

    }

    public Student(String name, int age, boolean accepted) {
        this.name = name;
        this.age = age;
        this.accepted = accepted;
    }

    public String toString() {
        return name + " " + age + " " + accepted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}