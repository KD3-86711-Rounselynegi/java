import java.util.Scanner;
import java.util.Set;

public class Employee {

	private String firstName;
	private String lastName;
	private double salary;
	
	Scanner sc =new Scanner(System.in);
	public Employee(String firstName,String lastName, double salary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
		
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    
    public String getFirstName() {
		return firstName;
	}
	
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    public String getLastName() {
		return lastName;
	}
    
    public void setSalary(double salary) {
    	if (salary>0)
    	{
		this.salary = salary;
    	}
    	else
    	{
    		System.out.println("Wrong input");
    	}
	}
    
    public double getSalary() {
		return salary;
	}
    
    public void accept() {
		System.out.println("Enter your First Name: ");
		firstName = sc.next();
		System.out.println("Enter your Last Name: ");
		lastName = sc.next();
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();
	}
    
    public void display() {
	    System.out.println("First Name: " + firstName);
	    System.out.println("Last Name: " + lastName);
	    System.out.println("Salary: " + salary);
	}
}

   


