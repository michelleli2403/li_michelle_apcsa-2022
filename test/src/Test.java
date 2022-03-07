public class Test implements WaterBottleInterface{
	public static void main(String[] args) {
		//System.out.println(color);
		
		Test ex = new Test();
		ex.fillUp();
		ex.pourOut();
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("it is filled");
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		System.out.println("it is empty");
	}
}

interface WaterBottleInterface {
	String color = "Blue";
	
	void fillUp();
	void pourOut();
}