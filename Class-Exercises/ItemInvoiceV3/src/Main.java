import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static String getData(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        int count = 5;

        Order []  orders = new Order[count];

        for (int i = 0; i < count; i++) {
            orders[i] = new Order();

            orders[i].setName(getData("Enter Name : "));
            orders[i].setBrand(getData("Enter Brand : "));
            orders[i].setQuantity(Integer.parseInt(getData("Enter Quantity : ")));
            orders[i].setPrice(Double.parseDouble(getData("Enter Price : ")));

            System.out.println("Order created");
            System.out.println("-" .repeat(50));
        }

        double total = 0;

        for(Order order : orders) {
            total += order.getTotal();
            System.out.println(order);
        }
        System.out.println("-".repeat(50));
        System.out.println("Total : \t\t\t\t" + total + "$");



    }
}
