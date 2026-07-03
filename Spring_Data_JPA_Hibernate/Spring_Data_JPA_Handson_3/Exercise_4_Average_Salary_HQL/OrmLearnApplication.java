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

        EmployeeService service =
                context.getBean(EmployeeService.class);

        double averageSalary =
                service.getAverageSalary(1);

        System.out.println();

        System.out.println(
                "Average Salary : "
                + averageSalary);

    }

}