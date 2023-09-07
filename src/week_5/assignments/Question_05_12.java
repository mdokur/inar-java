package week_5.assignments;

public class Question_05_12 {
    public static void main(String[] args) {
        int n =0;
        int lastN = 0;

        while( Math.pow(n,2)<1200 ){
            n++;
            lastN = (n+1)*-1;
        }
        System.out.println("The smallest n is: " + lastN);
    }
}
