import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Employee {
	String name;
	int age;
	String gender;
	public Employee(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return "- "+name+" -";
	}
	
	
	
}
class EmployeeSearch {
	
	public static Predicate<Employee> isAdultMale(){
		return p-> p.age > 21 && p.gender.equals("M");
	}
	public static List<Employee> filterEmployees(Predicate p,List<Employee> emp){
		return emp.stream().filter(p).collect(Collectors.toList());
		
		
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("david",34,"M"));
		emp.add(new Employee("ravi",21,"M"));
		emp.add(new Employee("alice",23,"F"));
		System.out.println(EmployeeSearch.filterEmployees(EmployeeSearch.isAdultMale(), emp));
		
		
		
	}

}
