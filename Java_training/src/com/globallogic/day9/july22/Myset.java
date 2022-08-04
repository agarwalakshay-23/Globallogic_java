/*Create A set with all the 
implanatation with user defined class employee 
and perform the insert delete and searching and sorting
*/

package com.globallogic.day9.july22;

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

public class Myset {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();

		// Inserting the Employee
		set.add(new Employee("ram", 20000.0, 20));
		set.add(new Employee("jhon", 40000.0, 50));
		set.add(new Employee("shyam", 10000.0, 30));
		set.add(new Employee("win", 30000.0, 40));

		System.out.println(set);

		// Searching the Employee

		Iterator<Employee> iter = set.iterator();

		while (iter.hasNext()) {

			Employee emp = iter.next();

			if (emp.getName().equals("ram")) {
				System.out.print("Searched for  : " + emp + "\n ");

				break;
			}
		}

		// Remove the Employee
		iter = set.iterator();

		while (iter.hasNext()) {

			Employee emp = iter.next();

			if (emp.getName().equals("ram")) {
				System.out.print("Removed Employee : " + emp + "\n ");
				set.remove(emp);
				break;
			}
		}
		System.out.println("Current list of employee : \n" + set);

		// Sorting the employee

		List<Employee> ls = new ArrayList<Employee>(set);
		Collections.sort(ls);
		System.out.println(ls);
	}
}

