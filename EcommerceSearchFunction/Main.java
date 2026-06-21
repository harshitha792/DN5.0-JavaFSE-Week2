import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }
    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == id)
                return products[mid];

            if (products[mid].productId < id)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Bag", "Fashion")

        };

        System.out.println("Linear Search:");

        Product result = linearSearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println();

        System.out.println("Binary Search:");

        result = binarySearch(products, 103);

        if (result != null)
            result.display();
        else
            System.out.println("Product not found");
    }
}
