import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService service;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        service = context.getBean(CountryService.class);

        showCountries();

    }

    private static void showCountries() {

        System.out.println("Available Countries");

        List<Country> countries = service.getAllCountries();

        for (Country country : countries) {
            System.out.println(country);
        }

    }

}