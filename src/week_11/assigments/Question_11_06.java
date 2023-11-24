package week_11.assigments;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Triangle(3, 4, 5));
        list.add(new Date());
        list.add(new Employee("Recai", "Istanbul", 222222, "recai@inar", 9100, "asbestosis"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(",,,,,,,,,,,,,,,,,,,,,");
            System.out.println(list.get(i).toString());
            System.out.println(",,,,,,,,,,,,,,,,,,,,,");
        }
    }
}
