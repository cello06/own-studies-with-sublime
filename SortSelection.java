public class SortSelection{
	public static void main(String[] args) {
		int[] numbers = getNumbers();
		sort(numbers);
		print(numbers);
	}
	public static int[] getNumbers(){
		int[] numbers = new int[100];
		for(int i = 0 ; i < numbers.length ; i++){
			numbers[i] = (int)(Math.random()*99+1);
		}
		return numbers;
	}
	public static void sort(int[] numbers){
		for(int i = 0 ; i < numbers.length-1 ; i++){
			int currentMin = numbers[i];
			int currentMinIndex = i;

			for(int j = i+1 ;j < numbers.length ; j++){
				if(currentMin > numbers[j]){
					currentMin = numbers[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex != i){
				numbers[currentMinIndex] = numbers[i];
				numbers[i] = currentMin; 
			}
		}
	}
	public static void print(int[] numbers){
		for(int i = 0 ; i < numbers.length ; i++){
			if((i+1) % 10 == 0){
				System.out.printf("%3d\n",numbers[i]);
			}else{
				System.out.printf("%3d",numbers[i]);
			}
		}
	}
}
	
