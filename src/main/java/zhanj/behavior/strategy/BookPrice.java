package zhanj.behavior.strategy;

public class BookPrice {
    private MemberStrategy strategy;

    public BookPrice(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double price) {
        return strategy.calcPrice(price);
    }
}
