
public class CardValidate {
	public static int sumDigits(long num)
	{
		int sum=0;
		while(num !=0){
			sum+=num%10; //gets the digit
			num=num/10;
			
		}
		return sum;
	}
	public static boolean isValid(int cc){
		if(cc%10==0){
			return true;
		}
		return false;
	}
	public static int Digit(int cc){
		if(cc<9){
			return cc;
		}else if(cc>9){
			return (cc%10 +cc/10);
		}
		return cc;
	}
	public static int Size(long cc){
		int len=0;
		while(cc>=10){
			cc/=10;
			len++;
		}
		return len;
	}

	public static void main(String[] args) {
		long N=Long.parseLong(args[0]); //your credit card number, getting argument value to long N
		//long total;
		//long cc=Long.parseLong(args[1]);
		//total=sumDigits(N);
		long copyN=N;
		int digit1,digit2;
		int product, sum=0;
		while(copyN !=0){
			digit1=(int)(copyN%10);
			copyN/=10;
			digit2=(int)(copyN%10);
			copyN/=10;
			//System.out.println(digit1 + " " + digit2);
			//System.out.println(digit1 + sumDigits(2*digit2));
			//product=2*digit2;
			//sum+=digit1;
			//if(product>9){
			//	sum+=sumDigits(product);
			//}
			//else{
			//	sum+=product;
			//}
			sum += digit1 + sumDigits(2*digit2);
		}
			System.out.println("Sum is:"+sum);
			if(sum%10==0){
				System.out.println("The credit card number, "+N+" is valid");
				
			}
			else
				System.out.println("The credit card number,"+N+" is invalid");
	}
	}

