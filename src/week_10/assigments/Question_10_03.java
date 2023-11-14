package week_10.assigments;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println("getValue : " + myInteger.getValue());
        System.out.println("isEven() : " + myInteger.isEven());
        System.out.println("isOdd()  : " + myInteger.isOdd());
        System.out.println("isPrime(): " + myInteger.isPrime());

        System.out.println("----------------------------------------");

        System.out.println("equals(10): " + myInteger.equals(10));
        System.out.println("equals(MyInteger(" + myInteger.getValue() + ")): " + myInteger.equals(myInteger));
        System.out.println("isEven(" + myInteger.getValue() + ") static: " + myInteger.isEven(myInteger));
        System.out.println("isOdd(" + myInteger.getValue() + ") static : " + myInteger.isOdd(myInteger));
        System.out.println("isPrime(" + myInteger.getValue() + ") static: " + myInteger.isPrime(myInteger));

        System.out.println("----------------------------------------");

        char[] array = {'1', '2', '3'};

        System.out.println("parseInt(char[]{1,2,3}) static: " + myInteger.parseInt(array));


        String str = "123";
        System.out.println("parseInt(" + str + ") static: " + myInteger.parseInt(str));
    }
}
