import java.util.Scanner;

class Method{
	public Method(int x, int y){
		System.out.println("Sum is :"+ (x+y));
	}
}

public class Sum{
	public static void main(String[] arg){
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		Method m = new Method(a,b);

		
		
		//System.out.println("sum is:"+ sum);
	}
}