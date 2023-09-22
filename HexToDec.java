import java.util.*;

public class HexToDec{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a heximal number : ");
		String heximalNumber = input.nextLine().toUpperCase();
		

		int decimalVersion = hexToDec(heximalNumber);
		
		System.out.print("Decimal version of "+heximalNumber+
			" is "+decimalVersion);	
	}
	public static int hexToDec(String heximalNumber){
		int decimalVersion = 0 ;
		int count = 0 ;
		
		for(int i = heximalNumber.length()-1 ; i >= 0 ; i--){
			if(Character.isLetter(heximalNumber.charAt(i))){
				
				decimalVersion += valueOfLetterPart(heximalNumber.charAt(i)) * Math.pow(16,count);
				count++;
			
			}else if (Character.isDigit(heximalNumber.charAt(i))) {
				
				decimalVersion += (heximalNumber.charAt(i) - '0') * Math.pow(16,count);
				count++;
			
			}else{
				System.out.print("You enter a wrong heximal number !!!");
				System.exit(1);
			}
		}
		return decimalVersion;
	}
	public static int valueOfLetterPart(char hexLetter){
		int valueOfLetter = 0;
		
		switch (hexLetter) {
			case 'A' : valueOfLetter = 10;break;
			case 'B' : valueOfLetter = 11;break;
			case 'C' : valueOfLetter = 12;break;
			case 'D' : valueOfLetter = 13;break;
			case 'E' : valueOfLetter = 14;break;
			case 'F' : valueOfLetter = 15;break;
			default:System.out.print("Wrong letter !!");
			System.exit(2);

		}
		return valueOfLetter;
	}

}