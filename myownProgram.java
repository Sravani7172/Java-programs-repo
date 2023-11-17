import java.util.*;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int numOfItems; // Corrected the variable name

    public Product(int id, String name, double price, int numOfItems) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.numOfItems = numOfItems;
    }
}

public class myownProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Product> productList = new ArrayList<Product>();

        System.out.println("Enter the number of products:");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Enter the id:");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the name of the product:");
            String name = scan.nextLine();
            System.out.println("Enter the price :");
            double price = scan.nextDouble();
            System.out.println("Number of items:");
            int numOfItems = scan.nextInt();
            Product product = new Product(id, name, price, numOfItems);
            productList.add(product);
        }

        System.out.println("Display list of products:");
        productList.forEach(p -> System.out.println("[" + p.id + " " + p.name + " " + p.price + " " + p.numOfItems + "]"));

        System.out.println("Enter the product id which you want to buy:");
        int selectedProductId = scan.nextInt();
        Optional<Product> selectedProduct = productList.stream().filter(p -> p.id == selectedProductId).findFirst();

        if (selectedProduct.isPresent()) {
            System.out.println("Selected product: " + selectedProduct.get().name);
            System.out.println("Enter the number of items you want to buy:");
            int itemsCount = scan.nextInt();
            double totalPrice = selectedProduct.get().price * itemsCount;
            System.out.println("Total Price: " + totalPrice);
            productList.remove(selectedProduct.get()); // Removed the unnecessary index-based removal
        } else {
            System.out.println("Product not found with the given id");
        }

        System.out.println("Remaining products list:");
        productList.forEach(l -> System.out.println(l.id + " " + l.name + " " + l.price + " " + l.numOfItems));

        scan.close();
    }
}
