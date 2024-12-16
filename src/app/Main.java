package app;

public class Main {
    static int items;
    static int productNumber;
    static String productName;
    static double price;
    static int days;
    static double totalSales;
    static double daySales;

    public static final String currency = "EUR";

    public static void main (String[] args ) {
    productNumber = 1;
    productName = "smartphone";
    items = 59;
    price = 205.99;
    days = 5;
    totalSales = items * price;
    daySales = totalSales / days;


        System.out.printf("Product No" + " " + productNumber + ": " + productName + "%n"+
        "total sales for " + days + " " + "is" +" " + currency +" " + totalSales+ ",%n" +
                "sales by day is" +" "+  currency +" "+  daySales);


        productNumber =  2;
        productName = "laptop";
        days = 7;
        items = 23;
        price = 455.95;
        totalSales =  items * price;
        daySales = totalSales / days;

        System.out.printf("%n" +"Product No" + " " + productNumber + ": " + productName + "%n"+
                "total sales for " + days + " " + "is" +" " + currency +" " + totalSales+ ",%n" +
                "sales by day is" +" "+  currency +" "+  daySales);

    }
}
