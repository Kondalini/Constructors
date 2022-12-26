import java.util.Scanner;

public class CalculateRevenue {
    public static void main(String[] args) {
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String msgRevenue = "The revenue from sale: ";
        String msgDiscount = "Discount:";
        char dollar = '$';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price");
        unitPrice = scanner.nextDouble();
        System.out.println("Enter quantity");
        quantity = scanner.nextInt();
        revenue = unitPrice * quantity;

        if (quantity >=100 && quantity < 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.15;
        } else {
            discountRate = 0;
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;
        System.out.println(msgRevenue + revenue + dollar);
        System.out.println(msgDiscount + discount + dollar);

    }
}

