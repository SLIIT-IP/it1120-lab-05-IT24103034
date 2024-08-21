import java.util.Scanner;

public class IT24103034Lab5Q1 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter the first integer:");
		int firstInteger=input.nextInt();

		System.out.println("Enter the second integer:");
		int secondInteger=input.nextInt();

		System.out.println("Enter the third integer:");
		int thirdInteger=input.nextInt();
		
		System.out.println("User entered numbers are:"+firstInteger+" "+secondInteger+" "+thirdInteger);
		
		if(firstInteger<secondInteger) {
			int min=firstInteger;
			int max=secondInteger;
		}
		else {
			int min=secondInteger;
			int max=firstInteger;
		}

		 if(secondInteger<thirdInteger) {
			int min=secondInteger;
			int max=thirdInteger;
		}
	
		else {
			int min=thirdInteger;
			int max=secondInteger;
		}
		if(firstInteger<thirdInteger) {
			int min=firstInteger;
			int max=thirdInteger;
		}
		else {
			int min=thirdInteger;
			int max=firstInteger;
		}
			
		System.out.println("The smallest number is:"+min);
		System.out.println("The largest number is:"+max);
	}
}