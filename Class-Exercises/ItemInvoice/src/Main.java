import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 5;

        Order []  orders = new Order[count];

        for (int i = 0; i < count; i++) {
            orders[i] = new Order();

            System.out.println("Enter Name : ");
            orders[i].name = scan.nextLine();

            System.out.println("Enter Brand : ");
            orders[i].brand = scan.nextLine();

            System.out.println("Enter Quantity : ");
            orders[i].quantity = Integer.parseInt(scan.nextLine());

            System.out.println("Enter Price : ");
            orders[i].price = Double.parseDouble(scan.nextLine());

            System.out.println("Order created");
            System.out.println("-" .repeat(50));
        }

        double total = 0;

        for(Order order : orders) {
            total += order.quantity * order.price;
            System.out.println(order);
        }
        System.out.println("-".repeat(50));
        System.out.println("Total : \t\t\t\t" + total + "$");



    }
}
