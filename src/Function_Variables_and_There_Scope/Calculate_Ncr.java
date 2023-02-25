package Function_Variables_and_There_Scope;

import java.util.Scanner;

public class Calculate_Ncr {
	public static int Factorial(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans; //returning this no
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int num = Factorial(n);
		int dec1 = Factorial(r);
		int dec2 = Factorial(n-r);
		
		int ans = num/(dec1 * dec2);
		System.out.println(ans);
	}

}
