package week_11.assigments;

import java.util.ArrayList;

public class Question_11_05 {
    public static void main(String[] args) {
        Course course = new Course("Course Inar Academy");
        ArrayList<String> list = course.getList();

        System.out.println("After adding student to the course...");
        course.addStudent("Nisanur Altundas");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");
        course.addStudent("Ada Kaya");

        course.displayCourse();
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("---------------------------------------------------");

        System.out.println("After dropping student to the course...");
        course.dropStudent("Sinan Cetin");
        course.dropStudent("Mehmet Toprak");
        course.dropStudent("Berkan Eris");

        course.displayCourse();
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}
