package Conditions_And_Loops;

/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/


import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
int e=sc.nextInt();
		int w=sc.nextInt();
            
            int fan;
        while(s<=e)
        {
            fan=((5*(s-32))/9);
			System.out.println(s+" "+fan);
            s+=w;
        }
	}

}
