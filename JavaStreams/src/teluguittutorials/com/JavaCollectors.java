package teluguittutorials.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	String name;
	String department;
	double salary;
	public Employee(String name,String department,double salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{
		return name + " (" + department + ")";
	}
}
public class JavaCollectors {

	public static void main(String[] args) {
		
		List<Employee> employee=Arrays.asList(
				 	new Employee("Alice", "HR", 50000),
	                new Employee("Bob", "IT", 60000),
	                new Employee("Charlie", "IT", 65000),
	                new Employee("David", "HR", 55000),
	                new Employee("Eve", "Finance", 70000)
	                );
	
		//toList() & toSet()
		List<String> namesList=employee.stream().map(Employee::getName).collect(Collectors.toList());
		Set<String> deptset=employee.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println("Name List:" + namesList);
		System.out.println("Unique Departments List:" + deptset);
		
		//Joining() concatenate elements into a single string 
		//Collectors.joining("delimiter","Prefix","Suffix")
		String allNames=employee.stream().map(Employee::getName).collect(Collectors.joining(",","Employees:[","]"));
		System.out.println("Joined Names:" +allNames);
		
		//Grouping()
		Map<String,List<Employee>> byDept=employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Grouped By Department:" + byDept);
		
		//partitioningBy()
		Map<Boolean,List<Employee>> highSalary=employee.stream().collect(Collectors.partitioningBy(e->e.getSalary()>=60000));
		System.out.println(">=60000:" + highSalary.get(true));
		System.out.println("<60000:" + highSalary.get(false));
		
		//summarzingDouble() / averagingDouble()
		double avgSalary=employee.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.print("Average Salary:" + avgSalary);
	}

}
 