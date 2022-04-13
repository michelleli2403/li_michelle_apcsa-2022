
public class Underdog extends Dog{
	public void act() {
		super.act();
		System.out.println("jump");
	}
	
	public void eat() {
		act();
		super.eat();
		System.out.println("chew");
	}
	
	public void talk() {
		System.out.println("po");
	}
	
	public static void main (String[] args) {
		System.out.println("Dog fido = new Underdog()");
		Dog fido = new Dog();
		fido.eat();
		fido.play();
	}
}
