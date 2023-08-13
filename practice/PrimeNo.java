import java.util.Scanner;

class Check{


	boolean isPrime(int x)
	{
		boolean prime=true;
		if(x<2){
			return false;	//handling number less than 2 as prime is for number greater than 2.
		}
		int sq = (int)Math.sqrt(x);//by defult returns double.  typecasting it to int

		// if a number has a factor larger than its square root, it must also have a corresponding factor smaller than its square root.
		
		for(int i=2;i<=sq;i++){
			if(x%i==0){
				prime = false;
				break;	
			}
		}
		return prime;
	}



	;
		
		
}

public class PrimeNo{
	public static void main(String[] args){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: " );
		a = sc.nextInt();

		//cheking prime number
		Check ch = new Check();
		boolean prime = ch.isPrime(a);
		if( prime ){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a prime no");
		}
	}
}
			