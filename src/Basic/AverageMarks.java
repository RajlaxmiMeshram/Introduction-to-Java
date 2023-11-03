package Basic;
import java.util.*;
public class AverageMarks {
public static void main(String[] args) {
		
		System.out.println("Enter the name of the student and marks of three subjects");
        Scanner sc =new Scanner(System.in);
			
	        String s= sc.next();
		        int m1= sc.nextInt();
		        int m2= sc.nextInt();
		        int m3= sc.nextInt();
        		     int marks = (m1+m2+m3)/3;   
		       
System.out.println(s);
sc.close();    
	                 
	                 System.out.println("Master 2.0 By Shaheer Alam 25144");
					
// 	                 System.out.print(m2+" " );
// 	                 System.out.print(m3);
		        
		        //marks = m1+m2+m3/100;
		        // System.out.println(marks);
	}
}
