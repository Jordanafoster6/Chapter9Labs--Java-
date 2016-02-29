import java.util.Scanner;

public class ProductionWorkerDemo {

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
		
		ProductionWorker emp1 = new ProductionWorker(name, id, hire, shift, hourPay);

		
		keyboard.nextLine();
		
		System.out.print("---------------------------- \n");
		System.out.printf("Employee: %s \n", emp1.getName());
		System.out.printf("ID Number: %d \n", emp1.getIdNumber());
		System.out.printf("Hire Date: %s \n", emp1.getHireDate());
		
		if(emp1.getShift() == 1)
		{
			System.out.printf("Shift: Day Shift \n");
		}
		else
			System.out.printf("Shift: Night Shift \n");
		
		System.out.printf("Hourly Pay Rate: $%.02f \n", emp1.getHourlyPay());
		System.out.print("---------------------------- \n");
		
		keyboard.close();
	}

}
