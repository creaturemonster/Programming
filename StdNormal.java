
public class StdNormal {
	public static void main(String[] args) {
		double u=Math.random();
		double v=Math.random();
		
		if(u>=0 && u<1 && v>=0 && v<1)
		{
			double w=Math.sin(2*Math.PI*v)*Math.sqrt((-2*Math.log(u)));
			System.out.println(w);
		}
		
		
		
		
		
		
	}
}
