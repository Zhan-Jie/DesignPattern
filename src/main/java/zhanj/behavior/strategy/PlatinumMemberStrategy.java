package zhanj.behavior.strategy;

public class PlatinumMemberStrategy implements MemberStrategy {
    public double calcPrice(double bookPrice) {
        System.out.println("对于白金会员的折扣高达20%");
        return bookPrice * 0.8;
    }
}
