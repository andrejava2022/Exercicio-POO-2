package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Salary {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println(employee);
		System.out.println();
		
		System.out.print("Which percentage to increasy salary? ");
		double percentage = sc.nextDouble();
		System.out.println();
		
		employee.increaseSalary(percentage);
	}

}
