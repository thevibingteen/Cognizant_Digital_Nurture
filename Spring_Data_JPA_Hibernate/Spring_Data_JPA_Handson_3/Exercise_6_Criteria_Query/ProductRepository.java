import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public List<Product> searchProducts() {

        List<Product> products =
                new ArrayList<>();

        products.add(new Product(
                1,
                "Laptop A",
                "Electronics",
                65000,
                16));

        products.add(new Product(
                2,
                "Laptop B",
                "Electronics",
                72000,
                32));

        return products;

    }

}