
/*
 * Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
 */
package Operators_and_For_Loop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
		int p=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				p++;
			}
		}
		if(p==1)
		{
			System.out.println(i);
		}
		}

	}

}
