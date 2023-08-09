class Animal{
	void makeNoise(){
		System.out.println("Animal is making noise");
	}
}
class Dog extends Animal{
	@Override
	void makeNoise(){
		System.out.println("Dog is barking");
	}
}

public class PolymorphismExample{
	public static void main(String[] args){
		Animal dog = new Animal();
		dog = new Dog();
		dog.makeNoise();
	}
}