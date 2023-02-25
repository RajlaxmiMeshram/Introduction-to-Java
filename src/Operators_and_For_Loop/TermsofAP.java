package Operators_and_For_Loop;

import java.util.Scanner;

public class TermsofAP {

	public static void main(String[] args) {
		int x,n=1,sum,i=1;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}


	}

}
