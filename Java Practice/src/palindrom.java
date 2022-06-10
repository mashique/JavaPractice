
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1212;
		
		System.out.println("Reverse Integer of a = " +revNumber(a));
		
		if (a == revNumber(a))
		{
			System.out.println("Palindrom Integer");
		}
		else
		{
			System.out.println("NOT Palindrom Integer");
		}
	}
	
	public static int revNumber(int num)
	{
		int temp=0;
		
		while(num>0)
		{
			temp= temp*10 + num%10;  
			num = num/10;
			
		}
			
		return temp;
		
	}
	

}
