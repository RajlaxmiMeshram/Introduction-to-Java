package Function_Variables_and_There_Scope;

import java.util.Scanner;

public class Fibonacci_Number {
	public static boolean checkMember(int n){
		int a =0;
		int b = 1;
		while (a<n)
		{
			int c = a+b;
			a=b;
			b=c;
		}
		if(n==a)
		{
			return true;
		}else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkMember(n));

	}

}
