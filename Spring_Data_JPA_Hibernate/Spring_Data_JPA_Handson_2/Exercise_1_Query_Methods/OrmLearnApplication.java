import java.util.List;

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

        System.out.println("Countries containing 'an'");

        List<Country> result =
                service.searchCountry("an");

        result.forEach(System.out::println);

        System.out.println();

        System.out.println("Countries in alphabetical order");

        service.getCountriesSorted()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Countries starting with 'A'");

        service.getCountriesStartingWith("A")
                .forEach(System.out::println);

    }

}