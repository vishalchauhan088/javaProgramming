public class VariableArgument{
	public static void main(String[] args){
		System.out.println("Add to numbers: " + add(1,2));
		System.out.println("Add 5 numbers: " + add(1,2,3,4,5));
	}
	public static int add(int... numbers){
		int sum = 0;
		for(int number: numbers){
			sum+= number;
		}
		return sum;
	}
}