package hk;

public class OverloadPoly 
{
	void addition(int a,int b,int c) 
	{
		System.out.println("Result:"+(a+b+c));
	}
	void addition(int a,int b,double c) 
	{
		System.out.println("Result:"+(a+b+c));
	}
//	void addition(int a,int b) 
//	{
//		System.out.println("Result:"+(a+b));
//	}
	void addition(int a,int b) 
	{
		System.out.println("Result:"+(a+b));
	}
	public static void main(String[] args) {
		OverloadPoly op=new OverloadPoly();
		op.addition(2, 5);
		op.addition(2, 5, 5);
		op.addition(2,5,5.5);
	}

}
