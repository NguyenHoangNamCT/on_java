
public class Bird extends Animal{

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("\tChim an con trung`");
	}

	@Override
	public void makeSound() {
		System.out.println("\tChim keu: Chip' chip'");
	}
	
	
	
}
