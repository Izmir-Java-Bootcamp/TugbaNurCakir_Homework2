package kodluyoruz_week2;

public class Product {
    private final String seller;    //Name of the seller.
    private final String productName;   //Name of the product
    private final double productPrice; //Price of the product.

    Product(String seller, String productName, int productPrice){
        this.seller = seller;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    //Construct a new Product from a given product
    public Product(Product original) {
        this.productName=original.productName;
        this.productPrice=original.productPrice;
        this.seller=original.seller;
    }
    public String getSeller() {
        return seller;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice(Cart cart) {
        return productPrice;
    }
    public boolean canBeReduced() {

        return true;
    }
    public String toString() {
        // code here
        return productName;
    }

}
