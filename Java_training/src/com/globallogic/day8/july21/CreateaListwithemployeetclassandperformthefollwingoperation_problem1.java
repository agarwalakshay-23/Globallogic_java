//Create a List with student class and perform the following operation

package com.globallogic.day8.july21;

import java.util.*;

class Employee implements Comparable<Employee> {

	private String name;
	private double salary;
	private int age;

	public Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "[Name: " + this.name + " ,Salary: " + this.salary + " Age: " + this.age + " ]\n";
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);

	}

}

public class CreateaListwithemployeetclassandperformthefollwingoperation_problem1 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> list = new ArrayList<>();

	public static void main(String[] args) {

		int user_choice;

		System.out.println("1:  Add the employee to list");
		System.out.println("2:  Delete the employee from list");
		System.out.println("3:  Search the employee name");
		System.out.println("4:  Update the employee value using name or name");
		System.out.println("5:  Sort the data of employee ");
		System.out.println("6:  Provide the sum of slary of employee");
		System.out.println("7:  search for highest paid salary");
		System.out.println("8:  search for minimum paid salary");
		System.out.println("9:  Display the Employee list");
		lp: while (true) // labeling the while loop
		{
			System.out.print("\nMake your choice: ");
			user_choice = sc.nextInt(); // reading user's choice
			switch (user_choice) {
			case 1:
				addEmployee();

				break;
			case 2:
				deleteEmployee();
				break;
			case 3:
				searchEmployee();
				break;
			case 4:
				updateEmployee();
				break;
			case 5:
				sortEmployee();
				break;
			case 6:
				sumofSalary();
				break;
			case 7:
				highestPaidSalary();
				break;
			case 8:
				lowestSalary();
				break;
			case 9:
				displayEmployee();
				break;
			default:
				System.out.println("wrong choice");
			}

		}
	}

	private static void lowestSalary() {
		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		Iterator<Employee> iter = list.iterator();

		double sal = Double.MAX_VALUE;
		Employee lowsal = new Employee();

		while (iter.hasNext()) {

			Employee emp = iter.next();
			if (emp.getSalary() < sal) {
				sal = emp.getSalary();
				lowsal = emp;
			}

		}
		System.out.println("Employee details who has the Lowest salary :\n" + lowsal);

	}

	private static void highestPaidSalary() {
		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		Iterator<Employee> iter = list.iterator();

		double sal = -1;
		Employee highsal = new Employee();

		while (iter.hasNext()) {

			Employee emp = iter.next();
			if (emp.getSalary() > sal) {
				sal = emp.getSalary();
				highsal = emp;
			}

		}
		System.out.println("Employee details who has the highest salary :\n" + highsal);

	}

	private static void sumofSalary() {

		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		double sum = 0.0;

		Iterator<Employee> iter = list.iterator();

		while (iter.hasNext()) {

			double salary = iter.next().getSalary();
			sum += salary;

		}
		System.out.println("sum of salary = " + sum);

	}

	private static void sortEmployee() {
		Collections.sort(list);
		System.out.println("Employee list has been sorted");
		System.out.println(list);

	}

	private static void updateEmployee() {
		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Enter the name of employee to update::");
		String emp_name = sc.next();

		Iterator<Employee> iter = list.iterator();

		boolean flag = false;
		while (iter.hasNext()) {

			Employee emp = iter.next();

			if (emp.getName().equals(emp_name)) {
				System.out.print(emp + "\n ");

				System.out.println("Enter the name of the employee");
				String emp_newName = sc.next();
				System.out.println("Enter the age of the employee");
				int new_age = sc.nextInt();
				System.out.println("Enter the Salary of the employee");
				double new_salary = sc.nextDouble();

				emp.setName(emp_newName);
				emp.setAge(new_age);
				emp.setSalary(new_salary);

				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Employee not found");
		else
			System.out.println("Employee details updated sucessfully");

	}

	private static void searchEmployee() {

		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Enter the name of employee to search ::");
		String emp_name = sc.next();

		Iterator<Employee> iter = list.iterator();

		boolean flag = false;
		while (iter.hasNext()) {

			Employee emp = iter.next();

			if (emp.getName().equals(emp_name)) {
				System.out.print(emp + "\n ");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("Employee not found");

	}

	private static void displayEmployee() {
		System.out.println(list);

	}

	private static void deleteEmployee() {
		if (list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Enter the name of employee to delete ::");
		String emp_name = sc.next();

		Iterator<Employee> iter = list.iterator();

		// System.out.println("\nThe iterator values"
		// + " of list are: ");
		boolean flag = false;
		while (iter.hasNext()) {

			Employee emp = iter.next();

			if (emp.getName().equals(emp_name)) {
				System.out.print(emp + "\n ");
				list.remove(emp);
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Employee deleted sucessfully ");
		else
			System.out.println("Employee not found");

	}

	private static void addEmployee() {
		System.out.println("Add the employee name ::");
		String name = sc.next();
		System.out.println("Add the employee age ::");
		int age = sc.nextInt();
		System.out.println("Add the employee salary ::");
		float salary = sc.nextFloat();

		Employee emp = new Employee(name, salary, age);
		list.add(emp);
		System.out.println("Employee added sucessfully");

	}

}
