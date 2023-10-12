public class MaxRow  {
	public static void main(String[] args) {
		int[][] numbers = new int[10][10];
		for(int row = 0 ; row < numbers.length ; row++){
			for(int column = 0 ; column < numbers[row].length ; column++){
				numbers[row][column] = (int)(Math.random()*10);
			}
		}
		print(numbers);

		int maxRow = 0 ;
		for(int column = 0; column < numbers[0].length;column++){
			maxRow += numbers[0][column];
		}
		int indexOfMaxRow = 0;

		for(int row = 1 ; row < numbers.length ; row++){
			int totalOfThisRow = 0 ;
			for (int column = 0;column < numbers[row].length ;column++) {
				totalOfThisRow += numbers[row][column];
			}
			if(totalOfThisRow > maxRow){
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		System.out.print("Max row :"+maxRow+"\nAnd index of it : "+indexOfMaxRow);
	}
	public static void print(int[][] numbers){
		for (int row = 0 ;row < numbers.length ;row++ ) {
			for (int column = 0 ; column < numbers[row].length ;column++ ) {
				System.out.print(numbers[row][column]+" ");
			}
			System.out.println();
		}
	}
}