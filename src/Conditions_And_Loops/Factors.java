package Conditions_And_Loops;
/*Write a program to print all the factors of a number other than 1 and the number itself. */

import java.util.Scanner;

public class Factors {
    
    public static void main(String[] args) {
        int number;
        int i=2;
          Scanner sc = new Scanner(System.in);
          number = sc.nextInt();
          
          while(i < number)
          {
              if (number % i == 0) 
              {
                  System.out.print(i + " ");
                }
               ++i ;
          }
          
          
          

}  
}
