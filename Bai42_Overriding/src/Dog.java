
public class Dog extends Animal{

	public Dog() {
		super("Dog");
	}

	@Override
	public void eat() {
		System.out.println("\tCho an xuong");
	}

	@Override
	public void makeSound() {
		System.out.println("\tCho sua: Gau gau");
	}
	
	
}
