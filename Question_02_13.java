import java.util.Scanner;
public class Question_02_13{
	public static void main(String[] args){
		final double MONTHLY_INTEREST_RATE=0.00417;
		double monthValue=0.0;

		Scanner input= new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");

		double savingAmounth=input.nextDouble();

		 
		System.out.print("Enter how many month :");

		int month=input.nextInt();
		

			for(int i=1;i<=month;i++){

		 monthValue = (savingAmounth+monthValue)*
			 (1+ MONTHLY_INTEREST_RATE);

			}


		 System.out.println("After "+month+". month, the account value"+
				 " is "+monthValue);

	}

}
