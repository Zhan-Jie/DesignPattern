package zhanj.behavior.strategy;

public class GoldenMemberStrategy implements MemberStrategy {
    public double calcPrice(double bookPrice) {
        System.out.println("对于黄金会员折扣为5%");
        return bookPrice * 0.95;
    }
}
