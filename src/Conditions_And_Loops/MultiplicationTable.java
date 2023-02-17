package Conditions_And_Loops;

import java.util.Scanner;
/*Write a program to print multiplication table of n */
public class MultiplicationTable {
    public static void main(String[] args) {
        int num, end;
          Scanner sc = new Scanner(System.in);
          num = sc.nextInt();
          //
          
          int i=1;
          
          while(i<=10)
          {
              
              System.out.println(num*i);
              i++;
          }
          }
}
