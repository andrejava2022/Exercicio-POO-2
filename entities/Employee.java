package entities;

public class Employee {
	
	public String name;
	public double grossSalary,tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		System.out.println("Update data: "+name+", $ "+
	    String.format("%.2f", +(grossSalary-tax+(grossSalary*percentage)/100)));
	}
	
	public String toString() {
		return "Employee: "+name+", $ "+String.format("%.2f", netSalary());
	}
}
