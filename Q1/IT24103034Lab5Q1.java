import java.util.Scanner;

public class IT24103034Lab5Q1 {

	public static void main(String[] args) {
	
		int firstInteger,secondInteger,thirdInteger,smallest,largest;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter the first integer:");
		 firstInteger=input.nextInt();

		System.out.println("Enter the second integer:");
		 secondInteger=input.nextInt();

		System.out.println("Enter the third integer:");
		 thirdInteger=input.nextInt();

		System.out.println("User enterednnumbers are:"+firstInteger+" "+secondInteger+" "+thirdInteger+" ");

		if(firstInteger>secondInteger)
		{
			 largest=firstInteger;
			 smallest=secondInteger;
		}

		else
		{
			 largest=secondInteger;
			 smallest=firstInteger;
		}

		if(thirdInteger>largest)
		{
			  largest=thirdInteger;
		}

		if(thirdInteger<smallest)
		{
			 smallest=thirdInteger;
		}

		System.out.println("The smallest number is:"+smallest);
		System.out.println("The largest number is:"+largest);
	}
}
