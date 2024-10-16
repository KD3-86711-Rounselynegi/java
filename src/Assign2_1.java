import java.util.Scanner;

public class Assign2_1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dosa = 30;
		int idli = 20;
		int samosa = 20;
		int noodles = 50;
		double total =0.0;
		int choice;
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		while(choice!=0)
		{
			System.out.println("Menu: ");
			System.out.println("Enter 0 to exit");
			System.out.println(" Enter 1 for Dosa Price: 30");
			System.out.println(" Enter 2 for Idli Price: 20");
			System.out.println(" Enter 3 for Samosa Price: 20");
			System.out.println(" Enter 4 for Noodles Price: 50");
			System.out.println(" Enter 5 to Generate Bill");
			
			
			switch(choice)
			{
			 
		
			
			case 1: System.out.println("You entered Dosa!!");
			        total=total+dosa;
			        
				break;
			case 2: System.out.println("You entered Idli!!");
	                total=total+idli;
		        break;
			case 3: System.out.println("You entered Samosa!!");
                    total=total+samosa;
                break;
			case 4: System.out.println("You entered noodles!!");
			        total =total+noodles;
		        break;
			case 5: System.out.println("Your total is: " + total);
			    break;
			
		
		}
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
		}
		System.out.println("Thankyou");
	}
}
