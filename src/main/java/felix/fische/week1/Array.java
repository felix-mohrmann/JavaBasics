package felix.fische.week1;

public class Array {

    public static String[] fillArray(int amountOfStudents) {
        String[] students = new String[amountOfStudents];

        for (int i = 0; i < students.length; i++){
            students[i] = "Students " + (i+1);
        }
        return students;
    }
}
