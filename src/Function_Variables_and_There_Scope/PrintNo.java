package Function_Variables_and_There_Scope;

import java.util.Scanner;

public class PrintNo {
	
	public static void Numbers(int n) //no return any value
	{
		if(n<=0) {
			return; //The function will end there
		}
		for(int i=1; i<=n;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Numbers(n);

	}

}
