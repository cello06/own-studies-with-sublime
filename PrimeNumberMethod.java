import java.util.*;

public class PrimeNumberMethod{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter prime number counts -> ");
		int primeNumberCount = input.nextInt();
		System.out.print("Enter how many prime number that you want to see per line -> ");
		int primeNumbersPerLine = input.nextInt();

		printPrimeNumber(primeNumberCount,primeNumbersPerLine);

	}
	public static void printPrimeNumber(int primeNumberCount,int primeNumbersPerLine){
		int count = 0;
		int number = 2;
		while(count < primeNumberCount){
			if(isPrime(number)){
				if((count+1) % primeNumbersPerLine == 0){
					System.out.printf("%-7d\n",number);
				}else{
					System.out.printf("%-7d",number);
				}
				count++;
			}
			number++;
		}
	}
	public static boolean isPrime(int number){
		for(int i = 2; i<=number/2 ; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
}