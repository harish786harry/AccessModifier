package hk;

public class AccessModifier 
{
	int nos;
	float hrs;
	int noc;
	void displayStudents()
	{
		System.out.println("Number of students");
	}
	void displayHours()
	{
		System.out.println("Number of Hours");
	}
	void displayClass()
	{
		System.out.println("Number of Class");
	}
	public static void main(String[] args) {
		AccessModifier am= new AccessModifier();
		am.displayStudents();
		am.displayHours();
		am.displayClass();
	}

}
