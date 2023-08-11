class A{
	public A(){
		System.out.println("Hello");
	}
	public A(String name){
		System.out.println("Hello " + name);
	}
}

public class ConstructorOverloading{
	public static void main(String[] arg){
		A obj = new A();
		A ob2 = new A("vishal");
	}
}