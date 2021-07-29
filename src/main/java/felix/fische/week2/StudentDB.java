package felix.fische.week2;

public class StudentDB {

    private Student[] students;

    public StudentDB (Student[] students){
        this.students = students;
    }

    public Student[] list(){
        return students;
    }

    @Override
    public String toString() {
        String allStudents = "";
        for (int i = 0; i < students.length; i++) {
             allStudents += students[i].getName() + " - " + students[i].getId() + ", ";
        }
        return allStudents;
    }

    public Student randomStudent(){
        return students[(int) Math.random() * students.length];
    }

    public void add(Student student){
        
    }
}
