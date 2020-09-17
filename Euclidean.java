
public class Euclidean {

	public static void main(String[] args) {
		float sum=0;
		double Euclidean;
		for(int i=0;i<args.length;i++){
			double N=Double.parseDouble(args[i]);
			sum+=Math.pow(N,2);
		}
		Euclidean=Math.sqrt(sum);
		System.out.println(Euclidean);
		
	}
	}

