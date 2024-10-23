package tester;
import java.util.Scanner;
public class Palindrome {

		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string to check for palindrome: ");
			String message = sc.next();
			
			StringBuilder sb = new StringBuilder(message);
		
			String rev = sb.reverse().toString();
			if(message.equalsIgnoreCase(rev))
			{
				
			System.out.println(" It is a palindrome ");
		}
			else
			{
				System.out.println("It is not a palindrome");
			}

	}

}
