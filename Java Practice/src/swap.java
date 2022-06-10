
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapp(5,6);

	}
	public static void swapp(int a, int b)
	{
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Value of A=" + a + " Value of B=" + b);
	}

}
