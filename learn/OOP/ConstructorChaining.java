class Rectangle{	
	int length;
	int height;
	public Rectangle(){
		this(4,4);
	}
	public Rectangle(int l, int h){
		length = l;
		height = h;
	}
	int area(){
		return length * height;
	}
}

public class ConstructorChaining{
	public static void main(String[] args){
		Rectangle rec1 = new Rectangle();
		System.out.println("Area of rectangle is: " + rec1.area());
	}
}
	