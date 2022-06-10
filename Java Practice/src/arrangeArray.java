
public class arrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {0,3,1,2,1,0,1,6};
		
		for(int i = 0; i<a.length; i++)
		{
			
			for (int j= i+1 ; j<a.length; j++)
			{
				
				if (a[i]>a[j])
				{
					int c= a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		
		for(int p :a)
		{
			System.out.print(p);
		}
			

	}

}
