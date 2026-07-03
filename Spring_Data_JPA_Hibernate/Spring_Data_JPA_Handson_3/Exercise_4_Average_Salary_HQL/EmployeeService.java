import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public double getAverageSalary(int departmentId) {

        return repository.getAverageSalary(departmentId);

    }

}