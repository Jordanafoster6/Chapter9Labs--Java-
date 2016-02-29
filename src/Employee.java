
public class Employee {

	private String name;
	private int idNumber;
	private String hireDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	public Employee(String n, int id, String hire)
	{
		name = n;
		idNumber = id;
		hireDate = hire;
	}
	
	
}
