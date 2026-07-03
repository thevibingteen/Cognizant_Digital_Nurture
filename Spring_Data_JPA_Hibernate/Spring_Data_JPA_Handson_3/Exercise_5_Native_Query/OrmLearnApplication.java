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

        EmployeeService service =
                context.getBean(EmployeeService.class);

        List<Employee> employees =
                service.getAllEmployees();

        System.out.println("Employee List");

        for (Employee employee : employees) {

            System.out.println(employee);

        }

    }

}