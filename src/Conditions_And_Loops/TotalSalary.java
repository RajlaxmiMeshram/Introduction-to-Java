package Conditions_And_Loops;
import java.util.Scanner;
/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf */
public class TotalSalary {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bs=s.nextInt();
		String str=s.next();
		char c=str.charAt(0);
		int all;
		if(c==65)
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;
		}
		else
		{
			all=1300;
		}
		double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
	}

}
