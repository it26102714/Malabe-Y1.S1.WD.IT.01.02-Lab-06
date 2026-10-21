import java.util.Scanner;

public class IT26102714Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bill, discount, amountToPay;
        double totalDiscount = 0;
        char payment;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCustomer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            payment = input.next().toUpperCase().charAt(0);

            if (payment == 'C') {
                discount = bill * 0.05;
                amountToPay = bill - discount;
                totalDiscount += discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amountToPay);

            } else if (payment == 'O') {
                discount = 0;
                amountToPay = bill;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amountToPay);

            } else {
                System.out.println(
                    "Payment type " + payment + " is not valid"
                );
            }
        }

        System.out.println("\nTotal discount given: " + totalDiscount);

        input.close();
    }
}