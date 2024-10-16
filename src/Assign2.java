import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("java Test");
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		
		System.out.println("Given Number: " + n);
		
		System.out.println("Binary Equivalent: " + Integer.toBinaryString(n));
		System.out.println("Octal Equivalent: " + Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent: " + Integer.toHexString(n));
	}
}
