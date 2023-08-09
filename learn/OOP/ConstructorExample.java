class Student{
	String name;
	int age;
	
	public Student(String n, int a){
		name = n;
		age = a;
	}
	void display(){
		System.out.println("Name : " + name + "  Age: " +age);
	}
}

public class ConstructorExample{
	public static void main(String[] arg){
		Student s1 = new Student("vishal",21);
		s1.display();
	}
}