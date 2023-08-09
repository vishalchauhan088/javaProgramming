class Circle{
	int radius;
	
	public Circle(){
		radius = 1;
	}

	public Circle(int r){
		radius = r;
	}
	
	double area(){
		return(3.14 * radius * radius);
	}

}

public class ConstructorOverloading{
	public static void main(String[] args){
		Circle c1 = new Circle(5);
		System.out.println("Area is :" + c1.area());
	}
}
		