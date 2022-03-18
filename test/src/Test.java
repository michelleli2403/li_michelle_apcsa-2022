public class Test {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		int[] a2 = new int[4];
		for (int i=0; i<a1.length; i++) {
			a1[i]=i;
		}
		for (int j=0; j<a2.length; j++) {
			a2[j]=j+3;
		}
		System.out.println(a1.length);
		a1=a2;
		
		System.out.println(a1.length);
		for (int k=0; k<a1.length; k++) {
			System.out.println(a1[k]+" ffff");
		}
	}
}