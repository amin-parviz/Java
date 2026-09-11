
public class Order {
    String name;
    String brand;
    int quantity;
    double price;

    public String toString(){
        return String.format("%10s %10s - %3s * %8s ==> %s $", name, brand, quantity, price, quantity * price);
    }
}
