package collections_and_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Employee Management System demonstrating Java 8+ Stream API operations.
 * Provides various methods to perform operations on employee collections.
 * 
 * @author Ketan Mishra
 * @version 1.0
 */
public class EmployeeManagement {
	
	private ArrayList<Employee> listOfEmp = new ArrayList<>();
	private List<Employee> listENames = new ArrayList<>();
	
	/**
	 * Adds an employee to the management system.
	 * 
	 * @param emp Employee object to be added
	 */
	public void addEmp(Employee emp) {
		listOfEmp.add(emp);
	}
	
	/**
	 * Displays details of all employees in the system.
	 */
	public void displayDetails() {
		for(Employee e : listOfEmp) {
			System.out.println(e);
		}
	}
	
	/**
	 * Calculates and displays the average salary of all employees.
	 * Uses Stream API to compute the average.
	 */
	public void displayAverageSalary() {
		double avgSal = listOfEmp.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average Salary of the employees: "+ avgSal);
	}
	
	/**
	 * Finds and displays the highest salary among all employees.
	 * Uses Stream API max operation.
	 */
	public void highestSalary() {
		double highestSal = listOfEmp.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
		System.out.println("Maximum Salary: "+highestSal);
	}
	
	/**
	 * Filters and displays employees with salary greater than 80000.
	 * Demonstrates Stream API filter and collect operations.
	 */
	public void higestSalarythan80000() {
		listENames = listOfEmp.stream().filter(e -> e.getSalary()>80000).collect(Collectors.toList());
		
		for(Employee e : listENames) {
			System.out.println(e.getName());
		}
	}
}
