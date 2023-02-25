package Function_Variables_and_There_Scope;
import java.lang.Integer;
import java.util.Scanner;


public class DivideNumber {
	public static int divideNum(int num,int den)//Use to return some value
	{
	if(den==0)
	{
		return Integer.MIN_VALUE;
	}
		return num/den;
	}
	
	public static void printResult(int num,int den)//Use to perform Task only
	{
		if(den==0)
		{
			System.out.println("division by Zero is not allowed");
			return;
		}
		System.out.println(divideNum(num,den));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int den = sc.nextInt();
		
		printResult(num, den);
	

	}

}
