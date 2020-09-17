
public class PrefixSum {

    public static int[] prefixSum(int[]a)
    {
    	int[] s= new int[a.length];
    	for(int i=0;i<s.length;i++){
    		for(int j=0;j<=i;j++){
    			s[i]+=a[j];
    		}
    	}
        return s;
       
    }

    public static int[][] prefixSum(int[][] a) {
        int[][] s = new int[a.length][a[0].length];
        for(int i=0;i<s.length;i++){
        	for(int j=0;j<s[i].length;j++){
        		for(int k=0;k<=i;k++){
        			for(int l=0;l<=j;l++){
        				s[i][j]+=a[k][l];
        			}
        		}
        	}
        }
       return s;
    }

    public static void main(String[] args) {
        int[] N=new int[args.length];
        int [][] M=new int[args.length][args.length];
        System.out.print(prefixSum(N));
        System.out.print(prefixSum(M));
        System.out.println();

    }

}	

