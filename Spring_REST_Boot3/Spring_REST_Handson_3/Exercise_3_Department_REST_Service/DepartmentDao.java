import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {

    private static List<Department> departmentList;

    public DepartmentDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        departmentList =
                (ArrayList<Department>) context.getBean("departmentList");

    }

    public List<Department> getAllDepartments() {

        return departmentList;

    }

}