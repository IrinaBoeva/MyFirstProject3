public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1, 2, 1000, 450};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();

        System.out.println(max);
    }
}
