

public class LongestPlateau {
    public static void main(String[] args) {
        int N = args.length;
        int[] a = new int[N];
        int startIndex = 0, length = 0;
        int tempStart = 0, tempLength = 0;	
        for (int i = 0;  i < N;  i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        for (int i = 1 ; i < N ; i++) {
        	if(a[i] > a[i-1] || (a[i] == a[i-1] && i == 1)) {
        		tempStart =  (a[i] == a[i-1]) ? 0 : i;
        		tempLength = (a[i] == a[i-1]) ? 2 : 1;
        		if(i == N - 1) {
        			startIndex = tempStart;
        			length = tempLength;
        		}
        	} 
        	else if(a[i] == a[i-1] && i != N - 1) {
        		tempLength++;
        	} 
        	else if((a[i] < a[i-1] && tempLength != 0) 
        		|| (a[i] == a[i-1] && tempLength != 0 && i == N - 1)) {
        		if(i == N - 1 && a[i] == a[i-1]) tempLength++;
        		if(tempLength > length) {
	        		length = tempLength;
	        		startIndex = tempStart;
        		}
        		tempLength = 0;
        		tempStart = 0;
        	}
        }
        System.out.println(startIndex + " " + length);
    }
}
