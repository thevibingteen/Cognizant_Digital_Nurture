import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        CountryService service =
                context.getBean(CountryService.class);

        Country india = new Country("IN", "India");

        service.addCountry(india);

        System.out.println(service.getAllCountries());

    }

}