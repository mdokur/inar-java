package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println("Population Projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population Projection Formula:");
        System.out.println("(Current population + (births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrrants per year))");
        System.out.println("Year 1 Projection:");
        System.out.println(312032486 + (31536000 / 7) - (31536000 / 13) + 31536000 / 45);
        System.out.println("Year 2 Projection:");
        System.out.println(314812582 + (31536000 / 7) - (31536000 / 13) + 31536000 / 45);
        System.out.println("Year 3 Projection:");
        System.out.println(317592678 + (31536000 / 7) - (31536000 / 13) + 31536000 / 45);
        System.out.println("Year 4 Projection:");
        System.out.println(320372774 + (31536000 / 7) - (31536000 / 13) + 31536000 / 45);
        System.out.println("Year 5 Projection:");
        System.out.println(323152870 + (31536000 / 7) - (31536000 / 13) + 31536000 / 45);
    }
}
