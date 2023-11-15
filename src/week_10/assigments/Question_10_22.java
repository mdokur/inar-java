package week_10.assigments;

public class Question_10_22 {
    public static void main(String[] args) {
        char[] chars = {'I', 'n', 'a', 'r'};
        MyString myString = new MyString(chars);
        System.out.println(myString.toString());
        System.out.println(myString.charAt(2));
        System.out.println(myString.length());
        System.out.println(myString.equals(new MyString("inarrr")));
        System.out.println(myString.toLowerCase());
        MyString myString1 = myString.valueOf(35467);
        System.out.println(myString1);
        MyString myString11 = myString.substring(1, 3);
        System.out.println(myString11.toString());
    }
}
