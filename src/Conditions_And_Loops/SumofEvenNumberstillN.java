/*
 * Given a number N, print sum of all even numbers from 1 to N.
 * 
 */


package Conditions_And_Loops;

import java.util.Scanner;

public class SumofEvenNumberstillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n;
		 Scanner s = new Scanner(System.in);
		 n=s.nextInt();
		 
		 int i =1;
		 int sum=0;
		 
		 while(i<=n)
		 {
			 if (i%2==0)
			 {
			 sum=sum+i;
			
			 }
			 i=i+1;
		 }
				System.out.println(sum);
				
	}

}
