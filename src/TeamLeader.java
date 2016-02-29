
public class TeamLeader extends ProductionWorker {

	private double monthlyBonus;
	private int trainingHours;
	private int hoursAttended;
	
	public TeamLeader(String n, int id, String hire, int s, double hour, int tHours, int aHours, double month) {
		super(n, id, hire, s, hour);
		monthlyBonus = month;
		trainingHours = tHours;
		hoursAttended = aHours;
	
	}

	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	public int getTrainingHours() {
		return trainingHours;
	}
	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}
	public int getHoursAttended() {
		return hoursAttended;
	}
	public void setHoursAttended(int hoursAttended) {
		this.hoursAttended = hoursAttended;
	}
}
