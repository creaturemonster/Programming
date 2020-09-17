public class OrderCheck {
	public static void main(String[] args) {
	Double x=Double.parseDouble(args[0]);
	Double y=Double.parseDouble(args[1]);
	Double z=Double.parseDouble(args[2]);
	if(x<y && y<z){
		System.out.println("True");
	}
	else if(x>y&&y>z){
		System.out.println("True");
	}
	else 
		System.out.println("False");
	
	}
	
	
	}

