package Operators_and_For_Loop;

import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		int n,c,i,sum=0,mul=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=sc.nextInt();
      	if(c==1)
        {
            while(n<13 && n>0)
            {
                sum=sum+n;
                
                n--;
            }
            System.out.println(sum);
        }
      	else if(c==2)
      	{
      		while(n>0)
      		{
      			mul=mul*n;
      			n--;
      		}
      		 System.out.println(mul);
      	}
      	else
      	{
      		System.out.println(-1);
      	}

	}

}
