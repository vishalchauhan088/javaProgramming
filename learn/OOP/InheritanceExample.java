class Animal {
	void makeSound(){
		System.out.println("Animal is making sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("dog is barking");
	}
}

public class InheritanceExample{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.makeSound();
	}
}