public class SpringLearnApplication {

    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDao();

        dao.getAllEmployees()
                .forEach(System.out::println);

    }

}