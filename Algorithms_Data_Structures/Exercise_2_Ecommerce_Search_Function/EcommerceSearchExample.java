package Algorithms_Data_Structures.Exercise_2_Ecommerce_Search_Function;

public class EcommerceSearchExample {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Backpack", "Travel")
        };

        System.out.println("Linear Search:");

        Product linearResult = LinearSearch.search(products, 104);

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println();

        System.out.println("Binary Search:");

        Product binaryResult = BinarySearch.search(products, 104);

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }
    }
}