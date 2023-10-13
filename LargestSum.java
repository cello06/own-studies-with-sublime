import java.util.Scanner;
public class LargestSum{
	public static void main(String[] args) {
		int[][] numbers= getList();
		printList(numbers);
		printMaxColumn(numbers);
		printMaxRow(numbers);
		printListShowingSums(numbers);
	}
	public static int[][] getList(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row number : ");
		int countOfRow = input.nextInt();
		System.out.print("Enter column number : ");
		int countOfColumn = input.nextInt();

		int[][] list = new int[countOfRow][countOfColumn];

		for(int row = 0 ; row < list.length ; row++){
			for(int column  = 0; column < list[row].length;column++){
				list[row][column] = (int)(Math.random()*90+10);
			}
		}
		return list;
	}
	public static void printList(int[][] list) {
		for(int row = 0 ; row < list.length ; row++){
			for(int column  = 0; column < list[row].length;column++){
				System.out.print(list[row][column]+" ");
			}
			System.out.println();
		}
	}
	public static void printMaxRow(int[][] list){
		int maxRow = 0;
		int maxRowIndex = 0;
		for(int column = 0 ; column < list[0].length ; column++){
			maxRow += list[0][column];
		}

		for(int row = 1 ; row < list.length ; row++){
			int totalOfThisRow = 0;
			for(int column  = 0 ; column < list[row].length ; column++){
				totalOfThisRow += list[row][column];
			}
			if(totalOfThisRow > maxRow){
				maxRow = totalOfThisRow;
				maxRowIndex = row;
			}
		}

		System.out.println("The Maximum Row : "+maxRow+" and line of it is : "+(maxRowIndex+1));
	}
	public static void printMaxColumn(int[][] list){
		int maxColumn = 0;
		int maxColumnIndex = 0;

		for(int row = 0 ; row < list.length ; row++){
			maxColumn += list[row][0];
		}

		for(int column = 1 ; column < list[0].length ; column++){
			int totalofThisColumn = 0;
			for(int row = 0 ; row < list.length; row++){
				totalofThisColumn += list[row][column];
			}
			if(totalofThisColumn > maxColumn){
				maxColumn = totalofThisColumn;
				maxColumnIndex = column;
			}
		}
		System.out.println("The Maximum Column : "+maxColumn+" and column of it is : "+(maxColumnIndex+1));
	}
	public static void printListShowingSums(int[][] list){
		int[] maxColumnList = new int[list[0].length];
		for(int column = 0 ; column < list[0].length;column++){
			int totalofThisColumn = 0 ;
			for(int row = 0 ; row < list.length ; row++){
				totalofThisColumn += list[row][column];
			}
			maxColumnList[column] = totalofThisColumn;
		}
		System.out.print("Sum of columns :");
		for(int column = 0 ; column < maxColumnList.length;column++){
			System.out.printf(" %d)%-3d",(column+1),maxColumnList[column]);
		}
		System.out.println();
		System.out.println("                -----------------------------------");


		for(int row = 0 ; row < list.length ; row++){
			int totalOfThisRow = 0 ;
			System.out.printf("%16s"," ");
			for (int column = 0 ; column < list[row].length;column++){
				totalOfThisRow += list[row][column];
				System.out.printf("%-6d",list[row][column]);
			}
			System.out.print("  Sum of "+(row+1)+". row is "+totalOfThisRow);
			System.out.println();
		}
	}
}