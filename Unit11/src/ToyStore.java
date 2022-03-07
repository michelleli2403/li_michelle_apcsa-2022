//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Collections;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for(String name : toys.split(" ")) {
			Toy t = getThatToy(name);
			if(t==null) {
				toyList.add(new Toy(name));
			}
			else {
				t.setCount(t.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		/*for (Toy t : toyList) {
  			if (t.getName().equals(nm))
  				return t;
  		}
  		return null;*/
  		for (int i=0; i<toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String name = "";
  		int max = Integer.MIN_VALUE;
  		for (Toy t : toyList) {
  			if(max < t.getCount()) {
  				max=t.getCount();
  				name=t.getName();
  			}
  		}
  		return name;
  	}  
  	  
  	public void sortToysByCount()
  	{
  		/*List<Toy> sortToy = new ArrayList<>();
  		for (Toy t : toyList) {
  			int min = Integer.MAX_VALUE;
  			if (t.getCount() <= min) {
  				min=t.getCount();
  				sortToy.add(t);
  			}
  		}
  		for (int i=0; i<toyList.size(); i++) {
  			
  		}*/
  	}
  
  	  
	public String toString()
	{
	   return ""+toyList;
	}
}