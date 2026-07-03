import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        DepartmentService departmentService =
                context.getBean(DepartmentService.class);

        EmployeeService employeeService =
                context.getBean(EmployeeService.class);

        SkillService skillService =
                context.getBean(SkillService.class);

        Department department =
                new Department(1, "Information Technology");

        departmentService.addDepartment(department);

        Employee employee =
                new Employee(101, "Rahul", department);

        employeeService.addEmployee(employee);

        Skill skill =
                new Skill(1, "Java");

        skillService.addSkill(skill);

        System.out.println("O/R Mapping example executed successfully.");

    }

}