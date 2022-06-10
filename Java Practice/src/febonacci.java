
public class febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int n1=0;
		int n2=1;
		int n3;
		int i=0;
		System.out.print(n1 +" "+ n2);
		
		while(i< n)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
			i++;
		}

		
		
	}
	
	

}
