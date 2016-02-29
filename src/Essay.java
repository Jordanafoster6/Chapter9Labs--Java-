import java.util.Scanner;

public class Essay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int totalGrade = 0;
		System.out.print("Please enter the total points earned for grammar. (30 pt max)");
		double grammar = keyboard.nextDouble();
		while(grammar < 0 || grammar > 30)
		{
			System.out.printf("You did not enter a valid amount of points.");
			System.out.print("Please enter the total points earned for grammar. (30 pt max)");
			grammar = keyboard.nextDouble();
		}
		totalGrade += grammar;
		System.out.print("Please enter the total points earned for spelling. (20 pt max)");
		double spelling = keyboard.nextDouble();
		while(spelling < 0 || spelling > 30)
		{
			System.out.printf("You did not enter a valid amount of points.");
			System.out.print("Please enter the total points earned for spelling. (20 pt max)");
			spelling = keyboard.nextDouble();
		}
		totalGrade += spelling;
		System.out.print("Please enter the total points earned for length. (20 pt max)");
		double length = keyboard.nextDouble();
		while(length < 0 || length > 30)
		{
			System.out.printf("You did not enter a valid amount of points.");
			System.out.print("Please enter the total points earned for length. (20 pt max)");
			length = keyboard.nextDouble();
		}
		totalGrade += length;
		System.out.print("Please enter the total points earned for content. (30 pt max)");
		double content = keyboard.nextDouble();
		while(content < 0 || content > 30)
		{
			System.out.printf("You did not enter a valid amount of points.");
			System.out.print("Please enter the total points earned for content. (30 pt max)");
			content = keyboard.nextDouble();
		}
		totalGrade += content;
		
		GradedActivity g1 = new GradedActivity();
		g1.setScore(totalGrade);
		
		System.out.print("---------------------------- \n");
		System.out.printf("Points Earned: %.02f%% \n", g1.getScore());
		System.out.printf("Your grade: %c \n", g1.getGrade());
		System.out.print("---------------------------- \n");
		
		keyboard.close();
	}


}
