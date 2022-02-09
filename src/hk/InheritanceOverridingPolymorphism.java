package hk;

public class InheritanceOverridingPolymorphism extends A
{
	int a=2;
	int b=3;
	int c;
	void sum()
	{
		c=a+b;
		System.out.println("Result:"+c);
	}
	void multiplication(int a, double b)
	{
		System.out.println("parent result of Multiplication:"+(a*b));
		System.out.println("Hello Child");
	}
	void display()
	{
		System.out.println("Hello Child");
	}
	public static void main(String[] args) {
		InheritanceOverridingPolymorphism iop=new InheritanceOverridingPolymorphism();
		iop.sum();
		iop.multiplication(3, 2.5);
		A a=new A();
		a.display();
		iop.display();
		
	}

}
class A{
	void multiplication(int a,double b)
	{
		System.out.println("Parent result of Multiplication:"+(a+b));
	}
	void display()
	{
		System.out.println("hello parent");
	}
}
