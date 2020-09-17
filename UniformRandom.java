//import java.util.Random;
public class UniformRandom
{
	
	public static void main(String args[])
	{
		int N=Integer.parseInt(args[0]);
		
		double max=0.0;
		double min=1.0;
		double sum=0.0;
		//double[] series=new double[N];
		//Random random=new Random();
		//for(int i=0;i<N;i++){
			//series[i]=random.nextInt();
		//}
		for(int j=1;j<=N;j++){
			double x = Math.random();
			//System.out.println("The random numbers are: "+x);
			sum += x;
			max=Math.max(max, x);
			min=Math.min(min, x);
		}
		
		double avg = sum /N;
		
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
	}
	
			
}
					
				
