import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudCityComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
	      return o1.getCity().compareTo(o2.getCity());
		
	}
	
}

class StudMarksComparatorDesc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}

class StudNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class Student implements Comparable<Student>
{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student(int roll, String name, String city, double marks) 
	{
		this.setRoll(roll);
		this.setName(name);
		this.setCity(city);
		this.setMarks(marks);
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [roll=" + getRoll() + ", name=" + getName() + ", city=" + getCity() + ", marks=" + getMarks() + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}
	
	
	
}


public class Assign_7 {

	public static int menu(Scanner sc)
	{
		System.out.println("Enter 0 to exit:");
		System.out.println("Enter 1 to display students sorted on their city(asc)");
		System.out.println("Enter 2 to display students sorted on their marks(desc)");
		System.out.println("Enter 3 to display students sorted on their name(asc)");
		System.out.println("Enter 4 to display students sorted on their rollno");
		System.out.println("Enter your choice:");
		return sc.nextInt();
		
	}
	
	public static void displayStudents(Student[] arr)
	{
		System.out.println("**************************************");
        for(Student student : arr)
        {
        	System.out.println(student);
        }
        System.out.println("**************************************");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		arr[0]=new Student(1, "Anil", "Pune", 70);
		arr[1]=new Student(2, "Mukesh", "Karad", 50);
		arr[2]=new Student(3, "Sham", "Kolkata", 90);
		arr[3]=new Student(4, "Ramesh", "Agra", 40);
		arr[4]=new Student(5, "Suresh", "Chennai", 85);
		int choice;
		
		while((choice = menu(sc))!= 0)
		{
			switch(choice)
			{
			case 1: comparator = new StudCityComparator();
			        Arrays.sort(arr, comparator);
			        displayStudents(arr);
				break;
			case 2: comparator = new StudMarksComparatorDesc();
			        Arrays.sort(arr, comparator);
			        displayStudents(arr);
				break;
			case 3: comparator = new StudNameComparator();
			        Arrays.sort(arr, comparator);
			        displayStudents(arr);
				break;
			case 4:  Arrays.sort(arr);
			        displayStudents(arr);
				break;
			default:System.out.println("Wrong choice");
				break;
			}
		}
	}

}
