package kodluyoruz_week2;

public class DiscountedProduct  extends Product{ //extends product
    // Original product
    private final Product original;

    // Discount in percent (%)
    private final double discount;

    /**
     * Construct a discounted product
     * @param original
     * @param discount
     */
    public DiscountedProduct(Product original, double discount) {
        super(original);
        if(original.canBeReduced()) {
            System.out.println("price can be reduced ");
        }

        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
        this.original = null;
        this.discount = 0;
    }

    /**
     * Return the price of this discounted product
     * @param cart shopping cart
     * @return discounted price
     */
    public double getPrice(Cart cart) {
        // code here

        return cart.totalPrice();
    }

    /**
     * Return the string representation of the product
     * Example: CD [discounted 20 %]
     */
    public String toString() {
        // code here
        return "something ";
    }
}
