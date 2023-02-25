package Function_Variables_and_There_Scope;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	public static void printFahrenheitTable(int start, int end, int step) 
	{
		for(int i= start;i<=end;i+=step)
		{
			System.out.println(i+" "+(int)((5.0/9)*(i-32)));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end =  sc.nextInt();
		int step = sc.nextInt();
				
		printFahrenheitTable(start,end,step);

	}

}
