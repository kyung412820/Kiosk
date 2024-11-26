package resource;

public enum UserType {
    VETERAN(0.1),  // 국가유공자: 10%
    SOLDIER(0.05), // 군인: 5%
    STUDENT(0.03), // 학생: 3%
    GENERAL(0.0);  // 일반: 0%

    private final double discountRate;

    UserType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double applyDiscount(double price) {
        return price - (price * discountRate);
    }
}
