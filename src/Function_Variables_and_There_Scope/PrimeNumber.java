package Function_Variables_and_There_Scope;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int n)
	{
		int d =2;
		while(d<n)
		{
			if(n%d==0)
			{
				return false;
			}
			d++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 boolean ansPrime=isPrime(n);
		 if(ansPrime==true)
		 {
			 System.out.println("Prime No");
			 System.out.println(ansPrime);
		 }else
		 {
			 System.out.println("Not a Prime Np");
			 System.out.println(ansPrime);
		 }
		
	}

}
