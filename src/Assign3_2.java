import java.util.Scanner;

public class Assign3_2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
		Employee e =new Employee("J","K",10000);
		e.accept();
		e.display();
		e.setFirstName("JK");
		e.getFirstName();
		e.setLastName("V");
		e.getLastName();
	}

}
