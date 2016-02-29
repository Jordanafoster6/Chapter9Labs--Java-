import java.util.Scanner;

public class ShiftSupervisorDemo {

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
		
		System.out.print("Please enter your salary pay");
		double salary = keyboard.nextDouble();
		
		System.out.print("Did your chift meet production goals? \n");
		System.out.print("Enter (1) for YES \n");
		System.out.print("Enter (2) for NO \n");
		int bonusYN = keyboard.nextInt();
		while(bonusYN < 1 || bonusYN > 2)
		{
			System.out.printf("You did not enter a valid integer to identify your bonus... \n");
			System.out.print("Enter (1) for YES \n");
			System.out.print("Enter (2) for NO \n");
			bonusYN = keyboard.nextInt();
		}
		double bonus = 0;
		if(bonusYN == 1)
		{
			System.out.print("What was the bonus earned this year?");
			bonus = keyboard.nextDouble();
		}
		
		ShiftSupervisor SS1 = new ShiftSupervisor(name, id, hire, salary, bonus);

		
		keyboard.nextLine();
		
		System.out.print("---------------------------- \n");
		System.out.printf("Employee: %s \n", SS1.getName());
		System.out.printf("ID Number: %d \n", SS1.getIdNumber());
		System.out.printf("Hire Date: %s \n", SS1.getHireDate());
		System.out.printf("Salary: $%.02f \n", SS1.getSalary());
		System.out.printf("Bonus: $%.02f \n", SS1.getBonus());
		System.out.print("---------------------------- \n");
		
		keyboard.close();

	}

}
