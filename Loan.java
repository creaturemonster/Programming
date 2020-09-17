public class Loan {
	
	public static void main(String[] args) {
		int year=Integer.parseInt(args[0]);
		double p=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		int NumberOfMonths=year*12;
		double Total=p*Math.exp(r*year);
		double PaymentPerMonth=Total/NumberOfMonths;
		System.out.println(PaymentPerMonth);
		

}
	
}