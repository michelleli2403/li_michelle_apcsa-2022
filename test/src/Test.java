import static java.lang.System.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class Test
{
	public static void main(String[] args) {
	
		int cnt=0;
		for(int run=1; run<=20; run++)
		{
		     if(run%3==0)
		        continue;
		     cnt++;
		}
		System.out.println(cnt);


	}
}