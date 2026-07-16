import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    List<String> phoneNumbers;
    Employee(String name,List<String> numbers){
        this.name=name;
        this.phoneNumbers=numbers;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}

public class TestClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee("David", Arrays.asList("12", "34", "56"));
        Employee emp2 = new Employee("Hussain", Arrays.asList("78", "910", "1112"));
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        List<String> phNumbers1 =
                empList.stream().flatMap(emp->emp.getPhoneNumbers().stream())
                                .collect(Collectors.toList());
        System.out.println(phNumbers1);

    }


}
