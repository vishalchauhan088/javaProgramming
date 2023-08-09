public class DynamicArray{
	public static void main(String[] arg){
		int[] numbers = new int[5];
		int n = 0;
		for(int number: numbers){
			numbers[number] = n;
			n++;
		}
	
		for(int number: numbers){
			System.out.println(numbers[number]);
		}
	}
}
		

		