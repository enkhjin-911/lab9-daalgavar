import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName()     { return name; }
    public String getCategory() { return category; }
    public double getPrice()    { return price; }

    @Override
    public String toString() {
        return name + " (" + (int) price + ")";
    }
}

public class ProductAnalyzer {

    public static Map<String, List<Product>> analyze(List<Product> products) {

        return products.stream()
            .filter(p -> p.getPrice() > 1000)

            .sorted(Comparator.comparingDouble(Product::getPrice).reversed())

            .collect(Collectors.groupingBy(Product::getCategory));
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Shoes",      "Clothing",   1500));
        products.add(new Product("T-Shirt",    "Clothing",   1200));

        Map<String, List<Product>> result = analyze(products);

        for (Map.Entry<String, List<Product>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}