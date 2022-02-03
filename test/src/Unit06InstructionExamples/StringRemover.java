package Unit06InstructionExamples;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
    public StringRemover() {
    	setRemover("","");
    }
    
    public StringRemover(String s, String rem) {
    	setRemover(s, rem);
    }
	

	public void setRemover(String s, String rem)
	{
		sentence=s;
		remove=rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		while (cleaned.indexOf(remove)!=-1) {
			int index = cleaned.indexOf(remove);
			int length = remove.length();
			cleaned = cleaned.substring(0,index-1)+cleaned.substring(index+length);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence+" - "+"String to remove "+remove+"\n"+removeStrings()+"\n";
	}
}