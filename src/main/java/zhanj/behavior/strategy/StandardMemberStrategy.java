package zhanj.behavior.strategy;

public class StandardMemberStrategy implements MemberStrategy {
    public double calcPrice(double bookPrice) {
        System.out.println("普通会员没有折扣");
        return bookPrice;
    }
}
