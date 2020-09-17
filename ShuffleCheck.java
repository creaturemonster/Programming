
public class ShuffleCheck {
	  private static void shuffleDeck(int[] numbers) {
	    	
			int N = numbers.length;
			for(int i=0 ; i < N ; i++)
			{
				int r = i + (int) (Math.random() * (N-i));
				int t = numbers[i] ;
				numbers[i] = numbers[r];
				numbers[r] = t;
			}
	    } 
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);  // size of array
        int N = Integer.parseInt(args[1]);  // number of random trials
      	int[] deck = new int[M];
      	int[][] positions = new int[M][M];
 		for (int i = 0 ; i < N ; i++) {
 			for(int j = 0 ; j < M ; j++) {
 				deck[j] = j;
 			}
 			shuffleDeck(deck);
 			for(int j = 0 ; j < M ; j++) {
 				positions[deck[j]][j]++;
 			}
 		}
  		for(int i = 0 ; i < M ; i++) {
 			for(int j = 0 ; j < M ; j++) {
 				System.out.print(positions[i][j] + " ");
 			}
 			System.out.print("\n");
 		}


    }

  
}
