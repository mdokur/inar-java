package week_11.assigments;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> list = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public int getNumberOfStudents() {
        return this.list.size();
    }

    public void addStudent(String student) {
        this.list.add(student);
    }

    public void dropStudent(String student) {
        this.list.remove(student);
    }

    public void displayCourse() {
        System.out.println(list.toString());
    }
}
