package Conditions_And_Loops;

import java.util.Scanner;

/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1 */
public class FindPowerOfNnumber {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int x=s.nextInt();
            int p=1;
            for(int i=1;i<=x;i++)
            {
                 p=p*n;
            }
            System.out.println(p);
          
      }

}
