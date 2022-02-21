import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//digit divisor: digit of a number which divides evenly into the number

public class Numbers {
  public static boolean isGoofy(int num) {
    int sum=0;
    int number=num;

    if (num<100) return false;    //check if at least 3 digits 
    int count3LSdigits=0;

    while(num>0 && count3LSdigits<3) {    //loop terminator after checking 3 least sig digits
      int dig=num%10;    //extract digit
      if (dig!=0 && number % dig == 0) {    //mod to see if divisor
        sum=sum+dig;    //sum the digits
      }

      num=num/10;    //strip off the least sig digit
      count3LSdigits++;
    }
    if (sum!=0 && sum%2 != 0) return true;    //return true or false based on sum even or odd
    else return false;
  }

  public static int[] getSomeGoofyNumbers(int count) {
  //public static List<Integer> getSomeGoofyNumbers(int count) {
    int[] ray = new int[count];    //setup array to store count number of goofy numbers
	//List<Integer> ray = new ArrayList<>();
    for(int i=0, x=100; i<count; x++) {    //loop
      if (isGoofy(x)) {    //call to isGoofy
        ray[i]=x;    //add to the array
    	//ray.add(x);
        i++; 
      }
    }
    return ray;    //return array
  }

  public static void main(String args[]) {
    Numbers test = new Numbers();
    System.out.println(test.isGoofy(1));
    System.out.println(test.isGoofy(153));
    
    System.out.println(Arrays.toString(getSomeGoofyNumbers(20)));
  }
}
