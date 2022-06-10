import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class duplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "First Test Java Program";
		
		duplicate(str);
	}
	
	public static void duplicate(String str)
	{
		String s="";
		HashMap<Character ,Integer > al = new HashMap<Character ,Integer >();
		
		for (int i= 0 ; i <str.length() ; i ++)
		{
			
			if(al.containsKey(str.charAt(i)))
			{
				al.put(str.charAt(i), al.get(str.charAt(i)) +1 );
			}
			else
			{
				al.put(str.charAt(i), 1);
			}
			
		}
		
		
		for (Map.Entry<Character ,Integer> ent : al.entrySet())
		{
			//if(ent.getValue()>1)
			{System.out.print(ent + " ");}
		}
		
		
	}

}
