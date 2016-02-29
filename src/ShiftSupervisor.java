
public class ShiftSupervisor extends Employee {

	private double salary;
	private double bonus;

	public ShiftSupervisor(String n, int id, String hire, double s, double b) {
		super(n, id, hire);
		salary = s;
		bonus = b;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		
		return bonus;
	}

	
	
}
