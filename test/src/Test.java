import java.util.ArrayList;

public class Test
{
	public static void main(String[] args) {
		ArrayList<Integer> ray;
		ray=new ArrayList<Integer>();
		ray.add(23);
		ray.add(11);
		ray.set(1, 5);
		ray.add(4);
		ray.set(0, 7);
		ray.add(53);
		ray.set(1, 93);
		ray.add(0,3);
		ray.set(0, 99);
		ray.add(0,33);
		System.out.println(ray);
	}
}