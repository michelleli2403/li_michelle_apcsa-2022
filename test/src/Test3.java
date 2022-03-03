import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Integer> ray = new ArrayList<>();
		ray.add(23);
		ray.add(11);
		ray.set(1, 5);
		ray.add(4);
		ray.set(0, 7);
		ray.add(53);
		System.out.println(ray.set(1, 93));
		System.out.println(ray.set(1, 93));
		System.out.println(ray.set(1, 90));
		System.out.println(ray.set(1, 93));


			
	}
}
