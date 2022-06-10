
public class revString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Hello this is the VISA interview";
		//Output: "interview ASIV eth si siht Hello"
		
		String[] a= str.split(" ");
		String first = a[a.length-1];
		String last = a[0];
		
		String[] b= str.split(first);
		String ss= b[0];
		String[] c= ss.split(last);
		
		System.out.println(first + revStr(c[1]) + last);
		
		
		
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
