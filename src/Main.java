public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{1, 2, 1000, 450};
        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();

        System.out.println(max);
    }
}
