import java.util.List;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private boolean permanent;
    private Department department;
    private List<Skill> skillList;

    public Employee() {
    }

    public Employee(int id, String name, double salary,
                    boolean permanent,
                    Department department,
                    List<Skill> skillList) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.permanent = permanent;
        this.department = department;
        this.skillList = skillList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

}