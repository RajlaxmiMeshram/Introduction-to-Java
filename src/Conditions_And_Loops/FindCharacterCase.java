/*   
 * Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet

 * */

package Conditions_And_Loops;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			char n = sc.next().charAt(0);
			
			if( n>='a'&& n<='z')
			{
				System.out.println("0");
			}else if(n>='A'&& n<='Z')
			{
				System.out.println("1");
			}else
			{
				System.out.println("-1");
			}

	}

}
