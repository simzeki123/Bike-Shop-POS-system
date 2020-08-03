package bikeProduct;

public enum Price {
    TEN(10),
    FIFTEEN(15),
    TWENTY(20);

    private int amount;

    Price(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}