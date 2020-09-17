public class PrimeCounter {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

        // initially assume all integers are prime
        boolean isPrime = true;
        int count=0;
        for (int i = 1; i <= N; i++) {
            count=0;
            for(int j=1;j<=i;j++){
            	if(N%j==0){
            		isPrime=false;
            	}
            	else
            		isPrime=true;
            		count++;
            		
            	}
            System.out.println(count);
            
        }
}
}