
public class MyMain {

	public static void main(String[] args) {
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
		System.out.println("Doi tuong Chim");
		b.eat();
		b.makeSound();
		b.sleep();
		System.out.println("Doi tuong Meo");
		c.eat();
		c.makeSound();
		c.sleep();
		System.out.println("Doi tuong cho");
		d.eat();
		d.makeSound();
		d.sleep();
	}

}
