import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class,
                        args);

        ProductService service =
                context.getBean(ProductService.class);

        List<Product> products =
                service.getProducts();

        System.out.println();

        System.out.println(
                "Available Products");

        System.out.println();

        for (Product product : products) {

            System.out.println(product.getName()
                    + " | RAM : "
                    + product.getRam()
                    + " GB");

        }

    }

}