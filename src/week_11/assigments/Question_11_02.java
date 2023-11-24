package week_11.assigments;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gürol", "Istanbul", 9999, "gurol@inar.com");
        System.out.println(person.toString());

        System.out.println("-------------------");

        Student student = new Student("Nafiz", "Ankara", 33333, "nafiz@inar", "mid");
        System.out.println(student.toString());

        System.out.println("-------------------");

        Employee employee = new Employee("Recai", "Istanbul", 222222, "recai@inar", 9100, "asbestosis");
        System.out.println(employee.toString());

        System.out.println("-------------------");

        Faculty faculty = new Faculty("Serhat", "Istanbul", 111111, "serhat@gmail", 11201, "910", "10am to 6pm", "manager");
        System.out.println(faculty.toString());

        System.out.println("-------------------");

        Staff staff = new Staff("Elon", "California", 123456, "elon@musk", 9999, "x", "CEO");
        System.out.println(staff.toString());
    }
}
