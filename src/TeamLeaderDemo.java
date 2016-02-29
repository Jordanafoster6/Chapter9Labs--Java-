import java.util.Scanner;

public class TeamLeaderDemo {

public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.printf("Hello, Please enter the information below! \n");
		
		System.out.print("Please enter your name");
		String name = keyboard.nextLine();
		
		System.out.print("Please enter your employee identification number");
		int id = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Please enter your hire date \n");
		String hire = keyboard.nextLine();
		
		System.out.print("Please enter your hourly pay");
		double hourPay = keyboard.nextDouble();
		
		System.out.print("Please enter the shift you are working..");
		System.out.print("Enter (1) for the Day Shift.. ");
		System.out.print("Enter (2) for the Night Shift.. ");
		int shift = keyboard.nextInt();
		while(shift < 1 || shift > 2)
		{
			System.out.printf("You did not enter a valid inetger to identify your shift...");
			System.out.print("Enter (1) for the Day Shift.. ");
			System.out.print("Enter (2) for the Night Shift.. ");
			shift = keyboard.nextInt();
		}
		
		System.out.print("How many training hours are required?");
		int requiredNum = keyboard.nextInt();
		
		System.out.print("How many training hours did you complete?");
		int completedNum = keyboard.nextInt();
		
		System.out.print("What's your fixed monthly bonus?");
		double bonus = keyboard.nextDouble();
		
		TeamLeader SS1 = new TeamLeader(name, id, hire, shift, hourPay, requiredNum, completedNum, bonus);

		
		keyboard.nextLine();
		
		System.out.print("---------------------------- \n");
		System.out.printf("Employee: %s \n", SS1.getName());
		System.out.printf("ID Number: %d \n", SS1.getIdNumber());
		System.out.printf("Hire Date: %s \n", SS1.getHireDate());
		System.out.printf("Hourly Pay Rate: $%.02f \n", SS1.getHourlyPay());
		System.out.printf("Bonus: $%.02f \n", SS1.getMonthlyBonus());
		if(SS1.getShift() == 1)
		{
			System.out.printf("Shift: Day Shift \n");
		}
		else
			System.out.printf("Shift: Night Shift \n");
		System.out.printf("Required Training Hours: %d \n", SS1.getTrainingHours());
		System.out.printf("Attended Training Hours: %d \n", SS1.getHoursAttended());
		System.out.print("---------------------------- \n");
		
		keyboard.close();

	}
}
