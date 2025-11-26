package ie.atu.week10;

public class Preferred extends Customer {
    private int loyalty_points;
    private double discount_level; //0.05 for 5%, etc.

    public Preferred() {
        super();
        this.loyalty_points = 0;
        this.discount_level = 0.0;
    }

    public Preferred(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyalty_points, double discount_level) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyalty_points = loyalty_points;
        this.discount_level = discount_level;
    }

    public int getLoyalty_points() {
        return loyalty_points;
    }

    public void setLoyalty_points(int loyalty_points) {
        this.loyalty_points = loyalty_points;
    }

    public double getDiscount_level() {
        return discount_level;
    }

    public void setDiscount_level(double discount_level) {
        this.discount_level = discount_level;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "loyalty_points=" + loyalty_points +
                "\ndiscount_level=" + discount_level ;
    }

    private void updateDiscountLevel() {
        if (loyalty_points < 500) {discount_level = discount_level = 0;}
        else if (loyalty_points <= 500 && loyalty_points <= 900) {discount_level = discount_level = 0.05;}
        else if (loyalty_points <= 1000 && loyalty_points <= 1499) {discount_level = discount_level = 0.06;}
        else if (loyalty_points <= 1500 && loyalty_points <= 1999) {discount_level = discount_level = 0.07;}
        else if (loyalty_points >= 2000) {discount_level = discount_level = 0.10;}
    }
    public void addLoyaltyPoints(int points) {
        this.loyalty_points += points;
        updateDiscountLevel();
    }



}
