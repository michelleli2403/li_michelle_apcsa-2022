//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m=new String[size][size];
    	int i=0;
    	for(int r=0; r<size; r++) {
    		for (int c=0; c<size; c++) {
    			m[r][c]=str.substring(i++,i);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found=false;
    	int len=m.length;
    	for(int r=0; !found&&r<len; r++) {
    		for(int c=0; !found && c<len; c++) {
    			if(word.substring(0,1).equals(m[r][c])) {
    				found = checkRight(word,r,c,len) ||
    						checkLeft(word,r,c,len) ||
    						checkUp(word,r,c,len) ||
    						checkDown(word,r,c,len) ||
    						checkDiagUpRight(word,r,c,len) ||
    						checkDiagUpLeft(word,r,c,len) ||
    						checkDiagDownLeft(word,r,c,len) ||
    						checkDiagDownRight(word,r,c,len);
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c, int len)
   {
		int i=0;
		while(i<w.length()) {
			if(c+i<0 || c+i>=len)
				return false;
			if(!w.substring(i,i+1).equals(m[r][c+i]))
				return false;
			i++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c, int len)
	{
		int i=0;
		/*while(i<w.length()) {
			if(c-i<0 || c-i>=len)
				return false;
			if(!w.substring)
		}*/
		return false;
	}

	public boolean checkUp(String w, int r, int c, int len)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c, int len)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c, int len)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c, int len)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c, int len)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c, int len)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
