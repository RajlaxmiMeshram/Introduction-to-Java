package Function_Variables_and_There_Scope;


//Multiple Variation of a same function is called function Overloading

public class FunctionOverloading {
	
	public static int sum(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static int sum(int a)
	{
		return a+1;
	}
	public static double sum(double a, double b)
	{
		double result = a+b;
		return result;
	}
	public static void main(String[] args) {
		int a = 10;
		int b =  5;
		System.out.println(sum(a,b));

	}

}
