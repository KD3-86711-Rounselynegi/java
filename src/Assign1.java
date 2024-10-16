import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		System.out.println("Enter 2 double values:");
		Scanner sc = new Scanner(System.in);		
		
        if(sc.hasNextDouble() && !sc.hasNextInt())
        {
        	double d1 = sc.nextDouble();
        	
        	if(sc.hasNextDouble() && !sc.hasNextInt())
        	{
        		double d2 = sc.nextDouble();
        		
        		double avg = (d1 + d2)/2;
            	System.out.println("Average of both the values is " + avg);
        	}
        	
        	else
        	{
        		System.out.println("Error: Values are not of Double datatype.");
        	}
        	
        }
        else
        {
        	System.out.println("Error: Values are not of Double datatype.");
        }
	}

}
