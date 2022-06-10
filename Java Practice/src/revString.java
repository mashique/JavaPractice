
public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "This is my First Program";
		
		System.out.println(revStr(str));
	}
	
	public static String revStr(String st)
	{
		String newStr= "";
		for(int i = st.length()-1; i>=0 ; i-- )
		{
			newStr= newStr+ st.charAt(i);
		}
		return newStr;
	}

}
