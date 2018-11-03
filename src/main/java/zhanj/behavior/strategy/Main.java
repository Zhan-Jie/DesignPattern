package zhanj.behavior.strategy;

public class Main {
    public static void main(String[] args) {
        double price = 30.0;
        test(new StandardMemberStrategy(), price);
        test(new GoldenMemberStrategy(), price);
        test(new PlatinumMemberStrategy(), price);
    }

    private static void test(MemberStrategy strategy, double price) {
        System.out.println("---------------------------------");
        double p = new BookPrice(strategy).quote(price);
        System.out.printf("原价为：%f, 折扣后为：%f%n", price, p);
    }
}
