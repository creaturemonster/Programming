
public class SimpleCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x=Double.parseDouble(args[0]);
char ops=args[1].charAt(0);
double y=Double.parseDouble(args[2]);
if(ops=='+'){
	System.out.println(x+y);
	
}
else if(ops=='-'){
	System.out.println(x-y);
}else if(ops=='*'){
	System.out.println(x*y);
	}
else if(ops=='/'){
	System.out.println(x/y);
}
else
{
	System.out.println("Invalid operator");
}

	}

}
