package felix.fische.week2;

import java.util.Objects;

public class Student {

    private String name;
    private int id;
    private int age;
    private boolean accepted;

    public Student(String name, int age, boolean accepted) {
        this.name = name;
        this.age = age;
        this.accepted = accepted;
    }

    public Student(){}

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return name + " " + age + " " + accepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return accepted == student.accepted && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, accepted);
    }
}