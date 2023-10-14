import java.util.Scanner;

public class Sudoku{
	public static void main(String[] args) {
		int[][] grid = getSolution();
		System.out.println(isValid(grid) ? "Valid Solution":"Invalid Solution");
	}
	public static int[][] getSolution(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sudoku puzzle solution : ");
		int[][] grid = new int[9][9];

		for(int row = 0 ; row < grid.length;row++){
			for(int column = 0 ; column < grid[row].length;column++){
				grid[row][column] = input.nextInt();
			}
		}
		return grid;
	}
	public static boolean isValid(int[][] grid){
		for(int row = 0 ; row < grid.length;row++){
			for(int column = 0 ; column < grid[row].length;column++){
				if(grid[row][column] < 1 || grid[row][column] > 9 || !isValid(row,column,grid)){
					return false;
				}
			}
		}
		return true;
	}
	public static boolean isValid(int i,int j,int[][] grid){
		for(int column = 0 ; column < grid.length ; column++){
			if(column != j && grid[i][column] == grid[i][j]){
				return false;
			}
		}
		for(int row = 0 ; row < grid.length ; row++){
			if(row != i && grid[row][j] == grid[i][j]){
				return false;
			}
		}
		for (int row = (i/3)*3 ; row < (i/3)*3+3 ; row++) {
			for(int column = (j/3)*3; column < (j/3)*3+3; column++){
				if(row != i && column != j && grid[row][column] == grid[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}