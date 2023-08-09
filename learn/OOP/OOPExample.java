 class Person{
	String name;
	int age;
	
	void introduce(){
		System.out.println("Hello, My name is "+name+" and my age is : "+age+".");
	}
}

public class OOPExample{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name = "vishal";
		p1.age = 21;	
		p1.introduce();
		
		Person p2 = new Person();
		p2.name = "Anshu";
		p2.age = 18;
		p2.introduce();
	}
}

