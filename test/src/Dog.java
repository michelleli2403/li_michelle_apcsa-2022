
public class Dog {
	public void act() {
		System.out.println("run");
	}
	
	public void eat() {
		act();
		System.out.println("eat");
	}
	
	public void play() {
		talk();
		System.out.println("sping");
	}
	
	public void talk() {
		System.out.println("bark");
	}
}
