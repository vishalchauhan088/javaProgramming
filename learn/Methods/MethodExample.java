public class MethodExample{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		int sum = addNumbers(a,b);
		System.out.print(sum);
	}
	
	public static int addNumbers(int x, int y){
		return ( x+y);
	}
}