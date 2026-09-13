
public class Order {
    private String name;
    private String brand;
    private int quantity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }else{
            System.out.println("Quantity is negative !");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price is negative !");
        }
    }
    public double getTotal() {
        return quantity * price;
    }

    public String toString(){
        return String.format("%10s %10s - %3s * %8s ==> %s $", name, brand, quantity, price, quantity * price);
    }
}
