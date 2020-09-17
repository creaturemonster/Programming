public class SimpleCalculator
{
	public static double Add(double x, double z){
		return x+z;
		
	}
	public static double Minus(double x, double z){
		return x-z;
		
	}
	public static double Multiply(double x, double z){
		return x*z;
		
	}
	public static double Divide(double x, double z){
		return x/z;
		
	}
	
	public static void main(String args[])
	{
		double x=Double.parseDouble(args[0]); 
		char operator=args[1].charAt(0); 
		double y=Double.parseDouble(args[2]);
		
		switch(operator) //check for each operator and execute the corresponding case
		{
			case '+': 
					System.out.println(Add(x,y));
					break;
			case '-': 
					System.out.println(Minus(x,y));
					break;
			case '*': 
					System.out.println(Multiply(x,y));
					break;
			case '/': 
					System.out.println(Divide(x,y));
					break;
			default :
					System.out.println("Invalid operator"); //print error
		}
	}
		

	}

					
				
