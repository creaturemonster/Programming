
public class Rumors {
	
	/**
	 * Generates a uniform random integer between 0 and N-1 but
	 * excluding the values me and self.
	 * 
	 * @param N   Range; must be strictly greater than 1 if src == me,
	 *              and strictly greater than 2 if src != me, 
	 *              otherwise behavior is undefined
	 * @param me  First value to exclude; must be between 0 and N-1
	 * @param src Second value to exclude; must be between 0 and N-1, 
	 *              and may be the same as the first.
	 * @return    Uniform random integer between 0 and N-1 excluding me and src.
	 */
	public static int randomPerson(int N, int me, int src) {
		int M = (me == src) ? (N-1) : (N-2);
		int i = Math.min(me, src), j = Math.max(me, src);
		int p = (int)(M*Math.random());
		//System.err.println(M + "(" + me + "," + src + "): " + p);
		if (p >= i) {
			++p;
		}
		if (p >= j && src != me) {
			++p;
		}
		return p;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); // # of guests
		int T = Integer.parseInt(args[1]); // # of simulation trials
			double prob, expected;
			double numComplete=0;
			double totalheard = 0; 
			for (int trial = 0; trial <T; trial ++) {
				double numheard = 1;
				boolean [] heard = new boolean [N]; 
				int heardFrom = 0; 
				int whoTalks = 0;
				heard [0] = true; 
					while (numheard < N) { 
						int nextPerson = randomPerson(N, whoTalks, heardFrom);
						if(heard[nextPerson] == false) {  
							heard[nextPerson] = true; 
							++numheard;
							heardFrom = whoTalks;
							whoTalks = nextPerson;	
							
						} else if (heard[nextPerson] == true) {
							break; 
					    }
					}
					totalheard += numheard;
					if (numheard == N) {
						numComplete += 1;
					}
			}
			prob = (double)numComplete/T;
			expected = (double)totalheard/T;		
			System.out.println(prob);
			System.out.println(expected);
			}
		

	}

