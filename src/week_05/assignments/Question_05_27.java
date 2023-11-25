package week_05.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        int j=0;
        for (int i = 101; i <=2100 ; i++) {
            if(i%4==0) {
                System.out.print(i + " ");
                j++;
                if(j%10==0){
                    System.out.println();
                }
            }
        }
    }
}
