import java.util.Scanner;

public class IT24103034Lab5Q2 {

	public static void main(String[] args) {

		int newMembers;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the number of new members introduced:");
		 newMembers=input.nextInt();

		
		switch(newMembers) {

			case 0: System.out.print("No Prize");
				break;

			case 3:System.out.print("Bag");
				break;

			case 10: System.out.print("Headphone");
				break;

			default: System.out.print("Input must be a number 0 or greater");
		}
	}
}