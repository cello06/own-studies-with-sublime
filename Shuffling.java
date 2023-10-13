import java.util.Scanner;
public class Shuffling{
	public static void main(String[] args) {
		int[][] numbers = getList();
		printList(numbers);
		shuflle(numbers);
		printList(numbers);
	}
	public static int[][] getList(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row number :");
		int countOfRow = input.nextInt();
		System.out.print("Enter column number :");
		int countOfColumn = input.nextInt();

		int[][] list = new int[countOfRow][countOfColumn];

		for(int row = 0 ; row < list.length ; row++){
			for(int column = 0 ; column < list[row].length ; column++){
				list[row][column] = column;
			}
		}
		

		return list;
	}
	public static void printList(int[][] list){
		for(int row = 0 ; row < list.length ; row++){
			for(int column = 0 ; column < list[row].length ; column++){
				System.out.print(list[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
	public static void shuflle(int[][] list){
		for(int row = 0 ; row < list.length ; row++){
			for(int column = 0 ; column < list[row].length ; column++){
				//int randomRow = (int)(Math.random()*list.length);
				int randomColumn = (int)(Math.random()*list[row].length);

				//complete shuffling!
				//int temp = list[row][column];
				//list[row][column] = list[randomRow][randomColumn];
				//list[randomRow][randomColumn] = temp;

				//column shuffling!
				int temp = list[row][column];
				list[row][column] = list[row][randomColumn];
				list[row][randomColumn] = temp;
			}
		}
	}
}