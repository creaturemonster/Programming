
public class Collinear {
    public static boolean collinear (double x1, double y1,double x2, double y2,double x3, double y3) {
    	if(((y2-y1)*(x3-x2))==((x2-x1)*(y3-y2))){
    		return true;
    	}else {
    		return false;
    	}
    	
   }
 public static boolean collinear(double[][] p) {
    	if(p.length< 3){
    		return true;
    	}
        double x1 = p[0][0];
        double y1 = p[0][1];
        double x2 = p[1][0];
        double y2 = p[1][1];

        boolean result = true;
        
        for (int i = 2; i < p.length; i++) {
        	
            result = collinear(x1, y1, x2, y2, p[i][0], p[i][1]);
           
        }
    	
		return result;

    	
   
    }
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        double x3 = Double.parseDouble(args[2]);
        double y1 = Double.parseDouble(args[3]);
        double y2 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);
        double[][] N = new double[args.length][args.length];
        System.out.println(collinear(x1, y1, x2, y2, x3, y3));
        System.out.println(collinear(N));
    }
}
