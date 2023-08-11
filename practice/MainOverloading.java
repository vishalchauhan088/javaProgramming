public class MainOverloading{

	public static int main(){	
		System.out.println("Hello");
		return 0;
	}

	public static void main(String... ab){
		MainOverloading obj = new MainOverloading();
		obj.main();
		System.out.println("in overloaded main function");
		
	}
}