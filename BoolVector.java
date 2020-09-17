
public class BoolVector {

	    public static boolean all(boolean[] a) {

	        boolean result = true;

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == false)
	                return false;
	        }

	        return result;

	    }

	    public static boolean some(boolean[] a) {

	        boolean result = false;

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == true)
	                return true;
	        }

	        return result;

	    }

	    public static boolean[] neg(boolean[] a) {

	        boolean[] neg = new boolean[a.length];
	        for (int i = 0; i < a.length; i++) {
	            neg[i] = !a[i];
	        }

	        return neg;

	    }

	    public static boolean[] and(boolean[] a, boolean[] b) {

	        if (a.length != b.length)
	            return null;

	        boolean[] and = new boolean[a.length];

	        for (int i = 0; i < a.length; i++) {
	            and[i] = a[i] & b[i];
	        }

	        return and;

	    }
	    public static boolean[] or(boolean[] a, boolean[] b) {

	        if (a.length != b.length)
	            return null;

	        boolean[] and = new boolean[a.length];

	        for (int i = 0; i < a.length; i++) {
	            and[i] = a[i] | b[i];
	        }

	        return and;

	    }

	    public static boolean[] xor(boolean[] a, boolean[] b) {

	        if (a.length != b.length)
	            return null;

	        boolean[] and = new boolean[a.length];

	        for (int i = 0; i < a.length; i++) {
	            and[i] = a[i] ^ b[i];
	        }

	        return and;

	    }
	}

