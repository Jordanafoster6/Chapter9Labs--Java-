
public class ProductionWorker extends Employee{
	
	private int shift;
	private double hourlyPay;

	public ProductionWorker(String n, int id, String hire, int s, double hour) {
		super(n, id, hire);
		shift = s;
		hourlyPay = hour;
		
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	
}
