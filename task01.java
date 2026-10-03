public class task01 {
    static void main () {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the price of the item:  $");
        double price = input.nextDouble();
        double shipping;
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.02;
        }
        double totalPrice = price + shipping;
        System.out.println("Shipping cost:  $" + shipping);
        System.out.println("total price:  $" + totalPrice);
    }
}
