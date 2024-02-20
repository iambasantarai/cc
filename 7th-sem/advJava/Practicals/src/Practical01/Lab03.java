/*
Create a class Product with name, qty and price. Create a parameterized constructor to set the
product details. Provide the method getName(), getQty() and getPrice() that return product name,
qty and price. Also create method getTotal() that returns the total price. Then create a class
ProductDemo with main method that creates two object of Product and find the total price of both
products.
 */
package Practical01;

class Product {
    public String name;
    public double price;
    public int qty;

    Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    String getName() {
        return name;
    }

    int getQty() {
        return qty;
    }

    double getPrice() {
        return price;
    }

    double getTotal() {
        return qty * price;
    }

}

public class Lab03 {
    public static void main(String[] args) {
        Product p1 = new Product("Plain T-Shirts", 5.5, 10);
        Product p2 = new Product("Knit sweaters", 9.4, 5);

        System.out.println("The total price of " + p1.getQty() + " " + p1.getName() + " is $" + p1.getTotal() + ".");
        System.out.println("The total price of " + p2.getQty() + " " + p2.getName() + " is $" + p2.getTotal() + ".");
    }
}
