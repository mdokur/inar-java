package week_10.assigments;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudents(String student) {
        int tempIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].compareTo(student) == 0) {
                tempIndex = i;
                break;
            }
        }
        for (int i = tempIndex; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }


    public void clean() {
        numberOfStudents = 0;
        students[numberOfStudents] = " ";
    }

    public void printCourse() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}
