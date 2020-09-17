public class Sorted
{
	public static boolean isAscending(int a[]) //method to check whether ascending array of not
	{
		boolean n=true;
		for(int i=0;i<a.length-1;i++) //no.of passes
		{
			for(int j=0;j<a.length-i-1;j++) //adjacent element comparisons
				if(a[j]>a[j+1]) //if 0th element > 1st element immediately exit loop by false
				{
					n=false;
					break;
				}
		}
		return n;
	}
	
	public static boolean isDescending(int a[]) //method to check whether descending array of not
	{
		boolean n=true;
		for(int i=0;i<a.length-1;i++) //no.of passes
		{
			for(int j=0;j<a.length-i-1;j++) //adjacent element comparisons
				if(a[j]<a[j+1]) //if 0th element > 1st element immediately exit loop by false
				{
					n=false;
					break;
				}
		}
		return n;
	}
	
	public static void main(String[] args)
	{
		
		int l=args.length;
		
		int[] A=new int[l];//creating dynamic array
		for(int i=0;i<l;i++) 
		{//repeat arguments times
			A[i]=Integer.parseInt(args[i]); //getting each converted integer to array
		}
		if(isAscending(A))
		{ //if it ascending array is passed
			System.out.println("Ascending");
		}
		else if(isDescending(A))
		{ //if it descending array is passed
			
			System.out.println("Descending");
		}
		else
		{
			System.out.println("Unsorted");
	}
}
		
}		
		
