public class MethodOverloading{
	public static void main(String[] args){
		int a =1,b = 2, c =3;
		System.out.println("a+b :" + add(a,b));
		System.out.println("a+b+c :" + add(a,b,c	));
	}
	public static int add(int x, int y){
		return x+y;
	}
	public static int add(int x, int y , int z){
		return x+y+z;
	}
}