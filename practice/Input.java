import java.util.Scanner;
public class Input{
	public static void main(String[] arg){
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Sum is:" + (a+b));
	}
}