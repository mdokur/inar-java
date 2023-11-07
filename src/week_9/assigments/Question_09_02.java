package week_9.assigments;

public class Question_09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock name  : " + stock.getName());
        System.out.println("Stock symbol: " + stock.getSymbol());
        System.out.println("Price-change\npercentage: " + stock.getChangePercent(34.50,34.35));
    }
}
