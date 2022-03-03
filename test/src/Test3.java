
public class Test3 {
	public static void main(String[] args) {
		//test code in the main in another class
			TestRunner test = new TestRunner();  					//1
			Test one = new Test("comp");				//2
			Test two = new Test("sci");				//3
			System.out.println(one + " " + two);	//4
			test.mystery(one,two);	
			System.out.println(one + " " + two);//5  System.out.println(one + " " + two);	//6
	}
}
