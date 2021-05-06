package entities2;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double tax;
	public double Increase;

	public double NetSalary() {
		return GrossSalary - tax;
	}

	public double IncreasedSalary() {
		return GrossSalary * (1 + Increase / 100) - tax;
	}

	public String toString() {
		return "Employee: " + Name + ", $ " + NetSalary();
	}

	public String NewSalary() {
		return "Employee: " + Name + ", $ " + String.format("%.2f", IncreasedSalary());

	}
}
