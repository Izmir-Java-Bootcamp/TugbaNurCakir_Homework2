package kodluyoruz_week2;
import java.util.Scanner;
public class Main {
    /*
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart){

        Scanner scanner = new Scanner((System.in));
        String name;
        String seller;
        int price;
        int amount;
        String discountQuestion;
        boolean discount;
        boolean buy2Take3;

        // Code to read from console the product name, seller,
        System.out.println("Enter the name of product: ");
        name = scanner.nextLine();

        System.out.println("Enter the name of seller: ");
        seller = scanner.nextLine();

        // price, number of products, discount and
        System.out.println("Enter the price: ");
        price = scanner.nextInt();

        System.out.println("Enter the amount of product : ");
        amount = scanner.nextInt();

        System.out.println("Do you want discount(Y/N) ");
        discountQuestion = scanner.nextLine();
        if (discountQuestion.equals("Y") || discountQuestion.equals("y")){
            discount = true;
        }
        else{
            discount = false;
        }

        if(discount){
            DiscountedProduct applyDiscount(new Product(seller,name,price), 20);
        }

        // if Buy2Take3 applies.
        if(amount >= 3){
//APPLY DISCOUNT
            //if amount
            cart.addProduct(new Product(seller, name, price),amount-1);
            cart.addProduct(new Product(seller, name, 0));
        }


        // Then create a product of the correct type
        // and add it to the shopping cart
    }

    // Main method to interact with a customer
    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        Scanner scanner = new Scanner(System.in);

        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options:");
        System.out.println("0 to buy a product");
        System.out.println("1 to checkout");

        Cart cart = new Cart();
        int buyOrCheckout = scanner.nextInt();
        if(buyOrCheckout == 0){
            System.out.println("Costumer " + customer + " wants to buy a product");
            askCustomer(cart);
        }
        else if (buyOrCheckout == 1) {//checkout
            System.out.println("total price of all products in your cart : " + cart.totalPrice());
        }

        //Implement the user interface here
        // Ask the user to choose 0 (buy product) or
        // 1 (checkout), depending on what they want to do.
        // Use the method askCustomer
    }
}