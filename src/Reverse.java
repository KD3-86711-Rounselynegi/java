import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String message = sc.next();
		
		StringBuilder sb = new StringBuilder(message);
		
		System.out.println("Before reverse: " + message);
		String rev = sb.reverse().toString();
		System.out.println("After reverse: " + rev);
	}

}
