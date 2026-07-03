import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    private static List<Employee> employeeList;

    public EmployeeDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        employeeList =
                (ArrayList<Employee>) context.getBean("employeeList");

    }

    public List<Employee> getAllEmployees() {

        return employeeList;

    }

}