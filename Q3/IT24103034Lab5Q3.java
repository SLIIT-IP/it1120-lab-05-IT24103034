import java.util.Scanner;

public class IT24103034Lab5Q3 {

	public static void main(String[] args) {

		double chargePerDay,totalAmount,discountRate;
		int dayReserved,startDate,endDate;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter start date(1-31):");
		 startDate=input.nextInt();

		System.out.println("Enter end date(1-31):");
		 endDate=input.nextInt();

		chargePerDay=48000.00;

		dayReserved=endDate-startDate;

		if(dayReserved<3)
		{
			discountRate=0;
		}

		else if(dayReserved<=4)
		{
			discountRate=10;
		}

		else
		{
			discountRate=20;
		}

		totalAmount=dayReserved*chargePerDay*90/100;

		System.out.println("Room charge per day:Rs."+chargePerDay);
		System.out.println("Number of days reserved:"+dayReserved);
		
		System.out.println("Total amount to be paid:Rs."+totalAmount);

		if(startDate>endDate)
		{
			System.out.println("Error:Start date must be less than End date");
		}

		if(startDate<1||startDate>31||endDate<1||endDate>31)
		{
			System.out.println("Error:Days must be between 1 and 31");
		}
	}
}